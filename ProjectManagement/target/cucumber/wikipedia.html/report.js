$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:usecases/AbsentScenarios.feature");
formatter.feature({
  "name": "Fixed activities",
  "description": "\tDescription: App setup for absent worker\n\tActors: Worker",
  "keyword": "Feature"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create fixed activity",
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
  "name": "that the worker is logged in",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.thatTheWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the fixed activity for \"PEPE\" called \"SICK\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.fixedActivityDoesNotExist(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker creates a fixed activity called \"SICK\"",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.createFixedActivity(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the fixed activity for the worker is contained in the app",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.FixedActivityIsContained()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add absent worker to activity",
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
  "name": "the worker creates a fixed activity called \"SICK\"",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.createFixedActivity(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers return date is on the 2020-5-12",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.setReturnDate(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is added to the activity",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.addWorkerToActivity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Worker is absent\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker is absent",
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
  "name": "the worker creates a fixed activity called \"SICK\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.createFixedActivity(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers return date is on the 2020-6-22",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.setReturnDate(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is absent",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.workerIsAbsent()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker goes on holiday",
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
  "name": "the worker creates a fixed activity called \"HOLIDAY\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.createFixedActivity(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers leave date is on the 2020-7-5",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.setLeaveDate(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers return date is on the 2020-7-22",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.setReturnDate(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is not absent",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.workerNotAbsent()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker has returned",
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
  "name": "that the fixed activity with the worker called \"HOLIDAY\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.fixedActivityExists(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers return date is on the 2020-4-24",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.setReturnDate(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker has returned",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.workerHasReturned()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker has multiple fixed activities and is absent",
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
  "name": "that the fixed activity with the worker called \"HOLIDAY\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.fixedActivityExists(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker creates a fixed activity called \"SICK\"",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.createFixedActivity(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers return date is on the 2020-5-12",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.setReturnDate(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker has 2 fixed activities",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.theWorkerHasFixedActivities(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is absent",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.workerIsAbsent()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker has multiple fixed activities and is not absent",
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
  "name": "that the fixed activity with the worker called \"SUMMER HOLIDAY\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.fixedActivityExists(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers leave date is on the 2020-7-5",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.setLeaveDate(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers return date is on the 2020-8-3",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.setReturnDate(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker creates a fixed activity called \"CHRISTMAS HOLIDAY\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.createFixedActivity(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers leave date is on the 2020-12-12",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.setLeaveDate(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers return date is on the 2020-12-28",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.setReturnDate(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker has 2 fixed activities",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.theWorkerHasFixedActivities(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is not absent",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.workerNotAbsent()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker has fixed activity and is in the timeframe",
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
  "name": "that the fixed activity with the worker called \"SUMMER HOLIDAY\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.fixedActivityExists(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers leave date is on the 2020-5-5",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.setLeaveDate(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers return date is on the 2020-6-15",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.setReturnDate(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker creates a fixed activity called \"CHRISTMAS HOLIDAY\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.createFixedActivity(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers leave date is on the 2020-12-12",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.setLeaveDate(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers return date is on the 2020-12-28",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.setReturnDate(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker has 2 fixed activities",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.theWorkerHasFixedActivities(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is absent",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.workerIsAbsent()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Leave and return date set",
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
  "name": "that the fixed activity with the worker called \"SUMMER HOLIDAY\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.fixedActivityExists(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers leave date is on the 2020-5-5",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.setLeaveDate(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers return date is on the 2020-6-15",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.setReturnDate(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers leave date is set",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.leaveDateSet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the workers return date is set",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.returnDateSet()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Fixed activity not created",
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
  "name": "that the fixed activity with the worker called \"HOLIDAY\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.fixedActivityDoesNotExist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker tries to find his fixed activity called \"HOLIDAY\"",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.findFixedActivity(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Fixed activity does not exist\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User tries to find fixed activity when not logged in",
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
  "name": "the worker tries to find his fixed activity called \"HOLIDAY\"",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.findFixedActivity(java.lang.String)"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User tries to add already existing fixed activity",
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
  "name": "that the fixed activity with the worker called \"SUMMER HOLIDAY\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.fixedActivityExists(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker creates a fixed activity called \"SUMMER HOLIDAY\"",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.createFixedActivity(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Fixed activity already exists\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User tries to add fixed activity whilst logged out",
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
  "name": "the worker creates a fixed activity called \"SUMMER HOLIDAY\"",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.createFixedActivity(java.lang.String)"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User removes fixed activity whilst logged out",
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
  "name": "that the fixed activity with the worker called \"SUMMER HOLIDAY\" does exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.fixedActivityExists(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker logs out",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.theWorkerLogsOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker tries to remove the fixed activity",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.FixedActivitySteps.removeFixedActivity()"
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
formatter.uri("file:usecases/ActivitySteps.feature");
formatter.feature({
  "name": "Activity",
  "description": "\tDescription: Creation of task\n\tActors: Project leader",
  "keyword": "Feature"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
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
formatter.step({
  "name": "the worker can find the activity",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.findActivity()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "cannot find activity",
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
  "name": "the worker can not find the activity",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.cantFindActivity()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Remove activity whilst offline",
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
  "name": "the worker logs out",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.theWorkerLogsOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker removes the activity",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.workerRemovesActivity()"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Remove activity",
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
  "name": "the worker removes the activity",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.workerRemovesActivity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is not contained in the project",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.activityNotContained()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Remove activity unsuccesfully",
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
  "name": "the worker removes the activity",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.workerRemovesActivity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"The activity is not contained in the project\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Remove activity whilst in activity",
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
  "name": "the worker removes the activity",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.workerRemovesActivity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User is in an activity\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker asks for assistance successfully",
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
  "name": "that worker \"RONA\" with password \"HELP\" exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.thatWorkerWithPasswordExist(java.lang.String,java.lang.String)"
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
  "name": "the worker is eligable for help",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.theWorkerIsEligableForHelp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker calls for assistance",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.theWorkerCallsForAssistance()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"RONA\" is added to the activity",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.addedWorker(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker asks for assistance unsuccessfully due to acitivty not being selected",
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
  "name": "that worker \"RONA\" with password \"HELP\" exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.thatWorkerWithPasswordExist(java.lang.String,java.lang.String)"
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
  "name": "the worker is not eligable for help",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.theWorkerIsNotEligableForHelp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker calls for assistance",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.theWorkerCallsForAssistance()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"RONA\" is not added to the activity",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.notAddedWorker(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker asks for assistance unsuccessfully due to worker not being eligable for help",
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
  "name": "the project has an activity named \"Loops\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theProjectHasAnActivityNamed(java.lang.String)"
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
  "name": "that worker \"RONA\" with password \"HELP\" exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.thatWorkerWithPasswordExist(java.lang.String,java.lang.String)"
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
  "name": "the worker is not eligable for help",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.theWorkerIsNotEligableForHelp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker calls for assistance",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.theWorkerCallsForAssistance()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker \"RONA\" is not added to the activity",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.notAddedWorker(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker asks for assistance unsuccessfully when no one is logged in",
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
  "name": "that worker \"RONA\" with password \"HELP\" exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.thatWorkerWithPasswordExist(java.lang.String,java.lang.String)"
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
  "name": "the worker is not eligable for help",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.theWorkerIsNotEligableForHelp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker calls for assistance",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.theWorkerCallsForAssistance()"
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
formatter.uri("file:usecases/DatesAndDeadlinesActivity.feature");
formatter.feature({
  "name": "Dates and deadlines for activities",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Set start date for activity",
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
  "name": "the worker sets the start date of the activity to the 2020-6-22 succesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerSetsTheStartDateOfTheActivityToTheSuccesfully(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the start time for the activity is 2020-6-22",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theStartTimeForTheActivityIs(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
  "name": "the worker sets the start date of the activity to the 2020-5-12 succesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerSetsTheStartDateOfTheActivityToTheSuccesfully(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the end date of the activity to the 2020-6-22 succesfully",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerSetsTheEndDateOfTheActivityToTheSuccesfully(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the start time for the activity is 2020-5-12",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theStartTimeForTheActivityIs(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the end time for the activity is 2020-6-22",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theEndTimeForTheActivityIs(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
  "name": "the worker sets the start date of the activity to the 2020-6-18 succesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerSetsTheStartDateOfTheActivityToTheSuccesfully(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the end date of the activity to the 2020-7-10 succesfully",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerSetsTheEndDateOfTheActivityToTheSuccesfully(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the start and end week of the given month of the activity are week 3 and week 2",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theStartAndEndWeekOfTheGivenMonthOfTheActivityAreWeekAndWeek(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
  "name": "the worker sets the start date of the activity to the 2020-6-22 succesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerSetsTheStartDateOfTheActivityToTheSuccesfully(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the end date of the activity to the 2020-5-12 unsuccesfully",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerSetsTheEndDateOfTheActivityToTheUnsuccesfully(int,int,int)"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
  "name": "the worker sets the end date of the activity to the 2020-5-12 unsuccesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerSetsTheEndDateOfTheActivityToTheUnsuccesfully(int,int,int)"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker sets deadline when he is not assigned to activity",
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
  "name": "the worker sets the end date of the activity to the 2020-5-12 unsuccesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerSetsTheEndDateOfTheActivityToTheUnsuccesfully(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User is not assigned to the activity\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:usecases/DatesAndDeadlinesProject.feature");
formatter.feature({
  "name": "Dates and deadlines for projects",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
formatter.step({
  "name": "the deadline is not overdue",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.deadlineNotOverdue()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
  "location": "acceptancetests.ProjectSteps.setEndDateUnsuccesfully(int,int,int)"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Set faulty start time",
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
  "name": "the worker sets the end date of the project to the 2020-6-12 succesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerSetsTheEndDateOfTheProjectToTheSuccesfully(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the start date of the project to the 2020-6-22 unsuccesfully",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.setStartDateTheUnsuccesfully(int,int,int)"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
  "location": "acceptancetests.ProjectSteps.setEndDateUnsuccesfully(int,int,int)"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
  "location": "acceptancetests.ProjectSteps.setEndDateUnsuccesfully(int,int,int)"
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
formatter.step({
  "name": "the project does not contain time specifications",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.doesNotContainTimeSpecifications()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
  "location": "acceptancetests.ProjectSteps.setEndDateUnsuccesfully(int,int,int)"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deadline is overdue",
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
  "name": "the worker sets the start date of the project to the 2020-4-22 succesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerSetsTheStartDateOfTheProjectToThe(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the end date of the project to the 2020-5-8 succesfully",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerSetsTheEndDateOfTheProjectToTheSuccesfully(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the deadline is overdue",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.deadlineOverdue()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deadline not set",
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
  "name": "the deadline is checked",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.deadlineCheck()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Deadline must be instantiated\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Project contains time specifications",
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
  "name": "the worker sets the start date of the project to the 2020-6-16 succesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerSetsTheStartDateOfTheProjectToThe(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker sets the end date of the project to the 2020-8-24 succesfully",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerSetsTheEndDateOfTheProjectToTheSuccesfully(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project contains time specifications",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.containsTimeSpecifications()"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker logs out succesfully",
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
  "name": "the worker logs out",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.theWorkerLogsOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "no one is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.noOneIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
  "name": "that worker \"PEPX\" with password \"1234\" exist in the app",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.thatWorkerWithPasswordExistInTheApp(java.lang.String,java.lang.String)"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
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
formatter.step({
  "name": "the project has no projectleader",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.hasNoProjectleader()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
formatter.step({
  "name": "the project has a projectleader",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.hasProjectleader()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker tries to find worker in project that does exist",
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
  "name": "worker with name \"PEPX\" and password \"1234\" is contained in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.workerWithNameAndPasswordIsContainedInTheProject(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker finds the worker with name \"PEPX\" in the project succesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerFindsTheWorkerWithNameInTheProjectSuccesfully(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is found",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerIsFound()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker tries to find worker in project that does not exist",
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
  "name": "the worker finds the worker with name \"PEPX\" in the project unsuccesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerFindsTheWorkerWithNameInTheProjectUnsuccesfully(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is not found",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerIsNotFound()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Remove project from app",
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
  "name": "worker with name \"PEPX\" and password \"1234\" is contained in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.workerWithNameAndPasswordIsContainedInTheProject(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker removes the project from the app",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerRemovesTheProjectFromTheApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is not contained in the app",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectIsNotContainedInTheApp()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Remove project from app unsuccessfully",
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
  "name": "the worker logs out",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.theWorkerLogsOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker removes the project from the app",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerRemovesTheProjectFromTheApp()"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Remove project from app when in project",
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
  "name": "the worker removes the project from the app",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerRemovesTheProjectFromTheApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User is outside of homepage\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Remove project from app when in activity",
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
  "name": "the worker removes the project from the app",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerRemovesTheProjectFromTheApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User is outside of homepage\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker tries to find project that doesn\u0027t exist",
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
  "name": "the worker tries to find project with name \"Programming 101\" in app",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerTriesToFindProjectWithNameInApp(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Project does not exist\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker tries to find project whilst logged off",
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
  "name": "the worker logs out",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.theWorkerLogsOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker tries to find project with name \"Programming 101\" in app",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerTriesToFindProjectWithNameInApp(java.lang.String)"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Multiple activities in project",
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
  "name": "the activity with name \"Loops2\" is in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theActivityWithNameIsInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there are currently 2 activities in the project",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.numberOfActivities(int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get project ID",
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
  "name": "that there are currently 102 projects in the app",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.numberOfProjects(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Programming 646\" does exist",
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
  "name": "the last two digits of the projects ID is \"02\"",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.CheckID(java.lang.String)"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker adds hours to an activity succesfully",
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
  "name": "the worker adds 15 work hours to the activity succesfully",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerAddsWorkHoursToTheActivitySuccesfully(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "another worker adds 10 work hours to the activity successfully",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.anotherWorkerAddsWorkHoursToTheActivitySuccessfully(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project has a total of 25 work hours",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectHasATotalOfWorkHours(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker has a total of 15 hours contributed to the activity",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerHasATotalOfHoursContributedToTheActivity(int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker has certain time contribution to different projects",
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
  "name": "the worker adds 15 work hours to the activity succesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerAddsWorkHoursToTheActivitySuccesfully(int)"
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
  "name": "the project has an activity named \"ProgrammingTasks 102\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theProjectHasAnActivityNamed(java.lang.String)"
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
  "name": "the worker adds 7 work hours to the activity succesfully",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerAddsWorkHoursToTheActivitySuccesfully(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker has a total of 15 work hours contributed to project \"Programming 101\"",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerHasATotalOfWorkHoursContributedToProject(int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker has a total of 7 work hours contributed to project \"Programming 102\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theWorkerHasATotalOfWorkHoursContributedToProject(int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
  "name": "the workers AssignedProjects list will hold \"Programming 101\" and \"Programming 102\"",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.the_workers_AssignedProjects_list_will_hold_and(java.lang.String,java.lang.String)"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker is added but already exists",
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
  "name": "the worker named \"PEPE\" with password \"1234\" is added to the app",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.theWorkerNamedWithPasswordIsAddedToTheApp(java.lang.String,java.lang.String)"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker is created but already exists",
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker has faulty username",
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
  "name": "that worker \"THOMAS\" with password \"1234\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.thatWorkerWithPasswordDoesNotExist(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker named \"THOMAS\" with password \"1234\" is created",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.theWorkerNamedWithPasswordIsCreated(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Username contains too many characters\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker has faulty username",
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
  "name": "that worker \"THOMAS\" with password \"1234\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.thatWorkerWithPasswordDoesNotExist(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker named \"THOMAS\" with password \"1234\" is added to the app",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.theWorkerNamedWithPasswordIsAddedToTheApp(java.lang.String,java.lang.String)"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker is succesfully created",
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
  "name": "that worker \"PEPX\" with password \"1234\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.thatWorkerWithPasswordDoesNotExist(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker named \"PEPX\" with password \"1234\" is created",
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker is removed from the app succesfully",
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
  "name": "that worker \"PEPE\" with password \"1234\" exist in the app",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.thatWorkerWithPasswordExistInTheApp(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is removed from the app",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.theWorkerIsRemovedFromTheApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is not contained in the app",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.theWorkerIsNotContainedInTheApp()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker is removed from the app unsuccesfully",
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
  "name": "that worker \"PEPE\" with password \"1234\" exist in the app",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.thatWorkerWithPasswordExistInTheApp(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker logs out",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.theWorkerLogsOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker is removed from the app",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.theWorkerIsRemovedFromTheApp()"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker tries to find worker that does not exist",
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
  "name": "that worker \"PEPX\" with password \"1234\" does not exist",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.thatWorkerWithPasswordDoesNotExist(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker tries to find worker with name \"PEPX\" in app",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.theWorkerTriesToFindWorkerWithNameInApp(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User does not exist\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker tries to find worker whilst logged out",
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
  "name": "that worker \"PEPX\" with password \"1234\" exist in the app",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.thatWorkerWithPasswordExistInTheApp(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker logs out",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.LoginLogoutSteps.theWorkerLogsOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker tries to find worker with name \"PEPX\" in app",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.theWorkerTriesToFindWorkerWithNameInApp(java.lang.String)"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
  "name": "the worker named \"PEPE\" with password \"1234\" is added to the app",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.theWorkerNamedWithPasswordIsAddedToTheApp(java.lang.String,java.lang.String)"
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
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Worker is not available",
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
  "name": "that the worker is working on 20 activities",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.thatTheWorkerIsWorkingOnProjects(int)"
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
  "name": "the worker is added to the activity",
  "keyword": "When "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.addWorkerToActivity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Worker is not available\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Workers total current time spent",
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
  "name": "that the worker is working on 5 activities",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.thatTheWorkerIsWorkingOnProjects(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker has amassed 10 hours for each activity",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.amassedHoursPerActivity(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker has accumulated 50 hours of work",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.workerAccumulatedHours(int)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:usecases/test.feature");
formatter.feature({
  "name": "test",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "reset",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "that the managementApp has been reset",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptancetests.resetStep.thatTheManagementAppHasBeenReset()"
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
  "name": "the worker adds 15 work hours to the activity succesfully",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerAddsWorkHoursToTheActivitySuccesfully(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "another worker adds 10 work hours to the activity successfully",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.anotherWorkerAddsWorkHoursToTheActivitySuccessfully(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project has a total of 25 work hours",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectHasATotalOfWorkHours(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the worker has a total of 15 hours contributed to the activity",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ActivitySteps.theWorkerHasATotalOfHoursContributedToTheActivity(int)"
});
formatter.result({
  "status": "passed"
});
});