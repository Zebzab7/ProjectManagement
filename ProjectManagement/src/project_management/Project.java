package project_management;

import java.util.ArrayList;

public class Project extends Item {
	private ArrayList<Activity> activities = new ArrayList<Activity>();
	private ArrayList<Integer> accumulatedHours = new ArrayList<Integer>();
	
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
		int hours = 0;
		for (Activity a : worker.getAssignedActivities()) {
			if (activities.contains(a)) {
				hours += worker.getHoursOnTask(a);
			}
		}
		return hours;
	}
	/*
	public boolean preConditionsMet() throws OperationNotAllowedException {
		if ( getState().currentUser() == null ) {
			throw new OperationNotAllowedException("User login required");
		}
		if (getState().currentProject() == this) {
			if (!containsWorker(getState().currentUser())) {
				throw new OperationNotAllowedException("User is not assigned to the project");
			}
			if (getProjectLeader() == getState().currentUser()) {
			   throw new OperationNotAllowedException("User is not the project leader");
			}
			return true;
		}
		return false;
	}
	*/
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
	
	/*
	public boolean addHoursToActivity(int hours, Activity activity) throws OperationNotAllowedException {
		
		if (!activity.preConditionsMet() || !containsWorker(getState().currentUser()) 
				|| !activity.containsWorker(getState().currentUser())) return false;
		
		Activity act = findActivity(activity.getName());
		
		int index = getWorkerList().indexOf(findWorker(getState().currentUser().getUsername()));
		int value = accumulatedHours.get(index);
		accumulatedHours.set(index, value+hours);
		
		if ( !((workedHours + hours) < 0) && act.preConditionsMet() ) {
			act.addHours(hours);
			workedHours += hours;
			return true;
		}
		throw new OperationNotAllowedException("Invalid input amount");
	}*/
	
	public boolean addWorkerToActivity(Worker worker, Activity activity) throws OperationNotAllowedException {
		if (activity.addWorker(worker)) {
			return true;
		}
		return false;
	}
	
	public boolean addWorker(Worker worker) {
		accumulatedHours.add(0);
		getWorkerList().add(worker);
		return true;
	}
	
	public boolean removeWorker(Worker worker) {
		accumulatedHours.remove(getWorkerList().indexOf(worker));
		getWorkerList().remove(worker);
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
