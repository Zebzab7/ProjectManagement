package project_management;

import java.util.GregorianCalendar;

public class AbsentTimeManager extends ItemTimeManager {
	private Worker worker;
	
	public AbsentTimeManager(State state, Worker worker) {
		super(state);
		this.worker = worker;
	}
	
	public GregorianCalendar getReturnDate(Worker worker) {
		return super.getEndTime();
	}
}
