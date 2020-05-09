package project_management;

import java.util.ArrayList;

public class Project extends Item {
	private ArrayList<Activity> activities = new ArrayList<Activity>();
	
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
	
	public ArrayList<Activity> getActivityList() {
		return activities;
	}
	public void setProjectLeader(Worker projectLeader) {
		this.projectLeader = projectLeader;
	}
	public Worker getProjectLeader() {
		return projectLeader;
	}
	public int workedHours() {
		return workedHours;
	}
	public boolean preConditionsMet() throws OperationNotAllowedException {
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
			setPreConditions(true);
			return true;
		}
		setPreConditions(false);
		return false;
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
	
	public boolean addHoursToActivity(int hours, Activity activity) throws OperationNotAllowedException {
		
		if (!activity.preConditionsMet() || !containsWorker(getState().currentUser()) 
			|| !activity.containsWorker(getState().currentUser())) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("Didn't add hours");
			return false;
		}
		
		Activity act = findActivity(activity.getName());
		
		int index = getWorkerList().indexOf(findWorker(getState().currentUser().getUsername()));
		int value = getAccumulatedHours().get(index);
		getAccumulatedHours().set(index, value+hours);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Added hours");
		
		if ( !((workedHours + hours) < 0) && act.preConditionsMet() ) {
			act.addHours(hours);
			workedHours += hours;
			return true;
		}
		throw new OperationNotAllowedException("Invalid input amount");
	}
	
	public boolean addWorkerToActivity(Worker worker, Activity activity) throws OperationNotAllowedException {
		if (activity.addWorker(worker)) {
			return true;
		}
		return false;
	}
	
	//public boolean addWorker(Worker worker) {
		//accumulatedHours.add(0);
		//getWorkerList().add(worker);
		//return true;
	//}
	
	//public boolean removeWorker(Worker worker) {
		//accumulatedHours.remove(getWorkerList().indexOf(worker));
		//getWorkerList().remove(worker);
		//return true;
	//}
	
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
