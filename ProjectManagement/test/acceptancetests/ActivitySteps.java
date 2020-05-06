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
import test_helpers.ErrorMessageHolder;
import test_helpers.StateHelper;

public class ActivitySteps {
	private String activityName;
	private Activity activity;
	
	private StateHelper stateHelper;
	private ManagementApp managementApp;
	private ErrorMessageHolder errorMessage;
	
	public ActivitySteps(ManagementApp managementApp, StateHelper stateHelper, ErrorMessageHolder errorMessage) {
		this.managementApp = managementApp;
		this.stateHelper = stateHelper;
		this.errorMessage = errorMessage;
		stateHelper.setState(managementApp.getState());
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
			   stateHelper.setActivity(new Activity(name, managementApp.getState()));
			   stateHelper.getProject().addActivity(stateHelper.getActivity());
		   }
		   assertTrue(stateHelper.getProject().containsActivity(name));
	    } catch (OperationNotAllowedException e) {
			 errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Given("the project has an activity named {string}")
	public void theProjectHasAnActivityNamed(String name) throws OperationNotAllowedException {
		Project p = stateHelper.getProject();
		stateHelper.logInTemp();
		if (!p.containsActivity(p.getName())) {
			p.addActivity(new Activity(name, managementApp.getState()));
		}
		stateHelper.setActivity(p.findActivity(name));
		stateHelper.logOutTemp();
		assertTrue(p.containsActivity(name));
	}
	
	@Given("the activity has no work hours")
	public void theActivityHasNoWorkHours() throws OperationNotAllowedException {
		try {
			Activity act = stateHelper.getActivity();
			stateHelper.logInTemp();
			if (!stateHelper.getProject().containsWorker(stateHelper.getTemp())) {
				stateHelper.getProject().addWorker(stateHelper.getTemp());
			}
			if (!stateHelper.getActivity().containsWorker(stateHelper.getTemp())) {
				stateHelper.getActivity().addWorker(stateHelper.getTemp());
			}
			stateHelper.getProject().addHoursToActivity(-act.workedHours(), act);
			stateHelper.logOutTemp();
			assertEquals(act.workedHours(), 0);
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Given("the activity is selected")
	public void theActivityIsSelected() {
		assertTrue(stateHelper.getActivity().select());
	}
	
	@Given("the worker is working on the activity")
	public void theWorkerIsWorkingOnTheActivity() throws OperationNotAllowedException {
		if(!stateHelper.getActivity().containsWorker(stateHelper.getWorker())) {
			stateHelper.getProject().addWorkerToActivity(stateHelper.getWorker(), stateHelper.getActivity());
		}
		assertTrue(stateHelper.getActivity().containsWorker(stateHelper.getWorker()));
	}
	
	@Given("the worker is not working on the activity")
	public void theWorkerIsNotWorkingOnTheActivity() throws OperationNotAllowedException {
		assertFalse(stateHelper.getActivity().containsWorker(stateHelper.getWorker()));
	}
	
	@When("the worker adds {int} work hours to the activity succesfully")
	public void theWorkerAddsWorkHoursToTheActivitySuccesfully(int hours) throws OperationNotAllowedException {
		try {
			assertTrue(stateHelper.getProject().addHoursToActivity(hours, stateHelper.getActivity()));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
		
	}
	
	@When("another worker adds {int} work hours to the activity successfully")
	public void anotherWorkerAddsWorkHoursToTheActivitySuccessfully(Integer int1) throws OperationNotAllowedException {
		try {
			Activity act = stateHelper.getActivity();
			stateHelper.logInTemp();
			if (!stateHelper.getProject().containsWorker(stateHelper.getTemp())) {
				stateHelper.getProject().addWorker(stateHelper.getTemp());
			}
			if (!stateHelper.getActivity().containsWorker(stateHelper.getTemp())) {
				stateHelper.getActivity().addWorker(stateHelper.getTemp());
			}
			boolean result = stateHelper.getProject().addHoursToActivity(-act.workedHours(), act);
			stateHelper.logOutTemp();
			assertTrue(result);
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker adds {int} work hours to the activity unsuccesfully")
	public void theWorkerAddsWorkHoursToTheActivityUnsuccesfully(int hours) throws OperationNotAllowedException {
		try {
			assertFalse(stateHelper.getProject().addHoursToActivity(hours, stateHelper.getActivity()));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
		
	}

	@When("worker creates new activity with name {string} and ET {int} hours")
	public void workerCreatesNewActivityWithNameAndETHours(String name, int ET) throws Exception {
		try {
			activityName = name;
			assertTrue( stateHelper.setActivity(new Activity(name, managementApp.getState(), ET)) );
		}
		catch (Exception e) {
	    	errorMessage.setErrorMessage(e.getMessage());
	    }
	}
	
	@When("worker adds the activity to the project")
	public void workerAddsTheActivityToTheProject() throws OperationNotAllowedException {
		try {
			assertTrue(stateHelper.getProject().addActivity(stateHelper.getActivity()));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Then("the activity has a total of {int} work hours")
	public void theActivityHasATotalOfWorkHours(int hours) {
		assertEquals(stateHelper.getActivity().workedHours(), hours);
	}
	
	@Then("the worker has a total of {int} hours contributed to the activity")
	public void theWorkerHasATotalOfHoursContributedToTheActivity(int hours) {
		assertEquals(stateHelper.getActivity().workerContributedHours(stateHelper.getWorker()), hours);
	}
	
	@Then("the activity is contained in the project")
	public void theActivityIsContainedInTheProject() throws OperationNotAllowedException {
	    assertTrue(stateHelper.getProject().containsActivity(activityName));
	}
}
