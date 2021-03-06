package acceptancetests;

import static org.hamcrest.CoreMatchers.equalTo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
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
	
	public ActivitySteps(ItemHolder stateHelper, ErrorMessageHolder errorMessage) {
		this.managementApp = ManagementApp.getInstance();
		this.itemHolder = stateHelper;
		this.errorMessage = errorMessage;

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
	public void theActivityWithNameIsNotInTheProject(String name) throws Exception {
	    assertFalse(itemHolder.getProject().containsActivity(name));
	}
	
	@Given("the activity with name {string} is in the project")
	public void theActivityWithNameIsInTheProject(String name) throws Exception {
	   try {
		   if (!itemHolder.getProject().containsActivity(name)) {
			   itemHolder.setActivity(new Activity(name));
			   itemHolder.getProject().addActivity(itemHolder.getActivity());
		   }
		   assertTrue(itemHolder.getProject().containsActivity(name));
	    } catch (Exception e) {
			 errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Given("the project has an activity named {string}")
	public void theProjectHasAnActivityNamed(String name) throws Exception {
		itemHolder.logInTemp();
		if (!itemHolder.getProject().containsActivity(name)) {
			itemHolder.setActivity(new Activity(name));
			itemHolder.getProject().addActivity(itemHolder.getActivity());
		}
		itemHolder.logOutTemp();
		assertTrue(itemHolder.getProject().containsActivity(name));
	}
	
	@Given("the activity has no work hours")
	public void theActivityHasNoWorkHours() throws Exception {
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
	public void theActivityIsSelected() throws Exception {
		if ( itemHolder.getActivity() != null && !itemHolder.getActivity().containsWorker(itemHolder.getWorker()) ) {
			managementApp.getState().setActivity(itemHolder.getActivity());
			itemHolder.getActivity().addWorker(itemHolder.getWorker());
		}
		assertTrue(managementApp.getState().setActivity(itemHolder.getActivity()));
	}
	
	@Given("the worker is working on the activity")
	public void theWorkerIsWorkingOnTheActivity() throws Exception {
		if(!itemHolder.getActivity().containsWorker(itemHolder.getWorker())) {
			itemHolder.getActivity().addWorker(itemHolder.getWorker());
		}
		assertTrue(itemHolder.getActivity().containsWorker(itemHolder.getWorker()));
	}
	
	@Given("the worker is not working on the activity")
	public void theWorkerIsNotWorkingOnTheActivity() throws Exception {
		if (itemHolder.getActivity().containsWorker(itemHolder.getWorker())) {
			itemHolder.getActivity().removeWorker(itemHolder.getWorker());
		}
		assertFalse(itemHolder.getActivity().containsWorker(itemHolder.getWorker()));
	}
	
	@When("the worker is added to the activity")
	public void addWorkerToActivity() throws Exception {
		try{
			itemHolder.getActivity().addWorker(managementApp.getState().currentUser());
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker sets the start date of the activity to the {int}-{int}-{int} succesfully")
	public void theWorkerSetsTheStartDateOfTheActivityToTheSuccesfully(int year, int month, int day) {
		try {
			assertTrue(itemHolder.getActivity().getTimeManager().setStartTime(year, month, day, itemHolder.getActivity()));
		} catch(Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker sets the end date of the activity to the {int}-{int}-{int} succesfully")
	public void theWorkerSetsTheEndDateOfTheActivityToTheSuccesfully(int year, int month, int day) {
		try {
			assertTrue(itemHolder.getActivity().getTimeManager().setEndTime(year, month, day, itemHolder.getActivity()));
		} catch(Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker sets the end date of the activity to the {int}-{int}-{int} unsuccesfully")
	public void theWorkerSetsTheEndDateOfTheActivityToTheUnsuccesfully(int year, int month, int day) {
		try {
			assertFalse(itemHolder.getActivity().getTimeManager().setEndTime(year, month, day, itemHolder.getActivity()));
		} catch(Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker adds {int} work hours to the activity succesfully")
	public void theWorkerAddsWorkHoursToTheActivitySuccesfully(int hours) throws Exception {
			assertTrue(managementApp.addHours(hours));
	}
	
	@When("the worker adds {int} work hours to the activity unsuccesfully")
	public void theWorkerAddsWorkHoursToTheActivityUnsuccesfully(int hours) throws Exception {
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
			itemHolder.setProject(p);
			managementApp.addHours(hours);
		//	assertTrue(p.addHoursToActivity(hours, a));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("another worker adds {int} work hours to the activity successfully")
	public void anotherWorkerAddsWorkHoursToTheActivitySuccessfully(int hours) throws Exception {
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
			assertTrue(itemHolder.setActivity(new Activity(name, ET)) );
		}
		catch (Exception e) {
	    	errorMessage.setErrorMessage(e.getMessage());
	    }
	}
	
	@When("worker adds the activity to the project")
	public void workerAddsTheActivityToTheProject() throws Exception {
		try {
			assertTrue(itemHolder.getProject().addActivity(itemHolder.getActivity()));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker removes the activity")
	public void workerRemovesActivity() {
	    try {
			managementApp.getState().currentProject().removeActivity(itemHolder.getActivity());
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
	
	@Then("the start time for the activity is {int}-{int}-{int}")
	public void theStartTimeForTheActivityIs(int year, int month, int day) {
		GregorianCalendar t = itemHolder.getActivity().getTimeManager().getStartTime();
		assertEquals(year, t.get(GregorianCalendar.YEAR));
		assertEquals(month - 1, t.get(GregorianCalendar.MONTH));
		assertEquals(day, t.get(GregorianCalendar.DATE));
	}
	
	@Then("the end time for the activity is {int}-{int}-{int}")
	public void theEndTimeForTheActivityIs(int year, int month, int day) {
		GregorianCalendar t = itemHolder.getActivity().getTimeManager().getEndTime();
		assertEquals(year, t.get(GregorianCalendar.YEAR));
		assertEquals(month - 1, t.get(GregorianCalendar.MONTH));
		assertEquals(day, t.get(GregorianCalendar.DATE));
	}
	
	@Then("the activity is contained in the project")
	public void theActivityIsContainedInTheProject() throws Exception {
	    assertTrue(itemHolder.getProject().containsActivity(itemHolder.getActivity().getName()));
	}
	@Then("the activity is not contained in the project")
	public void activityNotContained() {
	    assertFalse(itemHolder.getProject().containsActivity(itemHolder.getActivity().getName()));
	}
	@Then("the worker {string} is added to the activity")
	public void addedWorker(String string) {
	    try {
			assertTrue(managementApp.getState().currentActivity().containsWorker(itemHolder.getWorker()));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	@Then("the worker {string} is not added to the activity")
	public void notAddedWorker(String string) {
	    try {
			assertFalse(itemHolder.getActivity().containsWorker(itemHolder.getWorker()));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	@Then("the start and end week of the given month of the activity are week {int} and week {int}")
	public void theStartAndEndWeekOfTheGivenMonthOfTheActivityAreWeekAndWeek(int startWeek, int endWeek) {
		assertEquals(itemHolder.getActivity().getTimeManager().getStartWeek(), startWeek);
		assertEquals(itemHolder.getActivity().getTimeManager().getEndWeek(), endWeek);
	}
}
