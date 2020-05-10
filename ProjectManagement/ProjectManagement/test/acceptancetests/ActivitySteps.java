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
	
	private ItemHolder itemHolder;
	private ManagementApp managementApp;
	private ErrorMessageHolder errorMessage;
	
	public ActivitySteps(ManagementApp managementApp, ItemHolder stateHelper, ErrorMessageHolder errorMessage) {
		this.managementApp = managementApp;
		this.itemHolder = stateHelper;
		this.errorMessage = errorMessage;
		itemHolder.setState(managementApp.getState());
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
		itemHolder.logInTemp();
		if (!itemHolder.getProject().containsActivity(name)) {
			itemHolder.setActivity(new Activity(name, managementApp.getState()));
			itemHolder.getProject().addActivity(itemHolder.getActivity());
		}
		itemHolder.logOutTemp();
		assertTrue(itemHolder.getProject().containsActivity(name));
	}
	
	@Given("the activity has no work hours")
	public void theActivityHasNoWorkHours() throws OperationNotAllowedException {
		try {
			itemHolder.logInTemp();
			itemHolder.getProject().addWorker(itemHolder.getTemp());
			itemHolder.getActivity().addWorker(itemHolder.getTemp());
			managementApp.addHours(-itemHolder.getActivity().getHours());
			itemHolder.getProject().removeWorker(itemHolder.getTemp());
			itemHolder.getActivity().removeWorker(itemHolder.getTemp());
			itemHolder.logOutTemp();
			assertEquals(itemHolder.getActivity().getHours(), 0);
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Given("the activity is selected")
	public void theActivityIsSelected() throws OperationNotAllowedException {
		if ( itemHolder.getActivity() != null && !itemHolder.getActivity().containsWorker(itemHolder.getWorker()) ) {
			managementApp.getState().setActivity(itemHolder.getActivity());
			itemHolder.getActivity().addWorker(itemHolder.getWorker());
		}
		assertTrue(managementApp.getState().setActivity(itemHolder.getActivity()));
	}
	
	@Given("the worker is working on the activity")
	public void theWorkerIsWorkingOnTheActivity() throws OperationNotAllowedException {
		if(!itemHolder.getActivity().containsWorker(itemHolder.getWorker())) {
			itemHolder.getActivity().addWorker(itemHolder.getWorker());
		}
		assertTrue(itemHolder.getActivity().containsWorker(itemHolder.getWorker()));
	}
	
	@Given("the worker is not working on the activity")
	public void theWorkerIsNotWorkingOnTheActivity() throws OperationNotAllowedException {
		assertFalse(itemHolder.getActivity().containsWorker(itemHolder.getWorker()));
	}
	
	@When("the worker is added to the activity")
	public void addWorkerToActivity() throws OperationNotAllowedException {
		System.out.println("EndTime: " + managementApp.getState().currentFixedActivity().getAbsenceManager().getEndTime().getTime());
		System.out.println(managementApp.getState().currentFixedActivity().getAbsenceManager().getStartTime() == null);
		System.out.print("Worker is absent: ");
		System.out.println(managementApp.getState().currentUser().isAbsent());
		try{
			itemHolder.getActivity().addWorker(managementApp.getState().currentUser());
			System.out.println("Activity, itemHolder: " + itemHolder.getActivity().getName());
			System.out.println("Worker fA list size, mApp: " + managementApp.getState().currentUser().getAssignedFixedActivityList().toString());
			System.out.println("Worker added: " + itemHolder.getActivity().containsWorker(managementApp.getState().currentUser()));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker adds {int} work hours to the activity succesfully")
	public void theWorkerAddsWorkHoursToTheActivitySuccesfully(int hours) throws OperationNotAllowedException {
		try {
			assertTrue(managementApp.addHours(hours));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker adds {int} work hours to the activity unsuccesfully")
	public void theWorkerAddsWorkHoursToTheActivityUnsuccesfully(int hours) throws OperationNotAllowedException {
		try {
			assertFalse(managementApp.addHours(hours));
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
			itemHolder.setProject(p);
			managementApp.addHours(hours);
		//	assertTrue(p.addHoursToActivity(hours, a));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("another worker adds {int} work hours to the activity successfully")
	public void anotherWorkerAddsWorkHoursToTheActivitySuccessfully(int hours) throws OperationNotAllowedException {
		try {
			itemHolder.logInTemp();
			if (!itemHolder.getProject().containsWorker(itemHolder.getTemp())) {
				itemHolder.getProject().addWorker(itemHolder.getTemp());
			}
			if (!itemHolder.getActivity().containsWorker(itemHolder.getTemp())) {
				itemHolder.getActivity().addWorker(itemHolder.getTemp());
			}
			managementApp.addHours(hours);
			itemHolder.logOutTemp();
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	

	@When("worker creates new activity with name {string} and ET {int} hours")
	public void workerCreatesNewActivityWithNameAndETHours(String name, int ET) throws Exception {
		try {
			activityName = name;
			assertTrue(itemHolder.setActivity(new Activity(name, managementApp.getState(), ET)) );
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
		assertEquals(itemHolder.getActivity().getHours(), hours);
	}
	
	@Then("the worker has a total of {int} hours contributed to the activity")
	public void theWorkerHasATotalOfHoursContributedToTheActivity(int hours) {
		System.out.println(itemHolder.getWorker().getAssignedActivities());
		System.out.println(managementApp.getState().currentUser().getAssignedActivities());
		assertEquals(itemHolder.getWorker().getHoursOnActivity(managementApp.getState().currentActivity()), hours);
	}
	
	@Then("the activity is contained in the project")
	public void theActivityIsContainedInTheProject() throws OperationNotAllowedException {
	    assertTrue(itemHolder.getProject().containsActivity(activityName));
	}
}