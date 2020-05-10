Feature: Create workers
	Description: Create workers to app
	Actors: Worker

Scenario: Worker already exist
 	Given that no one is logged in
	And that worker "PEPE" with password "1234" exist
	When creation of worker named "PEPE" with password "1234"
 	Then the error message "User already exist" is given
 	
Scenario: Worker is added to app successfully
 	Given that no one is logged in
	And that worker "PEPE" with password "1234" does not exist
	When creation of worker named "PEPE" with password "1234"
 	Then the worker is contained in app