Feature: Dates and deadlines

Scenario: Set start date for project
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project is selected
	And the worker is the projectleader
	When the worker sets the start date of the project to the 2020-6-22 succesfully
	Then the start time for the project is 2020-6-22
    
Scenario: Set deadline successfully
	Given that the worker is logged in
    And the project with name "Programming 101" does exist
    And the project is selected
    And the worker is the projectleader
	When the worker sets the start date of the project to the 2020-5-12 succesfully
	And the worker sets the end date of the project to the 2020-6-22 succesfully
	Then the start time for the project is 2020-5-12
	And the end time for the project is 2020-6-22
	And the deadline is not overdue
	
Scenario: Check week number
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project is selected
	And the worker is the projectleader
	When the worker sets the start date of the project to the 2020-6-18 succesfully
	And the worker sets the end date of the project to the 2020-7-10 succesfully
	Then the start and end week of the given month of the project are week 3 and week 2
   
Scenario: Set faulty deadline
	Given that the worker is logged in
  	And the project with name "Programming 101" does exist
  	And the project is selected
  	And the worker is the projectleader
  	When the worker sets the start date of the project to the 2020-6-22 succesfully
  	And the worker sets the end date of the project to the 2020-5-12 unsuccesfully
  	Then the error message "Deadline is invalid" is given

Scenario: Set faulty start time
	Given that the worker is logged in
  	And the project with name "Programming 101" does exist
  	And the project is selected
  	And the worker is the projectleader
  	When the worker sets the end date of the project to the 2020-6-12 succesfully
  	And the worker sets the start date of the project to the 2020-6-22 unsuccesfully
  	Then the error message "Deadline is invalid" is given
   
Scenario: Set deadline when logged out
	Given that no one is logged in
	And the project with name "Programming 101" does exist
	And the project is selected
	And the worker is the projectleader
	When the worker sets the end date of the project to the 2020-5-12 unsuccesfully
	Then the error message "User login required" is given
	
Scenario: Non-project leader sets deadline
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project is selected
	And the worker is working on the project
	When the worker sets the end date of the project to the 2020-5-12 unsuccesfully
	Then the error message "User is not the project leader" is given
	And the project does not contain time specifications

Scenario: worker sets deadline when he is not assigned to project
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project is selected
	And the worker is not working on the project
	When the worker sets the end date of the project to the 2020-5-12 unsuccesfully
	Then the error message "User is not assigned to the project" is given

Scenario: Deadline is overdue
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project is selected
	And the worker is the projectleader
	When the worker sets the start date of the project to the 2020-4-22 succesfully
  And the worker sets the end date of the project to the 2020-5-8 succesfully
  Then the deadline is overdue

Scenario: Deadline not set
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project is selected
	When the deadline is checked
  Then the error message "Deadline must be instantiated" is given

Scenario: Project contains time specifications
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project is selected
	And the worker is the projectleader
	When the worker sets the start date of the project to the 2020-6-16 succesfully
  And the worker sets the end date of the project to the 2020-8-24 succesfully
  Then the project contains time specifications