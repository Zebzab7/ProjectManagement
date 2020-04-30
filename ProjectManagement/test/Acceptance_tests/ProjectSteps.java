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
		try {
			managementApp.createProject(name);
			project = managementApp.findProject(name);
	    	assertTrue(managementApp.containsProject(name));
	    } catch (OperationNotAllowedException e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Given("the worker is working on the project")
	public void theWorkerIsWorkingOnTheProject() throws OperationNotAllowedException, Exception {
		worker = managementApp.getUser().currentUser();
		project.addWorker(worker);
		assertTrue(project.containsWorker(worker));
	}
	
	@Given("the worker is not working on the project")
	public void theWorkerIsNotWorkingOnTheProject() throws OperationNotAllowedException {
		worker = managementApp.getUser().currentUser();
	    assertFalse(project.containsWorker(worker));
	}
	
	@Given("the project has no work hours")
	public void theProjectHasNoWorkHours() throws OperationNotAllowedException {
		Worker cWorker = managementApp.getUser().currentUser();
		Worker temp = new Worker("Temp", "1234");
		managementApp.getUser().setUser(temp);
		int hours = project.workedHours();
		project.addHours((hours - hours));
		managementApp.getUser().setUser(cWorker);
		assertTrue(project.workedHours() == 0);
	}
	
	@When("the worker adds {int} work hours succesfully")
	public void theWorkerAddsWorkHoursSuccesfully(int hours) throws OperationNotAllowedException {
		assertTrue(project.addHours(hours));
	}
	
	@When("the worker adds {int} work hours unsuccesfully")
	public void theWorkerAddsWorkHoursUnSuccesfully(int hours) throws OperationNotAllowedException {
		assertFalse(project.addHours(hours));
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
	
	@Then("the project has a total of {int} work hours")
	public void theProjectHasATotalOfWorkHours(int hours) {
		assertTrue(project.workedHours() == hours);
	}
	
	@Then("the project is contained in the app")
	public void theProjectIsContainedInTheApp() throws OperationNotAllowedException {
	    assertTrue(managementApp.containsProject(projectName));
	}
}
