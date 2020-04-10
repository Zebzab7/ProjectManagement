package SoftwareHuset;

import java.util.ArrayList;

public class TaskList {
	private ArrayList<Task> tasks = new ArrayList<Task>();
	
	public void addTask(Task task) {
		tasks.add(task);
	}
	public ArrayList<Task> Tasks(){
		return tasks;
	}
}
