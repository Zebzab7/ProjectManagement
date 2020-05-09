package project_management;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class AbsenceManager {
	private GregorianCalendar startTime = new GregorianCalendar();
	private GregorianCalendar endTime = new GregorianCalendar();
	
	public GregorianCalendar getStartTime() {
		return startTime;
	}
	public GregorianCalendar getEndTime() {
		return endTime;
	}
	
	public AbsenceManager() {
	}
	
	public void setStartTime(int year, int month, int day) throws OperationNotAllowedException {
		startTime.set(year, month - 1, day);
	}
	public void setEndTime(int year, int month, int day) throws OperationNotAllowedException {
		endTime.set(year, month - 1, day);
	}
	
	public void removeTimeSpecifications() {
		startTime = null;
		endTime = null;
	}
	
	public boolean hasStarted() {
		if(endTime == null) {
			return false;
		}
		
		if(startTime == null && endTime != null) {
			return true;
		}
		
		GregorianCalendar currentTime = new GregorianCalendar();
		
		if(currentTime.after(startTime) && currentTime.before(endTime)) {
			return true;
		}
		return false;
		
	}
	
}
