$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:use_cases/test.feature");
formatter.feature({
  "name": "Add Task",
  "description": "\tDescription: Add a new task\n\tActors: Worker",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add a task successfully",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the worker is a project leader",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "there is a task with name \"Programming 101\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the task is not in the project",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the task is added to the project",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the task with name \"Programming 101\" is contained in the project",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});