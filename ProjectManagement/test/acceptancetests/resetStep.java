package acceptancetests;

import static org.hamcrest.CoreMatchers.equalTo;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project_management.*;
import test_helpers.ErrorMessageHolder;
import test_helpers.ItemHolder;

public class resetStep {
	ManagementApp managementApp = ManagementApp.getInstance();
	State state = State.getInstance();
	@Given("that the managementApp has been reset")
	public void thatTheManagementAppHasBeenReset() {
	    // Write code here that turns the phrase above into concrete actions
	    managementApp.deleteInstance();
	    State.deleteInstance();
	}
}
