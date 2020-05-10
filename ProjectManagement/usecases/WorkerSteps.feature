Feature: Create workers
	Description: Create workers to app
	Actors: Worker

Scenario: Worker already exist
 	Given that no one is logged in
	And that worker "PEPE" with password "1234" exist
	When the worker named "PEPE" with password "1234" is created
 	Then the error message "User already exist" is given
 	
Scenario: Worker is added to app successfully
 	Given that no one is logged in
	And that worker "PEPE" with password "1234" does not exist
	When the worker named "PEPE" with password "1234" is created
 	Then the worker is contained in app
 
Scenario: Worker is not available:
	Given that the worker is logged in
	And that the worker is working on 20 activities
	And the project with name "Programming 101" does exist
	And the activity with name "Loops" is in the project
	And the project is selected
	When the worker is added to the activity
	Then the error message "Worker is not available" is given

Scenario: Workers total current time spent
	Given that the worker is logged in
	And that the worker is working on 5 activities
	And the worker has amassed 10 hours for each activity
	Then the worker has accumulated 50 hours of work