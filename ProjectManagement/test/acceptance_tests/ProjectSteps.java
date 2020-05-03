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
		this.stateHelper.setState(managementApp.getState());
	}
	
	@Given("the project with name {string} does not exist")
	public void theProjectWithNameDoesNotExist(String name) throws Exception {
		assertFalse(managementApp.containsProject(name));
	}
	
	@Given("the project with name {string} does exist")
	public void theProjectWithNameDoesExist(String name) throws Exception {
		
		try {
			stateHelper.logInTemp();
			managementApp.createProject(name);
			project = managementApp.findProject(name);
			this.projectName = name;
			stateHelper.setProject(project);
			stateHelper.logOutTemp();
			
	    	assertTrue(managementApp.containsProject(name));
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
		worker = stateHelper.getWorker();
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(project.getName());
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
		    project = managementApp.findProject(name);
		} catch (OperationNotAllowedException e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("worker adds new project named {string} with {string} as projectleader")
	public void workerAddsNewProjectNamedWithAsProjectleader(String projectName, String projectLeader) {
	    try {
	    	this.projectName =  projectName;
	 	    managementApp.createProjectWithLeader(projectName, managementApp.findWorker(projectLeader));
	 	    project = managementApp.findProject(projectName);
	    } catch (Exception e) {
	    	errorMessage.setErrorMessage(e.getMessage());
	    }
	}
	
	@When("the worker is added to the project")
	public void the_worker_is_added_to_the_project() {
		if(!project.containsWorker(managementApp.getState().currentUser())) {
			project.addWorker(managementApp.getState().currentUser());
		}
		
	    assertTrue(project.containsWorker(managementApp.getState().currentUser()));
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
	
	@Then("the worker has a total of {int} individual work hours")
	public void theWorkerHasATotalOfIndividualWorkHours(int hours) {
	    assertEquals(project.getWorkersAccumulatedHours(managementApp.getState().currentUser()), hours);
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
	    assertEquals(project.getStartWeek(),startWeek);
	    assertEquals(project.getEndWeek(),endWeek);
	}
	
}
