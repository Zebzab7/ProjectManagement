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
		return project.getTaskList().Tasks().add(new Task(name, ET, project));
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
