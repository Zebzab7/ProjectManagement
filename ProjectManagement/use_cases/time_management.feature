Feature: Add or remove hours
	Description: Worker adds or removes hours to given activity
	Actors: Worker
	
Scenario: Worker adds hours while working on project
	Given that worker with the name "PEPE" and password "1234" is logged in
	And the project with name "Programming 101" does exist
	And the worker is working on the project
	And the project has no work hours
	When the worker adds 10 work hours succesfully
	Then the project has a total of 10 work hours

Scenario: Worker adds hours while not working on project
	Given that worker with the name "PEPE" and password "1234" is logged in
	And the project with name "Programming 101" does exist
	And the worker is not working on the project
	And the project has no work hours
	When the worker adds 10 work hours unsuccesfully
	Then the project has a total of 0 work hours
	
Scenario: Hours are added when no one is logged in
	Given that no one is logged in
	And the project with name "Programming 101" does exist
	
Scenario: Hours are subtracted to a negative number
	Given that worker with the name "PEPE" and password "1234" is logged in
	And the project with name "Programming 101" does exist
	And the worker is working on the project
	And the project has no work hours
	When the worker adds -10 work hours succesfully
	Then the project has a total of 0 work hours
