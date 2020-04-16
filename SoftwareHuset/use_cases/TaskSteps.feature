Feature: Task
	Description: Creation of task
	Actors: Project leader
	
Background: setup
	Given that worker "PEPE" with password "1234" exist
	And the project with name "Programming 101" does exist
	And the worker is working on project "Programming 101"

#Scenario: Create task successfully
# 	Given that the worker is logged in
# 	And the worker is the project leader
# 	And the task with name "Loops" is not in the project
# 	When worker creates new task  with name "Loops" and ET "10" hours
# 	Then the task is contained in the project