$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:use_cases/ActivitySteps.feature");
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
  "location": "acceptance_tests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on a project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theWorkerIsWorkingOnAProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is the project leader",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theWorkerIsTheProjectLeader()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity with name \"Loops\" is not in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityWithNameIsNotInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "worker creates new activity with name \"Loops\" and ET 10 hours",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.workerCreatesNewActivityWithNameAndETHours(java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is contained in the project",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsContainedInTheProject()"
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
  "location": "acceptance_tests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on a project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theWorkerIsWorkingOnAProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is the project leader",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theWorkerIsTheProjectLeader()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity with name \"Loops\" is in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityWithNameIsInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "worker creates new activity with name \"Loops\" and ET 10 hours",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.workerCreatesNewActivityWithNameAndETHours(java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"The Task already exist in the project\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
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
  "location": "acceptance_tests.LoginLogoutSteps.thatNoOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity with name \"Loops\" is not in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityWithNameIsNotInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "worker creates new activity with name \"Loops\" and ET 10 hours",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.workerCreatesNewActivityWithNameAndETHours(java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User login required\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/LoginLogout.feature");
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
  "location": "acceptance_tests.LoginLogoutSteps.thatNoOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that worker \"PEPE\" with password \"1234\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.thatWorkerWithPasswordDoesNotExist(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the name is \"PEPE\" and password is \"1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.LoginLogoutSteps.theNameIsAndPasswordIs(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker login fails",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.LoginLogoutSteps.theWorkerLoginFails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Worker does not exist\" is given",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
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
  "location": "acceptance_tests.WorkerSteps.thatWorkerWithPasswordExist(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that no one is logged in",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.LoginLogoutSteps.thatNoOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the name is \"PEPX\" and password is \"1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.LoginLogoutSteps.theNameIsAndPasswordIs(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker login succeeds",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.LoginLogoutSteps.theWorkerLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is logged in",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.LoginLogoutSteps.theWorkerIsLoggedIn()"
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
  "location": "acceptance_tests.WorkerSteps.thatWorkerWithPasswordExist(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that no one is logged in",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.LoginLogoutSteps.thatNoOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the name is \"PEPE\" and password is \"1254\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.LoginLogoutSteps.theNameIsAndPasswordIs(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker login fails",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.LoginLogoutSteps.theWorkerLoginFails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is not logged in",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.LoginLogoutSteps.theWorkerIsNotLoggedIn()"
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
  "location": "acceptance_tests.WorkerSteps.thatWorkerWithPasswordExist(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that no one is logged in",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.LoginLogoutSteps.thatNoOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the name is \"PEOE\" and password is \"1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.LoginLogoutSteps.theNameIsAndPasswordIs(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker login fails",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.LoginLogoutSteps.theWorkerLoginFails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is not logged in",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.LoginLogoutSteps.theWorkerIsNotLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/ProjectSteps.feature");
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
  "location": "acceptance_tests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectWithNameDoesNotExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "worker adds new project named \"Programming 101\"",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.workerAddsNewProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is contained in the app",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsContainedInTheApp()"
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
  "location": "acceptance_tests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectWithNameDoesNotExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "worker adds new project named \"Programming 101\" with \"PEPE\" as projectleader",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.workerAddsNewProjectNamedWithAsProjectleader(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is contained in the app",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsContainedInTheApp()"
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
  "location": "acceptance_tests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "worker adds new project named \"Programming 101\" with \"PEPE\" as projectleader",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.workerAddsNewProjectNamedWithAsProjectleader(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Project already exist\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
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
  "location": "acceptance_tests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "worker adds new project named \"Programming 101\"",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.workerAddsNewProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Project already exist\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
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
  "location": "acceptance_tests.LoginLogoutSteps.thatNoOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectWithNameDoesNotExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "worker adds new project named \"Programming 101\"",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.workerAddsNewProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User login required\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/WorkerSteps.feature");
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
  "location": "acceptance_tests.LoginLogoutSteps.thatNoOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that worker \"PEPE\" with password \"1234\" exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.thatWorkerWithPasswordExist(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker named \"PEPE\" with password \"1234\" is created",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.theWorkerNamedWithPasswordIsCreated(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User already exist\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
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
  "location": "acceptance_tests.LoginLogoutSteps.thatNoOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that worker \"PEPE\" with password \"1234\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.thatWorkerWithPasswordDoesNotExist(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker named \"PEPE\" with password \"1234\" is created",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.theWorkerNamedWithPasswordIsCreated(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is contained in app",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.theWorkerIsContainedInApp()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/time_management.feature");
formatter.feature({
  "name": "Add or remove hours",
  "description": "\tDescription: Worker adds or removes hours to given activity\n\tActors: Worker",
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
  "location": "acceptance_tests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is the projectleader",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerIsTheProjectleader()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the start date of the project to the 2020-6-22",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerSetsTheStartDateOfTheProjectToThe(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the start time is set for the project",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.startTimeIsSet()"
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
  "location": "acceptance_tests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is the projectleader",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerIsTheProjectleader()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the start date of the project to the 2020-5-12",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerSetsTheStartDateOfTheProjectToThe(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the end date of the project to the 2020-6-22",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerSetsTheEndDateOfTheProjectTo(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the time settings for the project are set",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theTimeIsSet()"
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
  "location": "acceptance_tests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is the projectleader",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerIsTheProjectleader()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the start date of the project to the 2020-6-18",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerSetsTheStartDateOfTheProjectToThe(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the end date of the project to the 2020-7-10",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerSetsTheEndDateOfTheProjectTo(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the start and end week of the given month of the project are week 3 and week 2",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.weekRepresentation(int,int)"
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
  "location": "acceptance_tests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is the projectleader",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerIsTheProjectleader()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the start date of the project to the 2020-6-22",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerSetsTheStartDateOfTheProjectToThe(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the end date of the project to the 2020-5-12",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerSetsTheEndDateOfTheProjectTo(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Deadline is invalid\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
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
  "location": "acceptance_tests.LoginLogoutSteps.thatNoOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is the projectleader",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerIsTheProjectleader()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the end date of the project to the 2020-5-12",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerSetsTheEndDateOfTheProjectTo(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User login required\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
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
  "location": "acceptance_tests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerIsWorkingOnTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the end date of the project to the 2020-5-12",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerSetsTheEndDateOfTheProjectTo(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User is not the project leader\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
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
  "location": "acceptance_tests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is not working on the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerIsNotWorkingOnTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the end date of the project to the 2020-5-12",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerSetsTheEndDateOfTheProjectTo(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User is not assigned to the project\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker adds hours while not working on project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that worker with the name \"PEPE\" and password \"1234\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.LoginLogoutSteps.thatWorkerWithTheNameAndPasswordIsLoggedIn(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is not working on the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerIsNotWorkingOnTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project has no work hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectHasNoWorkHours()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker adds 10 work hours unsuccesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerAddsWorkHoursUnSuccesfully(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project has a total of 0 work hours",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectHasATotalOfWorkHours(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Hours are added when no one is logged in",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that no one is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.LoginLogoutSteps.thatNoOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project has no work hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectHasNoWorkHours()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker adds 10 work hours unsuccesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerAddsWorkHoursUnSuccesfully(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User login required\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker adds hours to his accumulated time spent",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that worker with the name \"PEPE\" and password \"1234\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.LoginLogoutSteps.thatWorkerWithTheNameAndPasswordIsLoggedIn(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerIsWorkingOnTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project has no work hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectHasNoWorkHours()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker adds 15 work hours succesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerAddsWorkHoursSuccesfully(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "another worker adds 10 work hours successfully",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.anotherWorkerAddsWorkHoursSuccessfully(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker has a total of 15 individual work hours",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerHasATotalOfIndividualWorkHours(int)"
});
formatter.result({
  "status": "passed"
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
  "location": "acceptance_tests.LoginLogoutSteps.thatWorkerWithTheNameAndPasswordIsLoggedIn(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerIsWorkingOnTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker adds 15 work hours succesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerAddsWorkHoursSuccesfully(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "worker adds new project named \"Programming 102\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.workerAddsNewProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is added to the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.the_worker_is_added_to_the_project()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker adds 7 work hours succesfully",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerAddsWorkHoursSuccesfully(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers AH-list will hold 15 hours for \"Programming 101\" and 7 hours for \"Programming 102\"",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.AccumulatedHoursListCheck(java.lang.Integer,java.lang.String,java.lang.Integer,java.lang.String)"
});
formatter.result({
  "status": "passed"
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
  "location": "acceptance_tests.LoginLogoutSteps.thatWorkerWithTheNameAndPasswordIsLoggedIn(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerIsWorkingOnTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 102\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is working on the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theWorkerIsWorkingOnTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers AssignedProjects list will hold \"Programming 101\" and \"Programming 102\"",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.the_workers_AssignedProjects_list_will_hold_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});