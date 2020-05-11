package project_management;

import java.util.*;

public class ItemTimeManager {
	private ArrayList<GregorianCalendar> absenteesReturn = new ArrayList<GregorianCalendar>();
	private ArrayList<Worker> absentees = new ArrayList<Worker>();
	
	private State state = State.getInstance();
	private GregorianCalendar startTime = null;
	private GregorianCalendar endTime = null;
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
	public ItemTimeManager() {
	}
	
	/* 
	 * Following 2 methods sets start and end time, respectively, of project to the given parameters
	 *  Requirements to not cause an exception:
	 *  	- User must be logged in
	 *  	- User must be working on the project
	 *  	- User must project leader
	 *  	- Time must be valid 
	 */ 
	
	public boolean setStartTime(int year, int month, int day, Item object) throws Exception {
		if(object.TimepreConditionsMet()) {
			startTime = new GregorianCalendar(year, month - 1, day);
			if (endTime != null && startTime.after(endTime)) {
				startTime = null;
				throw new Exception("Deadline is invalid");
			}
		}
		return true;
	}
	
	public boolean setEndTime(int year, int month, int day, Item object) throws Exception {
		if(object.TimepreConditionsMet()) {
			endTime = new GregorianCalendar(year, month - 1, day);
			if (startTime != null && startTime.after(endTime)) {
				endTime = null;
				throw new Exception("Deadline is invalid");
				
			}
		}
		return true;
	}
	
	/*
	 * Returns true if start and end times have been specified, false otherwise
	 */
	public boolean containsTimeSpecifications() {
		if(endTime != null && startTime != null) {
			//System.out.println(this.endTime.getTime());
			return true;
		}
		return false;
	}

	/*
	 * Returns true if the project is overdue, false otherwise
	 * Will cause an exception if no deadline has been set
	 */
	public boolean deadlineOverdue() throws Exception {
		if(this.endTime != null) {
			this.currentTime = new GregorianCalendar();
			if(currentTime.after(endTime)) {
				System.out.println("is overdue");
				return true;
			}
			System.out.println("is not overdue");
			return false;
		}
		else {
			System.out.println("FAIL");
			throw new Exception("Deadline must be instantiated");
		}
	}
	
}
