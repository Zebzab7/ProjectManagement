package project_management;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Project {
	private ArrayList<Activity> activities = new ArrayList<Activity>();
	private ArrayList<Worker> workers = new ArrayList<Worker>();
	private ArrayList<Integer> accumulatedHours = new ArrayList<Integer>();

	private String name, ID;
	private State state;
	
	private int workedHours;
	private int initialHours = 0;
	
	private Worker projectLeader;
	private GregorianCalendar startTime, endTime, currentTime;
	
	public String getName() {
		return name;
	}
	public ArrayList<Activity> getActivityList() {
		return activities;
	}
	public ArrayList<Worker> getWorkerList() {
		return workers;
	}
	public void setProjectLeader(Worker projectLeader) {
		this.projectLeader = projectLeader;
	}
	public Worker getProjectLeader() {
		return projectLeader;
	}
	public ArrayList<Integer> getAccumulatedHoursList() {
		return accumulatedHours;
	}
	public int getWorkersAccumulatedHours(Worker worker) {
		return accumulatedHours.get(workers.indexOf(worker));
	}
	public int workedHours() {
		return workedHours;
	}
	public GregorianCalendar getStartTime() {
		return startTime;
	}
	public GregorianCalendar getEndTime() {
		return endTime;
	}
	public int getStartWeek() {
		return this.startTime.get(GregorianCalendar.WEEK_OF_MONTH);
	}
	public int getEndWeek() {
		return this.endTime.get(GregorianCalendar.WEEK_OF_MONTH);
	}
	public int workerHours(Worker worker) {
		return 0;
	}
	
	/*
	 * Constructors for creating a project either with or without an initial project leader
	 */
	public Project(String name, String ID, State state) {
		this.name = name;
		this.ID = ID;
		this.state = state;
		workedHours = 0;
	}
	public Project (String name, String ID, Worker projectLeader, State state) {
		this.name = name;
		this.ID = ID;
		this.projectLeader = projectLeader;
		projectLeader.setLeadingProject(this);
		this.state = state;
		workedHours = 0;
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
	public void addWorker(Worker worker) {
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
	
	/*
	 * Creates an activity for the project with the given name, and estimated time (ET)
	 */
	public void createActivity(String name, int Estimate) throws OperationNotAllowedException {
		if (state.currentUser() == null) {
			throw new OperationNotAllowedException("User login required");
		}
		if ( containsActivity(name) ) throw new OperationNotAllowedException("The Task already exist in the project");
		double ET = Estimate;
		activities.add(new Activity(name, ET, this));
	}
	
	/*
	 * Adds the given integer parameter from the projects total work hours
	 * If the resulting sum is anything below 0, it will be set to 0
	 *  Requirements to not cause an exception:
	 *  	- User must be logged in
	 */
	public boolean addHours(int hours) throws OperationNotAllowedException {
		if ( state.currentUser() == null ) throw new OperationNotAllowedException("User login required");
		
		if ( containsWorker(state.currentUser()) ) {
			workedHours += hours;
			int incValue = accumulatedHours.get(workers.indexOf(state.currentUser()));
			accumulatedHours.set(workers.indexOf(state.currentUser()), incValue + hours);
			if ( workedHours < 0 ) workedHours = 0;
			return true;
		}
		return false;
	}
	
	/* 
	 * Following 2 methods sets start and end time, respectively, of project to the given parameters
	 *  Requirements to not cause an exception:
	 *  	- User must be logged in
	 *  	- User must be working on the project
	 *  	- User must project leader
	 *  	- Time must be valid 
	 */ 
	public void setStartTime(int year, int month, int day) throws OperationNotAllowedException {
		this.startTime = new GregorianCalendar();
		this.startTime.set(GregorianCalendar.YEAR, year);
		this.startTime.set(GregorianCalendar.MONTH, month);
		this.startTime.set(GregorianCalendar.DAY_OF_MONTH, day);
		
		if (state.currentUser() == null) throw new OperationNotAllowedException("User login required");
		if ( !containsWorker(state.currentUser()) ) throw new OperationNotAllowedException("User is not assigned to the project");
		if( !hasProjectLeader() || !state.currentUser().getUsername().equals(projectLeader.getUsername()) || 
				!state.currentUser().getPassword().equals(projectLeader.getPassword()) ) {
			throw new OperationNotAllowedException("User is not the project leader");
		}
		
		if(endTime != null && startTime.after(endTime)) {
			startTime = null;
			throw new OperationNotAllowedException("Deadline is invalid");
		}
	}
	public void setEndTime(int year, int month, int day) throws OperationNotAllowedException {
		this.endTime = new GregorianCalendar();
		this.endTime.set(GregorianCalendar.YEAR, year);
		this.endTime.set(GregorianCalendar.MONTH, month);
		this.endTime.set(GregorianCalendar.DAY_OF_MONTH, day);
		
		if(state.currentUser() == null) {
			
			throw new OperationNotAllowedException("User login required");
		}
		if ( !containsWorker(state.currentUser()) ) throw new OperationNotAllowedException("User is not assigned to the project");
		if( !hasProjectLeader() || !state.currentUser().getUsername().equals(projectLeader.getUsername()) || 
				!state.currentUser().getPassword().equals(projectLeader.getPassword()) ) {
			throw new OperationNotAllowedException("User is not the project leader");
		}
		
		if(startTime != null && startTime.after(endTime)) {
			endTime = null;
			throw new OperationNotAllowedException("Deadline is invalid");
		}
	}
	
	/*
	 * Returns true if start and end times have been specified, false otherwise
	 */
	public boolean containsTimeSpecifications() {
		if(this.endTime != null && this.startTime != null) {
			//System.out.println(this.endTime.getTime());
			return true;
		}
		return false;
	}
	/*
	 * Returns true if a start time for the project has been set, false otherwise
	 */
	public boolean startTimeSet() {
		if(this.startTime != null) {
			return true;
		}
		return false;
	}
	/*
	 * Returns true if an end time for the project has been set, false otherwise
	 */
	public boolean endTimeSet() {
		if(this.endTime != null) {
			return true;
		}
		return false;
	}
	
	/*
	 * Returns true if the project is overdue, false otherwise
	 * Will cause an exception if no deadline has been set
	 */
	public boolean deadlineOverdue() {
		if(this.startTime != null && this.endTime != null) {
			this.currentTime = new GregorianCalendar();
			if(endTime.after(currentTime)) {
				return true;
			}
			return false;
		}
		else {
			throw new IllegalArgumentException("Deadline must be instantiated");
		}
	}
}
