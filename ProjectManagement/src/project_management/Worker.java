package project_management;

import java.util.ArrayList;

public class Worker {
	private ArrayList<Activity> activities = new ArrayList<Activity>();
	private String username;
	private Project leadingProject;
	private String password;
	private int workedHours;
	
	private int registerHours;
	
	public Worker(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public void setLeadingProject(Project project) {
		leadingProject = project;
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
}
