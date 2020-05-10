package application;

import softwareHuset.Project;
import softwareHuset.State;
import softwareHuset.Worker;

public class UserHelper {
	private State state;
	private Project project;
	private Worker worker;
	
	public UserHelper (State state) {
		this.state = state;
	}
	public Project getProject() {
		if (project == null) {
			project = exampleProject();
		}
		return project;
	}
	
	private Project exampleProject() {
		project = new Project("Programming 101", "11",state);
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
