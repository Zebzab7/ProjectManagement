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
	public void removeUser(Worker worker) {
			users.remove(worker);
	}
	public void removeProject(Project project) {
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
	public boolean containsProject(String name) {
		for (Project p : projects) {
			if (p.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	public boolean CreateUser(String username, String password) {
		if (!containsUser(username)) {
			if (users.add(new Worker(username, password))) {
				return true;
			}
		}
		return false;
	}
	public Worker findWorker(String user) {
		for (Worker worker : users) {
			if (worker.getUsername().equals(user)){
				return worker;
			}
		}
		return null;
	}
	public Project findProject(String projectName) {
		for (Project project : projects) {
			if (project.getName().equals(projectName)){
				return project;
			}
		}
		return null;
	}
	public void addUserToProject(Worker user, Project project) {
		project.getWorkerList().add(user);

	}
	public boolean createProject(String name) {
		if (user == null) {
			return false;
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
	public boolean createProjectWithLeader(String projectName, Worker leader) {
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
