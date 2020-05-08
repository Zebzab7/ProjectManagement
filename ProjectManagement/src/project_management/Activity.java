package project_management;

import java.util.ArrayList;

public class Activity extends Item {
	
	public Activity(String name, State state) {
		super(name, state);
	}
	
	public boolean getPreConditions() throws OperationNotAllowedException {
		if ( getState().currentUser() == null ) {
			throw new OperationNotAllowedException("User login required");
		}
		if(isSelected()) {
			return setPreConditions(true);
		}
		return setPreConditions(false);
	}
	
	public void requestAssistance(Worker worker) throws OperationNotAllowedException {
		if(getPreConditions() && worker.grantAssistance()) {
			addWorker(worker);
		}
	}
	
}
