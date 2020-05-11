Feature: test
Background: reset
	Given that the managementApp has been reset
	
Scenario: Worker has certain time contribution to given activity
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project has an activity named "ProgrammingTasks 101"
	And the activity has no work hours
	And the project is selected
	And the activity is selected
	And the worker adds 15 work hours to the activity succesfully
	And another worker adds 10 work hours to the activity successfully
	Then the project has a total of 25 work hours
	And the worker has a total of 15 hours contributed to the activity

#Scenario: Worker has certain time contribution to different projects
#	Given that the worker is logged in
#	And the project with name "Programming 101" does exist
#	And the project has an activity named "ProgrammingTasks 101"
#	And the activity is selected
#	And the project is selected
#	When the worker adds 15 work hours to the activity succesfully

#	And the project with name "Programming 102" does exist
#	And the project has an activity named "ProgrammingTasks 102"
#	And the activity is selected
#	And the project is selected
#	When the worker adds 7 work hours to the activity succesfully
#	Then the worker has a total of 15 work hours contributed to project "Programming 101"
#	And the worker has a total of 7 work hours contributed to project "Programming 102"