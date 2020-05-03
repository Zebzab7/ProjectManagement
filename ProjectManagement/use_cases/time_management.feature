Feature: Add or remove hours
	Description: Worker adds or removes hours to given activity
	Actors: Worker
	
Scenario: Set start date for project
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the worker is the projectleader
	When the worker sets the start date of the project to the 2020-6-22
	Then the start time is set for the project
    
Scenario: Set deadline successfully
	Given that the worker is logged in
    And the project with name "Programming 101" does exist
    And the worker is the projectleader
	When the worker sets the start date of the project to the 2020-5-12
	And the worker sets the end date of the project to the 2020-6-22
	Then the time settings for the project are set
	
Scenario: Check week number
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the worker is the projectleader
	When the worker sets the start date of the project to the 2020-6-18
	And the worker sets the end date of the project to the 2020-7-10
	Then the start and end week of the given month of the project are week 3 and week 2
   
Scenario: Set faulty deadline
	Given that the worker is logged in
  	And the project with name "Programming 101" does exist
  	And the worker is the projectleader
  	When the worker sets the start date of the project to the 2020-6-22
  	And the worker sets the end date of the project to the 2020-5-12
  	Then the error message "Deadline is invalid" is given
   
Scenario: Set deadline when logged out
	Given that no one is logged in
	And the project with name "Programming 101" does exist
	And the worker is the projectleader
	When the worker sets the end date of the project to the 2020-5-12
	Then the error message "User login required" is given
	
Scenario: Non-project leader sets deadline
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the worker is working on the project
	When the worker sets the end date of the project to the 2020-5-12
	Then the error message "User is not the project leader" is given

Scenario: worker sets deadline when he is not assigned to project
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the worker is not working on the project
	When the worker sets the end date of the project to the 2020-5-12
	Then the error message "User is not assigned to the project" is given

Scenario: Worker adds hours while working on project
	Given that the worker is logged in
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
	And the project has no work hours
	When the worker adds 10 work hours unsuccesfully
	Then the error message "User login required" is given

#Scenario: Hours are subtracted to a negative number
	#Given that worker with the name "PEPE" and password "1234" is logged in
	#And the project with name "Programming 101" does exist
	#And the worker is working on the project
	#And the project has no work hours
	#When the worker adds -10 work hours succesfully
	#Then the project has a total of 0 work hours

Scenario: Worker adds hours to his accumulated time spent
	Given that worker with the name "PEPE" and password "1234" is logged in
	And the project with name "Programming 101" does exist
	And the worker is working on the project
	And the project has no work hours
	When the worker adds 15 work hours succesfully
	And another worker adds 10 work hours successfully
	Then the worker has a total of 15 individual work hours

Scenario: Check workers accumulated hours list
	Given that worker with the name "PEPE" and password "1234" is logged in
	And the project with name "Programming 101" does exist
	And the worker is working on the project
	When the worker adds 15 work hours succesfully
	And worker adds new project named "Programming 102"
	And the worker is added to the project
	And the worker adds 7 work hours succesfully
	Then the workers AH-list will hold 15 hours for "Programming 101" and 7 hours for "Programming 102"

Scenario: Number of assigned projects
	Given that worker with the name "PEPE" and password "1234" is logged in
	And the project with name "Programming 101" does exist
	And the worker is working on the project
	And the project with name "Programming 102" does exist
	And the worker is working on the project
	Then the workers AssignedProjects list will hold "Programming 101" and "Programming 102"