package test_helpers;

import project_management.Project;
import project_management.State;
import project_management.Worker;

public class StateHelper {
	private State state;
	private Project project;
	private Worker worker;
	
	public StateHelper (State state) {
		this.state = state;
	}
	
	private Project exampleProject() {
		project = new Project("Programming 101", "11", state);
		return project;
	}
	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Worker getWorker() {
		if (worker == null) {
			worker = exampleWorker();
		}
		return worker;
	}
	public Project getProject() {
		if (project == null) {
			project = exampleProject();
		}
		return project;
	}
	private Worker exampleWorker() {
		worker = new Worker("PEPE", "1234");
		return worker;
	}
}
