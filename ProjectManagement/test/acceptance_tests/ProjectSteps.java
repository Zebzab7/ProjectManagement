package acceptance_tests;

import static org.hamcrest.CoreMatchers.equalTo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
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
	}
	
	@Given("the project with name {string} does not exist")
	public void theProjectWithNameDoesNotExist(String name) throws Exception {
		assertFalse(managementApp.containsProject(name));
	}
	
	@Given("the project with name {string} does exist")
	public void theProjectWithNameDoesExist(String name) throws Exception {
		try {
			logInTemp();
			managementApp.createProject(name);
			project = managementApp.findProject(name);
			this.projectName = name;
			stateHelper.setProject(project);
			logOutTemp();
			
	    	assertTrue(managementApp.containsProject(name));
	    } catch (OperationNotAllowedException e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Given("the worker is working on the project")
	public void theWorkerIsWorkingOnTheProject() throws OperationNotAllowedException, Exception {
		worker = stateHelper.getWorker();
		project.addWorker(worker);
		assertTrue(project.containsWorker(worker));
	}
	
	@Given("the worker is not working on the project")
	public void theWorkerIsNotWorkingOnTheProject() throws OperationNotAllowedException {
		worker = stateHelper.getWorker();
		if ( project.containsWorker(worker) ) project.removeWorker(worker);
	    assertFalse(project.containsWorker(worker));
	}
	
	@Given("the project has no work hours")
	public void theProjectHasNoWorkHours() throws OperationNotAllowedException {
		logInTemp();
		int hours = project.workedHours();
		project.addHours( -hours );
		logOutTemp();
		assertTrue(project.workedHours() == 0);
	}
	
	@Given("the worker is the projectleader")
	public void theWorkerIsTheProjectleader() throws Exception {
		worker = stateHelper.getWorker();
		project.addWorker(worker);
		project.setProjectLeader(worker);
		assertEquals(project.getProjectLeader(), worker);
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
		projectName = name;
		try {
		    managementApp.createProject(name);
		} catch (OperationNotAllowedException e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("worker adds new project named {string} with {string} as projectleader")
	public void workerAddsNewProjectNamedWithAsProjectleader(String projectName, String projectLeader) {
	    try {
	    	this.projectName =  projectName;
	 	    managementApp.createProjectWithLeader(projectName, managementApp.findWorker(projectLeader));
	    } catch (Exception e) {
	    	errorMessage.setErrorMessage(e.getMessage());
	    }
	}
	
	@When("the worker sets the start date of the project to the {int}-{int}-{int}")
	public void theWorkerSetsTheStartDateOfTheProjectToThe(int year, int month, int day) throws Exception {
		try {
			project.setStartTime(year, month, day);
		} catch(Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker sets the end date of the project to the {int}-{int}-{int}")
	public void theWorkerSetsTheEndDateOfTheProjectTo(int year, int month, int day) throws Exception {
		try {
			project.setEndTime(year, month, day);
		} catch(Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Then("the project has a total of {int} work hours")
	public void theProjectHasATotalOfWorkHours(int hours) {
		assertTrue(project.workedHours() == hours);
	}
	@Then("the project is contained in the app")
	public void theProjectIsContainedInTheApp() throws OperationNotAllowedException {
	    assertTrue(managementApp.containsProject(projectName));
	}
	@Then("the start time is set for the project")
	public void startTimeIsSet() throws Exception {
		assertTrue(project.startTimeSet());
	}
	@Then("the end time is set for the project")
	public void endTimeIsSet() throws Exception {
		assertTrue(project.endTimeSet());
	}
	@Then("the time settings for the project are set")
	public void theTimeIsSet() throws Exception {
		assertTrue(project.containsTimeSpecifications());
	}
	
	/*
	 * Methods used for logging a temporary user in order to
	 * perform certain operations in the management app
	 */
	public void logInTemp() {
		prev = managementApp.getState().currentUser();
		temp = new Worker("Temp", "1234");
		managementApp.getState().setUser(temp);
	}
	public void logOutTemp() {
		managementApp.getState().setUser(prev);
		temp = null;
	}
}
