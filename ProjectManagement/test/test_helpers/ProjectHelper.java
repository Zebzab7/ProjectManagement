package test_helpers;

import project_management.Project;
import project_management.State;
public class ProjectHelper {
	private State user;
	private Project project;
	
	public ProjectHelper(State user) {
		this.user = user;
	}
	
	public void setProject(Project project) {
		this.project = project;
	}
	
	public Project getProject() {
		if (project == null) {
			project = exampleProject();
		}
		return project;
	}
	
	private Project exampleProject() {
		project = new Project("Programming 101", "", user);
		return project;
	}
}
