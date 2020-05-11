package project_management;

public class State {
	private Worker cUser;
	private Project cProject;
	private Activity cActivity;
	private FixedActivity cFixedActivity;
	private static State instance;
	
	private State() {
	}
	
	public static State getInstance() {
		if(instance == null) {
			instance = new State();
		}
		return instance;
	}
	// used for cucumber
	public static void deleteInstance() {
		instance = null;
	}
	
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
