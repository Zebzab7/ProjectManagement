$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:use_cases/LoginLogout.feature");
formatter.feature({
  "name": "LoginLogout",
  "description": "\tDescription: Log a worker in and out\n\tActors: Worker",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Log in",
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
  "name": "the worker is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.LoginLogoutSteps.theWorkerIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
});