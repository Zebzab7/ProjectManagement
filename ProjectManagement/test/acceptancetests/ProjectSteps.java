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
import test_helpers.StateHelper;
public class ProjectSteps {
	private ManagementApp managementApp;
	private ErrorMessageHolder errorMessage;
	
	private StateHelper stateHelper;
	private Worker worker, prev, temp;
	private Project project;
	
	String projectName;
	
	public ProjectSteps(ManagementApp managementApp, ErrorMessageHolder errorMessage, StateHelper stateHelper) {
		this.managementApp = managementApp;
		this.errorMessage = errorMessage;
		this.stateHelper = stateHelper;
		this.stateHelper.setState(managementApp.getState());
	}
	
	@Given("the project with name {string} does not exist")
	public void theProjectWithNameDoesNotExist(String name) throws Exception {
		assertFalse(managementApp.containsProject(name));
	}
	
	@Given("the project with name {string} does exist")
	public void theProjectWithNameDoesExist(String name) throws Exception {
		try {
			if ( !managementApp.containsProject(name) ) {
				assertTrue(managementApp.addProject(new Project(name, managementApp.getState())));
			}
			assertTrue(managementApp.containsProject(name));
			project = managementApp.findProject(name);
			this.projectName = name;
			stateHelper.setProject(project);
	    } catch (OperationNotAllowedException e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Given("the worker is working on the project")
	public void theWorkerIsWorkingOnTheProject() throws OperationNotAllowedException, Exception {
		if(!project.containsWorker(managementApp.getState().currentUser())) {
			project.addWorker(managementApp.getState().currentUser());
		}
		assertTrue(project.containsWorker(managementApp.getState().currentUser()));
	}
	
	@Given("the worker is not working on the project")
	public void theWorkerIsNotWorkingOnTheProject() throws OperationNotAllowedException {
		worker = stateHelper.getWorker();
		if ( project.containsWorker(worker) ) project.removeWorker(worker);
	    assertFalse(project.containsWorker(worker));
	}
	
	@Given("the project has no work hours")
	public void theProjectHasNoWorkHours() throws OperationNotAllowedException {
		stateHelper.logInTemp();
		int hours = project.workedHours();
		project.addHours( -hours );
		stateHelper.logOutTemp();
		assertTrue(project.workedHours() == 0);
	}
	
	@Given("the worker is the projectleader")
	public void theWorkerIsTheProjectleader() throws Exception {
		stateHelper.logInTemp();
		if ( !stateHelper.getProject().containsWorker(stateHelper.getWorker()) ) {
			stateHelper.getProject().addWorker(stateHelper.getWorker());
			stateHelper.getProject().setProjectLeader(stateHelper.getWorker());
		}
		stateHelper.logOutTemp();
		assertEquals(stateHelper.getProject().getProjectLeader(), stateHelper.getWorker());
	}
	
	@Given("the project is selected")
	public void theProjectIsSelected() {
		assertTrue(stateHelper.getProject().select());
	}
	
	@When("the worker adds {int} work hours succesfully")
	public void theWorkerAddsWorkHoursSuccesfully(int hours) throws OperationNotAllowedException {
		assertTrue(project.addHours(hours));
	}
	
	@When("the worker adds {int} work hours unsuccesfully")
	public void theWorkerAddsWorkHoursUnSuccesfully(int hours) throws OperationNotAllowedException {
		try {
			assertFalse(project.addHours(hours));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}

	@When("worker adds new project named {string}")
	public void workerAddsNewProject(String name) throws Exception {
		try {
			projectName = name;
			assertTrue(managementApp.addProject(new Project(name, managementApp.getState())));
		    project = managementApp.findProject(name);
		} catch (OperationNotAllowedException e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("worker adds new project named {string} with {string} as projectleader")
	public void workerAddsNewProjectNamedWithAsProjectleader(String name, String projectLeader) {
	    try {
	    	projectName =  name;
	    	managementApp.addProject(new Project(name, managementApp.getState(), managementApp.findWorker(projectLeader)));
	 	    project = managementApp.findProject(name);
	    } catch (Exception e) {
	    	errorMessage.setErrorMessage(e.getMessage());
	    }
	}
	
	@When("the worker is added to the project")
	public void the_worker_is_added_to_the_project() {
		if(!project.containsWorker(managementApp.getState().currentUser())) {
			try {
				project.addWorker(managementApp.getState().currentUser());
			} catch (Exception e) {
				errorMessage.setErrorMessage(e.getMessage());
			}
		}
		
	    assertTrue(project.containsWorker(managementApp.getState().currentUser()));
	}
	
	@When("the worker sets the start date of the project to the {int}-{int}-{int} succesfully")
	public void theWorkerSetsTheStartDateOfTheProjectToThe(int year, int month, int day) throws Exception {
		try {
			assertTrue(stateHelper.getProject().setStartTime(year, month, day));
		} catch(Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker sets the end date of the project to the {int}-{int}-{int} succesfully")
	public void theWorkerSetsTheEndDateOfTheProjectToTheSuccesfully(int year, int month, int day) throws Exception {
		try {
			assertTrue(stateHelper.getProject().setEndTime(year, month, day));
		} catch(Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker sets the end date of the project to the {int}-{int}-{int} unsuccesfully")
	public void theWorkerSetsTheEndDateOfTheProjectToTheUnsuccesfully(int year, int month, int day) {
		try {
			assertFalse(stateHelper.getProject().setEndTime(year, month, day));
		} catch(Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("another worker adds {int} work hours successfully")
	public void anotherWorkerAddsWorkHoursSuccessfully(int hours) {
		try {
			stateHelper.logInTemp();
			project.addWorker(managementApp.getState().currentUser());
			project.addHours(hours);
			stateHelper.logOutTemp();
			
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}	
	}
	
	@Then("the start time for the project is {int}-{int}-{int}")
	public void theStartTimeForTheProjectIs(int year, int month, int day) {
		GregorianCalendar t = stateHelper.getProject().getTimeManager().getStartTime();
		assertEquals(year, t.get(GregorianCalendar.YEAR));
		assertEquals(month - 1, t.get(GregorianCalendar.MONTH));
		assertEquals(day, t.get(GregorianCalendar.DATE));
	}

	@Then("the end time for the project is {int}-{int}-{int}")
	public void theEndTimeForTheProjectIs(int year, int month, int day) {
		GregorianCalendar t = stateHelper.getProject().getTimeManager().getEndTime();
		assertEquals(year, t.get(GregorianCalendar.YEAR));
		assertEquals(month - 1, t.get(GregorianCalendar.MONTH));
		assertEquals(day, t.get(GregorianCalendar.DATE));
	}
	
	@Then("the worker has a total of {int} individual work hours")
	public void theWorkerHasATotalOfIndividualWorkHours(int hours) {
	    assertEquals(project.getWorkersAccumulatedHours(managementApp.getState().currentUser()), hours);
	}
	
	@Then("the project has a total of {int} work hours")
	public void theProjectHasATotalOfWorkHours(int hours) {
		assertEquals(project.workedHours(), hours);
	}
	
	@Then("the project is contained in the app")
	public void theProjectIsContainedInTheApp() throws OperationNotAllowedException {
	    assertTrue(managementApp.containsProject(projectName));
	}
	@Then("the workers AH-list will hold {int} hours for {string} and {int} hours for {string}")
	public void AccumulatedHoursListCheck(Integer hours1, String projectName1, Integer hours2, String projectName2) {
	    
		try {
			assertTrue(managementApp.workerHoursCollected(managementApp.getState().currentUser()).get(0).contains("" + hours1));
			assertTrue(managementApp.workerHoursCollected(managementApp.getState().currentUser()).get(1).contains("" + hours2));
			
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	@Then("the workers AssignedProjects list will hold {string} and {string}")
	public void the_workers_AssignedProjects_list_will_hold_and(String projectName1, String projectName2) {
	    try {
			assertEquals(managementApp.currentAssignedProjects(managementApp.getState().currentUser()).get(0).getName(),
																											projectName1);
			assertEquals(managementApp.currentAssignedProjects(managementApp.getState().currentUser()).get(1).getName(),
																											projectName2);
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	@Then("the start and end week of the given month of the project are week {int} and week {int}")
	public void weekRepresentation(int startWeek, int endWeek) {
		assertEquals(project.getTimeManager().getStartWeek(), startWeek);
		assertEquals(project.getTimeManager().getEndWeek(), endWeek);
	}
	
}
