package acceptancetests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project_management.Activity;
import project_management.FixedActivity;
import project_management.ManagementApp;
import test_helpers.ErrorMessageHolder;
import test_helpers.ItemHolder;

public class FixedActivitySteps {
	private String activityName;
	private FixedActivity fActivity;
	
	private ItemHolder itemHolder;
	private ManagementApp managementApp;
	private ErrorMessageHolder errorMessage;
	
	public FixedActivitySteps(ManagementApp managementApp, ItemHolder itemHelper, ErrorMessageHolder errorMessage) {
		this.managementApp = managementApp;
		this.itemHolder = itemHelper;
		this.errorMessage = errorMessage;
		itemHelper.setState(managementApp.getState());
	}
	
	@Given("the fixed activity for {string} called {string} does not exist")
	public void fixedActivityDoesNotExist(String worker, String fixedActivity) {
		
	}
	
	@When("the worker creates a fixed activity called {string}")
	public void createFixedActivity(String fixedActivity) {
		
	}
	
	@When("the worker creates a fixed activity for {string} called {string})")
	public void createFixedActivityForWorker(String worker, String fixedActivity) {
		
	}
	
	@Then("the fixed activity for the worker is contained in the app")
	public void FixedActivityIsContained() {
		
	}
	
	
	
}
