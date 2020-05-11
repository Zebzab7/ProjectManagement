Feature: Fixed activities
	Description: App setup for absent worker
	Actors: Worker
Background: reset
	Given that the managementApp has been reset
	
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
	And that the fixed activity with the worker called "HOLIDAY" does exist
	When the workers return date is on the 2020-4-24
	Then the worker has returned
	
Scenario: Worker has multiple fixed activities and is absent
	Given that the worker is logged in
	And that the fixed activity with the worker called "HOLIDAY" does exist
	When the worker creates a fixed activity called "SICK"
	And the workers return date is on the 2020-5-12
	Then the worker has 2 fixed activities
	And the worker is absent

Scenario: Worker has multiple fixed activities and is not absent
	Given that the worker is logged in
	And that the fixed activity with the worker called "SUMMER HOLIDAY" does exist
	When the workers leave date is on the 2020-7-5
	And the workers return date is on the 2020-8-3
	And the worker creates a fixed activity called "CHRISTMAS HOLIDAY"
	And the workers leave date is on the 2020-12-12
	And the workers return date is on the 2020-12-28
	Then the worker has 2 fixed activities
	And the worker is not absent

Scenario: Worker has fixed activity and is in the timeframe
	Given that the worker is logged in
	And that the fixed activity with the worker called "SUMMER HOLIDAY" does exist
	When the workers leave date is on the 2020-5-5
	And the workers return date is on the 2020-6-15
	And the worker creates a fixed activity called "CHRISTMAS HOLIDAY"
	And the workers leave date is on the 2020-12-12
	And the workers return date is on the 2020-12-28
	Then the worker has 2 fixed activities
	And the worker is absent
	
Scenario: Leave and return date set
	Given that the worker is logged in
	And that the fixed activity with the worker called "SUMMER HOLIDAY" does exist
	When the workers leave date is on the 2020-5-5
	And the workers return date is on the 2020-6-15
	Then the workers leave date is set
	And the workers return date is set

Scenario: Fixed activity not created
	Given that the worker is logged in
	And that the fixed activity with the worker called "HOLIDAY" does not exist
	When the worker tries to find his fixed activity called "HOLIDAY"
	Then the error message "Fixed activity does not exist" is given
	
Scenario: User tries to find fixed activity when not logged in
	Given that worker "PEPE" with password "1234" exist
	And that no one is logged in
	When the worker tries to find his fixed activity called "HOLIDAY"
	Then the error message "User login required" is given

Scenario: User tries to add already existing fixed activity
	Given that the worker is logged in
	And that the fixed activity with the worker called "SUMMER HOLIDAY" does exist
	When the worker creates a fixed activity called "SUMMER HOLIDAY"
	Then the error message "Fixed activity already exists" is given
	
Scenario: User tries to add fixed activity whilst logged out
	Given that no one is logged in
	When the worker creates a fixed activity called "SUMMER HOLIDAY"
	Then the error message "User login required" is given

Scenario: User removes fixed activity whilst logged out
	Given that the worker is logged in
	And that the fixed activity with the worker called "SUMMER HOLIDAY" does exist
	When the worker logs out
	And the worker tries to remove the fixed activity
	Then the error message "User login required" is given