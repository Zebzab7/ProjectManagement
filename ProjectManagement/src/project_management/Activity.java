package project_management;

import java.util.ArrayList;

public class Activity extends Item {
	private int expectedTime;
	private int workedHours;
	
	public boolean preConditionsMet() throws OperationNotAllowedException {
		if(getState().currentUser() == null) {
			throw new OperationNotAllowedException("User login required");
		}
		if(isSelected()) {
			return true;
		}
		return false;
	}
	
	public Activity(String name, State state) {
		super(name, state);
	}
	
	public Activity(String name, State state, int ET) {
		super(name, state);
		this.expectedTime = ET;
	}
	
	public int workedHours() {
		return workedHours;
	}
	
//	public boolean addWorker(Worker worker) throws OperationNotAllowedException {
//		accumulatedHours.add(0);
//		getWorkerList().add(worker);
//		return true;
//	}
//	
//	public boolean removeWorker(Worker worker) {
//		accumulatedHours.remove(getWorkerList().indexOf(worker));
//		getWorkerList().remove(worker);
//		return true;
//	}
	
	public int workerContributedHours(Worker worker) {
		int index = getWorkerList().indexOf(findWorker(worker.getUsername()));
		return getAccumulatedHours().get(index);
	}
	
	public boolean addHours(int hours) throws OperationNotAllowedException {
		if (preConditionsMet()) {
			workedHours += hours;
			int index = getWorkerList().indexOf(findWorker(getState().currentUser().getUsername()));
			int value = getAccumulatedHours().get(index);
			getAccumulatedHours().set(index, value+hours);
			getState().currentUser().addHours(hours);
			if (workedHours < 0) workedHours = 0;
			return true;
		}
		return false;
	}
	
	public void requestAssistance(Worker worker) throws OperationNotAllowedException {
		if(preConditionsMet() && worker.grantAssistance()) {
			addWorker(worker);
		}
	}
	
}
