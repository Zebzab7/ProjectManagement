package softwareHuset;

import java.util.ArrayList;

import java.util.stream.Collectors;

public class ManagementApp {
	ArrayList<Project> projects = new ArrayList<Project>();
	ArrayList<Worker> users = new ArrayList<Worker>();
	
	private Worker user;
	
	public boolean LoggedIn() {
		if (user == null) {
			return false;
		}
		return true;
		//return loggedIn;
	}
	public boolean Login(String name,String password) {
		for (Worker worker : users) {
			if (worker.password.equals(password)&& worker.getUsername().equals(name)) {
				user = worker;
				return true;
			}
		}
		return false;
	}
	public boolean Logout() {
		user = null;
		if (user == null) {
			return true;
		}
		return false;
	}
	public boolean removeUser(String name) {
		if (!containsUser(name)) {
			return true;
		}
		for (Worker worker : users) {
			if (worker.getUsername().equals(name)){
				users.remove(name);
				return true;
			}
		}
		return false;
	}
	public boolean removeProject(String name) {
		if (!containsProject(name)) {
			return true;
		}
		for (Project p : projects) {
			if (p.getName().equals(name)){
				projects.remove(name);
				return true;
			}
		}
		return false;
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
	public boolean addUserToProject(String user, String project) {
		Worker worker =findWorker(user);
		if (this.user == null) {
			return false;
		}
			if (worker != null) {
				for (Project p : projects) {
					if (p.getName().equals(project)) {
						p.getWorkerList().addWorker(worker);
						return true;
					}
				}
			}
		return false;
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
		if (projects.add(new Project(name, generateProjectId()))) {
			return true;
		}
		return false;
	}
	public boolean createProjectWithLeader(String projectName, String projectLeader) {
		if (user == null) {
			return false;
		}
		for (Worker w : users) {
			if (w.getUsername().equals(projectLeader)) {
				for (Project p : projects) {
					if (p.getName().equals(projectName)) {
						return false;
					}
				}
				if (projects.add(new Project(projectName, generateProjectId(), w))) {
					return true;
				}
			}
		}
		return false;
	}
	public String generateProjectId() {
		return "" + projects.size() +1;
	}
}
