package project_management;

import java.util.ArrayList;

public class RegisterHours {
	
	private State state;
	private int workedHours = 0;
	private ArrayList<Integer> individualHours = new ArrayList<Integer>();
	
	public ArrayList<Integer> getIndividualHoursList() {
		return individualHours;
	}
	public int getWorkedHours() {
		return workedHours;
	}
	
	public RegisterHours(State state) {
		this.state = state;
	}
	
	public boolean addHours(int hours, Item item) throws OperationNotAllowedException {
		if(item instanceof Project) {
			throw new OperationNotAllowedException("Can't add hours to project");
		}
		if(item.preConditionsMet()) {
			workedHours += hours;
			addIndividualHours(hours, item, state.currentUser());
			if (workedHours < 0) workedHours = 0;
			return true;
		}
		return false;
	}
	
	private void addIndividualHours(int hours, Item item, Worker worker) {
		int value = individualHours.get(item.getWorkerList().indexOf(worker));
		individualHours.set(item.getWorkerList().indexOf(worker), value + hours);
	}
	
}
