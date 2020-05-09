$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:usecases/TimeManagement.feature");
formatter.feature({
  "name": "Add or remove hours",
  "description": "\tDescription: Worker adds or removes hours to given activity\n\tActors: Worker",
  "keyword": "Feature"
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
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertFalse(Assert.java:65)\r\n\tat org.junit.Assert.assertFalse(Assert.java:75)\r\n\tat acceptancetests.ActivitySteps.theWorkerAddsWorkHoursToTheActivityUnsuccesfully(ActivitySteps.java:143)\r\n\tat ✽.the worker adds -10 work hours to the activity unsuccesfully(file:///C:/Users/ludvi/eclipse-workspace/ProjectManagement/usecases/TimeManagement.feature:45)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the error message \"Invalid input amount\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptancetests.WorkerSteps.TheErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the project has a total of 0 work hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptancetests.ProjectSteps.theProjectHasATotalOfWorkHours(int)"
});
formatter.result({
  "status": "skipped"
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
});