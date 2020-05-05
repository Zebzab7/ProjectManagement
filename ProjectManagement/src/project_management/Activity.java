package project_management;

import java.util.ArrayList;

public class Activity extends Item {
	private ArrayList<Worker> workers = new ArrayList<Worker>();
	private ArrayList<Integer> accumulatedHours = new ArrayList<Integer>();
	private int expectedTime;
	private int workedHours;
	
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
	
	public boolean setStartTime(int year, int month, int day) throws OperationNotAllowedException {
		if (isSelected()) {
			getTimeManager().setStartTime(year, month, day);
			return true;
		}
		return false;
	}
	
	public boolean setEndTime(int year, int month, int day) throws OperationNotAllowedException {
		if (isSelected()) {
			getTimeManager().setStartTime(year, month, day);
			return true;
		}
		return false;
	}
	
	public boolean addHours(int hours) {
		workedHours += hours;
		if (workedHours < 0) workedHours = 0;
		return true;
	}
}
