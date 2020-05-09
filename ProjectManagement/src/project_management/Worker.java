package project_management;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Worker {
	private ArrayList<Activity> assignedActivities = new ArrayList<Activity>();
	private ArrayList<Project> assignedProjects = new ArrayList<Project>();
	private ArrayList<FixedActivity> assignedFixedActivities = new ArrayList<FixedActivity>();
	private String username;
	private String password;
	private int workedHours;
	private boolean help;
	
	public Worker(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public boolean addHours(int hours) {
		workedHours += hours;
		return true;
	}

	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
	public ArrayList<FixedActivity> getAssignedFixedActivityList() {
		return assignedFixedActivities;
	}
	
	public ArrayList<Project> getAssignedProjects() {
		return assignedProjects;
	}
	public ArrayList<Activity> getAssignedActivities() {
		return assignedActivities;
	}
	
	public boolean isAbsent() {
		for(FixedActivity f : assignedFixedActivities) {
			if(f.getAbsenceManager().hasStarted()) {
				return true;
			}
		}
		return false;
	}
	
	public void addProject(Project project) {
		assignedProjects.add(project);
	}
	public void addActivity(Activity activity) {
		assignedActivities.add(activity);
	}
	public void addFixedActivity(FixedActivity fActivity) {
		assignedFixedActivities.add(fActivity);
	}
	
	public void removeProject(Project project) {
		assignedProjects.remove(project);
	}
	public void removeActivity(Activity activity) {
		assignedActivities.remove(activity);
	}
	public void removeFixedActivity(FixedActivity fActivity) {
		assignedFixedActivities.remove(fActivity);
	}
	
	public boolean isAvailable() {
		if(assignedActivities.size() < 20 && !isAbsent()) {
			return true;
		}
		return false;
	}
	public boolean grantAssistance() {
		if(isAvailable()) {
			help = true;
			return help;
		}
		help = false;
		return help;
	}
	
}
