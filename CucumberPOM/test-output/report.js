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
  "duration": 7519202305,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 281282366,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_log_into_app()"
});
formatter.result({
  "duration": 456080278,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_logged_in_user_name()"
});
formatter.result({
  "duration": 10649021842,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verify_the_activity_matrix_link()"
});
formatter.result({
  "duration": 53307267,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verify_the_inbox_link()"
});
formatter.result({
  "duration": 47928870,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verify_the_search_link()"
});
formatter.result({
  "duration": 41717,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verify_the_vendor_tab()"
});
formatter.result({
  "duration": 47405,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verify_the_my_profile_tab()"
});
formatter.result({
  "duration": 47025,
  "status": "passed"
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
  "duration": 1844073505,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.click_on_the_add_button()"
});
formatter.result({
  "duration": 415342957,
  "status": "passed"
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
  "duration": 5930837421,
  "status": "passed"
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
  "duration": 463716677,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.submit_the_record()"
});
formatter.result({
  "duration": 1329479359,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.close_Transaction()"
});
formatter.result({
  "duration": 835616807,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.wait_for_sec()"
});
formatter.result({
  "duration": 4999521019,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.open_the_Specific_records()"
});
formatter.result({
  "duration": 1579530841,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ctd class\u003d\"\" aria-describedby\u003d\"6907d457-2f6a-4354-905d-e48e44d68943\" role\u003d\"gridcell\"\u003e...\u003c/td\u003e is not clickable at point (942, 199). Other element would receive the click: \u003clabel class\u003d\"txt1\" for\u003d\"txtActivit...\"\u003eRemark\u003c/label\u003e\n  (Session info: chrome\u003d66.0.3359.139)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027SDF4110IPM096\u0027, ip: \u002710.254.19.60\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91), userDataDir\u003dC:\\Users\\JAIN~1.ANU\\AppData\\Local\\Temp\\scoped_dir3344_29318}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d66.0.3359.139, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: c0226cb73b1dd6d6c8d60cba93df9bf8\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:275)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:82)\r\n\tat com.qa.pages.VendorManualRegPage.select_specific_vendor(VendorManualRegPage.java:98)\r\n\tat com.qa.stepDefinations.RegistrationPageSteps.open_the_Specific_records(RegistrationPageSteps.java:55)\r\n\tat ✽.Then open the Specific records(C:/Users/jain.anuj/git/selenium/CucumberPOM/src/main/java/com/qa/features/dgsl.feature:24)\r\n",
  "status": "failed"
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