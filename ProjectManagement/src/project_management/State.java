package project_management;

public class State {
	private Worker cUser;
	private Project cProject;
	private Activity cActivity;
	
	public Worker currentUser() {
		return cUser;
	}
	public Project currentProject() {
		return cProject;
	}
	public Activity currentActivity() {
		return cActivity;
	}
	public void setUser(Worker user) {
		cUser = user;
	}
	public void setProject(Project project) {
		cProject = project;
	}
	public void setActivity(Activity activity) {
		this.cActivity = activity;
	}

}
