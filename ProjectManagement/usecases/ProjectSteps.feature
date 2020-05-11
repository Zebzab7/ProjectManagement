Feature: Create projects
	Description: Create projects to app
	Actors: Worker
	
Scenario: Add project successfully with no leader
	Given that the worker is logged in
	And the project with name "Programming 101" does not exist
	When worker adds new project named "Programming 101"
	Then the project is contained in the app
	And the project has no projectleader

Scenario: Add project successfully with leader
	Given that the worker is logged in
	And the project with name "Programming 101" does not exist
	When worker adds new project named "Programming 101" with "PEPE" as projectleader
	Then the project is contained in the app
	And the project has a projectleader
	
Scenario: Worker tries to find worker in project that does exist
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project is selected
	And worker with name "PEPX" and password "1234" is contained in the project
	When the worker finds the worker with name "PEPX" in the project succesfully
	Then the worker is found
	
Scenario: Worker tries to find worker in project that does not exist
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project is selected
	When the worker finds the worker with name "PEPX" in the project unsuccesfully
	Then the worker is not found
	
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
	And worker with name "PEPX" and password "1234" is contained in the project
	When the worker removes the project from the app
	Then the project is not contained in the app

Scenario: Remove project from app unsuccessfully
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	When the worker logs out
	And the worker removes the project from the app
	Then the error message "User login required" is given
	
Scenario: Remove project from app when in project
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project is selected
	And the worker removes the project from the app
	Then the error message "User is outside of homepage" is given

Scenario: Remove project from app when in activity
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the activity with name "Loops" is in the project
	And the activity is selected
	And the worker removes the project from the app
	Then the error message "User is outside of homepage" is given
	
Scenario: Worker tries to find project that doesn't exist
	Given that the worker is logged in
	And the project with name "Programming 101" does not exist
	When the worker tries to find project with name "Programming 101" in app
	Then the error message "Project does not exist" is given
	
Scenario: Worker tries to find project whilst logged off
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	When the worker logs out
	And the worker tries to find project with name "Programming 101" in app
	Then the error message "User login required" is given
	
Scenario: Multiple activities in project
	Given that the worker is logged in
	And the project with name "Programming 101" does exist
	And the project is selected
	And the activity with name "Loops" is in the project
	And the activity with name "Loops2" is in the project
	Then there are currently 2 activities in the project
	
Scenario: Get project ID
	Given that the worker is logged in
	And that there are currently 102 projects in the app
	And the project with name "Programming 646" does exist
	And the project is selected
	Then the last two digits of the projects ID is "02"