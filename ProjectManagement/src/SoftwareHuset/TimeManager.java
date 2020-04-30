package softwareHuset;

import java.util.ArrayList;

public class TimeManager {
	private ArrayList<Time> timers;
	
	public TimeManager() {
		timers = new ArrayList<Time>();
	}
	
	public ArrayList<Time> getTimers() {
		return timers;
	}
	public boolean addTime(Time e) {
		if (timers.add(e)) {
			return true;
		}
		return false;
	}
}
