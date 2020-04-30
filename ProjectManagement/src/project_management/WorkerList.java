package project_management;

import java.util.ArrayList;

public class WorkerList {
	private ArrayList<Worker> workers = new ArrayList<Worker>();
	
	public void addWorker(Worker worker) {
		workers.add(worker);
	}
	public ArrayList<Worker> Workers(){
		return workers;
	}

}
