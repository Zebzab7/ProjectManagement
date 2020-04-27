package application;

import softwareHuset.Project;
import softwareHuset.User;
public class ProjectHelper {
	private User user;
	private Project project;
	
	public ProjectHelper(User user) {
		this.user = user;
	}
	
	public Project getProject() {
		if (project == null) {
			project = exampleProject();
		}
		return project;
	}
	
	private Project exampleProject() {
		project = new Project("Programming 101", "",user);
		return project;
	}
}
