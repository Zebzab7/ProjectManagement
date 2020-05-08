package project_management;

import java.util.ArrayList;

public class Worker {
	private ArrayList<Activity> assignedActivities = new ArrayList<Activity>();
	private ArrayList<Project> assignedProjects = new ArrayList<Project>();
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
	
	public ArrayList<Project> getAssignedProjects() {
		return assignedProjects;
	}
	public ArrayList<Activity> getAssignedActivities() {
		return assignedActivities;
	}
	
	public void addProject(Project project) {
		assignedProjects.add(project);
	}
	public void addActivity(Activity activity) {
		assignedActivities.add(activity);
	}
	
	public boolean isAvailable() {
		if(assignedActivities.size() < 20) {
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
