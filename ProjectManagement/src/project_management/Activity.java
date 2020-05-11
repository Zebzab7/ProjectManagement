package project_management;

public class Activity extends Item {
	public Activity(String name) {
		super(name);
	}
	
	public Activity(String name, int ET) {
		super(name);
	}
	
	public void addHours(int hours) throws Exception {
		super.addHours(hours);
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
