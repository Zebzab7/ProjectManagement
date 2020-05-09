package project_management;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Worker {
	private ArrayList<Activity> assignedActivities = new ArrayList<Activity>();
	private ArrayList<Project> assignedProjects = new ArrayList<Project>();
	private String username;
	private String password;
	private AbsenceManager absenceManager;
	private int workedHours;
	private boolean help;
	
	public Worker(String username, String password) {
		this.username = username;
		this.password = password;
		this.absenceManager = new AbsenceManager();
	}
	
	public boolean addHours(int hours) {
		workedHours += hours;
		return true;
	}

	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
	public AbsenceManager getAbsenceManager() {
		return absenceManager;
	}
	
	public ArrayList<Project> getAssignedProjects() {
		return assignedProjects;
	}
	public ArrayList<Activity> getAssignedActivities() {
		return assignedActivities;
	}
	
	public boolean isAbsent() {
		if(absenceManager.getEndTime() == null) {
			return false;
		}
		
		GregorianCalendar currentDate = new GregorianCalendar();
		
		if(absenceManager.getStartTime() == null) {
			return true;
		}
		if(currentDate.after(absenceManager.getStartTime()) && currentDate.before(absenceManager.getEndTime())) {
			return true;
		}
		return false;
	}
	
	public void addProject(Project project) {
		assignedProjects.add(project);
	}
	public void addActivity(Activity activity) {
		assignedActivities.add(activity);
	}
	
	public boolean isAvailable() {
		if(assignedActivities.size() < 20 && !isAbsent()) {
			return true;
		}
		return false;
	}
	public boolean grantAssistance() {
		if(isAvailable()) {
			help = true;
			return help;
		}
		help = false;
		return help;
	}
	
}
