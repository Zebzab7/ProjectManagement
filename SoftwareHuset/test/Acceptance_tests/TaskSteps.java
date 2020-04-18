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
	
	private ProjectHelper projectHelper;
	private Project project;
	private String taskName;
	private WorkerHelper workerHelper;
	private ManagementApp managementApp;
	
	public TaskSteps(ManagementApp managementApp, WorkerHelper workerhelper) {
		this.managementApp = managementApp;
		this.workerHelper = workerhelper;
		this.projectHelper = new ProjectHelper(managementApp.getUser());
	}
	@Given("the worker is working on a project")
	public void theWorkerIsWorkingOnAProject() {
	    managementApp.createProject(projectHelper.getProject().getName());
	    project = managementApp.findProject(projectHelper.getProject().getName());
	    managementApp.addUserToProject(workerHelper.getWorker(), project);
	}

	@Given("the worker is the project leader")
	public void theWorkerIsTheProjectLeader() {
	    project.setProjectLeader(workerHelper.getWorker());
	}

	@Given("the task with name {string} is not in the project")
	public void theTaskWithNameIsNotInTheProject(String task) {
	    assertFalse(project.containsTask(task));
	}
	
	@Given("the task with name {string} is in the project")
	public void theTaskWithNameIsInTheProject(String task) {
		project.createTask(task, "0");
		assertTrue(project.containsTask(task));
	}

	@When("worker creates new task  with name {string} and ET {string} hours")
	public void workerCreatesNewTaskWithNameAndETHours(String name, String ET) {
		taskName = name;
	    project.createTask(name, ET);
	}

	@Then("the task is contained in the project")
	public void theTaskIsContainedInTheProject() {
	    assertTrue(project.containsTask(taskName));
	}
}
