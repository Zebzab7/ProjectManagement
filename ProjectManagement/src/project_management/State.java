package project_management;

public class State {
	private Worker cUser;
	private Project cProject;
	private Activity cTask;
	
	public Worker currentUser() {
		return cUser;
	}
	public Project currentProject() {
		return cProject;
	}
	public Activity currentTask() {
		return cTask;
	}
	public void setUser(Worker user) {
		cUser = user;
	}
	public void setProject(Project project) {
		cProject = project;
	}
	public void setTask(Activity task) {
		cTask = task;
	}

}
