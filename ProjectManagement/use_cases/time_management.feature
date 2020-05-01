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
	
Scenario: hours are added when no one is logged in
	Given that no one is logged in
	And the project with name "Programming 101" does exist

Scenario: Set start date for project
	Given that the worker is logged in
  And the project with name "Programming 101" does exist
  And the worker "PEPE" is the projectleader
  When the worker sets the start date of the project to the 2020-6-22
  Then the start time is set for the project
    
Scenario: Set deadline successfully
	Given that the worker is logged in
  And the project with name "Programming 101" does exist
  And the worker "PEPE" is the projectleader
	When the worker sets the start date of the project to the 2020-5-12
	And the worker sets the end date of the project to the 2020-6-22
	Then the time settings for the project are set
   
Scenario: Set faulty deadline
	Given that the worker is logged in
  And the project with name "Programming 101" does exist
  And the worker "PEPE" is the projectleader
  When the worker sets the start date of the project to the 2020-6-22
  And the worker sets the end date of the project to the 2020-5-12
  Then the error message "Deadline is invalid" is given
   
Scenario: Set deadline when logged out
	Given that no one is logged in
	And the project with name "Programming 101" does exist
	When the worker sets the end date of the project to the 2020-5-12
	Then the error message "user is not logged in" is given
	
Scenario: Non-project leader sets deadline
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the worker is working on the project
	When the worker sets the end date of the project to the 2020-5-12
	Then the error message "user is not the project leader" is given

Scenario: worker sets deadline when he is not assigned to project
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the worker is not working on the project
	When the worker sets the end date of the project to the 2020-5-12
	Then the error message "user is not the assigned to project" is given