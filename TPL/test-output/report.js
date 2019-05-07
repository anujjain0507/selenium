$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/jain.anuj/workspace/TPL/src/main/java/com/qa/features/TPL.feature");
formatter.feature({
  "line": 1,
  "name": "TPLAplication Testing",
  "description": "",
  "id": "tplaplication-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "To verify TPL home page",
  "description": "",
  "id": "tplaplication-testing;to-verify-tpl-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User open the browser and enter the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter the user name and Password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Verify the Home page Title",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.user_open_the_browser_and_enter_the_URL()"
});
formatter.result({
  "duration": 6493465486,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.enter_the_user_name_and_Password()"
});
formatter.result({
  "duration": 703239287,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.verify_the_Home_page_Title()"
});
formatter.result({
  "duration": 16935391,
  "status": "passed"
});
});