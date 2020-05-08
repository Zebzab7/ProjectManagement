package project_management;

import java.util.ArrayList;

public class RegisterHours {
	
	private State state;
	private int workedHours = 0;
	private int projectWorkedHours = 0;
	private ArrayList<Integer> individualHours = new ArrayList<Integer>();
	
	public ArrayList<Integer> getIndividualHoursList() {
		return individualHours;
	}
	public int getWorkedHours() {
		return workedHours;
	}
	public int getProjectHours() {
		return projectWorkedHours;
	}
	
	public RegisterHours(State state) {
		this.state = state;
	}
	
	public boolean addHours(int hours, Item item) throws OperationNotAllowedException {
		if(item instanceof Project) {
			throw new OperationNotAllowedException("Can't add hours to project");
		}
		if(item.preConditionsMet()) {
			if(item instanceof Activity) {
				
			}
			setWorkedHours(hours);
			addIndividualHours(hours, item, state.currentUser());
			if (workedHours < 0) workedHours = 0;
			return true;
		}
		return false;
	}
	
	public boolean addHoursWithWorker(int halfHours, Item item, Worker worker) throws OperationNotAllowedException {
		if(item instanceof Project) {
			throw new OperationNotAllowedException("Can't add hours to project");
		}
		if(item.preConditionsMet()) {
			setWorkedHours(halfHours);
			addIndividualHours(halfHours, item, worker);
			if (workedHours < 0) workedHours = 0;
			return true;
		}
		return false;
	}
	
	private void addIndividualHours(int halfHours, Item item, Worker worker) {
		int value = individualHours.get(item.getWorkerList().indexOf(worker));
		individualHours.set(item.getWorkerList().indexOf(worker), value + halfHours);
	}
	private void setWorkedHours(int halfHours) {
		workedHours+=halfHours;
	}
	private void addHoursToProject(int halfHours, Project project) {
		projectWorkedHours += halfHours;
	}
	
}
