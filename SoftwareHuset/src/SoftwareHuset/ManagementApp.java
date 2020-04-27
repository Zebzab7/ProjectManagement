package softwareHuset;

import java.util.ArrayList;

import java.util.stream.Collectors;

public class ManagementApp {
	private ArrayList<Project> projects = new ArrayList<Project>();
	private ArrayList<Worker> users = new ArrayList<Worker>();
	private User user = new User();
	
	public User getUser() {
		return user;
	}
	
	public ArrayList<Worker> getUsers() {
		return users;
	}
	
	public boolean LoggedIn() {
		if (user.currentUser() == null) {
			return false;
		}
		return true;
		//return loggedIn;
	}
	public boolean Login(String name,String password) {
		for (Worker worker : users) {
			if (worker.password.equals(password)&& worker.getUsername().equals(name)) {
				user.setUser(worker);
				return true;
			}
		}
		return false;
	}
	public boolean Logout() {
		user.setUser(null);
		if (user.currentUser() == null) {
			return true;
		}
		return false;
	}
	public void removeUser(Worker worker) throws OperationNotAllowedException {
		if (user.currentUser() == null) {
			throw new OperationNotAllowedException("User login required");
		}
			users.remove(worker);
	}
	public void removeProject(Project project) throws OperationNotAllowedException {
		if (user.currentUser() == null) {
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
		else throw new Exception("User already exist");
		return false;
	}
	public Worker findWorker(String worker) throws Exception {
		if (user.currentUser() == null) {
			throw new OperationNotAllowedException("User login required");
		}
		for (Worker w : users) {
			if (w.getUsername().equals(worker)){
				return w;
			}
		}
		return null;
	}
	public Project findProject(String projectName) throws Exception{
		if (user.currentUser() == null) {
			throw new OperationNotAllowedException("User login required");
		}
		for (Project project : projects) {
			if (project.getName().equals(projectName)){
				return project;
			}
		}
		return null;
	}
	public void addWorkerToProject(Worker worker, Project project) throws Exception{
		if (user.currentUser() == null) {
			throw new OperationNotAllowedException("User login required");
		}
		project.getWorkerList().add(worker);

	}
	public boolean createProject(String name) throws Exception {
		if (user.currentUser() == null) {
			throw new OperationNotAllowedException("User login required");
		}
		for (Project p : projects) {
			if (p.getName().equals(name)) {
				return false;
			}
		}
		if (projects.add(new Project(name, generateProjectId(), user))) {
			return true;
		}
		return false;
	}
	public boolean createProjectWithLeader(String projectName, Worker leader) throws Exception {
		if (user.currentUser() == null) {
			throw new OperationNotAllowedException("User login required");
		}
		if (!containsProject(projectName)) {
			projects.add(new Project(projectName, generateProjectId(), leader, user));
			return true;
		}
		return false;
	}
	public String generateProjectId() {
		return "" + projects.size() +1;
	}
}
