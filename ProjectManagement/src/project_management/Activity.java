package project_management;

import java.util.ArrayList;

public class Activity {
	Project project;
	private ArrayList<Worker> workers = new ArrayList<Worker>();
	private ArrayList<Integer> accumulatedHours = new ArrayList<Integer>();
	
	private int workedHours;
	private int initialHours = 0;
	
	private String name;
	private State state;
	private ActivityTimeManager activityTimeManager;
	int ID;
	
	public String getName() {
		return name;
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
	public int workerHours(Worker worker) {
		return 0;
	}
	public ActivityTimeManager getATM() {
		return activityTimeManager;
	}
	
	public Activity(String name, Project project, State state) {
		int ID = project.getActivityList().size() + 1;
		this.name = name;
		this.project = project;
		this.state = state;
		this.activityTimeManager = new ActivityTimeManager(this.project, this.state, this);
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
	
	public boolean addHours(int hours) throws OperationNotAllowedException {
		if ( state.currentUser() == null ) throw new OperationNotAllowedException("User login required");
		
		if(isAbsentActivity()) {
			throw new OperationNotAllowedException("Not eligable for this activity");
		}
		
		if ( containsWorker(state.currentUser()) ) {
			workedHours += hours;
			
			int incValueActivity = accumulatedHours.get(workers.indexOf(state.currentUser()));
			int incValueProject = project.getAHList().get(project.getWorkerList().indexOf(state.currentUser()));
			accumulatedHours.set(workers.indexOf(state.currentUser()), incValueActivity + hours);
			project.getAHList().set(project.getWorkerList().indexOf(state.currentUser()), incValueProject + hours);
			
			if ( workedHours < 0 ) workedHours = 0;
			return true;
		}
		return false;
	}
	public boolean isAbsentActivity() {
		if(this.getName().equals("Sickness") || this.getName().equals("Holiday") || this.getName().equals("Courses")) {
			return true;
		}
		return false;
	}
	public boolean workerIsAbsent() {
		if(isAbsentActivity()) {
			if(this.containsWorker(state.currentUser())) {
				return true;
			}
			return false;
		}
		return false;
	}
}
