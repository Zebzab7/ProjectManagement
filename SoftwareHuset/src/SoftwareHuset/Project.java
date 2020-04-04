package SoftwareHuset;

import java.util.ArrayList;

public class Project {
	
	private String ID;
	private String name;
	
	private TaskList taskList;
	private WorkerList workerList;
		
	private Worker projectLeader;
	
	//set gets
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
	//Constructor
	public Project (String name, String ID) {
		this.name = name;
		this.ID = ID;
		
		this.taskList = new TaskList();
		this.workerList = new WorkerList();
	}
	public Project (String name, String ID, Worker projectLeader) {
		this.name = name;
		this.ID = ID;
		this.projectLeader = projectLeader;
		
		this.taskList = new TaskList();
		this.workerList = new WorkerList();
	}
	//methods
	
}
