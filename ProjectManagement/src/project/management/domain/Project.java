package project.management.domain;

import java.util.ArrayList;

public class Project {
	private String name;
	private User projectManager;
	private ArrayList<User> projectUsers = new ArrayList<User>();
	private ArrayList<Activity> projectActivities = new ArrayList<Activity>();
	
	public Project(String name) {
		this.name = name;
	}
		
	public void setManager(User user) {
		projectManager = user;
	}
	
	public void assignUser(User user) {
		if ( projectManager.isLoggedIn() ) projectUsers.add(user);
		
	}
}
