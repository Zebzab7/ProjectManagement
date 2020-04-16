package acceptance_tests;

import softwareHuset.Project;

public class ProjectHelper {
	private Project project;
	
	public Project getProject() {
		if (project == null) {
			project = exampleProject();
		}
		return project;
	}
	
	private Project exampleProject() {
		project = new Project("Programming 101", "");
		return project;
	}
}
