package project_management;

import java.util.ArrayList;

public class FixedActivity {
	private ArrayList<Worker> absentees = new ArrayList<Worker>();
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
	public ArrayList<Worker> getAbsentees() {
		return absentees;
	}
	
	public FixedActivity(String name, State state) {
		this.name = name;
		this.state = state;
		absenceManager = new AbsenceManager(absentee, state);
	}
	
	public FixedActivity(String name, State state, Worker absentee) {
		this.name = name;
		this.state = state;
		this.absentee = absentee;
		absentees.add(absentee);
		absenceManager = new AbsenceManager(absentee, state);
	}
	
	public void setWorker(Worker worker) {
		if(absentee == null) {
			this.absentee = worker;
			absentees.add(worker);
		}
		else {
			absentees.remove(absentee);
			this.absentee = worker;
			absentees.add(worker);
		}
	}
	
	/*
	 * Returns true, if the current user is assigned to an absent activity
	 */
	public boolean workerIsAbsent(Worker worker) {
		for(Worker absent : absentees) {
			if(absent.getUsername().equals(worker.getUsername())) {
				return true;
			}
		}
		return false;
	}
	
}
