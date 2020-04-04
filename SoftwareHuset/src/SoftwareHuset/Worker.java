package SoftwareHuset;
public class Worker {
	String username;
	
	Project project;
	
	TaskList taskList;
	
	public Worker(String username, Project project) {
		this.username = username;
		this.project = project;
	}
	// new task
	public boolean newTask(String name, int ET) {
		return project.getTaskList().tasks.add(new Task(name, ET, project));
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
