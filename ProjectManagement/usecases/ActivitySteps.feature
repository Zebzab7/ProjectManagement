Feature: Activity
	Description: Creation of task
	Actors: Project leader
	
Scenario: Create activity successfully
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
 	And the worker is the project leader
 	And the activity with name "Loops" is not in the project
 	When worker creates new activity with name "Loops" and ET 10 hours
 	And worker adds the activity to the project
 	Then the activity is contained in the project

Scenario: Activity name exist
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
 	And the worker is the project leader
 	And the activity with name "Loops" is in the project
 	When worker creates new activity with name "Loops" and ET 10 hours
 	And worker adds the activity to the project
 	Then the error message "The activity already exists in the project" is given
 	
Scenario: Worker not logged in
	Given that no one is logged in
	And the project with name "Programming 101" does exist
 	And the activity with name "Loops" is not in the project
 	When worker creates new activity with name "Loops" and ET 10 hours
 	And worker adds the activity to the project
 	Then the error message "User login required" is given
 	
Scenario: Worker asks for assistance successfully
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the activity with name "Loops" is in the project
	And the project is selected
	And the activity is selected
	And that worker "RONALD" with password "HELP" exist
	And the worker is eligable for help
	When the worker calls for assistance
	Then the worker "RONALD" is added to the activity
	
Scenario: Worker asks for assistance unsuccessfully
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the activity with name "Loops" is in the project
	And the project is selected
	And the activity is selected
	And that worker "RONALD" with password "HELP" exist
	And the worker is not eligable for help
	When the worker calls for assistance
	Then the worker "RONALD" is added to the activity

Scenario: Worker is available:
	Given that the worker is logged in
	And 