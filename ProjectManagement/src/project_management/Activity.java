package project_management;

import java.util.ArrayList;

public class Activity extends Item {
	private ArrayList<Integer> accumulatedHours = new ArrayList<Integer>();
	private int expectedTime;
	
	public Activity(String name) {
		super(name);
	}
	public ArrayList<Integer> getAccumulatedHours(){
		return accumulatedHours;
	}
	
	public Activity(String name, int ET) {
		super(name);
		this.expectedTime = ET;
	}
	
	public void addHours(int hours) throws OperationNotAllowedException {
		super.addHours(hours);
	}

	public boolean TimepreConditionsMet() throws OperationNotAllowedException {
		if (getState().currentActivity() == this && super.TimepreConditionsMet()) {
			if (!containsWorker(getState().currentUser())) {
				throw new OperationNotAllowedException("User is not assigned to the activity");
			}
		}
		return true;
	}
	
	public void requestAssistance(Worker worker) throws OperationNotAllowedException {
		if(preConditionsMet() && worker.grantAssistance()) {
			addWorker(worker);
		}
	}
	
}
