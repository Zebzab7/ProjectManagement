package acceptance_tests;

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
public class TaskSteps {
	
	private Project project;
	private Task task;
	private String user;
	private String projectName;
	private ManagementApp managementApp;
	public TaskSteps(ManagementApp managementApp) {
		this.managementApp = managementApp;
	}
	@Given("the worker is working on project {string}")
	public void theWorkerIsWorkingOnProject(String project) {
	    managementApp.addUserToProject(user, project);
	}

	@Given("the worker is the project leader")
	public void theWorkerIsTheProjectLeader() {
	    assertTrue(project.setProjectleader(user));
	}

	@Given("the task with name {string} is not in the project")
	public void theTaskWithNameIsNotInTheProject(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("worker creates new task  with name {string} and ET {string} hours")
	public void workerCreatesNewTaskWithNameAndETHours(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the task is contained in the project")
	public void theTaskIsContainedInTheProject() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
