package test_helpers;

import project_management.Project;
import project_management.State;
import project_management.Worker;

public class StateHelper {
	private State state;
	private Project project;
	private Worker worker;
	private Worker temp;
	
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
	public void setState(State state) {
		this.state = state;
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
	/*
	 * Methods used for logging a temporary user in order to
	 * perform certain operations in the management app
	 */
	public void logInTemp() {
		worker = state.currentUser();
		temp = new Worker("Temp", "1234");
		state.setUser(temp);
	}
	public void logOutTemp() {
		state.setUser(worker);
		temp = null;
	}
	private Worker exampleWorker() {
		worker = new Worker("PEPE", "1234");
		return worker;
	}
}
