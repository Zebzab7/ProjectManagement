Feature: find the rat

Scenario: Hours are subtracted to a negative number
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project has an activity named "ProgrammingTasks 101"
	And the worker is working on the activity
	And the worker is working on the project
	And the activity has no work hours
	And the activity is selected
	When the worker adds -10 work hours to the activity unsuccesfully
	Then the error message "Invalid input amount" is given
	And the project has a total of 0 work hours
