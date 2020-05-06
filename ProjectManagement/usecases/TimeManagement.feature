Feature: Add or remove hours
	Description: Worker adds or removes hours to given activity
	Actors: Worker

Scenario: Worker adds hours to an activity while not on the workerlist
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project has an activity named "ProgrammingTasks 101"
	And the worker is working on the activity
	And the worker is working on the project
	And the activity is selected
	And the activity has no work hours
	When the worker adds 10 work hours to the activity succesfully
	Then the activity has a total of 10 work hours
	And the project has a total of 10 work hours

Scenario: Worker adds hours to activity while not on the workerlist
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project has an activity named "ProgrammingTasks 101"
	And the worker is not working on the activity
	And the activity is selected
	And the activity has no work hours
	When the worker adds 10 work hours to the activity unsuccesfully
	Then the project has a total of 0 work hours
	
Scenario: Worker adds hours to activity while not logged in
	Given that no one is logged in
	And the project with name "Programming 101" does exist
	And the project has an activity named "ProgrammingTasks 101"
	And the worker is working on the activity
	And the worker is working on the project
	And the activity has no work hours
	And the activity is selected
	When the worker adds 10 work hours to the activity unsuccesfully
	Then the error message "User login required" is given
	Then the project has a total of 0 work hours

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

Scenario: Worker has certain time contribution to given activity
	Given the worker is logged in
	And the project with name "Programming 101" does exist
	And the project has an activity named "ProgrammingTasks 101"
	And the worker is working on the project
	And the project has no work hours
	And the activity is selected
	When the worker adds 15 work hours to the activity succesfully
	And another worker adds 10 work hours to the activity successfully
	Then the project has a total of 25 work hours
	And the worker has a total of 15 hours contributed to the activity

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