package project_management;

import java.util.ArrayList;

public class Project {
	private String ID;
	private String name;
	
	private State state;
	
	private ArrayList<Task> tasks = new ArrayList<Task>();
	private ArrayList<Worker> workers = new ArrayList<Worker>();
	private TimeManager timeManager;
	
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
	public ArrayList<Task> getTaskList() {
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
	}
	
	public Project (String name, String ID, Worker projectLeader, State state) {
		this.name = name;
		this.ID = ID;
		this.projectLeader = projectLeader;
		this.timeManager = new TimeManager(); 
		projectLeader.project = this;
		this.state = state;
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
	public boolean containsTask(String taskName) throws OperationNotAllowedException {
		for (Task task : tasks) {
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
			tasks.add(new Task (name, ET, this));
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
