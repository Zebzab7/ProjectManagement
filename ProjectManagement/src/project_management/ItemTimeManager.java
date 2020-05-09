package project_management;

import java.util.*;

public class ItemTimeManager {
	
	private State state;
	private GregorianCalendar startTime = new GregorianCalendar();
	private GregorianCalendar endTime = new GregorianCalendar();
	private boolean startTimeSpecified = false;
	private boolean endTimeSpecified = false;
	private GregorianCalendar currentTime, absentee;
	
	/*
	 * Getter methods
	 */
	public GregorianCalendar getStartTime() {
		return startTime;
	}
	public GregorianCalendar getEndTime() {
		return endTime;
	}
	public int getStartWeek() {
		return startTime.get(GregorianCalendar.WEEK_OF_MONTH);
	}
	public int getEndWeek() {
		return endTime.get(GregorianCalendar.WEEK_OF_MONTH);
	}
	
	/*
	 * Constructor
	 */
	public ItemTimeManager(State state) {
		this.state = state;
	}
	
	/* 
	 * Following 2 methods sets start and end time, respectively, of project to the given parameters
	 *  Requirements to not cause an exception:
	 *  	- User must be logged in
	 *  	- User must be working on the project
	 *  	- User must project leader
	 *  	- Time must be valid 
	 */ 
	
	public boolean setStartTime(int year, int month, int day, Item object) throws OperationNotAllowedException {
		if(object.preConditionsMet()) {
			startTime.set(year, month - 1, day);
			if (endTimeSpecified && startTime.after(endTime)) {
				throw new OperationNotAllowedException("Deadline is invalid");
			}
			startTimeSpecified = true;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean setEndTime(int year, int month, int day, Item object) throws OperationNotAllowedException {
		if(object.preConditionsMet()) {
			endTime.set(year, month - 1, day);
			if (startTimeSpecified && startTime.after(endTime)) {
				throw new OperationNotAllowedException("Deadline is invalid");
			}
			endTimeSpecified = true;
			return true;
		}
		else {
			return false;
		}
	}
	
	/*
	 * Returns true if start and end times have been specified, false otherwise
	 */
	public boolean containsTimeSpecifications() {
		if(endTimeSpecified != false && startTimeSpecified != false) {
			//System.out.println(this.endTime.getTime());
			return true;
		}
		return false;
	}
	/*
	 * Returns true if a start time for the project has been set, false otherwise
	 */
	public boolean startTimeSet() {
		if(startTimeSpecified != false) {
			return true;
		}
		return false;
	}
	/*
	 * Returns true if an end time for the project has been set, false otherwise
	 */
	public boolean endTimeSet() {
		if(endTimeSpecified != false) {
			return true;
		}
		return false;
	}
	/*
	 * Returns true if the project is overdue, false otherwise
	 * Will cause an exception if no deadline has been set
	 */
	public boolean deadlineOverdue() {
		if(this.startTime != null && this.endTime != null) {
			this.currentTime = new GregorianCalendar();
			if(endTime.after(currentTime)) {
				return true;
			}
			return false;
		}
		else {
			throw new IllegalArgumentException("Deadline must be instantiated");
		}
	}
	
}
