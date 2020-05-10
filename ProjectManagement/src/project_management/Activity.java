package project_management;

import java.util.ArrayList;

public class Activity extends Item {
	private ArrayList<Integer> accumulatedHours = new ArrayList<Integer>();
	private int expectedTime;
	
	public Activity(String name, State state) {
		super(name, state);
	}
	
	public Activity(String name, State state, int ET) {
		super(name, state);
		this.expectedTime = ET;
	}
	
	public void addHours(int hours) throws OperationNotAllowedException {
		System.out.println("adding hours to activity: "+ hours);
		//defence
		/*if (getState().currentUser() == null ) {
			throw new OperationNotAllowedException("User login required");
		}*/
		super.addHours(hours);
	}
	
//	public boolean addWorker(Worker worker) throws OperationNotAllowedException {
//		accumulatedHours.add(0);
//		getWorkerList().add(worker);
//		worker.addActivity(this);
//		return true;
//	}
//	
//	public boolean removeWorker(Worker worker) {
//		accumulatedHours.remove(getWorkerList().indexOf(worker));
//		getWorkerList().remove(worker);
//		return true;
//	}

	public boolean TimepreConditionsMet() throws OperationNotAllowedException {
		if (getState().currentActivity() == this && super.TimepreConditionsMet()) {
			if (!containsWorker(getState().currentUser())) {
				throw new OperationNotAllowedException("User is not assigned to the project");
			}
			return true;
		}
		return false;
	}
	/*
	public boolean addHours(int hours) throws OperationNotAllowedException {
		if (preConditionsMet()) {
			getState().currentUser().addHours(hours);
			workedHours += hours;
			int index = getWorkerList().indexOf(findWorker(getState().currentUser().getUsername()));
			int value = accumulatedHours.get(index);
			accumulatedHours.set(index, value+hours);
			if (workedHours < 0) workedHours = 0;
			return true;
		}
		return false;
	}*/
	
	public void requestAssistance(Worker worker) throws OperationNotAllowedException {
		if(preConditionsMet() && worker.grantAssistance()) {
			addWorker(worker);
		}
	}
	
}
