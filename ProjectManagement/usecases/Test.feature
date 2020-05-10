Feature: fails

Scenario: Set deadline for other project
	Given that the worker is logged in
  	And the project with name "Programming 101" does exist
  	And the project is selected
  	When the worker sets time specifications for another project
  	Then the project does not contain time specifications