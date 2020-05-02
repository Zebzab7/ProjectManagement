Feature: LoginLogout
	Description: Log a worker in and out
	Actors: Worker

Scenario: Worker does not exist and tries to log in
 	Given that no one is logged in
 	And that worker "PEPE" with password "1234" does not exist
 	And the name is "PEPE" and password is "1234"
 	Then the worker login fails
 	And the error message "Worker does not exist" is given
 	
Scenario: Worker logs in successfully
	Given that worker "PEPX" with password "1234" exist
 	And that no one is logged in
 	And the name is "PEPX" and password is "1234"
 	Then the worker login succeeds
 	And the worker is logged in
 	
Scenario: Worker logs in with wrong password
	Given that worker "PEPE" with password "1234" exist
 	And that no one is logged in
 	And the name is "PEPE" and password is "1254"
 	Then the worker login fails
 	And the worker is not logged in
 	
Scenario: Worker logs in with wrong name
	Given that worker "PEPE" with password "1234" exist
 	And that no one is logged in
 	And the name is "PEOE" and password is "1234"
 	Then the worker login fails
 	And the worker is not logged in
 	