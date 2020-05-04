package project_management;

import java.util.*;

public class TimeManager {
	private ArrayList<GregorianCalendar> absenteesReturn = new ArrayList<GregorianCalendar>();
	private ArrayList<Worker> absentees = new ArrayList<Worker>();
	
	private State state;
	private GregorianCalendar startTime, endTime, currentTime, absentee;
	
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
		return this.startTime.get(GregorianCalendar.WEEK_OF_MONTH);
	}
	public int getEndWeek() {
		return this.endTime.get(GregorianCalendar.WEEK_OF_MONTH);
	}
	
	/*
	 * Constructor
	 */
	public TimeManager(State state) {
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
	public void setStartTime(int year, int month, int day) throws OperationNotAllowedException {
		
		if (state.currentUser() == null) throw new OperationNotAllowedException("User login required");
		
		if(state.currentProject() != null && state.currentActivity() == null) {
			
			if(!state.currentProject().hasProjectLeader() ||
				   !state.currentUser().getUsername().equals(state.currentProject().getProjectLeader().getUsername()) || 
				   !state.currentUser().getPassword().equals(state.currentProject().getProjectLeader().getPassword())) {
				   throw new OperationNotAllowedException("User is not the project leader");
				}
					this.startTime = new GregorianCalendar(year, month - 1, day);
			}
		else {
			this.startTime = new GregorianCalendar(year, month - 1, day);
		}
		
		if(endTime != null && startTime.after(endTime)) {
			startTime = null;
			throw new OperationNotAllowedException("Deadline is invalid");
		}
		
	}
	public void setEndTime(int year, int month, int day) throws OperationNotAllowedException {
		
		if (state.currentUser() == null) throw new OperationNotAllowedException("User login required");
		
		if(state.currentProject() != null && state.currentActivity() == null) {
			
				if(!state.currentProject().hasProjectLeader() ||
				   !state.currentUser().getUsername().equals(state.currentProject().getProjectLeader().getUsername()) || 
				   !state.currentUser().getPassword().equals(state.currentProject().getProjectLeader().getPassword())) {
				   throw new OperationNotAllowedException("User is not the project leader");
				}
				
				this.endTime = new GregorianCalendar(year, month - 1, day);
		}
		else {
			this.endTime = new GregorianCalendar(year, month - 1, day);
		}
		
		if(startTime != null && startTime.after(endTime)) {
			endTime = null;
			throw new OperationNotAllowedException("Deadline is invalid");
		}
	}
	/*
	 * Returns true if start and end times have been specified, false otherwise
	 */
	public boolean containsTimeSpecifications() {
		if(this.endTime != null && this.startTime != null) {
			//System.out.println(this.endTime.getTime());
			return true;
		}
		return false;
	}
	/*
	 * Returns true if a start time for the project has been set, false otherwise
	 */
	public boolean startTimeSet() {
		if(this.startTime != null) {
			return true;
		}
		return false;
	}
	/*
	 * Returns true if an end time for the project has been set, false otherwise
	 */
	public boolean endTimeSet() {
		if(this.endTime != null) {
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
