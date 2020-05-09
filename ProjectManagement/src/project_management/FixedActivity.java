package project_management;

import java.util.ArrayList;

public class FixedActivity {
	private Worker absentee;
	private AbsenceManager absenceManager;
	private String name;
	private State state;
	
	public AbsenceManager getAbsenceManager() {
		return absenceManager;
	}
	public String getName() {
		return name;
	}
	public Worker getAbsentee() {
		return absentee;
	}
	
	public FixedActivity(String name, State state, Worker absentee) {
		this.name = name;
		this.state = state;
		this.absentee = absentee;
		absenceManager = new AbsenceManager();
	}
	
}
