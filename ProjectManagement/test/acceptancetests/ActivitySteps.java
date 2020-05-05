package acceptancetests;

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
import test_helpers.ActivityHelper;
import test_helpers.ErrorMessageHolder;
import test_helpers.StateHelper;

public class ActivitySteps {
	private String activityName;
	private Activity activity;
	
	private StateHelper stateHelper;
	private ActivityHelper activityHelper;
	private ManagementApp managementApp;
	private ErrorMessageHolder errorMessage;
	
	public ActivitySteps(ManagementApp managementApp, StateHelper userHelper, ActivityHelper activityHelper, ErrorMessageHolder errorMessage) {
		this.managementApp = managementApp;
		this.stateHelper = new StateHelper(managementApp.getState());
		this.errorMessage = errorMessage;
		this.activityHelper = activityHelper;
	}
	
	@Given("the worker is working on a project")
	public void theWorkerIsWorkingOnAProject() throws Exception {
	    if (!managementApp.containsProject(stateHelper.getProject().getName())) {
	    	managementApp.addProject(stateHelper.getProject());
	    }
	    assertTrue(stateHelper.getProject().addWorker(stateHelper.getWorker()));
	}

	@Given("the worker is the project leader")
	public void theWorkerIsTheProjectLeader() {
	    stateHelper.getProject().setProjectLeader(stateHelper.getWorker());
	}

	@Given("the activity with name {string} is not in the project")
	public void theActivityWithNameIsNotInTheProject(String name) throws OperationNotAllowedException {
	    assertFalse(stateHelper.getProject().containsActivity(name));
	}
	
	@Given("the activity with name {string} is in the project")
	public void theActivityWithNameIsInTheProject(String name) throws OperationNotAllowedException {
	   try {
		   if (!stateHelper.getProject().containsActivity(name)) {
			   activityHelper.setActivity(new Activity(name, managementApp.getState()));
			   stateHelper.getProject().addActivity(activityHelper.getActivity());
		   }
		   assertTrue(stateHelper.getProject().containsActivity(name));
	    } catch (OperationNotAllowedException e) {
			 errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Given("the project has an activity named {string}")
	public void theProjectHasAnActivityNamed(String name) throws OperationNotAllowedException {
		Project p = stateHelper.getProject();
		if (!p.containsActivity(p.getName())) {
			p.addActivity(new Activity(name, managementApp.getState()));
		}
		activityHelper.setActivity(p.findActivity(name));
		assertTrue(p.containsActivity(name));
	}
	
	@Given("the activity has no work hours")
	public void theActivityHasNoWorkHours() {
		Activity act = activityHelper.getActivity();
		stateHelper.getProject().addHoursToActivity(-act.workedHours(), act);
		assertEquals(act.workedHours(), 0);
	}
	
	@When("the worker adds {int} work hours to the activity succesfully")
	public void theWorkerAddsWorkHoursToTheActivitySuccesfully(int hours) {
		assertTrue(stateHelper.getProject().addHoursToActivity(hours, activityHelper.getActivity()));
	}

	@When("worker creates new activity with name {string} and ET {int} hours")
	public void workerCreatesNewActivityWithNameAndETHours(String name, int ET) throws Exception {
		try {
			activityName = name;
			assertTrue( activityHelper.setActivity(new Activity(name, managementApp.getState(), ET)) );
		}
		catch (Exception e) {
	    	errorMessage.setErrorMessage(e.getMessage());
	    }
	}
	
	@When("worker adds the activity to the project")
	public void workerAddsTheActivityToTheProject() throws OperationNotAllowedException {
		try {
			assertTrue(stateHelper.getProject().addActivity(activityHelper.getActivity()));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Then("the activity has a total of {int} work hours")
	public void theActivityHasATotalOfWorkHours(int hours) {
		assertEquals(activityHelper.getActivity().workedHours(), hours);
	}
	
	@Then("the activity is contained in the project")
	public void theActivityIsContainedInTheProject() throws OperationNotAllowedException {
	    assertTrue(stateHelper.getProject().containsActivity(activityName));
	}
}
