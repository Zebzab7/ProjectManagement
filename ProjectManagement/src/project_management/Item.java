package project_management;

import java.util.ArrayList;

public class Item {
	private String name;
	private State state = State.getInstance();
	private ItemTimeManager timeManager;
	private ArrayList<Integer> accumulatedHours = new ArrayList<Integer>();
	private ArrayList<Worker> workers = new ArrayList<Worker>();
	private int hours = 0;
	
	public Item(String name) {
		this.name = name;
		timeManager = new ItemTimeManager();
	}
	public void addHours(int hours) throws Exception {
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
			if (w.getUsername().equals(name)) {
				return w;
			}
		}
		return null;
	}
	public boolean TimepreConditionsMet() throws Exception {
		if (getState().currentUser() == null ) {
			throw new Exception("User login required");
		}
		return true;
	}
	
	public boolean preConditionsMet() throws Exception {
		if(getState().currentUser() == null) {
			throw new Exception("User login required");
		}
		if(getState().currentActivity() != null && getState().currentProject() != null) {
			return true;
		}
		return false;
	}
	public boolean containsWorker(Worker worker) throws Exception {
		for (Worker w : workers) {
			if (w.getUsername().equals(worker.getUsername())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean addWorker(Worker worker) throws Exception {
		
		if(worker.isAbsent() && !(this instanceof Project)) {
			throw new Exception("Worker is absent");
		}
		if(!worker.isAvailable() && (this instanceof Activity)) {
			throw new Exception("Worker is not available");
		}
		assert((this instanceof Activity) || (this instanceof Project));
		accumulatedHours.add(0);
		workers.add(worker);
		
		if(this instanceof Project) worker.getAssignedProjects().add((Project) this);
		if(this instanceof Activity) worker.addActivity((Activity) this);
		
		assert(workers.contains(worker));
		return true;
	}
	
	
	public boolean removeWorker(Worker worker) {
		accumulatedHours.remove(getWorkerList().indexOf(worker));
		workers.remove(worker);
		
		if(this instanceof Project) worker.getAssignedProjects().remove(state.currentProject());
		if(this instanceof Activity) worker.removeActivity(state.currentActivity());
		
		return true;
	}
	public ArrayList<Integer> getAccumulatedHours() {
		return accumulatedHours;
	}
	
	public void addHoursToWorker(int hours) {
		for(int i = 0; i < workers.size(); i++) {
			if(workers.get(i).getUsername().equals(state.currentUser().getUsername())) {
				accumulatedHours.set(i, accumulatedHours.get(i) + hours);
			}
		}
	}
}
