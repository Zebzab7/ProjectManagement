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

import helpers.ErrorMessageHolder;
import helpers.UserHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project_management.*;
public class TaskSteps {
	
	//private Project project;
	private String taskName;
	private UserHelper userHelper;

	private ManagementApp managementApp;
	private ErrorMessageHolder errorMessage;
	public TaskSteps(ManagementApp managementApp, UserHelper userHelper, ErrorMessageHolder errorMessage) {
		this.managementApp = managementApp;
		this.userHelper = new UserHelper(managementApp.getUser());
		this.errorMessage = errorMessage;
	}
	@Given("the worker is working on a project")
	public void theWorkerIsWorkingOnAProject() throws Exception{
	    if (!managementApp.containsProject(userHelper.getProject().getName())) {
	    	managementApp.createProject(userHelper.getProject().getName());
	    }
	    managementApp.addWorkerToProject(userHelper.getWorker(), userHelper.getProject());
	}

	@Given("the worker is the project leader")
	public void theWorkerIsTheProjectLeader() {
	    userHelper.getProject().setProjectLeader(userHelper.getWorker());
	}

	@Given("the task with name {string} is not in the project")
	public void theTaskWithNameIsNotInTheProject(String task) throws OperationNotAllowedException {
	    assertFalse(userHelper.getProject().containsTask(task));
	}
	
	@Given("the task with name {string} is in the project")
	public void theTaskWithNameIsInTheProject(String task) throws OperationNotAllowedException {
		   try {
			   	userHelper.getProject().createTask(task, "1");
				assertTrue(userHelper.getProject().containsTask(task));
		    }catch (OperationNotAllowedException e) {
				 errorMessage.setErrorMessage(e.getMessage());
			}
		userHelper.getProject().createTask(task, "0");
		assertTrue(userHelper.getProject().containsTask(task));
	}

	@When("worker creates new task  with name {string} and ET {string} hours")
	public void workerCreatesNewTaskWithNameAndETHours(String name, String ET)throws Exception {
		try {
			taskName = name;
			userHelper.getProject().createTask(name, ET);
		}
		catch (Exception e) {
	    	errorMessage.setErrorMessage(e.getMessage());
	    }
		
	}

	@Then("the task is contained in the project")
	public void theTaskIsContainedInTheProject() throws OperationNotAllowedException {
	    assertTrue(userHelper.getProject().containsTask(taskName));
	}
}
