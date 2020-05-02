package project_management;

public class Time {
	private int hours;
	private Worker worker;
	private Project project;
	
	public Time(int hours) {
		this.hours = hours;
	}
	
	public void appointWorker(Worker worker) {
		this.worker = worker;
	}
	
	public void appointProject(Project project) {
		this.project = project;
	}
	
	public int getHours() {
		return hours;
	}
	
	public void addHours(int hours) {
		this.hours += hours;
	}
}
