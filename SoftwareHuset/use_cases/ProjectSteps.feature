Feature: Create projects
	Description: Create projects to app
	Actors: Worker

Background:
	Given that worker "PEPE" with password "1234" exist
	
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
	
Scenario: Add project with leader that already exists
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	When worker adds new project named "Programming 101" with "PEPE" as projectleader
	Then the error message "Project already exist or user does not exist" is given

Scenario: Add project with leader that already exists
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	When worker adds new project named "Programming 101" with "PEOE" as projectleader
	Then the error message "Project already exist or user does not exist" is given	

Scenario: Add project that already exists
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	When worker adds new project named "Programming 101"
	Then the error message "Project already exist" is given