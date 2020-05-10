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
	private Worker worker, prev, temp;
	private Project project;
	
	String projectName;
	
	public ProjectSteps(ManagementApp managementApp, ErrorMessageHolder errorMessage, ItemHolder stateHelper) {
		this.managementApp = managementApp;
		this.errorMessage = errorMessage;
		this.itemHolder = stateHelper;
		itemHolder.setState(managementApp.getState());
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
				itemHolder.setProject(new Project(name, managementApp.getState()));
				assertTrue(managementApp.addProject(itemHolder.getProject()));
			}
			assertTrue(managementApp.containsProject(name));
			project = itemHolder.getProject();
			this.projectName = name;
			itemHolder.logOutTemp();
	    } catch (OperationNotAllowedException e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Given("the worker is working on the project")
	public void theWorkerIsWorkingOnTheProject() throws OperationNotAllowedException, Exception {
		if(!itemHolder.getProject().containsWorker(itemHolder.getWorker())) {
			itemHolder.getProject().addWorker(itemHolder.getWorker());
		}
		assertTrue(itemHolder.getProject().containsWorker(itemHolder.getWorker()));
	}
	
	@Given("the worker is not working on the project")
	public void theWorkerIsNotWorkingOnTheProject() throws OperationNotAllowedException {
		worker = itemHolder.getWorker();
		if ( project.containsWorker(worker) ) project.removeWorker(worker);
	    assertFalse(project.containsWorker(worker));
	}
	
	@Given("the worker is the projectleader")
	public void theWorkerIsTheProjectleader() throws Exception {
		itemHolder.logInTemp();
		if ( !itemHolder.getProject().isProjectLeader(managementApp.getState().currentUser()) ) {
			
			itemHolder.getProject().addWorker(itemHolder.getWorker());
			itemHolder.getProject().setProjectLeader(itemHolder.getWorker());
		}
		
		itemHolder.logOutTemp();
		assertEquals(itemHolder.getProject().getProjectLeader(), itemHolder.getWorker());
	}
	
	@Given("the project is selected")
	public void theProjectIsSelected() throws OperationNotAllowedException {
		if ( itemHolder.getProject() != null && !itemHolder.getProject().containsWorker(itemHolder.getWorker()) ) {
			managementApp.getState().setProject(itemHolder.getProject());
			itemHolder.getProject().addWorker(itemHolder.getWorker());
		}
		assertTrue(managementApp.getState().setProject(itemHolder.getProject()));
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
	
	@When("the worker sets the start date of the project to the {int}-{int}-{int} succesfully")
	public void theWorkerSetsTheStartDateOfTheProjectToThe(int year, int month, int day) throws Exception {
		try {
			assertTrue(project.getTimeManager().setStartTime(year, month, day, project));
		} catch(Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker sets the end date of the project to the {int}-{int}-{int} succesfully")
	public void theWorkerSetsTheEndDateOfTheProjectToTheSuccesfully(int year, int month, int day) throws Exception {
		try {
			assertTrue(project.getTimeManager().setEndTime(year, month, day, project));
		} catch(Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker removes the project from the app")
	public void theWorkerRemovesTheProjectFromTheApp() {
		try {
			assertTrue(managementApp.removeProject(itemHolder.getProject()));
		} catch (OperationNotAllowedException e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker sets the end date of the project to the {int}-{int}-{int} unsuccesfully")
	public void theWorkerSetsTheEndDateOfTheProjectToTheUnsuccesfully(int year, int month, int day) {
		try {
			assertFalse(itemHolder.getProject().getTimeManager().setEndTime(year, month, day, project));
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
	    assertEquals(project.getWorkersAccumulatedHours(managementApp.getState().currentUser()), hours);
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
	public void theProjectIsContainedInTheApp() throws OperationNotAllowedException {
	    assertTrue(managementApp.containsProject(projectName));
	}
	
	@Then("the project is not contained in the app")
	public void theProjectIsNotContainedInTheApp() throws OperationNotAllowedException {
		assertFalse(managementApp.containsProject(itemHolder.getProject().getName()));
	}
	
	@Then("the start and end week of the given month of the project are week {int} and week {int}")
	public void weekRepresentation(int startWeek, int endWeek) {
		assertEquals(project.getTimeManager().getStartWeek(), startWeek);
		assertEquals(project.getTimeManager().getEndWeek(), endWeek);
	}
	
}
