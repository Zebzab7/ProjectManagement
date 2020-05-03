package project_management;

public class AbsentTimeManager extends ActivityTimeManager {
	private Worker worker;
	
	public AbsentTimeManager(Project project, State state, Activity activity, Worker worker) {
		super(project, state, activity);
		this.worker = worker;
	}
}
