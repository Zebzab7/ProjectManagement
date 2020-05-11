Feature: Activity
	Description: Creation of task
	Actors: Project leader

Background: reset
	Given that the managementApp has been reset
		
Scenario: Create activity successfully
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
 	And the worker is the project leader
 	And the project is selected
 	And the activity with name "Loops" is not in the project
 	When worker creates new activity with name "Loops" and ET 10 hours
 	And worker adds the activity to the project
 	Then the activity is contained in the project
 	And the worker can find the activity
 	
Scenario: cannot find activity
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
 	And the project is selected
 	And the activity with name "Loops" is not in the project
 	Then the worker can not find the activity

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

Scenario: Remove activity whilst offline
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
 	And the activity with name "Loops" is in the project
 	And the project is selected
 	When the worker logs out
 	When the worker removes the activity
 	Then the activity is contained in the project

Scenario: Remove activity
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
 	And the activity with name "Loops" is in the project
 	And the project is selected
 	When the worker removes the activity
 	Then the activity is not contained in the project
 	
Scenario: Remove activity unsuccesfully
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
 	And the activity with name "Loops" is not in the project
 	And the project is selected
 	When the worker removes the activity
 	Then the error message "The activity is not contained in the project" is given

Scenario: Remove activity whilst in activity
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
 	And the activity with name "Loops" is not in the project
 	And the project is selected
 	And the activity is selected
 	When the worker removes the activity
 	Then the error message "User is in an activity" is given

Scenario: Worker asks for assistance successfully
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the activity with name "Loops" is in the project
	And the project is selected
	And the activity is selected
	And that worker "RONA" with password "HELP" exist
	And the worker is working on the project
	And the worker is not working on the activity
	And the worker is eligable for help
	When the worker calls for assistance
	Then the worker "RONA" is added to the activity
	
Scenario: Worker asks for assistance unsuccessfully due to acitivty not being selected
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the activity with name "Loops" is in the project
	And the project is selected
	And the activity is selected
	And that worker "RONA" with password "HELP" exist
	And the worker is working on the project
	And the worker is not working on the activity
	And the worker is not eligable for help
	When the worker calls for assistance
	Then the worker "RONA" is not added to the activity
	
Scenario: Worker asks for assistance unsuccessfully due to worker not being eligable for help
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project has an activity named "Loops"
	And the project is selected
	And that worker "RONA" with password "HELP" exist
	And the worker is working on the project
	And the worker is not working on the activity
	And the worker is not eligable for help
	When the worker calls for assistance
	Then the worker "RONA" is not added to the activity
	
Scenario: Worker asks for assistance unsuccessfully when no one is logged in
	Given that no one is logged in
	And the project with name "Programming 101" does exist
	And the activity with name "Loops" is in the project
	And the project is selected
	And the activity is selected
	And that worker "RONA" with password "HELP" exist
	And the worker is working on the project
	And the worker is not working on the activity
	And the worker is not eligable for help
	When the worker calls for assistance
	Then the error message "User login required" is given