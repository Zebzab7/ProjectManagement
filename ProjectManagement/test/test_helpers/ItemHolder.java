package test_helpers;

import project_management.Activity;
import project_management.FixedActivity;
import project_management.Project;
import project_management.State;
import project_management.Worker;

public class ItemHolder {
	private State state;
	private Project project;
	private Activity activity;
	private FixedActivity fixedActivity;
	private Worker worker, prev;
	private Worker temp;
	
	public ItemHolder (State state) {
		this.state = state;
	}
	public State getState() {
		return state;
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
	public FixedActivity getFixedActivity() {
		if(fixedActivity == null) {
			fixedActivity = exampleFixedActivity();
		}
		return fixedActivity;
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
	public void setFixedActivity(FixedActivity fixedActivity) {
		this.fixedActivity = fixedActivity;
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
	private FixedActivity exampleFixedActivity() {
		fixedActivity = new FixedActivity("fixedActivity101", state.currentUser());
		return fixedActivity;
	}
	
	/*
	 * Methods used for logging a temporary user in order to
	 * perform certain operations in the management app
	 */
	public void logInTemp() {
		prev = state.currentUser();
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
