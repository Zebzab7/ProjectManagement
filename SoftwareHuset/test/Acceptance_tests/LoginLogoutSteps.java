package acceptance_tests;

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


public class LoginLogoutSteps {
	private ManagementApp managementApp;
	private String password;
	private String name;
	Worker user;
	
	
	UserHelper userHelper;
	public LoginLogoutSteps(ManagementApp managementApp, UserHelper helper) {
		this.managementApp = managementApp;
		this.userHelper = helper;
	}
	@Given("the name is {string} and password is {string}")
	public void theNameIsAndPasswordIs(String string, String string2) {
	    this.name = string;
	    this.password = string2;
	}
	@Given("that no one is logged in")
	public void thatNoOneIsLoggedIn()throws Exception {
		managementApp.Logout();
	    assertFalse(managementApp.LoggedIn());
	}
	@Then("the worker login succeeds")
	public void theWorkerLoginSucceeds() throws Exception{
	    assertTrue(managementApp.Login(name, password));
	}
	@Then("the worker login fails")
	public void theWorkerLoginFails()throws Exception {
		 assertFalse(managementApp.Login(name, password));
	}
	@Then("the worker is logged in")
	public void theWorkerIsLoggedIn()throws Exception {
	    assertTrue(managementApp.LoggedIn());
	}
	@Then("the worker is not logged in")
	public void theWorkerIsNotLoggedIn() throws Exception {
		assertFalse(managementApp.LoggedIn());
	}
	
	@Given("that the worker is logged in")
	public void thatTheWorkerIsLoggedIn()throws Exception {
		if (!managementApp.containsUser(userHelper.getWorker().getUsername())) {
			assertTrue(managementApp.CreateUser(userHelper.getWorker().getUsername(), userHelper.getWorker().getPassword()));
		}
	    assertTrue(managementApp.Login(userHelper.getWorker().getUsername(), userHelper.getWorker().getPassword()));
	}


}
