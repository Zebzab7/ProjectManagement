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
import test_helpers.ItemHolder;

public class ActivitySteps {
	private String activityName;
	private Activity activity;
	
	private ItemHolder itemHolder;
	private ManagementApp managementApp;
	private ErrorMessageHolder errorMessage;
	
	public ActivitySteps(ManagementApp managementApp, ItemHolder stateHelper, ErrorMessageHolder errorMessage) {
		this.managementApp = managementApp;
		this.itemHolder = stateHelper;
		this.errorMessage = errorMessage;
		stateHelper.setState(managementApp.getState());
	}
	
	@Given("the worker is working on a project")
	public void theWorkerIsWorkingOnAProject() throws Exception {
	    if (!managementApp.containsProject(itemHolder.getProject().getName())) {
	    	managementApp.addProject(itemHolder.getProject());
	    }
	    assertTrue(itemHolder.getProject().addWorker(itemHolder.getWorker()));
	}

	@Given("the worker is the project leader")
	public void theWorkerIsTheProjectLeader() {
		itemHolder.getProject().setProjectLeader(itemHolder.getWorker());
	}

	@Given("the activity with name {string} is not in the project")
	public void theActivityWithNameIsNotInTheProject(String name) throws OperationNotAllowedException {
	    assertFalse(itemHolder.getProject().containsActivity(name));
	}
	
	@Given("the activity with name {string} is in the project")
	public void theActivityWithNameIsInTheProject(String name) throws OperationNotAllowedException {
	   try {
		   if (!itemHolder.getProject().containsActivity(name)) {
			   itemHolder.setActivity(new Activity(name, managementApp.getState()));
			   itemHolder.getProject().addActivity(itemHolder.getActivity());
		   }
		   assertTrue(itemHolder.getProject().containsActivity(name));
	    } catch (OperationNotAllowedException e) {
			 errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Given("the project has an activity named {string}")
	public void theProjectHasAnActivityNamed(String name) throws OperationNotAllowedException {
		Project p = itemHolder.getProject();
		itemHolder.logInTemp();
		if (!p.containsActivity(p.getName())) {
			p.addActivity(new Activity(name, managementApp.getState()));
		}
		itemHolder.setActivity(p.findActivity(name));
		itemHolder.logOutTemp();
		assertTrue(p.containsActivity(name));
	}
	
	@Given("the activity has no work hours")
	public void theActivityHasNoWorkHours() throws OperationNotAllowedException {
		try {
			Activity act = itemHolder.getActivity();
			itemHolder.logInTemp();
			if (!itemHolder.getProject().containsWorker(itemHolder.getTemp())) {
				itemHolder.getProject().addWorker(itemHolder.getTemp());
			}
			if (!itemHolder.getActivity().containsWorker(itemHolder.getTemp())) {
				itemHolder.getActivity().addWorker(itemHolder.getTemp());
			}
			itemHolder.getProject().addHoursToActivity(-act.workedHours(), act);
			itemHolder.logOutTemp();
			assertEquals(act.workedHours(), 0);
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Given("the activity is selected")
	public void theActivityIsSelected() {
		assertTrue(itemHolder.getActivity().select());
	}
	
	@Given("the worker is working on the activity")
	public void theWorkerIsWorkingOnTheActivity() throws OperationNotAllowedException {
		if(!itemHolder.getActivity().containsWorker(itemHolder.getWorker())) {
			itemHolder.getProject().addWorkerToActivity(itemHolder.getWorker(), itemHolder.getActivity());
		}
		assertTrue(itemHolder.getActivity().containsWorker(itemHolder.getWorker()));
	}
	
	@Given("the worker is not working on the activity")
	public void theWorkerIsNotWorkingOnTheActivity() throws OperationNotAllowedException {
		assertFalse(itemHolder.getActivity().containsWorker(itemHolder.getWorker()));
	}
	
	@When("the worker is added to the activity")
	public void addWorkerToActivity() throws OperationNotAllowedException {
		
		try{
			itemHolder.getActivity().addWorker(managementApp.getState().currentUser());
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker adds {int} work hours to the activity succesfully")
	public void theWorkerAddsWorkHoursToTheActivitySuccesfully(int hours) throws OperationNotAllowedException {
		try {
			assertTrue(itemHolder.getProject().addHoursToActivity(hours, itemHolder.getActivity()));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker selects and adds {int} work hours to activity {string} in project {string} succesfully")
	public void theWorkerSelectsAndAddsWorkHoursToActivityInProjectSuccesfully(int hours, String activityName, String projectName) 
			throws Exception {
		try {
			Project p = managementApp.findProject(projectName);
			Activity a = p.findActivity(activityName);
			a.select();
			assertTrue(p.addHoursToActivity(hours, a));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("another worker adds {int} work hours to the activity successfully")
	public void anotherWorkerAddsWorkHoursToTheActivitySuccessfully(int hours) throws OperationNotAllowedException {
		try {
			Activity act = itemHolder.getActivity();
			itemHolder.logInTemp();
			if (!itemHolder.getProject().containsWorker(itemHolder.getTemp())) {
				itemHolder.getProject().addWorker(itemHolder.getTemp());
			}
			if (!itemHolder.getActivity().containsWorker(itemHolder.getTemp())) {
				itemHolder.getActivity().addWorker(itemHolder.getTemp());
			}
			boolean result = itemHolder.getProject().addHoursToActivity(hours, act);
			itemHolder.logOutTemp();
			assertTrue(result);
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker adds {int} work hours to the activity unsuccesfully")
	public void theWorkerAddsWorkHoursToTheActivityUnsuccesfully(int hours) throws OperationNotAllowedException {
		try {
			assertFalse(itemHolder.getProject().addHoursToActivity(hours, itemHolder.getActivity()));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
		
	}

	@When("worker creates new activity with name {string} and ET {int} hours")
	public void workerCreatesNewActivityWithNameAndETHours(String name, int ET) throws Exception {
		try {
			activityName = name;
			assertTrue( itemHolder.setActivity(new Activity(name, managementApp.getState(), ET)) );
		}
		catch (Exception e) {
	    	errorMessage.setErrorMessage(e.getMessage());
	    }
	}
	
	@When("worker adds the activity to the project")
	public void workerAddsTheActivityToTheProject() throws OperationNotAllowedException {
		try {
			assertTrue(itemHolder.getProject().addActivity(itemHolder.getActivity()));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Then("the activity has a total of {int} work hours")
	public void theActivityHasATotalOfWorkHours(int hours) {
		assertEquals(itemHolder.getActivity().workedHours(), hours);
	}
	
	@Then("the worker has a total of {int} hours contributed to the activity")
	public void theWorkerHasATotalOfHoursContributedToTheActivity(int hours) {
		assertEquals(itemHolder.getActivity().workerContributedHours(itemHolder.getWorker()), hours);
	}
	
	@Then("the activity is contained in the project")
	public void theActivityIsContainedInTheProject() throws OperationNotAllowedException {
	    assertTrue(itemHolder.getProject().containsActivity(activityName));
	}
}
