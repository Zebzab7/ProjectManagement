Feature: Task
	Description: Creation of task
	Actors: Project leader
Scenario: Create task successfully
	Given that the worker is logged in
	And the worker is working on a project
 	And the worker is the project leader
 	And the task with name "Loops" is not in the project
 	When worker creates new task  with name "Loops" and ET "10" hours
 	Then the task is contained in the project

Scenario: Task name exist
	Given that the worker is logged in
	And the worker is working on a project
 	And the worker is the project leader
 	And the task with name "Loops" is in the project
 	When worker creates new task  with name "Loops" and ET "10" hours
 	Then the error message "The Task already exist in the project" is given
 	
Scenario: Worker not logged in
	Given that no one is logged in
	And the project with name "Programming 101" does exist
 	And the task with name "Loops" is not in the project
 	When worker creates new task  with name "Loops" and ET "10" hours
 	Then the error message "You have to be logged in" is given