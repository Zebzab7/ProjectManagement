package project_management;

import java.util.ArrayList;

public class Worker {
	private ArrayList<Activity> assignedActivities = new ArrayList<Activity>();
	private ArrayList<Integer> workHoursOnActivities = new ArrayList<Integer>();
	private ArrayList<Project> assignedProjects = new ArrayList<Project>();
	private ArrayList<FixedActivity> assignedFixedActivities = new ArrayList<FixedActivity>();
	private String username;
	private String password;
	private int workedHours = 0;
	private boolean help;
	
	public Worker(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public int getHoursOnActivity(Activity activity) {
		return workHoursOnActivities.get(assignedActivities.indexOf(activity));
	}	
	public boolean addHours(int hours, Activity activity) {
		int addHours = workHoursOnActivities.get(assignedActivities.indexOf(activity)) + hours;
		workHoursOnActivities.set(assignedActivities.indexOf(activity), addHours);
		workedHours += hours;
		return true;
	}
	public int workedHours() {
		return workedHours;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
	public ArrayList<Project> getAssignedProjects() {
		return assignedProjects;
	}
	public ArrayList<Activity> getAssignedActivities() {
		return assignedActivities;
	}
	public ArrayList<FixedActivity> getAssignedFixedActivityList() {
		return assignedFixedActivities;
	}
	public ArrayList<Integer> getWorkedHoursOnActivities() {
		return workHoursOnActivities;
	}
	
	public void setHelpStatus(boolean status) {
		this.help=status;
	}
	
	public boolean isAvailable() {
		if(assignedActivities.size() < 20 && !isAbsent()) {
			return true;
		}
		return false;
	}
	public boolean grantAssistance() {
		assert(this != null);
		if(isAvailable() && help == true) {
			assert(isAvailable());
			return true;
		}
		return false;
	}
	
	
	public boolean isAbsent() {
		for(FixedActivity f : assignedFixedActivities) {
			if(f.getAbsenceManager().hasStarted()) {
				return true;
			}
		}
		return false;
	}
	
	public void addActivity(Activity activity) {
		if(!assignedActivities.contains(activity)) {
			assignedActivities.add(activity);
			workHoursOnActivities.add(0);
		}
	}
	public void removeActivity(Activity activity) {
		if(assignedActivities.contains(activity)) {
			workHoursOnActivities.remove(assignedActivities.indexOf(activity));
			assignedActivities.remove(activity);
		}
	}
	
//	METHODS FOR GUI

	public boolean addAssignedProject(Project p) {												
		
		if(assignedProjects.contains(p)) {
			return false;
		}
		return assignedProjects.add(p);
	}
	
}
