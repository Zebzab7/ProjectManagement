package project_management;

import java.util.ArrayList;

public class Project extends Item {
	private ArrayList<Activity> activities = new ArrayList<Activity>();
	private ArrayList<Integer> accumulatedHours = new ArrayList<Integer>();
	
	private int workedHours;
	private int initialHours = 0;
	private int expectedTime;
	
	private Worker projectLeader;
	
	/*
	 * Constructors for creating a project either with or without an initial project leader
	 */
	public Project(String name, State state) {
		super(name, state);
	}
	public Project(String name, State state, Worker projectLeader) {
		super(name, state);
		this.projectLeader = projectLeader;
	}
	
	public ArrayList<Integer> getAccumulatedHoursList() {
		return accumulatedHours;
	}
	public ArrayList<Activity> getActivityList() {
		return activities;
	}
	public void setProjectLeader(Worker projectLeader) {
		this.projectLeader = projectLeader;
	}
	public Worker getProjectLeader() {
		return projectLeader;
	}
	public int getWorkersAccumulatedHours(Worker worker) {
		return accumulatedHours.get(getWorkerList().indexOf(worker));
	}
	public int workedHours() {
		return workedHours;
	}
	public boolean getPreConditions() throws OperationNotAllowedException {
		if ( getState().currentUser() == null ) {
			throw new OperationNotAllowedException("User login required");
		}
		if (isSelected()) {
			if (!containsWorker(getState().currentUser())) {
				throw new OperationNotAllowedException("User is not assigned to the project");
			}
			if (!projectLeaderIsLoggedIn()) {
			   throw new OperationNotAllowedException("User is not the project leader");
			}
			this.setPreConditions(true);
			return this.getPreConditions();
		}
		this.setPreConditions(false);
		return this.getPreConditions();
	}
	
	
	/*
	 * Returns true if project has a project leader, false otherwise
	 */
	public boolean hasProjectLeader() {
		if (projectLeader != null) return true;
		return false;
	}
	
	public boolean containsActivity(String name) {
		for (Activity activity : activities) {
			if (activity.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	public Activity findActivity(String name) {
		for (Activity a : activities) {
			if (a.getName().equals(name)) {
				return a;
			}
		}
		return null;
	}
	
	public boolean projectLeaderIsLoggedIn() throws OperationNotAllowedException {
		
		if ( hasProjectLeader() &&
			   getState().currentUser().getUsername().equals(projectLeader.getUsername()) && 
			   getState().currentUser().getPassword().equals(projectLeader.getPassword()) ) {
			return true;
		}
		return false;
	}
	
	public boolean addHoursToActivity(int hours, Activity activity) {
		Activity act = findActivity(activity.getName());
		act.addHours(hours);
		workedHours += hours;
		if (workedHours < 0) workedHours = 0;
		return true;
	}
	
	public boolean addActivity(Activity activity) throws OperationNotAllowedException {
		if ( getState().currentUser() == null ) {
			throw new OperationNotAllowedException("User login required");
		}
		if (!containsActivity(activity.getName())) {
			activities.add(activity);
			return true;
		}
		throw new OperationNotAllowedException("The activity already exists in the project");
	}
	
}
