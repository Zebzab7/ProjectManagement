$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:usecases/ActivitySteps.feature");
formatter.feature({
  "name": "Activity",
  "description": "\tDescription: Creation of task\n\tActors: Project leader",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create activity successfully",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the worker is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on a project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerIsWorkingOnAProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is the project leader",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerIsTheProjectLeader()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity with name \"Loops\" is not in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theActivityWithNameIsNotInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "worker creates new activity with name \"Loops\" and ET 10 hours",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.workerCreatesNewActivityWithNameAndETHours(java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "worker adds the activity to the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.workerAddsTheActivityToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is contained in the project",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theActivityIsContainedInTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Activity name exist",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the worker is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on a project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerIsWorkingOnAProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is the project leader",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerIsTheProjectLeader()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity with name \"Loops\" is in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theActivityWithNameIsInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "worker creates new activity with name \"Loops\" and ET 10 hours",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.workerCreatesNewActivityWithNameAndETHours(java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "worker adds the activity to the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.workerAddsTheActivityToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"The activity already exists in the project\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker not logged in",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that no one is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatNoOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity with name \"Loops\" is not in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theActivityWithNameIsNotInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "worker creates new activity with name \"Loops\" and ET 10 hours",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.workerCreatesNewActivityWithNameAndETHours(java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "worker adds the activity to the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.workerAddsTheActivityToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User login required\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:usecases/DatesAndDeadlines.feature");
formatter.feature({
  "name": "Dates and deadlines",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Set start date for project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the worker is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is selected",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectIsSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is the projectleader",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerIsTheProjectleader()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the start date of the project to the 2020-6-22 succesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerSetsTheStartDateOfTheProjectToThe(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the start time for the project is 2020-6-22",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theStartTimeForTheProjectIs(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Set deadline successfully",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the worker is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is selected",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectIsSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is the projectleader",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerIsTheProjectleader()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the start date of the project to the 2020-5-12 succesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerSetsTheStartDateOfTheProjectToThe(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the end date of the project to the 2020-6-22 succesfully",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerSetsTheEndDateOfTheProjectToTheSuccesfully(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the start time for the project is 2020-5-12",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theStartTimeForTheProjectIs(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the end time for the project is 2020-6-22",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theEndTimeForTheProjectIs(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check week number",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the worker is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is selected",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectIsSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is the projectleader",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerIsTheProjectleader()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the start date of the project to the 2020-6-18 succesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerSetsTheStartDateOfTheProjectToThe(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the end date of the project to the 2020-7-10 succesfully",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerSetsTheEndDateOfTheProjectToTheSuccesfully(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the start and end week of the given month of the project are week 3 and week 2",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.weekRepresentation(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Set faulty deadline",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the worker is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is selected",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectIsSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is the projectleader",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerIsTheProjectleader()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the start date of the project to the 2020-6-22 succesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerSetsTheStartDateOfTheProjectToThe(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the end date of the project to the 2020-5-12 unsuccesfully",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerSetsTheEndDateOfTheProjectToTheUnsuccesfully(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Deadline is invalid\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Set deadline when logged out",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that no one is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatNoOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is selected",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectIsSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is the projectleader",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerIsTheProjectleader()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the end date of the project to the 2020-5-12 unsuccesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerSetsTheEndDateOfTheProjectToTheUnsuccesfully(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User login required\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Non-project leader sets deadline",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the worker is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is selected",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectIsSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerIsWorkingOnTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the end date of the project to the 2020-5-12 unsuccesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerSetsTheEndDateOfTheProjectToTheUnsuccesfully(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User is not the project leader\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "worker sets deadline when he is not assigned to project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the worker is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is selected",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectIsSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is not working on the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerIsNotWorkingOnTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the end date of the project to the 2020-5-12 unsuccesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerSetsTheEndDateOfTheProjectToTheUnsuccesfully(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User is not assigned to the project\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:usecases/LoginLogout.feature");
formatter.feature({
  "name": "LoginLogout",
  "description": "\tDescription: Log a worker in and out\n\tActors: Worker",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Worker does not exist and tries to log in",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that no one is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatNoOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that worker \"PEPE\" with password \"1234\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.thatWorkerWithPasswordDoesNotExist(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the name is \"PEPE\" and password is \"1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.theNameIsAndPasswordIs(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker login fails",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.theWorkerLoginFails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Worker does not exist\" is given",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker logs in successfully",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that worker \"PEPX\" with password \"1234\" exist",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.thatWorkerWithPasswordExist(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that no one is logged in",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatNoOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the name is \"PEPX\" and password is \"1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.theNameIsAndPasswordIs(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker login succeeds",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.theWorkerLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is logged in",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.theWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker logs in with wrong password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that worker \"PEPE\" with password \"1234\" exist",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.thatWorkerWithPasswordExist(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that no one is logged in",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatNoOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the name is \"PEPE\" and password is \"1254\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.theNameIsAndPasswordIs(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker login fails",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.theWorkerLoginFails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is not logged in",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.theWorkerIsNotLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker logs in with wrong name",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that worker \"PEPE\" with password \"1234\" exist",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.thatWorkerWithPasswordExist(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that no one is logged in",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatNoOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the name is \"PEOE\" and password is \"1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.theNameIsAndPasswordIs(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker login fails",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.theWorkerLoginFails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is not logged in",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.theWorkerIsNotLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:usecases/ProjectSteps.feature");
formatter.feature({
  "name": "Create projects",
  "description": "\tDescription: Create projects to app\n\tActors: Worker",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add project successfully with no leader",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the worker is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesNotExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "worker adds new project named \"Programming 101\"",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.workerAddsNewProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is contained in the app",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectIsContainedInTheApp()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add project successfully with leader",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the worker is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesNotExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "worker adds new project named \"Programming 101\" with \"PEPE\" as projectleader",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.workerAddsNewProjectNamedWithAsProjectleader(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is contained in the app",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectIsContainedInTheApp()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add project that already exists with leader",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the worker is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "worker adds new project named \"Programming 101\" with \"PEPE\" as projectleader",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.workerAddsNewProjectNamedWithAsProjectleader(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Project already exist\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add project that already exists",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the worker is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "worker adds new project named \"Programming 101\"",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.workerAddsNewProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Project already exist\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker not logged in",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that no one is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatNoOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesNotExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "worker adds new project named \"Programming 101\"",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.workerAddsNewProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User login required\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:usecases/Rat.feature");
formatter.feature({
  "name": "find the rat",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Hours are subtracted to a negative number",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the worker is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project has an activity named \"ProgrammingTasks 101\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theProjectHasAnActivityNamed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on the activity",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerIsWorkingOnTheActivity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerIsWorkingOnTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity has no work hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theActivityHasNoWorkHours()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is selected",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theActivityIsSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker adds -10 work hours to the activity unsuccesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerAddsWorkHoursToTheActivityUnsuccesfully(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Invalid input amount\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project has a total of 0 work hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectHasATotalOfWorkHours(int)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:usecases/TimeManagement.feature");
formatter.feature({
  "name": "Add or remove hours",
  "description": "\tDescription: Worker adds or removes hours to given activity\n\tActors: Worker",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Worker adds hours to an activity while not on the workerlist",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the worker is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project has an activity named \"ProgrammingTasks 101\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theProjectHasAnActivityNamed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on the activity",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerIsWorkingOnTheActivity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerIsWorkingOnTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is selected",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theActivityIsSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity has no work hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theActivityHasNoWorkHours()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker adds 10 work hours to the activity succesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerAddsWorkHoursToTheActivitySuccesfully(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity has a total of 10 work hours",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theActivityHasATotalOfWorkHours(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project has a total of 10 work hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectHasATotalOfWorkHours(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker adds hours to activity while not on the workerlist",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the worker is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project has an activity named \"ProgrammingTasks 101\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theProjectHasAnActivityNamed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is not working on the activity",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerIsNotWorkingOnTheActivity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is selected",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theActivityIsSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity has no work hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theActivityHasNoWorkHours()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker adds 10 work hours to the activity unsuccesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerAddsWorkHoursToTheActivityUnsuccesfully(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project has a total of 0 work hours",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectHasATotalOfWorkHours(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker adds hours to activity while not logged in",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that no one is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatNoOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project has an activity named \"ProgrammingTasks 101\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theProjectHasAnActivityNamed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on the activity",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerIsWorkingOnTheActivity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerIsWorkingOnTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity has no work hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theActivityHasNoWorkHours()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is selected",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theActivityIsSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker adds 10 work hours to the activity unsuccesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerAddsWorkHoursToTheActivityUnsuccesfully(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User login required\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project has a total of 0 work hours",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectHasATotalOfWorkHours(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Hours are subtracted to a negative number",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the worker is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project has an activity named \"ProgrammingTasks 101\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theProjectHasAnActivityNamed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on the activity",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerIsWorkingOnTheActivity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerIsWorkingOnTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity has no work hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theActivityHasNoWorkHours()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is selected",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theActivityIsSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker adds -10 work hours to the activity unsuccesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerAddsWorkHoursToTheActivityUnsuccesfully(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Invalid input amount\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project has a total of 0 work hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectHasATotalOfWorkHours(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker has certain time contribution to given activity",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the worker is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.theWorkerIsLoggedIn()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat acceptancetests.LoginLogoutSteps.theWorkerIsLoggedIn(LoginLogoutSteps.java:86)\r\n\tat ✽.the worker is logged in(file:///D:/Eclipse/eclipse-workspace/ProjectManagement1/usecases/TimeManagement.feature:52)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the project has an activity named \"ProgrammingTasks 101\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theProjectHasAnActivityNamed(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the worker is working on the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerIsWorkingOnTheProject()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the project has no work hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectHasNoWorkHours()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the activity is selected",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theActivityIsSelected()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the worker adds 15 work hours to the activity succesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerAddsWorkHoursToTheActivitySuccesfully(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "another worker adds 10 work hours to the activity successfully",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.anotherWorkerAddsWorkHoursToTheActivitySuccessfully(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the project has a total of 25 work hours",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectHasATotalOfWorkHours(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the worker has a total of 15 hours contributed to the activity",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerHasATotalOfHoursContributedToTheActivity(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Check workers accumulated hours list",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that worker with the name \"PEPE\" and password \"1234\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatWorkerWithTheNameAndPasswordIsLoggedIn(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerIsWorkingOnTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker adds 15 work hours succesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerAddsWorkHoursSuccesfully(int)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat acceptancetests.ProjectSteps.theWorkerAddsWorkHoursSuccesfully(ProjectSteps.java:104)\r\n\tat ✽.the worker adds 15 work hours succesfully(file:///D:/Eclipse/eclipse-workspace/ProjectManagement1/usecases/TimeManagement.feature:67)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "worker adds new project named \"Programming 102\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.workerAddsNewProject(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the worker is added to the project",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the worker adds 7 work hours succesfully",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerAddsWorkHoursSuccesfully(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the workers AH-list will hold 15 hours for \"Programming 101\" and 7 hours for \"Programming 102\"",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.AccumulatedHoursListCheck(java.lang.Integer,java.lang.String,java.lang.Integer,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Number of assigned projects",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that worker with the name \"PEPE\" and password \"1234\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatWorkerWithTheNameAndPasswordIsLoggedIn(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerIsWorkingOnTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 102\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerIsWorkingOnTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers AssignedProjects list will hold \"Programming 101\" and \"Programming 102\"",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.the_workers_AssignedProjects_list_will_hold_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:usecases/WorkerSteps.feature");
formatter.feature({
  "name": "Create workers",
  "description": "\tDescription: Create workers to app\n\tActors: Worker",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Worker already exist",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that no one is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatNoOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that worker \"PEPE\" with password \"1234\" exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.thatWorkerWithPasswordExist(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker named \"PEPE\" with password \"1234\" is created",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.theWorkerNamedWithPasswordIsCreated(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User already exist\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker is added to app successfully",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that no one is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatNoOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that worker \"PEPE\" with password \"1234\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.thatWorkerWithPasswordDoesNotExist(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker named \"PEPE\" with password \"1234\" is created",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.theWorkerNamedWithPasswordIsCreated(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is contained in app",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.theWorkerIsContainedInApp()"
});
formatter.result({
  "status": "passed"
});
});