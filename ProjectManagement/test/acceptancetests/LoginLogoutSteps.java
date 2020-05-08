package acceptancetests;

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
import test_helpers.StateHelper;

public class LoginLogoutSteps {
	private ManagementApp managementApp;
	private String password;
	private String name;
	private ErrorMessageHolder errorMessage;
	private Worker worker;
	
	StateHelper stateHelper;
	
	public LoginLogoutSteps(ManagementApp managementApp, StateHelper helper, ErrorMessageHolder errorMessage) {
		this.managementApp = managementApp;
		this.stateHelper = helper;
		this.errorMessage = errorMessage;
	}
	
	@Given("the name is {string} and password is {string}")
	public void theNameIsAndPasswordIs(String name, String password) {
		this.name = name;
	    this.password = password;
	}
	
	@Given("that no one is logged in")
	public void thatNoOneIsLoggedIn()throws Exception {
		managementApp.Logout();
	    assertFalse(managementApp.LoggedIn());
	}
	
	@Given("that the worker is logged in")
	public void thatTheWorkerIsLoggedIn() throws Exception {
		worker = stateHelper.getWorker();
		if (!managementApp.containsUser(worker.getUsername())) {
			assertTrue(managementApp.createUser(worker.getUsername(), worker.getPassword()));
		}
	    assertTrue(managementApp.Login(worker.getUsername(), worker.getPassword()));
	}
	
	@Given("that worker with the name {string} and password {string} is logged in")
	public void thatWorkerWithTheNameAndPasswordIsLoggedIn(String name, String password) throws Exception {
		stateHelper.setWorker(new Worker(name, password));
		managementApp.createUser(name, password);
		assertTrue(managementApp.Login(name, password));
	}
	
	@When("the worker logs in")
	public void theWorkerLogsIn() throws Exception {
	    managementApp.Login(name, password);
	}
	
	@Then("the worker login succeeds")
	public void theWorkerLoginSucceeds() throws Exception{
	    assertTrue(managementApp.Login(name, password));
	}
	
	@Then("the worker login fails")
	public void theWorkerLoginFails() throws Exception {
		try {
			assertFalse(managementApp.Login(name, password));
		} catch (Exception e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
	}
	
	@Then("the worker is logged in")
	public void theWorkerIsLoggedIn() throws Exception {
		worker = managementApp.getState().currentUser();
		assertTrue(worker.getUsername().equals(name));
		assertTrue(worker.getPassword().equals(password));
	}
	
	@Then("the worker is not logged in")
	public void theWorkerIsNotLoggedIn() throws Exception {
		assertFalse(managementApp.LoggedIn());
	}
}
