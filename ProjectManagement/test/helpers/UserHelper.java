package helpers;

import project_management.Project;
import project_management.User;
import project_management.Worker;

public class UserHelper {
	private User user;
	private Project project;
	private Worker worker;
	
	public UserHelper (User user) {
		this.user = user;
	}
	public Project getProject() {
		if (project == null) {
			project = exampleProject();
		}
		return project;
	}
	
	private Project exampleProject() {
		project = new Project("Programming 101", "11",user);
		return project;
	}
	
	public Worker getWorker() {
		if (worker == null) {
			worker = exampleWorker();
		}
		return worker;
	}
	
	private Worker exampleWorker() {
		worker = new Worker("PEPE", "1234");
		return worker;
	}
}
