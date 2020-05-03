package project_management;

public class FixedActivities {
	private Project project;
	private Activity sickness;
	private Activity holiday;
	private Activity courses;
	
	public Activity getSicknessActivity() {
		return sickness;
	}
	public Activity getHolidayActivity() {
		return holiday;
	}
	public Activity getCoursesActivity() {
		return courses;
	}
	
	public FixedActivities(Project project) {
		this.project = project;
		try {
			project.createActivity("Sickness");
			project.createActivity("Holiday");
			project.createActivity("Courses");
			
			this.sickness = project.findActivity("Sickness");
			this.holiday = project.findActivity("Holiday");
			this.courses = project.findActivity("Courses");
			
		} catch (OperationNotAllowedException e) {
			e.printStackTrace();
		}
	}

}
