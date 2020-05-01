package project_management;

import java.util.ArrayList;

public class Worker {
	private ArrayList<Activity> activities = new ArrayList<Activity>();
	
	private String username;
	private Project leadingProject;
	private String password;
	private int registerHours;
	
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
	public boolean newActivity(String name, int ET) {
		return leadingProject.getTaskList().add(new Activity(name, ET, leadingProject));
	}
	public boolean setTime(Activity task, float time) {
		for (Time e : leadingProject.getTimeManager().getTimers()) {
			if (e.getTask() == task && e.getWorker() == this) {
				e.setTime(time);
				return true;
			}
		}
		if(leadingProject.getTimeManager().getTimers().add(new Time(task, this, time))){
			return true;
		}
		return false;
	}
	public boolean changeLeader(Worker newLeader) {
		if(leadingProject.getProjectLeader() == this && newLeader != this) {
			leadingProject.setProjectLeader(newLeader);
			return true;
		}
		return false;
	}
	
}
