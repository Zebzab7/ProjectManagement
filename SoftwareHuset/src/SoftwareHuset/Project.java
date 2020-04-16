package softwareHuset;

import java.util.ArrayList;

public class Project {
	
	private String ID;
	private String name;
	
	private ArrayList<Task> tasks = new ArrayList<Task>();
	private ArrayList<Worker> workers = new ArrayList<Worker>();
	private TimeManager timeManager;
	private Worker projectLeader;
	
	//set gets
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
	public Project (String name, String ID) {
		this.name = name;
		this.ID = ID;
		this.timeManager = new TimeManager(); 
	}
	
	public Project (String name, String ID, Worker projectLeader) {
		this.name = name;
		this.ID = ID;
		this.projectLeader = projectLeader;
		this.timeManager = new TimeManager(); 
		projectLeader.project = this;
	}
	//methods
	public Worker findWorker (String name) {
		for (Worker w : workers) {
			if (w.getUsername() == name) {
				return w;
			}
		}
		return null;
	}
	public boolean containsTask(String taskName) {
		for (Task task : tasks) {
			if (task.name.equals(taskName)) {
				return true;
			}
		}
		return false;
	}
	public void createTask(String name, String Estimate) {
		try {
			double ET = Integer.parseInt(Estimate);
			tasks.add(new Task (name, ET, this));
		}
		catch (Exception e) {
			
		}
		
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
