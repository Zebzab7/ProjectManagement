package project_management;

import java.util.ArrayList;

//public class Activity1 {
//	Project project;
//	private ArrayList<Worker> workers = new ArrayList<Worker>();
//	private ArrayList<Integer> accumulatedHours = new ArrayList<Integer>();
//	private ArrayList<AbsentTimeManager> absentees = new ArrayList<AbsentTimeManager>();
//	
//	private int workedHours;
//	private int initialHours = 0;
//	private int expectedTime;
//	
//	private String name;
//	private State state;
//	private ItemTimeManager timeManager;
//	private FixedActivity absenteeCheck;
//	int ID;
//	
//	public String getName() {
//		return name;
//	}
//	public ArrayList<Integer> getAccumulatedHoursList() {
//		return accumulatedHours;
//	}
//	public int getWorkersAccumulatedHours(Worker worker) {
//		return accumulatedHours.get(workers.indexOf(worker));
//	}
//	public int workedHours() {
//		return workedHours;
//	}
//	public int workerHours(Worker worker) {
//		return 0;
//	}
//	public ItemTimeManager getTM() {
//		return timeManager;
//	}
//	
//	/*
//	 * Constructor
//	 */
//	public Activity(String name, Project project, State state) {
//		int ID = project.getActivityList().size() + 1;
//		this.name = name;
//		this.project = project;
//		this.state = state;
//		this.timeManager = new ItemTimeManager(this.state);
//		this.absenteeCheck = new FixedActivity(name,state);
//	}
//	
//	public Activity(String name, int ET, State state) {
////		int ID = project.getActivityList().size() + 1;
//		this.name = name;
//		this.state = state;
//		this.timeManager = new ItemTimeManager(this.state);
//		this.absenteeCheck = new FixedActivity(name,state);
//		expectedTime = ET;
//	}
//	
//	public Activity(String name, State state) throws OperationNotAllowedException {
////		int ID = project.getActivityList().size() + 1;
//		this.name = name;
//		this.state = state;
//		this.timeManager = new ItemTimeManager(this.state);
//		this.absenteeCheck = new FixedActivity(name,state);
//		expectedTime = 0;
//	}
//	
//	public boolean selectActivity() {
//		if(state.currentUser() != null && workers.contains(state.currentUser())) {
//			state.setActivity(this);
//			return true;
//		}
//		return false;
//	}
//	
//	/*
//	 * Returns true if given worker exists in project, false otherwise
//	 */
//	public boolean containsWorker(Worker worker) {
//		for (Worker w : workers) {
//			if (w.getUsername().equals(worker.getUsername())) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	/*
//	 * Adds the given worker as a worker on the project
//	 */
//	public void addWorker(Worker worker) throws Exception {
//		if(absenteeCheck.workerIsAbsent(worker)) {
//			throw new Exception("Worker is absent");
//		}
//		workers.add(worker);
//		accumulatedHours.add(initialHours);
//	}
//	
//	/*
//	 * Removes the given worker from the project
//	 */
//	public void removeWorker(Worker worker) {
//		accumulatedHours.remove(workers.indexOf(worker));
//		workers.remove(worker);
//	}
//	
//	public boolean addHours(int hours) throws OperationNotAllowedException {
//		if ( state.currentUser() == null ) throw new OperationNotAllowedException("User login required");
//		
//		if(absenteeCheck.workerIsAbsent(state.currentUser())) {
//			throw new OperationNotAllowedException("Worker is absent");
//		}
//		
//		if ( containsWorker(state.currentUser()) && !absenteeCheck.workerIsAbsent(state.currentUser())) {
//			workedHours += hours;
//			
//			// Increments work hours for individual - activity and project
//			int incValueActivity = accumulatedHours.get(workers.indexOf(state.currentUser()));
//			int incValueProject = project.getAHList().get(project.getWorkerList().indexOf(state.currentUser()));
//			accumulatedHours.set(workers.indexOf(state.currentUser()), incValueActivity + hours);
//			project.getAHList().set(project.getWorkerList().indexOf(state.currentUser()), incValueProject + hours);
//			
//			if ( workedHours < 0 ) workedHours = 0;
//			return true;
//		}
//		return false;
//	}
//}
