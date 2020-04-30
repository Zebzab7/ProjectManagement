package acceptance_tests;

import project_management.Project;
import project_management.User;
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
