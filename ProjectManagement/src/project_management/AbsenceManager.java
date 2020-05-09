package project_management;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class AbsenceManager {
	private GregorianCalendar startTime = new GregorianCalendar();
	private GregorianCalendar endTime = new GregorianCalendar();
	private Worker worker;
	private State state;
	
	public AbsenceManager(Worker worker, State state) {
		this.worker = worker;
		this.state = state;
	}
	
	public void setStartTime(int year, int month, int day) throws OperationNotAllowedException {
		if(state.currentUser() == null) throw new OperationNotAllowedException("User login required");
		startTime.set(year, month - 1, day);
	}
	public void setEndTime(int year, int month, int day) throws OperationNotAllowedException {
		if(state.currentUser() == null) throw new OperationNotAllowedException("User login required");
		endTime.set(year, month - 1, day);
	}
}
