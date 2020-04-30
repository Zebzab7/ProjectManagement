package project_management;

public class Time {
	private Activity task;
	private Worker worker;
	float time;
	
	public Time (Activity task, Worker worker, float time) {
		this.task = task;
		this.worker = worker;
		this.time = time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	public Activity getTask() {
		return task;
	}
	public Worker getWorker() {
		return worker;
	}
	
}
