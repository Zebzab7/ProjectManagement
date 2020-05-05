package project_management;

import java.util.ArrayList;

public class Item {
	private String name;
	private State state;
	private ItemTimeManager timeManager;
	private ArrayList<Worker> workers = new ArrayList<Worker>();
	private boolean selected = false;
	
	public Item(String name, State state) {
		this.name = name;
		this.state = state;
		timeManager = new ItemTimeManager(state);
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
	
	public Worker findWorker (String name) throws OperationNotAllowedException {
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
	
	public boolean setStartTime(int year, int month, int day) throws OperationNotAllowedException {
		if (selected) {
			timeManager.setStartTime(year, month, day);
			return true;
		}
		return false;
	}
	
	public boolean setEndTime(int year, int month, int day) throws OperationNotAllowedException {
		if (selected) {
			timeManager.setStartTime(year, month, day);
			return true;
		}
		return false;
	}
	
	public boolean addWorker(Worker worker) throws Exception {
//		if(absenteeCheck.workerIsAbsent(worker)) {
//			throw new Exception("Worker is absent");
//		}
		workers.add(worker);
		return true;
//		accumulatedHours.add(initialHours);
	}
	
	public void removeWorker(Worker worker) {
//		accumulatedHours.remove(workers.indexOf(worker));
		workers.remove(worker);
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
