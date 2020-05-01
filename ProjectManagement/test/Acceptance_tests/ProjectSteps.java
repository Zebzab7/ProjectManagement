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
	private Worker worker;
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
		Worker prev = managementApp.getState().currentUser();
		Worker temp = new Worker("Temp", "1234");
		try {
			managementApp.getState().setUser(temp);
			
			managementApp.createProject(name);
			project = managementApp.findProject(name);
			this.projectName = name;
			stateHelper.setProject(project);
			
			managementApp.getState().setUser(prev);
	    	assertTrue(managementApp.containsProject(name));
	    } catch (OperationNotAllowedException e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Given("the worker is working on the project")
	public void theWorkerIsWorkingOnTheProject() throws OperationNotAllowedException, Exception {
		worker = managementApp.getState().currentUser();
		project.addWorker(worker);
		assertTrue(project.containsWorker(worker));
	}
	
	@Given("the worker is not working on the project")
	public void theWorkerIsNotWorkingOnTheProject() throws OperationNotAllowedException {
		worker = managementApp.getState().currentUser();
	    assertFalse(project.containsWorker(worker));
	}
	
	@Given("the project has no work hours")
	public void theProjectHasNoWorkHours() throws OperationNotAllowedException {
		Worker cWorker = managementApp.getState().currentUser();
		Worker temp = new Worker("Temp", "1234");
		managementApp.getState().setUser(temp);
		int hours = project.workedHours();
		project.addHours((hours - hours));
		managementApp.getState().setUser(cWorker);
		assertTrue(project.workedHours() == 0);
	}
	
	@Given("the worker {string} is the projectleader")
	public void workerEqualsProjectleader(String name) throws Exception {
		try {
			worker = stateHelper.getWorker();
			if(worker.getUsername().equals(name) && managementApp.containsProject(projectName)) {
				project.setProjectLeader(worker);
				assertEquals(project.getProjectLeader(), worker);
			}
		} catch(Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
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
	public void workerSpecifiesStartingTime(int year, int month, int day) throws Exception {
		try {
			if(managementApp.containsProject(projectName) && managementApp.LoggedIn()
			   && project.getProjectLeader() == worker) {
				project.setStartTime(year, month, day);
			}
		} catch(Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker sets the end date of the project to the {int}-{int}-{int}")
	public void workerSpecifiesEndTime(int year, int month, int day) throws Exception {
		try {
			if(managementApp.containsProject(projectName) && managementApp.LoggedIn()
			   && project.getProjectLeader() == worker) {
				project.setEndTime(year, month, day);
			}
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
	
	
}
