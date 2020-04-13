package acceptance_tests;

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
	private ManagementApp managementApp;
	public TaskSteps(Project project, ManagementApp managementApp) {
		this.project = project;
		this.managementApp = managementApp;
	}

}
