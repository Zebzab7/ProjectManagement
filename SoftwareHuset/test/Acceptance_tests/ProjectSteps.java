package acceptance_tests;

import softwareHuset.ManagementApp;
import softwareHuset.Worker;
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
public class ProjectSteps {
	private ManagementApp managementApp;
	private ErrorMessageHolder errorMessage;
	String projectName;
	public ProjectSteps(ManagementApp managementApp, ErrorMessageHolder errorMessage) {
		this.managementApp = managementApp;
		this.errorMessage = errorMessage;
	}
	
	@Given("the project with name {string} does not exist")
	public void theProjectWithNameDoesNotExist(String name) {
		assertTrue(managementApp.removeProject(name));
	}
	@Given("the project with name {string} does exist")
	public void theProjectWithNameDoesExist(String name) {
	    assertTrue(managementApp.createProject(name));
	}
	@When("worker adds new project named {string}")
	public void workerAddsNewProject(String name) {
		projectName = name;
	    managementApp.createProject(name);
	}
	@When("worker adds new project named {string} with {string} as projectleader")
	public void workerAddsNewProjectNamedWithAsProjectleader(String projectName, String projectLeader) {
	    this.projectName =  projectName;
	    managementApp.createProjectWithLeader(projectName, projectLeader);
	    
	}

	@Then("the project is contained in the app")
	public void theProjectIsContainedInTheApp() {
	    assertTrue(managementApp.containsProject(projectName));
	}
}
