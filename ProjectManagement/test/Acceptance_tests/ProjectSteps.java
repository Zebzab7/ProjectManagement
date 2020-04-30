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
import project_management.*;
public class ProjectSteps {
	private ManagementApp managementApp;
	private ErrorMessageHolder errorMessage;
	String projectName;
	public ProjectSteps(ManagementApp managementApp, ErrorMessageHolder errorMessage) {
		this.managementApp = managementApp;
		this.errorMessage = errorMessage;
	}
	
	@Given("the project with name {string} does not exist")
	public void theProjectWithNameDoesNotExist(String name) throws Exception {
		assertFalse(managementApp.containsProject(name));
	}
	@Given("the project with name {string} does exist")
	public void theProjectWithNameDoesExist(String name) throws Exception {
	    try {
	    	assertTrue(managementApp.createProject(name));
	    }catch (OperationNotAllowedException e) {
			 errorMessage.setErrorMessage(e.getMessage());
		}
		
	}
	@When("worker adds new project named {string}")
	public void workerAddsNewProject(String name)throws Exception {
		try {
			projectName = name;
		    managementApp.createProject(name);
		} catch (OperationNotAllowedException e) {
			 errorMessage.setErrorMessage(e.getMessage());
		}
	}
	@When("worker adds new project named {string} with {string} as projectleader")
	public void workerAddsNewProjectNamedWithAsProjectleader(String projectName, String projectLeader) {
	    try {
	    	this.projectName =  projectName;
	 	    managementApp.createProjectWithLeader(projectName, managementApp.findWorker(projectLeader));
	 	    
	    } catch (Exception e) {
	    	errorMessage.setErrorMessage(e.getMessage());
	    }
	}

	@Then("the project is contained in the app")
	public void theProjectIsContainedInTheApp() throws OperationNotAllowedException {
	    assertTrue(managementApp.containsProject(projectName));
	}


}
