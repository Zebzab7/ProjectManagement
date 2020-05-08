package project_management;

import java.util.ArrayList;

public class Item {
	private String name;
	private State state;
	private ItemTimeManager timeManager;
	private RegisterHours registerHours;
	private ArrayList<Worker> workers = new ArrayList<Worker>();
	private boolean selected = false;
	private boolean preConditions = false;
	
	public Item(String name, State state) {
		this.name = name;
		this.state = state;
		timeManager = new ItemTimeManager(state);
		registerHours = new RegisterHours(state);
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
	public boolean isSelected() {
		return selected;
	}
	public State getState() {
		return state;
	}
	public RegisterHours getRegisterHours() {
		return registerHours;
	}
	public boolean preConditionsMet() throws OperationNotAllowedException {
		return preConditions;
	}
	
	public boolean setPreConditions(boolean statement) {
		this.preConditions = statement;
		return preConditions;
	}
	
	public Worker findWorker (String name) {
		for (Worker w : workers) {
			if (w.getUsername() == name) {
				return w;
			}
		}
		return null;
	}
	
	public boolean containsWorker(Worker worker) throws OperationNotAllowedException {
		if (state.currentUser() == null) {
			throw new OperationNotAllowedException("User login required");
		}
		
		for (Worker w : workers) {
			if (w.getUsername().equals(worker.getUsername())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean addWorker(Worker worker) throws OperationNotAllowedException {
//		if(absenteeCheck.workerIsAbsent(worker)) {
//			throw new Exception("Worker is absent");
//		}
		if(preConditionsMet()) {
			if(this instanceof Activity) {
				worker.getAssignedActivities().add(state.currentActivity());
			}
			
		workers.add(worker);
		registerHours.getIndividualHoursList().add(0);
		return true;
		}
		return false;
//		accumulatedHours.add(initialHours);
	}
	
	public boolean removeWorker(Worker worker) throws OperationNotAllowedException {
//		accumulatedHours.remove(workers.indexOf(worker));
		if(preConditionsMet()) {
			if(this instanceof Activity) {
				worker.getAssignedActivities().remove(state.currentActivity());
			}
		workers.remove(worker);
		registerHours.getIndividualHoursList().remove(workers.indexOf(worker));
		return true;
		}
		return false;
	}
	
	public boolean select() {
		selected = true;
		return true;
	}
	
	public boolean unselect() {
		selected = false;
		return true;
	}
}
