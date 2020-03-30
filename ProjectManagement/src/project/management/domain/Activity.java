package project.management.domain;

public class Activity {
	private int startTime, endTime, estimatedWorkTime;
	
	public Activity(String name, int estimatedWorkTime) {
		this.estimatedWorkTime = estimatedWorkTime;
	}
	
	public void beginActivity() {
		startTime = Time.recordTime();
	}
}
