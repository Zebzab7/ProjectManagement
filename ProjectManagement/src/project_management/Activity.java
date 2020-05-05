package project_management;

import java.util.ArrayList;

public class Activity extends Item {
	private ArrayList<Worker> workers = new ArrayList<Worker>();
	private ArrayList<Integer> accumulatedHours = new ArrayList<Integer>();
	private int expectedTime;
	private int workedHours;
	
	public boolean getPreConditions() throws OperationNotAllowedException {
		if ( getState().currentUser() == null ) {
			throw new OperationNotAllowedException("User login required");
		}
		if(isSelected()) {
			return setPreConditions(true);
		}
		return setPreConditions(false);
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
	
	public boolean addHours(int hours) {
		workedHours += hours;
		if (workedHours < 0) workedHours = 0;
		return true;
	}
}
