package softwareHuset;

public class User {
	private Worker cUser;
	private Project cProject;
	private Task cTask;
	
	public Worker currentUser() {
		return cUser;
	}
	public Project currentProject() {
		return cProject;
	}
	public Task currentTask() {
		return cTask;
	}
	public void setUser(Worker user) {
		cUser = user;
	}
	public void setProject(Project project) {
		cProject = project;
	}
	public void setTask(Task task) {
		cTask = task;
	}

}
