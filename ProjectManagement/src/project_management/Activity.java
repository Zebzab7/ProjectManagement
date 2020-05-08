package project_management;

import java.util.ArrayList;

public class Activity extends Item {
	
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
	
	//public Activity(String name, State state, int ET) {
		//super(name, state);
		//this.expectedTime = ET;
	//}
	
	public int workerContributedHours(Worker worker) {
		int index = getWorkerList().indexOf(findWorker(worker.getUsername()));
		return getRegisterHours().getIndividualHoursList().get(index);
	}
	
	public void requestAssistance(Worker worker) throws OperationNotAllowedException {
		if(preConditionsMet() && worker.grantAssistance()) {
			addWorker(worker);
		}
	}
	
}
