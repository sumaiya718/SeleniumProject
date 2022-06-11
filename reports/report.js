$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/doc.feature");
formatter.feature({
  "name": "Automate Leaftap Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "TC001_LogIn and LogOut",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Launch ChromeBrowser and Load URL",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter Username as \u003cusername\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Password as \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Click the LogIn button",
  "keyword": "When "
});
formatter.step({
  "name": "It\u0027s navigated HomePage",
  "keyword": "Then "
});
formatter.step({
  "name": "Click the LogOut button",
  "keyword": "And "
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "DemoSalesManager",
        "crmsfa"
      ]
    },
    {
      "cells": [
        "DemoCSR",
        "crmsfa"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC001_LogIn and LogOut",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Launch ChromeBrowser and Load URL",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.launchChromeBrowserAndLoadURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Username as DemoSalesManager",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.enterUsernameAsDemoSalesManager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.enterPasswordAsCrmsfa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the LogIn button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.clickTheLogInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It\u0027s navigated HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.itSNavigatedHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the LogOut button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.clickTheLogOutButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC001_LogIn and LogOut",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Launch ChromeBrowser and Load URL",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.launchChromeBrowserAndLoadURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Username as DemoCSR",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.enterUsernameAsDemoSalesManager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.enterPasswordAsCrmsfa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the LogIn button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.clickTheLogInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It\u0027s navigated HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.itSNavigatedHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the LogOut button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.clickTheLogOutButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
});