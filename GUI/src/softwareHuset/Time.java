package softwareHuset;

public class Time {
	private Activity activity;
	private Worker worker;
	float time;
	
	public Time (Activity activity, Worker worker, float time) {
		this.activity = activity;
		this.worker = worker;
		this.time = time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	public Activity getActivity() {
		return activity;
	}
	public Worker getWorker() {
		return worker;
	}
	
}
