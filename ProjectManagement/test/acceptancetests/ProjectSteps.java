package acceptancetests;

import static org.hamcrest.CoreMatchers.equalTo;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project_management.*;
import test_helpers.ErrorMessageHolder;
import test_helpers.ItemHolder;

public class ProjectSteps {
	private ManagementApp managementApp;
	private ErrorMessageHolder errorMessage;
	private ItemHolder itemHolder;
	private Worker worker;
	
	private Worker workerFound;
	String projectName;
	
	public ProjectSteps(ErrorMessageHolder errorMessage, ItemHolder stateHelper) {
		this.managementApp = ManagementApp.getInstance();
		this.errorMessage = errorMessage;
		this.itemHolder = stateHelper;
	}
	
	@Given("the project with name {string} does not exist")
	public void theProjectWithNameDoesNotExist(String name) throws Exception {
		assertFalse(managementApp.containsProject(name));
	}
	
	@Given("the project with name {string} does exist")
	public void theProjectWithNameDoesExist(String name) throws Exception {
		try {
			itemHolder.logInTemp();
			if ( !managementApp.containsProject(name) ) {
				itemHolder.setProject(new Project(name));
				assertTrue(managementApp.addProject(itemHolder.getProject()));
			}
			assertTrue(managementApp.containsProject(name));
			this.projectName = name;
			itemHolder.logOutTemp();
	    } catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Given("the worker is working on the project")
	public void theWorkerIsWorkingOnTheProject() throws Exception, Exception {
		if(!itemHolder.getProject().containsWorker(itemHolder.getWorker())) {
			itemHolder.getProject().addWorker(itemHolder.getWorker());
		}
		assertTrue(itemHolder.getProject().containsWorker(itemHolder.getWorker()));
	}
		
	
	@Given("worker with name {string} and password {string} is contained in the project")
	public void workerWithNameAndPasswordIsContainedInTheProject(String name, String password) throws Exception {
		assertTrue(itemHolder.getProject().addWorker(new Worker(name, password)));
	}
	
	@Given("the worker is not working on the project")
	public void theWorkerIsNotWorkingOnTheProject() throws Exception {
		worker = itemHolder.getWorker();
		if ( itemHolder.getProject().containsWorker(managementApp.getState().currentUser()) ) {
			itemHolder.getProject().removeWorker(worker);
		}
	    assertFalse(itemHolder.getProject().containsWorker(worker));
	}
	
	@Given("the worker is the projectleader")
	public void theWorkerIsTheProjectleader() throws Exception {
		itemHolder.logInTemp();
		if ( !itemHolder.getProject().isProjectLeader(managementApp.getState().currentUser()) ) {
			
			itemHolder.getProject().addWorker(itemHolder.getWorker());
			itemHolder.getProject().setProjectLeader(itemHolder.getWorker());
		}
		
		itemHolder.logOutTemp();
		assertTrue(itemHolder.getProject().isProjectLeader(itemHolder.getWorker()));
	}
	
	@Given("the project is selected")
	public void theProjectIsSelected() throws Exception {
		if ( itemHolder.getProject() != null && !itemHolder.getProject().containsWorker(itemHolder.getWorker()) ) {
			managementApp.getState().setProject(itemHolder.getProject());
			itemHolder.getProject().addWorker(itemHolder.getWorker());
		}
		assertTrue(managementApp.getState().setProject(itemHolder.getProject()));
	}
	
	@Given("that there are currently {int} projects in the app")
	public void numberOfProjects(int number) throws Exception {
		for(int i = 0; i < number; i++) {
			if(managementApp.getProjects().size() <= number) {
	    		managementApp.addProject(new Project("Programming 10" + i));
	    	}
		}
	}
	
	@When("the worker finds the worker with name {string} in the project succesfully")
	public void theWorkerFindsTheWorkerWithNameInTheProjectSuccesfully(String name) {
		workerFound = itemHolder.getProject().findWorker(name);
	    assertTrue(workerFound != null);
	}
	
	@When("the worker finds the worker with name {string} in the project unsuccesfully")
	public void theWorkerFindsTheWorkerWithNameInTheProjectUnsuccesfully(String name) {
		workerFound = itemHolder.getProject().findWorker(name);
		assertTrue(workerFound == null);
	}
	
	@When("worker adds new project named {string}")
	public void workerAddsNewProject(String name) throws Exception {
		try {
			assertTrue(managementApp.addProject(new Project(name)));
		    managementApp.getState().setProject(managementApp.findProject(name));
			projectName = name;
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("worker adds new project named {string} with {string} as projectleader")
	public void workerAddsNewProjectNamedWithAsProjectleader(String name, String projectLeader) {
	    try {
	    	managementApp.addProject(new Project(name, managementApp.findWorker(projectLeader)));
	    	managementApp.getState().setProject(managementApp.findProject(name));
	    	projectName = name;
	    } catch (Exception e) {
	    	errorMessage.setErrorMessage(e.getMessage());
	    }
	}
	
	@When("the worker sets the start date of the project to the {int}-{int}-{int} succesfully")
	public void theWorkerSetsTheStartDateOfTheProjectToThe(int year, int month, int day) throws Exception {
		assertTrue(managementApp.getState().currentProject().getTimeManager().
				   setStartTime(year, month, day, managementApp.getState().currentProject()));
	}
	
	@When("the worker sets the end date of the project to the {int}-{int}-{int} succesfully")
	public void theWorkerSetsTheEndDateOfTheProjectToTheSuccesfully(int year, int month, int day) throws Exception {
		assertTrue(managementApp.getState().currentProject().getTimeManager().
				   setEndTime(year, month, day, managementApp.getState().currentProject()));
	}
	
	@When("the worker removes the project from the app")
	public void theWorkerRemovesTheProjectFromTheApp() {
		try {
			assertTrue(managementApp.removeProject(itemHolder.getProject()));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker sets the end date of the project to the {int}-{int}-{int} unsuccesfully")
	public void setEndDateUnsuccesfully(int year, int month, int day) {
		try {
			assertFalse(managementApp.getState().currentProject().getTimeManager().
						setEndTime(year, month, day, managementApp.getState().currentProject()));
		} catch(Exception e) {
			System.out.println("HERE: " + e.getMessage());
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker sets the start date of the project to the {int}-{int}-{int} unsuccesfully")
	public void setStartDateTheUnsuccesfully(int year, int month, int day) {
		try {
			assertFalse(managementApp.getState().currentProject().getTimeManager().
						setStartTime(year, month, day, managementApp.getState().currentProject()));
		} catch(Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker tries to find project with name {string} in app")
	public void theWorkerTriesToFindProjectWithNameInApp(String name) {
		try {
			managementApp.findProject(name);
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the deadline is checked")
	public void deadlineCheck() {
		try {
			managementApp.getState().currentProject().getTimeManager().deadlineOverdue();
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Then("the start time for the project is {int}-{int}-{int}")
	public void theStartTimeForTheProjectIs(int year, int month, int day) {
		GregorianCalendar t = itemHolder.getProject().getTimeManager().getStartTime();
		assertEquals(year, t.get(GregorianCalendar.YEAR));
		assertEquals(month - 1, t.get(GregorianCalendar.MONTH));
		assertEquals(day, t.get(GregorianCalendar.DATE));
	}

	@Then("the end time for the project is {int}-{int}-{int}")
	public void theEndTimeForTheProjectIs(int year, int month, int day) {
		GregorianCalendar t = itemHolder.getProject().getTimeManager().getEndTime();
		assertEquals(year, t.get(GregorianCalendar.YEAR));
		assertEquals(month - 1, t.get(GregorianCalendar.MONTH));
		assertEquals(day, t.get(GregorianCalendar.DATE));
	}
	
	@Then("the worker has a total of {int} individual work hours")
	public void theWorkerHasATotalOfIndividualWorkHours(int hours) {
		assertEquals(managementApp.getState().currentProject().getWorkersAccumulatedHours(managementApp.getState().currentUser()), hours);
	}
	
	@Then("the worker has a total of {int} work hours contributed to project {string}")
	public void theWorkerHasATotalOfWorkHoursContributedToProject(int hours, String name) throws Exception {
		Project p = managementApp.findProject(name);
		assertEquals(p.getWorkersAccumulatedHours(itemHolder.getWorker()), hours);
	}
	
	@Then("the project has a total of {int} work hours")
	public void theProjectHasATotalOfWorkHours(int hours) {
		assertEquals(itemHolder.getProject().getHours(), hours);
	}
	
	@Then("the project is contained in the app")
	public void theProjectIsContainedInTheApp() throws Exception {
	    assertTrue(managementApp.containsProject(projectName));
	}
	
	@Then("the project is not contained in the app")
	public void theProjectIsNotContainedInTheApp() throws Exception {
		assertFalse(managementApp.containsProject(itemHolder.getProject().getName()));
	}
	
	@Then("the start and end week of the given month of the project are week {int} and week {int}")
	public void weekRepresentation(int startWeek, int endWeek) {
		assertEquals(managementApp.getState().currentProject().getTimeManager().getStartWeek(), startWeek);
		assertEquals(managementApp.getState().currentProject().getTimeManager().getEndWeek(), endWeek);
	}
	
	@Then("the project contains time specifications")
	public void containsTimeSpecifications() {
		assertTrue(managementApp.getState().currentProject().getTimeManager().containsTimeSpecifications());
	}
	
	@Then("the project does not contain time specifications")
	public void doesNotContainTimeSpecifications() {
		assertFalse(managementApp.getState().currentProject().getTimeManager().containsTimeSpecifications());
	}
	
	@Then("the deadline is overdue")
	public void deadlineOverdue() throws Exception {
		assertTrue(managementApp.getState().currentProject().getTimeManager().deadlineOverdue());
	}
	
	@Then("the worker is found")
	public void theWorkerIsFound() {
		assertTrue(workerFound != null);
	}
	
	@Then("the worker is not found")
	public void theWorkerIsNotFound() {
		assertTrue(workerFound == null);
	}
	
	@Then("the deadline is not overdue")
	public void deadlineNotOverdue() throws Exception {
		assertFalse(managementApp.getState().currentProject().getTimeManager().deadlineOverdue());
	}
	
	@Then("the project has a projectleader")
	public void hasProjectleader() {
		assertTrue(managementApp.getState().currentProject().hasProjectLeader());
	}
	
	@Then("the project has no projectleader")
	public void hasNoProjectleader() {
		assertFalse(managementApp.getState().currentProject().hasProjectLeader());
	}
	
	@Then("the worker can find the activity")
	public void findActivity() {
		Activity a =managementApp.getState().currentProject().findActivity(itemHolder.getActivity().getName());
		System.out.println("ACTIVITY: " + a);
		assertTrue(a != null);
	}
	
	@Then("the worker can not find the activity")
	public void cantFindActivity() {
		Activity a = managementApp.getState().currentProject().findActivity(itemHolder.getActivity().getName());
		System.out.println("ACTIVITY - NOT: " + a);
		assertFalse(a != null);
	}
	
	@Then("there are currently {int} activities in the project")
	public void numberOfActivities(int number) {
		assertEquals(managementApp.getState().currentProject().getActivityList().size(),number);
	}
	
	@Then("the last two digits of the projects ID is {string}")
	public void CheckID(String ID) {
		System.out.println("ID:");
		System.out.println(managementApp.getState().currentProject().getID());
		assertTrue(managementApp.getState().currentProject().getID().substring(4).equals(ID));
	}
	
}
