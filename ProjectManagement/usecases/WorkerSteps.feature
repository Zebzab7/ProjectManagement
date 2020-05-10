Feature: Create workers
	Description: Create workers to app
	Actors: Worker

Scenario: Worker is added but already exists
 	Given that the worker is logged in
	And that worker "PEPE" with password "1234" exist
	When the worker named "PEPE" with password "1234" is added to the app
 	Then the error message "User already exist" is given
 	
Scenario: Worker is created but already exists
 	Given that the worker is logged in
	And that worker "PEPE" with password "1234" exist
	When the worker named "PEPE" with password "1234" is created
 	Then the error message "User already exist" is given
 	
Scenario: Worker is succesfully created
	Given that the worker is logged in 
	And that worker "PEPX" with password "1234" does not exist
	When the worker named "PEPX" with password "1234" is created
	Then the worker is contained in app
 	
Scenario: Worker is added to app successfully
 	Given that the worker is logged in
	And that worker "PEPE" with password "1234" exist
	When the worker named "PEPE" with password "1234" is added to the app
 	Then the worker is contained in app
 	
Scenario: Worker is removed from the app succesfully
	Given that the worker is logged in
	And that worker "PEPE" with password "1234" exist in the app
	When the worker is removed from the app
	Then the worker is not contained in the app
	
Scenario: Worker tries to find worker that doesn't exist
	Given that the worker is logged in
	And that worker "PEPX" with password "1234" does not exist
	When the worker tries to find worker with name "PEPX" in app
	Then the error message "User does not exist" is given