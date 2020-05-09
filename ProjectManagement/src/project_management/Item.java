package project_management;

import java.util.ArrayList;

public class Item {
	private String name;
	private State state;
	private ItemTimeManager timeManager;
	private ArrayList<Integer> accumulatedHours = new ArrayList<Integer>();
	private ArrayList<Worker> workers = new ArrayList<Worker>();
	private boolean preConditions = false;
	private int hours = 0;
	
	public Item(String name, State state) {
		this.name = name;
		this.state = state;
		timeManager = new ItemTimeManager(state);
	}
	public void addHours(int hours) throws OperationNotAllowedException {
		//defence
		if (getState().currentUser() == null ) {
			throw new OperationNotAllowedException("User login required");
		}
		
		//int cUserIndex = getWorkerList().indexOf(getState().currentUser());
		//accumulatedHours.set(cUserIndex, accumulatedHours.get(cUserIndex) + hours);
		this.hours += hours;
		
	}
	public int getHours() {
		return hours;
	}
	public String getName() {
		return name;
	}
	public ItemTimeManager getTimeManager() {
		return timeManager;
	}
	public ArrayList<Worker> getWorkerList() {
		return workers;
	}
	public State getState() {
		return state;
	}
	/*
	public boolean preConditionsMet() throws OperationNotAllowedException {
		return preConditions;
	}*/

	public Worker findWorker (String name) {
		for (Worker w : workers) {
			if (w.getUsername() == name) {
				return w;
			}
		}
		return null;
	}
	public boolean TimepreConditionsMet() throws OperationNotAllowedException {
		if (getState().currentUser() == null ) {
			throw new OperationNotAllowedException("User login required");
		}
		return true;
	}
	
	public boolean preConditionsMet() throws OperationNotAllowedException {
		if(getState().currentUser() == null) {
			throw new OperationNotAllowedException("User login required");
		}
		if(getState().currentActivity() != null || getState().currentProject() != null) {
			return true;
		}
		return false;
	}
	public boolean containsWorker(Worker worker) throws OperationNotAllowedException {
		for (Worker w : workers) {
			if (w.getUsername().equals(worker.getUsername())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean addWorker(Worker worker) throws OperationNotAllowedException {
		System.out.println("Worker is absent:" + worker.isAbsent());
		if(worker.isAbsent() && !(this instanceof Project)) {
			throw new OperationNotAllowedException("Worker is absent");
		}
		accumulatedHours.add(0);
		workers.add(worker);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("CURRENT ACTIVITY == null: ");
		System.out.println(state.currentActivity() == null);
		
		if(this instanceof Project) worker.getAssignedProjects().add(state.currentProject());
		if(this instanceof Activity) {
			System.out.println("ADDED WORKER DETAILS");
			worker.getAssignedActivities().add(state.currentActivity());
			worker.getWorkedHoursOnActivities().add(0);
		}
		System.out.println("WORKED ACTIVITIES: " + worker.getAssignedActivities().toString());
		
		return true;
	}
	
	public boolean removeWorker(Worker worker) {
		accumulatedHours.remove(getWorkerList().indexOf(worker));
		workers.remove(worker);
		
		if(this instanceof Project) worker.getAssignedProjects().remove(state.currentProject());
		if(this instanceof Activity) worker.getAssignedActivities().remove(state.currentActivity());
		
		return true;
	}
}
