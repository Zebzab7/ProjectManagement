package project_management;

import java.util.ArrayList;

public class Project extends Item {
	private ArrayList<Activity> activities = new ArrayList<Activity>();
	
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
		int hours = 0;
		for (Activity a : worker.getAssignedActivities()) {
			if (activities.contains(a)) {
				hours += worker.getHoursOnActivity(a);
			}
		}
		return hours;
	}
	
	public boolean TimepreConditionsMet() throws OperationNotAllowedException {
		if (getState().currentProject() == this && super.TimepreConditionsMet()) {
			if (!containsWorker(getState().currentUser())) {
				throw new OperationNotAllowedException("User is not assigned to the project");
			}
			if (getProjectLeader() != getState().currentUser()) {
				   throw new OperationNotAllowedException("User is not the project leader");
			}
			return true;
			
		}
		return false;
		
	}
	/*
	 * Returns true if project has a project leader, false otherwise
	 */
	public boolean hasProjectLeader() {
		if (projectLeader != null) return true;
		return false;
	}
	
	public boolean isProjectLeader(Worker worker) {
		if ( worker.equals(projectLeader) ) return true;
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
