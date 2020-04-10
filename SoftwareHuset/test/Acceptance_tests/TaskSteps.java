package Acceptance_tests;

import SoftwareHuset.*;
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

public class TaskSteps {
	
	private ManagementApp managementApp;
	
	public TaskSteps(ManagementApp managementApp) {
		this.managementApp = managementApp;
	}
	@Given("that the worker is a project leader")
	public void thatTheWorkerIsAProjectLeader() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("there is a task with name {string}")
	public void thereIsATaskWithName(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("the task is not in the project")
	public void theTaskIsNotInTheProject() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the task is added to the project")
	public void theTaskIsAddedToTheProject() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the task with name {string} is contained in the project")
	public void theTaskWithNameIsContainedInTheProject(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
