$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:usecases/Test.feature");
formatter.feature({
  "name": "fails",
  "description": "",
  "keyword": "Feature"
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
  "error_message": "java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 1\r\n\tat java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)\r\n\tat java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)\r\n\tat java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)\r\n\tat java.base/java.util.Objects.checkIndex(Objects.java:373)\r\n\tat java.base/java.util.ArrayList.get(ArrayList.java:425)\r\n\tat project_management.Worker.getHoursOnActivity(Worker.java:23)\r\n\tat acceptancetests.ActivitySteps.theWorkerHasATotalOfHoursContributedToTheActivity(ActivitySteps.java:212)\r\n\tat ✽.the worker has a total of 15 hours contributed to the activity(file:///C:/Users/ludvi/eclipse-workspace/ProjectManagement/usecases/Test.feature:13)\r\n",
  "status": "failed"
});
});