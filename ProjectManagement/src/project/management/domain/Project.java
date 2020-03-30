package project.management.domain;

public class Project {
	private String name;
	private User projectManager;
	
	public Project(String name) {
		this.name = name;
	}
		
	public void setManager(User user) {
		projectManager = user;
	}
}
