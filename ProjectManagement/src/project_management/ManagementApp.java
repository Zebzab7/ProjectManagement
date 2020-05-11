package project_management;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class ManagementApp {
	private ArrayList<Project> projects = new ArrayList<Project>();
	private ArrayList<Worker> users = new ArrayList<Worker>();
	private ArrayList<FixedActivity> fixedActivities = new ArrayList<FixedActivity>();
	private State state = State.getInstance();
	private int ID = 0;
	
	private static ManagementApp instance;
	private ManagementApp() {
	}
	
	public static ManagementApp getInstance() {
		if (instance == null) {
			instance = new ManagementApp();
		}
		return instance;
	}
	
	//used for cucumber reset
	public static void deleteInstance() {
		instance = null;
	}
	
	public State getState() {
		return state;
	}
	public ArrayList<Project> getProjects() {
		return projects;
	}
	
	public boolean LoggedIn() {
		if (state.currentUser() == null) {
			return false;
		}
		return true; 
	}
	public boolean addHours(int hours) throws Exception {
		if (!LoggedIn()) throw new Exception("User login required");
		else if (state.currentActivity() != null && state.currentProject() != null) {
			//preConditions
			assert(LoggedIn() && state.currentActivity() != null && state.currentProject() != null);
			//Contract additions
			int preActivityHours = state.currentActivity().getHours();
			int preProjectHours = state.currentProject().getHours();
			int preWorkerHours = state.currentUser().workedHours();
			
			state.currentActivity().addHours(hours);
			state.currentProject().addHours(hours);
			state.currentUser().addHours(hours, state.currentActivity());
			
			//postConditions
			assert(state.currentActivity().getHours() == preActivityHours + hours &&
					state.currentProject().getHours() == preProjectHours + hours &&
					state.currentUser().workedHours() == preWorkerHours + hours);
			
			return true;
		}
		return false;
	}
	
	/*
	 * Method attempts to log in user with given name and password
	 * Returns true if successful, false otherwise
	 */
	public boolean Login(String name, String password) throws Exception {
		assert(state.currentUser() == null);
		for (Worker worker : users) {
			if (worker.getPassword().equals(password) && worker.getUsername().equals(name)) {
				state.setUser(worker);
				assert(state.currentUser().getUsername().equals(worker.getUsername()));
				return true;
			}
		}
		throw new Exception("Worker does not exist");
	}
	
	public boolean Logout() {
		if (LoggedIn()) state.setUser(null);
		return true;
	}
	public boolean removeUser(Worker worker) throws Exception {
		if (!LoggedIn()) throw new Exception("User login required");
		users.remove(findWorker(worker.getUsername()));
		return true;
	}
	public boolean removeProject(Project project) throws Exception {
		if (!LoggedIn()) throw new Exception("User login required");
		if (state.currentProject() != null || state.currentActivity() != null) throw new Exception("User is outside of homepage");
		for(Worker w : project.getWorkerList()) {
			w.getAssignedProjects().remove(project);
		}
		projects.remove(project);
		return true;
	}
	public void removeFixedActivity(FixedActivity fActivity) throws Exception {
		if (!LoggedIn()) throw new Exception("User login required");
		fixedActivities.remove(fActivity);
		state.currentUser().getAssignedFixedActivityList().remove(fActivity);
	}
	public boolean containsUser(String name) {
		for (Worker worker : users) {
			if (worker.getUsername().equals(name)) {
				return true;
			}
		}
		return false;
	}
	public boolean containsProject(String name) throws Exception {
		for (Project p : projects) {
			if (p.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	public boolean containsFixedActivity(String name, String absentee) {
		for(FixedActivity f : fixedActivities) {
			if(f.getName().equals(name) && f.getAbsentee().getUsername().equals(absentee)) {
				return true;
			}
		}
		return false;
	}
	public boolean createUser(String username, String password) throws Exception {
		if (!containsUser(username)) {
			if(username.length() > 4) {
				throw new Exception("Username contains too many characters");
			}
			users.add(new Worker(username, password));
			return true;
		}
		throw new Exception("User already exist");
	}
	public boolean addWorker(Worker worker) throws Exception {
		
		if (!containsUser(worker.getUsername())) {
			if(worker.getUsername().length() > 4) {
				throw new Exception("Username contains too many characters");
			}
			users.add(new Worker(worker.getUsername(), worker.getPassword()));
			return true;
		}
		throw new Exception("User already exist");
	}
	public Worker findWorker(String name) throws Exception {
		if (!LoggedIn()) throw new Exception("User login required");
		for (Worker w : users) {
			if (w.getUsername().equals(name)){
				return w;
			}
		}
		throw new Exception("User does not exist");
	}
	public Project findProject(String projectName) throws Exception{
		if (!LoggedIn()) throw new Exception("User login required");
		for (Project project : projects) {
			if (project.getName().equals(projectName)){
				return project;
			}
		}
		throw new Exception("Project does not exist");
	}
	public FixedActivity findFixedActivity(String fActivityName) throws Exception{
		if (!LoggedIn()) throw new Exception("User login required");
		for (FixedActivity f : fixedActivities) {
			if (f.getName().equals(fActivityName)){
				return f;
			}
		}
		throw new Exception("Fixed activity does not exist");
	}
	public boolean addProject(Project project) throws Exception {
		if ( containsProject(project.getName()) ) throw new Exception("Project already exist");
		projects.add(project);
		project.setID(generateProjectID());
		return true;
	}
	
	public boolean createFixedActivity(FixedActivity fActivity) throws Exception {
		if (!LoggedIn()) throw new Exception("User login required");
		if(containsFixedActivity(fActivity.getName(),state.currentUser().getUsername())) {
			throw new Exception("Fixed activity already exists");
		}
		fixedActivities.add(fActivity);
		state.currentUser().getAssignedFixedActivityList().add(fActivity);
		return true;
	}
	private String generateProjectID() {
		GregorianCalendar projectDate = new GregorianCalendar();
		
		String month = "" + projectDate.get(GregorianCalendar.MONTH);
		String year = String.valueOf(projectDate.get(GregorianCalendar.YEAR)).substring(2);
		String projectNumber = "0" + ID;
		
		if(ID > 99) {
			ID = 0;
			projectNumber = "0" + ID;
		}
		else if(ID > 9 && ID <= 99) {
			projectNumber = "" + ID;
		}
		
		if(projectDate.get(GregorianCalendar.MONTH) < 10) {
			month = "0" + projectDate.get(GregorianCalendar.MONTH);
		}
		
		ID++;
		
		return "" + month + year + projectNumber;
	}
	
//	ADDED METHODS IN MANAGEMENT APP

	public ArrayList<Worker> getUsers() {
		return users;
	}
}