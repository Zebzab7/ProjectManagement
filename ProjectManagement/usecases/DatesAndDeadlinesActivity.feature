Feature: Dates and deadlines for activities

Scenario: Set start date for activity
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project has an activity named "ProgrammingTasks 101"
	And the project is selected
	And the activity is selected
	When the worker sets the start date of the activity to the 2020-6-22 succesfully
	Then the start time for the activity is 2020-6-22
    
Scenario: Set deadline successfully
	Given that the worker is logged in
    And the project with name "Programming 101" does exist
    And the project has an activity named "ProgrammingTasks 101"
    And the project is selected
    And the activity is selected
	When the worker sets the start date of the activity to the 2020-5-12 succesfully
	And the worker sets the end date of the activity to the 2020-6-22 succesfully
	Then the start time for the activity is 2020-5-12
	And the end time for the activity is 2020-6-22
	
Scenario: Check week number
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project has an activity named "ProgrammingTasks 101"
	And the project is selected
	And the activity is selected
	When the worker sets the start date of the activity to the 2020-6-18 succesfully
	And the worker sets the end date of the activity to the 2020-7-10 succesfully
	Then the start and end week of the given month of the activity are week 3 and week 2
   
Scenario: Set faulty deadline 
	Given that the worker is logged in
  	And the project with name "Programming 101" does exist
  	And the project has an activity named "ProgrammingTasks 101"
  	And the project is selected
  	And the activity is selected
  	When the worker sets the start date of the activity to the 2020-6-22 succesfully
  	And the worker sets the end date of the activity to the 2020-5-12 unsuccesfully
  	Then the error message "Deadline is invalid" is given
   
Scenario: Set deadline when logged out
	Given that no one is logged in
	And the project with name "Programming 101" does exist
	And the project has an activity named "ProgrammingTasks 101"
	And the project is selected
	And the activity is selected
	When the worker sets the end date of the activity to the 2020-5-12 unsuccesfully
	Then the error message "User login required" is given
	
Scenario: Worker sets deadline when he is not assigned to activity
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project has an activity named "ProgrammingTasks 101"
	And the project is selected
	And the activity is selected
	And the worker is not working on the activity
	When the worker sets the end date of the activity to the 2020-5-12 unsuccesfully
	Then the error message "User is not assigned to the activity" is given