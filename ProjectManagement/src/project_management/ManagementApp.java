package project_management;

import java.util.ArrayList;

import java.util.stream.Collectors;

public class ManagementApp {
	private ArrayList<Project> projects = new ArrayList<Project>();
	private ArrayList<Project> assignedProjects = new ArrayList<Project>();
	private ArrayList<Worker> users = new ArrayList<Worker>();
	private ArrayList<String> workerHours = new ArrayList<String>();
	private State state = new State();
	
	public State getState() {
		return state;
	}
	
	public boolean LoggedIn() {
		if (state.currentUser() == null) {
			return false;
		}
		return true;
	}
	
	// Returns true if login succeeds, false otherwise
	public boolean Login(String name, String password) {
		for (Worker worker : users) {
			if (worker.getPassword().equals(password) && worker.getUsername().equals(name)) {
				state.setUser(worker);
				return true;
			}
		}
		return false;
	}
	public boolean Logout() {
		state.setUser(null);
		if (state.currentUser() == null) {
			return true;
		}
		return false;
	}
	public void removeUser(Worker worker) throws OperationNotAllowedException {
		if (state.currentUser() == null) {
			throw new OperationNotAllowedException("User login required");
		}
			users.remove(worker);
	}
	public void removeProject(Project project) throws OperationNotAllowedException {
		if (state.currentUser() == null) {
			throw new OperationNotAllowedException("User login required");
		}
			projects.remove(project);
	}
	public boolean containsUser(String name) {
		for (Worker worker : users) {
			if (worker.getUsername().equals(name)) {
				return true;
			}
		}
		return false;
	}
	public boolean containsProject(String name) throws OperationNotAllowedException {
		for (Project p : projects) {
			if (p.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean CreateUser(String username, String password) throws Exception {
		if (!containsUser(username)) {
			if (users.add(new Worker(username, password))) {
				return true;
			}
		}
		throw new Exception("User already exist");
	}
	
	public Worker findWorker(String name) throws Exception {
		if (state.currentUser() == null) {
			throw new OperationNotAllowedException("User login required");
		}
		for (Worker w : users) {
			if (w.getUsername().equals(name)){
				return w;
			}
		}
		return null;
	}
	public Project findProject(String projectName) throws Exception{
		if (state.currentUser() == null) {
			throw new OperationNotAllowedException("User login required");
		}
		for (Project project : projects) {
			if (project.getName().equals(projectName)){
				return project;
			}
		}
		return null;
	}
	public void addWorkerToProject(Worker worker, Project project) throws Exception {
		if (state.currentUser() == null) {
			throw new Exception("User login required");
		}
		project.getWorkerList().add(worker);

	}
	public boolean createProject(String name) throws Exception {
		if (state.currentUser() == null) {
			throw new OperationNotAllowedException("User login required");
		}
		for (Project p : projects) {
			if (p.getName().equals(name)) {
				return false;
			}
		}
		if (projects.add(new Project(name, generateProjectId(), state))) {
			return true;
		}
		return false;
	}
	public boolean createProjectWithLeader(String projectName, Worker leader) throws Exception {
		if (state.currentUser() == null) {
			throw new OperationNotAllowedException("User login required");
		}
		if (!containsProject(projectName)) {
			projects.add(new Project(projectName, generateProjectId(), leader, state));
			return true;
		}
		return false;
	}
	
	public String generateProjectId() {
		return "" + projects.size() +1;
	}
	
	public ArrayList<String> workerHoursCollected(Worker worker) {
		workerHours.clear();
		for(Project p : projects) {
			if(p.containsWorker(state.currentUser())) {
				workerHours.add("Project:" + p.getName() + ", hours accumulated:"
										    + p.getWorkersAccumulatedHours(state.currentUser()));
			}
			
		}
		return workerHours;
	}
	public ArrayList<Project> currentAssignedProjects(Worker worker) throws Exception {
		assignedProjects.clear();
		for(Project p : projects) {
			if(p.containsWorker(state.currentUser())) {
				assignedProjects.add(p);
			}
		}
		if(assignedProjects.isEmpty()) throw new Exception("Worker isn't assigned to a project");
		return assignedProjects;
	}
}
