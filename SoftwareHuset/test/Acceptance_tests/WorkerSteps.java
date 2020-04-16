package acceptance_tests;

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
import softwareHuset.*;
public class WorkerSteps {
	private ManagementApp managementApp;
	private ErrorMessageHolder errorMessage;
	String user;
	public WorkerSteps(ManagementApp managementApp, ErrorMessageHolder errorMessage) {
		this.managementApp = managementApp;
		this.errorMessage = errorMessage;
	}
	@Given("that worker {string} with password {string} exist")
	public void thatWorkerWithPasswordExist(String name, String password) throws Exception {
		user = name;
	    managementApp.CreateUser(name, password);
	    assertTrue(managementApp.containsUser(name));
	}
	
	@Given("that worker {string} with password {string} does not exist")
	public void thatWorkerWithPasswordDoesNotExist(String name, String password) {
		managementApp.removeUser(managementApp.findWorker(name));
	}
	
	@When("creation of worker named {string} with password {string}")
	public void creationOfWorkerNamedWithPassword(String name, String password) {
		user = name;
	    managementApp.CreateUser(name, password);
	}
	@Then("the error message {string} is given")
	public void errorMessageIsProduced(String string) throws Exception {
		assertEquals(errorMessage, this.errorMessage);
	}

	@Then("the worker is contained in app")
	public void theWorkerIsContainedInApp() {
	    assertTrue(managementApp.containsUser(user));
	}

}
