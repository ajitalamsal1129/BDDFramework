$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/ajitalamsal/Documents/JavaTraining/FreeCRMBDDFramework/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefination.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 2366444507,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 53764596,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.user_enters_username_and_password()"
});
formatter.result({
  "duration": 1818103898,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 54650988,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.user_is_on_homepage()"
});
formatter.result({
  "duration": 11072833,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.close_the_browser()"
});
formatter.result({
  "duration": 89094467,
  "status": "passed"
});
});