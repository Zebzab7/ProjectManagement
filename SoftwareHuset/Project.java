package softwareHuset;

import java.util.ArrayList;

public class Project {
	
	private String ID;
	private String name;
	
	private TaskList taskList;
	private WorkerList workerList;
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
	public TaskList getTaskList() {
		return taskList;
	}
	public WorkerList getWorkerList() {
		return workerList;
	}
	public String getId() {
		return ID;
	}
	
	//Constructor
	public Project (String name, String ID) {
		this.name = name;
		this.ID = ID;
		
		this.taskList = new TaskList();
		this.workerList = new WorkerList();
		this.timeManager = new TimeManager(); 
	}
	
	public Project (String name, String ID, Worker projectLeader) {
		this.name = name;
		this.ID = ID;
		this.projectLeader = projectLeader;
		this.taskList = new TaskList();
		this.workerList = new WorkerList();
		this.timeManager = new TimeManager(); 
		projectLeader.project = this;
	}
	//methods
	public Worker findWorker (String name) {
		for (Worker w : workerList.Workers()) {
			if (w.getUsername() == name) {
				return w;
			}
		}
		return null;
	}
	public boolean setProjectleader(String newLeader) {
		Worker leader = findWorker(newLeader);
		if ((leader.getUsername() != null) && leader.getUsername() == newLeader) {
			projectLeader = leader;
			return true;
		}
		return false;
	}
}
