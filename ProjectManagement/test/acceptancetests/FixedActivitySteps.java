package acceptancetests;

import static org.hamcrest.CoreMatchers.equalTo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project_management.*;
import test_helpers.ErrorMessageHolder;
import test_helpers.ItemHolder;

public class FixedActivitySteps {
	private String activityName;
	
	private ItemHolder itemHolder;
	private ManagementApp managementApp;
	private ErrorMessageHolder errorMessage;
	
	public FixedActivitySteps(ItemHolder itemHelper, ErrorMessageHolder errorMessage) {
		this.managementApp = ManagementApp.getInstance();
		this.itemHolder = itemHelper;
		this.errorMessage = errorMessage;
	}
	
	@Given("the fixed activity for {string} called {string} does not exist")
	public void fixedActivityDoesNotExist(String worker, String fixedActivity) {
		assertFalse(managementApp.containsFixedActivity(fixedActivity, worker));
	}
	
	@Given("that the fixed activity with the worker called {string} does exist")
	public void fixedActivityExists(String fixedActivity) throws Exception {
		managementApp.createFixedActivity(new FixedActivity(fixedActivity, itemHolder.getWorker()));
		managementApp.getState().setFixedActivity(managementApp.findFixedActivity(fixedActivity));
		itemHolder.setFixedActivity(managementApp.findFixedActivity(fixedActivity));
		
		assertTrue(managementApp.containsFixedActivity(fixedActivity, itemHolder.getWorker().getUsername()));
	}
	@Given("that the fixed activity with the worker called {string} does not exist")
	public void fixedActivityDoesNotExist(String fixedActivity) {
	    assertFalse(managementApp.containsFixedActivity(fixedActivity, managementApp.getState().currentUser().getUsername()));
	}
	
	@When("the worker creates a fixed activity called {string}")
	public void createFixedActivity(String fixedActivity) {
		try {
			managementApp.createFixedActivity(new FixedActivity(fixedActivity,
																managementApp.getState().currentUser()));
			
			managementApp.getState().setFixedActivity(managementApp.findFixedActivity(fixedActivity));
			itemHolder.setFixedActivity(managementApp.findFixedActivity(fixedActivity));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
		
	}
	
	@When("the workers leave date is on the {int}-{int}-{int}")
	public void setLeaveDate(int year, int month, int day) throws Exception {
		assertTrue(managementApp.getState().currentFixedActivity().getAbsenceManager().setStartTime(year, month, day));
	}
	
	@When("the workers return date is on the {int}-{int}-{int}")
	public void setReturnDate(int year, int month, int day) throws Exception {
		assertTrue(managementApp.getState().currentFixedActivity().getAbsenceManager().setEndTime(year, month, day));
	}
	
	@When("the worker tries to find his fixed activity called {string}")
	public void findFixedActivity(String fActivity) {
	    try{
	    	managementApp.findFixedActivity(fActivity);
	    } catch(Exception e) {
	    	errorMessage.setErrorMessage(e.getMessage());
	    }
	}
	@When("the worker tries to remove the fixed activity")
	public void removeFixedActivity() {
		try {
			managementApp.removeFixedActivity(managementApp.getState().currentFixedActivity());
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Then("the fixed activity for the worker is contained in the app")
	public void FixedActivityIsContained() {
		assertTrue(managementApp.containsFixedActivity(itemHolder.getFixedActivity().getName(),
													   managementApp.getState().currentUser().getUsername()));
	}
	
	@Then("the worker has {int} fixed activities")
	public void theWorkerHasFixedActivities(int count) {
	    assertEquals(managementApp.getState().currentUser().getAssignedFixedActivityList().size(),count);
	}
	
	@Then("the worker is absent")
	public void workerIsAbsent() {
		assertTrue(managementApp.getState().currentUser().isAbsent());
	}
	
	@Then("the worker is not absent")
	public void workerNotAbsent() {
		assertFalse(managementApp.getState().currentUser().isAbsent());
	}
	
	@Then("the worker has returned")
	public void workerHasReturned() throws Exception {
		managementApp.removeFixedActivity(itemHolder.getFixedActivity());
		
		assertTrue(managementApp.getState().currentUser().isAvailable());
	}
	
	@Then("the workers leave date is set")
	public void leaveDateSet() {
		assertTrue(managementApp.getState().currentFixedActivity().getAbsenceManager().getStartTime() != null);
	}
	
	@Then("the workers return date is set")
	public void returnDateSet() {
		assertTrue(managementApp.getState().currentFixedActivity().getAbsenceManager().getEndTime() != null);
	}
	
	
}
