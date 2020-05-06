package test_helpers;

import project_management.Activity;
import project_management.Project;
import project_management.State;
import project_management.Worker;

public class ItemHolder {
	private State state;
	private Project project;
	private Activity activity;
	private Worker worker, prev;
	private Worker temp;
	
	public ItemHolder (State state) {
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
	public Activity getActivity() {
		if (activity == null) {
			activity = exampleActivity();
		}
		return activity;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public boolean setActivity(Activity activity) {
		this.activity = activity;
		return true;
	}
	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	
	private Worker exampleWorker() {
		worker = new Worker("PEPE", "1234");
		return worker;
	}
	private Project exampleProject() {
		project = new Project("Programming 101", state);
		return project;
	}
	private Activity exampleActivity() {
		activity = new Activity("Activity101", state);
		return activity;
	}
	
	/*
	 * Methods used for logging a temporary user in order to
	 * perform certain operations in the management app
	 */
	public void logInTemp() {
		if (state.currentUser() != null) 
		prev = new Worker(state.currentUser().getUsername(), state.currentUser().getPassword());
		else prev = null;
		temp = new Worker("Temp", "1234");
		state.setUser(temp);
	}
	public void logOutTemp() {
		state.setUser(prev);
		temp = null;
	}
	public Worker getTemp() {
		return temp;
	}
}
