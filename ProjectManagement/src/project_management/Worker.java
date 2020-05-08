package project_management;

import java.util.ArrayList;

public class Worker {
	private ArrayList<Activity> activities = new ArrayList<Activity>();
	
	private String username;
	private Project leadingProject;
	private String password;
	private int registerHours;
	private boolean help = false;
	
	public Worker(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public void setLeadingProject(Project project) {
		leadingProject = project;
	}

	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public ArrayList<Activity> getWorkedActivities() {
		return activities;
	}
	//public boolean newActivity(String name, int ET) {
		//return leadingProject.getActivityList().add(new Activity(name, leadingProject));
	//}
	public boolean changeLeader(Worker newLeader) {
		if(leadingProject.getProjectLeader() == this && newLeader != this) {
			leadingProject.setProjectLeader(newLeader);
			return true;
		}
		return false;
	}
	public boolean isAvailable() {
		if(activities.size() < 20) {
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
