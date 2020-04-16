$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:use_cases/LoginLogout.feature");
formatter.feature({
  "name": "LoginLogout",
  "description": "\tDescription: Log a worker in and out\n\tActors: Worker",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "Worker login successfully",
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
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "Worker has wrong password",
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
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "Worker has wrong name",
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
  "name": "Add project with leader that already exists",
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
  "name": "the error message \"Project already exist or user does not exist\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.errorMessageIsProduced(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add project with leader that already exists",
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
  "name": "worker adds new project named \"Programming 101\" with \"PEOE\" as projectleader",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.workerAddsNewProjectNamedWithAsProjectleader(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Project already exist or user does not exist\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.errorMessageIsProduced(java.lang.String)"
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
  "location": "acceptance_tests.WorkerSteps.errorMessageIsProduced(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/TaskSteps.feature");
formatter.feature({
  "name": "Task",
  "description": "\tDescription: Creation of task\n\tActors: Project leader",
  "keyword": "Feature"
});
formatter.background({
  "name": "setup",
  "description": "",
  "keyword": "Background"
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
  "name": "the project with name \"Programming 101\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectWithNameDoesExist(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat acceptance_tests.ProjectSteps.theProjectWithNameDoesExist(ProjectSteps.java:33)\r\n\tat ✽.the project with name \"Programming 101\" does exist(file:///C:/Users/simon/eclipse-workspace/SoftwareHuset/use_cases/TaskSteps.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the worker is working on project \"Programming 101\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.TaskSteps.theWorkerIsWorkingOnProject(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Create task successfully",
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
  "status": "skipped"
});
formatter.step({
  "name": "the worker is the project leader",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.TaskSteps.theWorkerIsTheProjectLeader()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the task with name \"Loops\" is not in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.TaskSteps.theTaskWithNameIsNotInTheProject(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "worker creates new task  with name \"Loops\" and ET \"10\" hours",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.TaskSteps.workerCreatesNewTaskWithNameAndETHours(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the task is contained in the project",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.TaskSteps.theTaskIsContainedInTheProject()"
});
formatter.result({
  "status": "skipped"
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
  "name": "creation of worker named \"PEPE\" with password \"1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.creationOfWorkerNamedWithPassword(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Worker already exist\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.errorMessageIsProduced(java.lang.String)"
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
  "name": "creation of worker named \"PEPE\" with password \"1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.WorkerSteps.creationOfWorkerNamedWithPassword(java.lang.String,java.lang.String)"
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
});