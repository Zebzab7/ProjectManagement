package project_management;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Project {
	private ArrayList<Activity> activities = new ArrayList<Activity>();
	private ArrayList<Worker> workers = new ArrayList<Worker>();
	private ArrayList<Integer> accumulatedHours = new ArrayList<Integer>();
	private FixedActivity absenteeCheck;

	private String name, ID;
	private State state;
	
	private int workedHours;
	private int initialHours = 0;
	
	private Worker projectLeader;
	private TimeManager timeManager;
	
	public String getName() {
		return name;
	}
	public ArrayList<Activity> getActivityList() {
		return activities;
	}
	public ArrayList<Worker> getWorkerList() {
		return workers;
	}
	public ArrayList<Integer> getAHList() {
		return accumulatedHours;
	}
	public void setProjectLeader(Worker projectLeader) {
		this.projectLeader = projectLeader;
	}
	public Worker getProjectLeader() {
		return projectLeader;
	}
	public int getWorkersAccumulatedHours(Worker worker) {
		return accumulatedHours.get(workers.indexOf(worker));
	}
	public int workedHours() {
		return workedHours;
	}
	public int workerHours(Worker worker) {
		return 0;
	}
	public TimeManager getTM() {
		return timeManager;
	}
	
	/*
	 * Constructors for creating a project either with or without an initial project leader
	 */
	public Project(String name, String ID, State state) {
		this.name = name;
		this.ID = ID;
		this.state = state;
		this.timeManager = new TimeManager(this.state);
		this.absenteeCheck = new FixedActivity(name,state);
		
		workedHours = 0;
	}
	public Project (String name, String ID, Worker projectLeader, State state) {
		this.name = name;
		this.ID = ID;
		this.projectLeader = projectLeader;
		projectLeader.setLeadingProject(this);
		this.state = state;
		this.timeManager = new TimeManager(this.state);
		this.absenteeCheck = new FixedActivity(name,state);
		workedHours = 0;
	}
	
	public boolean selectProject() {
		if(state.currentUser() != null && workers.contains(state.currentUser())) {
			state.setProject(this);
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
	
	/*
	 * Returns worker with the given name
	 * Returns null if no such worker exists
	 */
	public Worker findWorker (String name) throws OperationNotAllowedException {
		for (Worker w : workers) {
			if (w.getUsername() == name) {
				return w;
			}
		}
		return null;
	}
	
	/*
	 * Returns true if given worker exists in project, false otherwise
	 */
	public boolean containsWorker(Worker worker) {
		for (Worker w : workers) {
			if (w.getUsername().equals(worker.getUsername())) {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * Adds the given worker as a worker on the project
	 */
	public void addWorker(Worker worker) throws Exception {
		if(absenteeCheck.workerIsAbsent(worker)) {
			throw new Exception("Worker is absent");
		}
		workers.add(worker);
		accumulatedHours.add(initialHours);
	}
	
	/*
	 * Removes the given worker from the project
	 */
	public void removeWorker(Worker worker) {
		accumulatedHours.remove(workers.indexOf(worker));
		workers.remove(worker);
	}
	
	/*
	 * Returns true if the given activity exists in the project, false otherwise
	 */
	public boolean containsActivity(String activityName) throws OperationNotAllowedException {
		for (Activity activity : activities ) {
			if (activity.getName().equals(activityName)) {
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
	 * Creates an activity for the project with the given name, project and state
	 */
	public void createActivity(String name, String type) throws OperationNotAllowedException {
		if (state.currentUser() == null) {
			throw new OperationNotAllowedException("User login required");
		}
		if ( containsActivity(name) ) throw new OperationNotAllowedException("The Task already exist in the project");
		activities.add(new Activity(name, this, state));
	}

}
