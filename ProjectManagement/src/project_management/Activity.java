package project_management;

import java.util.ArrayList;

public class Activity {
	Project project;
	
	String name;
	double ET;	
	int ID;
	
	public Activity(String name, double ET, Project project) {
		int ID = project.getTaskList().size() + 1;
		this.name = name;
		this.ET = ET;
		this.project = project;
	}
	
	public String getName() {
		return name;
	}
	
}
