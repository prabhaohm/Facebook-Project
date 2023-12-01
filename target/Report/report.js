$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeautureFiles/Forgotten.feature");
formatter.feature({
  "name": "Validate the forgotten password functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.scenario({
  "name": "Validate the forgotten with invalid mobile number",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should click the forgotten password link",
  "keyword": "When "
});
formatter.match({
  "location": "ForgottenStepDefenition.userShouldClickTheForgottenPasswordLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should input invalid mobile number on the textbox",
  "keyword": "And "
});
formatter.match({
  "location": "ForgottenStepDefenition.userShouldInputInvalidMobileNumberOnTheTextbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "ForgottenStepDefenition.userShouldClickTheSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to recover page",
  "keyword": "Then "
});
formatter.match({
  "location": "ForgottenStepDefenition.userShouldNavigateToRecoverPage()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: check forgot\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.stepdefinition.ForgottenStepDefenition.userShouldNavigateToRecoverPage(ForgottenStepDefenition.java:47)\r\n\tat ✽.User should navigate to recover page(file:src/test/resources/FeautureFiles/Forgotten.feature:8)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});