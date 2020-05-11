package project_management;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class AbsenceManager {
	private GregorianCalendar startTime = null;
	private GregorianCalendar endTime = null;
	
	public GregorianCalendar getStartTime() {
		return startTime;
	}
	public GregorianCalendar getEndTime() {
		return endTime;
	}
	
	public AbsenceManager() {
	}
	
	public boolean setStartTime(int year, int month, int day) throws Exception {
		startTime = new GregorianCalendar(year, month - 1, day);
		return true;
	}
	public boolean setEndTime(int year, int month, int day) throws Exception {
		endTime = new GregorianCalendar(year, month - 1, day);
		return true;
	}
	

	public boolean hasStarted() {
		if(endTime == null) {
			return false;
		}
		
		if(endTime != null && startTime == null) {
			return true;
		}
		
		GregorianCalendar currentTime = new GregorianCalendar();
		
		if(currentTime.after(startTime) && currentTime.before(endTime)) {
			return true;
		}
		return false;
		
	}
}
