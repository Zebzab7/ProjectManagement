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
	
	public WorkerSteps(ManagementApp managementApp, ErrorMessageHolder errorMessage, ItemHolder stateHelper) {
		this.managementApp = managementApp;
		this.errorMessage = errorMessage;
		this.itemHolder = stateHelper;
		
	}
	
	@Given("that worker {string} with password {string} exist")
	public void thatWorkerWithPasswordExist(String name, String password) throws Exception {
		itemHolder.setWorker(new Worker(name, password));
		managementApp.addWorker(itemHolder.getWorker());
	    assertTrue(managementApp.containsUser(name));
	}
	
	@Given("that worker {string} with password {string} does not exist")
	public void thatWorkerWithPasswordDoesNotExist(String name, String password) throws Exception {
		assertFalse(managementApp.containsUser(name));
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
}
