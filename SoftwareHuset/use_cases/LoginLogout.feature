Feature: LoginLogout
	Description: Log a worker in and out
	Actors: Worker
	
Background:
	Given that worker "PEPE" with password "1234" exist
	
Scenario: Worker login successfully
 	Given that no one is logged in
 	And the name is "PEPE" and password is "1234"
 	Then the worker login succeeds
 	And the worker is logged in
 	
Scenario: Worker has wrong password
 	Given that no one is logged in
 	And the name is "PEPE" and password is "1254"
 	Then the worker login fails
 	And the worker is not logged in
 	
Scenario: Worker has wrong name
 	Given that no one is logged in
 	And the name is "PEOE" and password is "1234"
 	Then the worker login fails
 	And the worker is not logged in
 	