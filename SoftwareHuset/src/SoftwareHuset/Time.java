package SoftwareHuset;

public class Time {
	private Task task;
	private Worker worker;
	float time;
	
	
	public Time (Task task, Worker worker, float time) {
		this.task = task;
		this.worker = worker;
		this.time = time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	public Task getTask() {
		return task;
	}
	public Worker getWorker() {
		return worker;
	}
	
}
