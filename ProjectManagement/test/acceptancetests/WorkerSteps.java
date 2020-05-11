package acceptancetests;

import io.cucumber.java.en.Given;
import static org.junit.Assert.assertTrue;

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

public class WorkerSteps {
	private ManagementApp managementApp;
	private ErrorMessageHolder errorMessage;
	private ItemHolder itemHolder;
	
	public WorkerSteps(ErrorMessageHolder errorMessage, ItemHolder stateHelper) {
		this.managementApp = ManagementApp.getInstance();
		this.errorMessage = errorMessage;
		this.itemHolder = stateHelper;
	}
	
	@Given("that worker {string} with password {string} exist")
	public void thatWorkerWithPasswordExist(String name, String password) throws Exception {
		assertTrue(itemHolder.setWorker(new Worker(name, password)));
	}
	
	@Given("that worker {string} with password {string} exist in the app")
	public void thatWorkerWithPasswordExistInTheApp(String name, String pass) throws Exception {
		itemHolder.setWorker(new Worker(name, pass));
		if (!managementApp.containsUser(name)) {
			managementApp.addWorker(itemHolder.getWorker());
		}
		assertTrue(managementApp.containsUser(name));
	}
	
	@Given("the worker is not the projectleader")
	public void theWorkerIsNotTheProjectleader() {
		assertFalse(itemHolder.getProject().isProjectLeader(itemHolder.getWorker()));
	}
	
	@Given("that worker {string} with password {string} does not exist")
	public void thatWorkerWithPasswordDoesNotExist(String name, String password) throws Exception {
		assertFalse(managementApp.containsUser(name));
	}
	
	@Given("the worker has amassed {int} hours for each activity")
	public void amassedHoursPerActivity(int hours) throws Exception {
	    
		for(int i = 0; i < managementApp.getState().currentUser().getAssignedActivities().size(); i++) {
			managementApp.getState().setActivity(managementApp.getState().currentUser().getAssignedActivities().get(i));
			managementApp.getState().setProject(itemHolder.getProject());
	    	managementApp.addHours(hours);
	    }
	    
	}
	
	@Given("that the worker is working on {int} activities")
	public void thatTheWorkerIsWorkingOnProjects(int count) {
	    for(int i = 0; i < count; i++) {
	    	if(managementApp.getState().currentUser().getAssignedActivities().size()<= count) {
	    		managementApp.getState().currentUser().getAssignedActivities().add(new Activity("Programmingtask 10" + i));
	    		managementApp.getState().currentUser().getWorkedHoursOnActivities().add(0);
	    	}
	    }
	    assertEquals(managementApp.getState().currentUser().getAssignedActivities().size(), count);
	}
	
	@Given("the worker is eligable for help")
	public void theWorkerIsEligableForHelp() {
	    itemHolder.getWorker().setHelpStatus(true);
	}
	
	@Given("the worker is not eligable for help")
	public void theWorkerIsNotEligableForHelp() {
		itemHolder.getWorker().setHelpStatus(false);
	}
	
	@When("the worker named {string} with password {string} is added to the app")
	public void theWorkerNamedWithPasswordIsAddedToTheApp(String name, String pass) throws Exception {
		try {
			assertTrue(managementApp.addWorker(itemHolder.getWorker()));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker is removed from the app")
	public void theWorkerIsRemovedFromTheApp() throws Exception {
		try {
			assertTrue(managementApp.removeUser(itemHolder.getWorker()));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
		
	}
	
	@When("the worker calls for assistance")
	public void theWorkerCallsForAssistance() {
	    try {
			itemHolder.getActivity().requestAssistance(itemHolder.getWorker());
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker named {string} with password {string} is created")
	public void theWorkerNamedWithPasswordIsCreated(String name, String password) throws Exception {
		try {
		    managementApp.createUser(name, password);
		    itemHolder.setWorker(managementApp.findWorker(name));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@When("the worker tries to find worker with name {string} in app")
	public void theWorkerTriesToFindWorkerWithNameInApp(String name) throws Exception {
		try {
			managementApp.findWorker(name);
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Then("the workers AssignedProjects list will hold {string} and {string}")
	public void the_workers_AssignedProjects_list_will_hold_and(String projectName1, String projectName2) {
	    try {
	    	Project p1 = managementApp.findProject(projectName1);
	    	Project p2 = managementApp.findProject(projectName2);
	    	assertTrue(itemHolder.getWorker().getAssignedProjects().contains(p1));
	    	assertTrue(itemHolder.getWorker().getAssignedProjects().contains(p2));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Then("the error message {string} is given")
	public void TheErrorMessageIsGiven(String string) throws Exception {
		assertEquals(errorMessage.getErrorMessage(), string);
	}

	@Then("the worker is contained in app")
	public void theWorkerIsContainedInApp() {
	    assertTrue(managementApp.containsUser(itemHolder.getWorker().getUsername()));
	}
	
	@Then("the worker is not contained in the app")
	public void theWorkerIsNotContainedInTheApp() {
		assertFalse(managementApp.containsUser(itemHolder.getWorker().getUsername()));
	}
	
	
	
	@Then("the worker has accumulated {int} hours of work")
	public void workerAccumulatedHours(int accHours) {
	   assertEquals(managementApp.getState().currentUser().workedHours(), accHours);
	}
	
}
