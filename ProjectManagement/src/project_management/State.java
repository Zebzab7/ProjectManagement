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
	public void setProject(Project project) {
		cProject.unselect();
		project.select();
		cProject = project;
	}
	public void setActivity(Activity activity) {
		cActivity.unselect();
		activity.select();
		this.cActivity = activity;
	}
	public void setFixedActivity(FixedActivity fixedActivity) {
		this.cFixedActivity = fixedActivity;
	}

}
