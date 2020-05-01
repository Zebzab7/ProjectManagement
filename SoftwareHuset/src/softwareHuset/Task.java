package softwareHuset;

import java.util.ArrayList;

public class Task {
	Project project;
	
	
	String name;
	double ET;	
	int ID;
	
	private WorkerList workers;
	
	public Task(String name, double ET, Project project) {
		int ID = project.getTaskList().size()+1;
		this.name = name;
		this.ET = ET;
		this.project = project;
	}
	
	public String getName() {
		return name;
	}
	
}
