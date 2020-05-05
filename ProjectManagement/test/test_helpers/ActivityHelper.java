package test_helpers;

import project_management.Activity;
import project_management.Project;
import project_management.State;

public class ActivityHelper {
	private State state;
	private Activity activity;
	
	public ActivityHelper(State state) {
		this.state = state;
	}
	
	public boolean setActivity(Activity activity) {
		this.activity = activity;
		return true;
	}
	
	public Activity getActivity() {
		if (activity == null) {
			activity = exampleActivity();
		}
		return activity;
	}
	
	private Activity exampleActivity() {
		activity = new Activity("Activity101", 10, state);
		return activity;
	}
}
