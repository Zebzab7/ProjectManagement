Feature: Create projects
	Description: App setup for absent worker
	Actors: Worker

Scenario: Create fixed activity
	Given that worker "PEPE" with password "1234" exist
	And the fixed activity for "PEPE" called "SICK" does not exist
	When the worker creates a fixed activity called "SICK"
	Then the fixed activity for the worker is contained in the app

Scenario: Create fixed activity for specific worker
	Given that the worker is logged in
	And the fixed activity for "PEPE" called "SICK" does not exist
	When the worker creates a fixed activity for "PEPE" called "SICK"
	Then the fixed activity is contained in the app

Scenario: Add absent worker to activity
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project has an activity named "ProgrammingTasks 101"
	When the worker is added to the activity
	Then the error message "Worker is absent" is given
	
Scenario: Worker is absent
	Given that the worker is logged in
	And the worker creates a fixed activity called "Sick"
	When the worker sets his return date to the 2020-6-22 succesfully
	Then the worker is absent

Scenario: Worker goes on holiday
	Given that the worker is logged in
	And the worker creates a fixed activity called "Holiday"
	When the worker sets his leave date to the 2020-6-22 succesfully
	And the worker sets his return date to the 2020-6-22 succesfully
	Then the worker is absent during this time
	
Scenario: Worker has returned
	Given that the worker is logged in
	And the fixed activity with the worker called "Holiday" does exist
	And the worker returns on the 2020-4-29
	Then the worker has returned
	