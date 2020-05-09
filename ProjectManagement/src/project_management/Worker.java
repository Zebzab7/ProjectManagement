package project_management;

import java.util.ArrayList;

public class Worker {
	private ArrayList<Activity> assignedActivities = new ArrayList<Activity>();
	private ArrayList<Integer> workHoursOnActivities = new ArrayList<Integer>();
	private ArrayList<Project> assignedProjects = new ArrayList<Project>();
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
		System.out.println("add hours on activity from worker: " + this);
		workHoursOnActivities.set(assignedActivities.indexOf(activity), hours);
		workedHours += hours;
		return true;
	}
	public int getHours() {
		return workedHours;
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
	
	public void addProject(Project project) {
		assignedProjects.add(project);
	}
	public void addActivity(Activity activity) {
		assignedActivities.add(activity);
		workHoursOnActivities.add(0);
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
