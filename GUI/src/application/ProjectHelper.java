package application;

import softwareHuset.Project;
import softwareHuset.State;
public class ProjectHelper {
	private State state;
	private Project project;
	
	public ProjectHelper(State state) {
		this.state = state;
	}
	
	public Project getProject() {
		if (project == null) {
			project = exampleProject();
		}
		return project;
	}
	
	private Project exampleProject() {
		project = new Project("Programming 101", "",state);
		return project;
	}
}
