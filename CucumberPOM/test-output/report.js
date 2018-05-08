$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/jain.anuj/git/selenium/CucumberPOM/src/main/java/com/qa/features/dgsl.feature");
formatter.feature({
  "line": 1,
  "name": "DGSL Application Test",
  "description": "",
  "id": "dgsl-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate dgsl Home Page Test",
  "description": "",
  "id": "dgsl-application-test;validate-dgsl-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user log into app",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate logged in user name",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "verify the activity matrix link",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify the inbox link",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "verify the search link",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "verify the vendor tab",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "verify the my profile tab",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_open_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.user_log_into_app()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.validate_logged_in_user_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.verify_the_activity_matrix_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.verify_the_inbox_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.verify_the_search_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.verify_the_vendor_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.verify_the_my_profile_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Validate dgsl Vendor Manual Registration Test",
  "description": "",
  "id": "dgsl-application-test;validate-dgsl-vendor-manual-registration-test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "User click on the Vendor Registration Menu",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Click on the add button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "enter the \"\u003cVendor name\u003e\" and \"\u003ccommodity\u003e\" and \"\u003ccontact person\u003e\" and\"\u003cemailid\u003e\" and \"\u003cphone no\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "select the \"\u003cactivity\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "submit the record",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "close the transaction",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Wait for 5 sec",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "open the Specific records",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "select the next \"\u003cactivity2\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "submit the transaction",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "close transaction",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "dgsl-application-test;validate-dgsl-vendor-manual-registration-test;",
  "rows": [
    {
      "cells": [
        "Vendor name",
        "commodity",
        "contact person",
        "emailid",
        "phone no",
        "activity",
        "activity2"
      ],
      "line": 30,
      "id": "dgsl-application-test;validate-dgsl-vendor-manual-registration-test;;1"
    },
    {
      "cells": [
        "MSC",
        "Electrical",
        "pooja",
        "pooja.patil@datamatics.com",
        "1236547895",
        "Self Registration",
        "Approve"
      ],
      "line": 31,
      "id": "dgsl-application-test;validate-dgsl-vendor-manual-registration-test;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 31,
  "name": "Validate dgsl Vendor Manual Registration Test",
  "description": "",
  "id": "dgsl-application-test;validate-dgsl-vendor-manual-registration-test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "User click on the Vendor Registration Menu",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Click on the add button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "enter the \"MSC\" and \"Electrical\" and \"pooja\" and\"pooja.patil@datamatics.com\" and \"1236547895\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "select the \"Self Registration\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "submit the record",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "close the transaction",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Wait for 5 sec",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "open the Specific records",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "select the next \"\u003cactivity2\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "submit the transaction",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "close transaction",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationPageSteps.user_click_on_the_Vendor_Registration_Menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationPageSteps.click_on_the_add_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "MSC",
      "offset": 11
    },
    {
      "val": "Electrical",
      "offset": 21
    },
    {
      "val": "pooja",
      "offset": 38
    },
    {
      "val": "pooja.patil@datamatics.com",
      "offset": 49
    },
    {
      "val": "1236547895",
      "offset": 82
    }
  ],
  "location": "RegistrationPageSteps.enter_the_details(String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Self Registration",
      "offset": 12
    }
  ],
  "location": "RegistrationPageSteps.select_the_activity(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationPageSteps.submit_the_record()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationPageSteps.close_Transaction()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationPageSteps.wait_for_sec()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationPageSteps.open_the_Specific_records()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cactivity2",
      "offset": 17
    }
  ],
  "location": "RegistrationPageSteps.select_the(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationPageSteps.submit_the_transaction()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationPageSteps.close_transaction()"
});
formatter.result({
  "status": "skipped"
});
});