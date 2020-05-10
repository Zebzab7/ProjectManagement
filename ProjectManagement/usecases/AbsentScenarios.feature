Feature: Create fixed activities
	Description: App setup for absent worker
	Actors: Worker

Scenario: Create fixed activity
	Given that worker "PEPE" with password "1234" exist
	And that the worker is logged in
	And the fixed activity for "PEPE" called "SICK" does not exist
	When the worker creates a fixed activity called "SICK"
	Then the fixed activity for the worker is contained in the app

Scenario: Add absent worker to activity
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project has an activity named "ProgrammingTasks 101"
	And the worker is not working on the activity
	When the worker creates a fixed activity called "SICK"
	And the workers return date is on the 2020-5-12
	And the worker is added to the activity
	Then the error message "Worker is absent" is given
	
Scenario: Worker is absent
	Given that the worker is logged in
	And the worker creates a fixed activity called "SICK"
	When the workers return date is on the 2020-6-22
	Then the worker is absent

Scenario: Worker goes on holiday
	Given that the worker is logged in
	And the worker creates a fixed activity called "HOLIDAY"
	When the workers leave date is on the 2020-7-5
	And the workers return date is on the 2020-7-22
	Then the worker is not absent
	
Scenario: Worker has returned
	Given that the worker is logged in
	And the fixed activity with the worker called "HOLIDAY" does exist
	When the workers return date is on the 2020-4-24
	Then the worker has returned
	
Scenario: Worker has multiple fixed activities and is absent
	Given that the worker is logged in
	And the fixed activity with the worker called "HOLIDAY" does exist
	When the worker creates a fixed activity called "SICK"
	And the workers return date is on the 2020-5-12
	Then the worker has 2 fixed activities
	And the worker is absent

Scenario: Worker has multiple fixed activities and is not absent
	Given that the worker is logged in
	And the fixed activity with the worker called "SUMMER HOLIDAY" does exist
	When the workers leave date is on the 2020-7-5
	And the workers return date is on the 2020-8-3
	And the worker creates a fixed activity called "CHRISTMAS HOLIDAY"
	And the workers leave date is on the 2020-12-12
	And the workers return date is on the 2020-12-28
	Then the worker has 2 fixed activities
	And the worker is not absent

Scenario: Worker has fixed activity and is in the timeframe
	Given that the worker is logged in
	And the fixed activity with the worker called "SUMMER HOLIDAY" does exist
	When the workers leave date is on the 2020-5-5
	And the workers return date is on the 2020-6-15
	And the worker creates a fixed activity called "CHRISTMAS HOLIDAY"
	And the workers leave date is on the 2020-12-12
	And the workers return date is on the 2020-12-28
	Then the worker has 2 fixed activities
	And the worker is absent