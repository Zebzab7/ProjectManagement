package project_management;

import java.util.ArrayList;

public class Activity extends Item {
	private ArrayList<Integer> accumulatedHours = new ArrayList<Integer>();
	private int expectedTime;
	
	public Activity(String name) {
		super(name);
	}
	
	public Activity(String name, int ET) {
		super(name);
		this.expectedTime = ET;
	}

	public boolean TimepreConditionsMet() throws Exception {
		if (getState().currentActivity() == this && super.TimepreConditionsMet()) {
			if (!containsWorker(getState().currentUser())) {
				throw new Exception("User is not assigned to the activity");
			}
		}
		return true;
	}
	
	public void requestAssistance(Worker worker) throws Exception {
		if(preConditionsMet() && worker.grantAssistance()) {
			addWorker(worker);
		}
	}
}
