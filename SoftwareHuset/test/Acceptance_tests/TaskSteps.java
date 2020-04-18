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
	
	//private Project project;
	private String taskName;
	private UserHelper userHelper;

	private ManagementApp managementApp;
	
	public TaskSteps(ManagementApp managementApp, UserHelper userHelper) {
		this.managementApp = managementApp;
		this.userHelper = new UserHelper(managementApp.getUser());
	}
	@Given("the worker is working on a project")
	public void theWorkerIsWorkingOnAProject() throws Exception{
	    managementApp.createProject(userHelper.getProject().getName());
	    managementApp.addWorkerToProject(userHelper.getWorker(), userHelper.getProject());
	}

	@Given("the worker is the project leader")
	public void theWorkerIsTheProjectLeader() {
	    userHelper.getProject().setProjectLeader(userHelper.getWorker());
	}

	@Given("the task with name {string} is not in the project")
	public void theTaskWithNameIsNotInTheProject(String task) {
	    assertFalse(userHelper.getProject().containsTask(task));
	}
	
	@Given("the task with name {string} is in the project")
	public void theTaskWithNameIsInTheProject(String task) {
		userHelper.getProject().createTask(task, "0");
		assertTrue(userHelper.getProject().containsTask(task));
	}

	@When("worker creates new task  with name {string} and ET {string} hours")
	public void workerCreatesNewTaskWithNameAndETHours(String name, String ET) {
		taskName = name;
		userHelper.getProject().createTask(name, ET);
	}

	@Then("the task is contained in the project")
	public void theTaskIsContainedInTheProject() {
	    assertTrue(userHelper.getProject().containsTask(taskName));
	}
}
