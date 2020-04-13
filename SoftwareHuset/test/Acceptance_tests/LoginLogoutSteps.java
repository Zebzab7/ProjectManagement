package acceptance_tests;

import static org.junit.Assert.assertTrue;

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
	
	public LoginLogoutSteps(ManagementApp managementApp) {
		this.managementApp = managementApp;
	}
	@Given("^that the worker is logged in$")
	public void thatTheWorkerIsLoggedIn() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   assertTrue(managementApp.Login("1234"));
	}
	@Then("the worker is logged in")
	public void theWorkerIsLoggedIn() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(managementApp.LoggedIn());

	}
}
