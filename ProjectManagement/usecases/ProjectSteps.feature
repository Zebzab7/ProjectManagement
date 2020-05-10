Feature: Create projects
	Description: Create projects to app
	Actors: Worker
	
Scenario: Add project successfully with no leader
	Given that the worker is logged in
	And the project with name "Programming 101" does not exist
	When worker adds new project named "Programming 101"
	Then the project is contained in the app

Scenario: Add project successfully with leader
	Given that the worker is logged in
	And the project with name "Programming 101" does not exist
	When worker adds new project named "Programming 101" with "PEPE" as projectleader
	Then the project is contained in the app
	
Scenario: Add project that already exists with leader
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	When worker adds new project named "Programming 101" with "PEPE" as projectleader
	Then the error message "Project already exist" is given

Scenario: Add project that already exists
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	When worker adds new project named "Programming 101"
	Then the error message "Project already exist" is given

Scenario: Worker not logged in
	Given that no one is logged in
	And the project with name "Programming 101" does not exist
	When worker adds new project named "Programming 101"
	Then the error message "User login required" is given
	
Scenario: Remove project from app
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	When the worker removes the project from the app
	Then the project is not contained in the app
	
Scenario: Worker tries to find project that doesn't exist
	Given that the worker is logged in
	And the project with name "Programming 101" does not exist
	When the worker tries to find project with name "Programming 101" in app
	Then the error message "Project does not exist" is given