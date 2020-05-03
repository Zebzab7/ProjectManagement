package project_management;

public class ActivityTimeManager extends ProjectTimeManager {
	Activity activity;
	
	public ActivityTimeManager(Project project, State state, Activity activity) {
		super(project, state);
		this.activity = activity;
	}
}
