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

public class ActivitySteps {
	private String activityName;
	
	private StateHelper stateHelper;
	private ManagementApp managementApp;
	private ErrorMessageHolder errorMessage;
	
	public ActivitySteps(ManagementApp managementApp, StateHelper userHelper, ErrorMessageHolder errorMessage) {
		this.managementApp = managementApp;
		this.stateHelper = new StateHelper(managementApp.getState());
		this.errorMessage = errorMessage;
	}
	
	@Given("the worker is working on a project")
	public void theWorkerIsWorkingOnAProject() throws Exception{
	    if (!managementApp.containsProject(stateHelper.getProject().getName())) {
	    	managementApp.createProject(stateHelper.getProject().getName());
	    }
	    managementApp.addWorkerToProject(stateHelper.getWorker(), stateHelper.getProject());
	}

	@Given("the worker is the project leader")
	public void theWorkerIsTheProjectLeader() {
	    stateHelper.getProject().setProjectLeader(stateHelper.getWorker());
	}

	@Given("the activity with name {string} is not in the project")
	public void theActivityWithNameIsNotInTheProject(String activity) throws OperationNotAllowedException {
	    assertFalse(stateHelper.getProject().containsActivity(activity));
	}
	
	@Given("the activity with name {string} is in the project")
	public void theActivityWithNameIsInTheProject(String name) throws OperationNotAllowedException {
	   try {
		   	stateHelper.getProject().createActivity(name, 1);
			assertTrue(stateHelper.getProject().containsActivity(name));
	    } catch (OperationNotAllowedException e) {
			 errorMessage.setErrorMessage(e.getMessage());
		}
		assertTrue(stateHelper.getProject().containsActivity(name));
	}

	@When("worker creates new activity with name {string} and ET {int} hours")
	public void workerCreatesNewActivityWithNameAndETHours(String name, int ET)throws Exception {
		try {
			activityName = name;
			stateHelper.getProject().createActivity(name, ET);
		}
		catch (Exception e) {
	    	errorMessage.setErrorMessage(e.getMessage());
	    }
	}

	@Then("the activity is contained in the project")
	public void theActivityIsContainedInTheProject() throws OperationNotAllowedException {
	    assertTrue(stateHelper.getProject().containsActivity(activityName));
	}
}
