package project_management;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Project {
	private String ID;
	private String name;
	
	private State state;
	
	private ArrayList<Activity> tasks = new ArrayList<Activity>();
	private ArrayList<Worker> workers = new ArrayList<Worker>();
	private TimeManager timeManager;
	
	private int workedHours;
	
	private Worker projectLeader;
	
	private GregorianCalendar startTime;
	private GregorianCalendar endTime;
	private GregorianCalendar currentTime;
	
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
	public GregorianCalendar getStartTime() {
		return startTime;
	}
	public GregorianCalendar getEndTime() {
		return endTime;
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
	//Time based methods
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
	
	public void setStartTime(int year, int month, int day) throws OperationNotAllowedException {
		
		this.startTime = new GregorianCalendar();
		this.startTime.set(GregorianCalendar.YEAR, year);
		this.startTime.set(GregorianCalendar.MONTH, month);
		this.startTime.set(GregorianCalendar.DAY_OF_MONTH, day);
		
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
		
		if(startTime != null && startTime.after(endTime)) {
			endTime = null;
			throw new OperationNotAllowedException("Deadline is invalid");
		}
		
	}
	public boolean containsTimeSpecifications() {
		if(this.endTime != null && this.startTime != null) {
			System.out.println(this.endTime.getTime());
			return true;
		}
		return false;
	}
	
	public boolean startTimeSet() {
		if(this.startTime != null) {
			return true;
		}
		return false;
	}
	public boolean endTimeSet() {
		if(this.endTime != null) {
			return true;
		}
		return false;
	}
	
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
	
//	public boolean setProjectleader(String newLeader) {
//		Worker leader = findWorker(newLeader);
//		if ((leader.getUsername() != null) && leader.getUsername() == newLeader) {
//			projectLeader = leader;
//			return true;
//		}
//		return false;
//	}
}
