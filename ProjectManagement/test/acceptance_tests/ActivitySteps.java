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
	
	private StateHelper userHelper;
	private ManagementApp managementApp;
	private ErrorMessageHolder errorMessage;
	
	public ActivitySteps(ManagementApp managementApp, StateHelper userHelper, ErrorMessageHolder errorMessage) {
		this.managementApp = managementApp;
		this.userHelper = new StateHelper(managementApp.getState());
		this.errorMessage = errorMessage;
	}
	
	@Given("the worker is working on a project")
	public void theWorkerIsWorkingOnAProject() throws Exception{
	    if (!managementApp.containsProject(userHelper.getProject().getName())) {
	    	managementApp.createProject(userHelper.getProject().getName());
	    }
	    managementApp.addWorkerToProject(userHelper.getWorker(), userHelper.getProject());
	}

	@Given("the worker is the project leader")
	public void theWorkerIsTheProjectLeader() {
	    userHelper.getProject().setProjectLeader(userHelper.getWorker());
	}

	@Given("the activity with name {string} is not in the project")
	public void theActivityWithNameIsNotInTheProject(String activity) throws OperationNotAllowedException {
	    assertFalse(userHelper.getProject().containsActivity(activity));
	}
	
	@Given("the activity with name {string} is in the project")
	public void theActivityWithNameIsInTheProject(String activity) throws OperationNotAllowedException {
		   try {
			   	userHelper.getProject().createActivity(activity, "1");
				assertTrue(userHelper.getProject().containsActivity(activity));
		    } catch (OperationNotAllowedException e) {
				 errorMessage.setErrorMessage(e.getMessage());
			}
		userHelper.getProject().createActivity(activity, "0");
		assertTrue(userHelper.getProject().containsActivity(activity));
	}

	@When("worker creates new activity with name {string} and ET {string} hours")
	public void workerCreatesNewActivityWithNameAndETHours(String name, String ET)throws Exception {
		try {
			activityName = name;
			userHelper.getProject().createActivity(name, ET);
		}
		catch (Exception e) {
	    	errorMessage.setErrorMessage(e.getMessage());
	    }
	}

	@Then("the activity is contained in the project")
	public void theActivityIsContainedInTheProject() throws OperationNotAllowedException {
	    assertTrue(userHelper.getProject().containsActivity(activityName));
	}
}
