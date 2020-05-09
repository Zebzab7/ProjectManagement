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
		absenceManager = absentee.getAbsenceManager();
	}
	
	public void setWorker(Worker worker) throws OperationNotAllowedException {
		if(state.currentUser() == null) {
			throw new OperationNotAllowedException("User login required");
		}
		if(worker != null) {
			worker.getAbsenceManager().setFixedTime(absentee.getAbsenceManager().getStartTime(),absentee.getAbsenceManager().getEndTime());
			absentee.getAbsenceManager().removeTimeSpecifications();
			this.absentee = worker;
		}
		throw new OperationNotAllowedException("Worker not registered");
		
	}
	
}
