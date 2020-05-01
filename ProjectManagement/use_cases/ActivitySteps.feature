Feature: Activity
	Description: Creation of task
	Actors: Project leader
	
Scenario: Create activity successfully
	Given that the worker is logged in
	And the worker is working on a project
 	And the worker is the project leader
 	And the activity with name "Loops" is not in the project
 	When worker creates new activity with name "Loops" and ET "10" hours
 	Then the activity is contained in the project

Scenario: Activity name exist
	Given that the worker is logged in
	And the worker is working on a project
 	And the worker is the project leader
 	And the activity with name "Loops" is in the project
 	When worker creates new activity with name "Loops" and ET "10" hours
 	Then the error message "The Task already exist in the project" is given
 	
Scenario: Worker not logged in
	Given that no one is logged in
 	And the activity with name "Loops" is not in the project
 	When worker creates new activity with name "Loops" and ET "10" hours
 	Then the error message "User login required" is given