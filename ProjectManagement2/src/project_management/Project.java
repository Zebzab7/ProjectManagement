package project_management;

import java.util.ArrayList;

public class Project {
	private String ID;
	private String name;
	
	private State state;
	
	private ArrayList<Activity> tasks = new ArrayList<Activity>();
	private ArrayList<Worker> workers = new ArrayList<Worker>();
	private TimeManager timeManager;
	
	private int workedHours;
	
	private Worker projectLeader;
	
	// Set gets
	public String getName() {
		return name;
	}
	public TimeManager getTimeManager() {
		return timeManager;
	}
	public void setProjectLeader(Worker projectLeader) {
		this.projectLeader = projectLeader;
	}
	public Worker getProjectLeader() {
		return projectLeader;
	}
	public ArrayList<Activity> getTaskList() {
		return tasks;
	}
	public ArrayList<Worker> getWorkerList() {
		return workers;
	}
	public String getId() {
		return ID;
	}
	
	//Constructor
	public Project(String name, String ID, State state) {
		this.name = name;
		this.ID = ID;
		this.timeManager = new TimeManager(); 
		this.state = state;
		workedHours = 0;
	}
	
	public Project (String name, String ID, Worker projectLeader, State state) {
		this.name = name;
		this.ID = ID;
		this.projectLeader = projectLeader;
		this.timeManager = new TimeManager(); 
		projectLeader.project = this;
		this.state = state;
		workedHours = 0;
	}
	
	// Methods
	public Worker findWorker (String name) throws OperationNotAllowedException {
		for (Worker w : workers) {
			if (w.getUsername() == name) {
				return w;
			}
		}
		return null;
	}
	
	public boolean containsWorker (Worker worker) throws OperationNotAllowedException {
		for (Worker w : workers) {
			if (w.equals(worker)) {
				return true;
			}
		}
		return false;
	}
	
	public void addWorker(Worker worker) {
		workers.add(worker);
	}
	
	public void removeWorker(Worker worker) {
		workers.remove(worker);
	}
	
	public boolean containsTask(String taskName) throws OperationNotAllowedException {
		for (Activity task : tasks) {
			if (task.name.equals(taskName)) {
				return true;
			}
		}
		return false;
	}
	
	public void createTask(String name, String Estimate) throws OperationNotAllowedException {
		if (state.currentUser() == null) {
			throw new OperationNotAllowedException("User login required");
		}
			double ET = Integer.parseInt(Estimate);
			tasks.add(new Activity (name, ET, this));
	}
	
	public boolean addHours(int hours) throws OperationNotAllowedException {
		if ( containsWorker(state.currentUser()) ) {
			workedHours += hours;
			return true;
		}
		return false;
	}
	
	public int workedHours() {
		return workedHours;
	}
	
//	public boolean setProjectleader(String newLeader) {
//		Worker leader = findWorker(newLeader);
//		if ((leader.getUsername() != null) && leader.getUsername() == newLeader) {
//			projectLeader = leader;
//			return true;
//		}
//		return false;
//	}
}
