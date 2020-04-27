package softwareHuset;

import java.util.ArrayList;

public class Worker {
	private String username;
	
	Project project;
	String password;
	private ArrayList<Task> tasks = new ArrayList<Task>();
	
	public Worker(String username, String password) {
		this.username = username;
		this.password = password;
	}
	// set get
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
	// new task
	public boolean newTask(String name, int ET) {
		return project.getTaskList().add(new Task(name, ET, project));
	}
	//set time
	public boolean setTime(Task task, float time) {
		for (Time e : project.getTimeManager().getTimers()) {
			if (e.getTask() == task && e.getWorker() == this) {
				e.setTime(time);
				return true;
			}
		}
		if(project.getTimeManager().getTimers().add(new Time(task, this, time))){
			return true;
		}
		return false;
	}
	
	//change leader
	public boolean changeLeader(Worker newLeader) {
		if(project.getProjectLeader() == this && newLeader != this) {
			project.setProjectLeader(newLeader);
			return true;
		}
		return false;
	}
}
