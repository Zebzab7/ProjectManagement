package project_management;

import java.util.ArrayList;

public class FixedActivity {
	private Worker absentee;
	private AbsenceManager absenceManager;
	private String name;
	
	public AbsenceManager getAbsenceManager() {
		return absenceManager;
	}
	public String getName() {
		return name;
	}
	public Worker getAbsentee() {
		return absentee;
	}
	
	public FixedActivity(String name, Worker absentee) {
		this.name = name;
		this.absentee = absentee;
		absenceManager = new AbsenceManager();
	}
	
}
