package project_management;

public class State {
	private Worker cUser;
	private Project cProject;
	private Activity cActivity;
	private FixedActivity cFixedActivity;
	
	public Worker currentUser() {
		return cUser;
	}
	public Project currentProject() {
		return cProject;
	}
	public Activity currentActivity() {
		return cActivity;
	}
	public FixedActivity currentFixedActivity() {
		return cFixedActivity;
	}
	public void setUser(Worker user) {
		cUser = user;
	}
	public boolean setProject(Project project) {
		cProject = project;
		return true;
	}
	public boolean setActivity(Activity activity) {
		cActivity = activity;
		return true;
	}
	public boolean setFixedActivity(FixedActivity fixedActivity) {
		this.cFixedActivity = fixedActivity;
		return true;
	}

}
