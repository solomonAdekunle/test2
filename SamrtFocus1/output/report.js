$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com\\test\\PersonalisedEmailPage\\PersonalisedEmailPage.feature");
formatter.feature({
  "line": 2,
  "name": "Smart PersonlizationEmai title page",
  "description": "I want to use this template for my feature file",
  "id": "smart-personlizationemai-title-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmartPersonlizationEmailPageTest"
    }
  ]
});
formatter.scenario({
  "line": 17,
  "name": "verify title page",
  "description": "",
  "id": "smart-personlizationemai-title-page;verify-title-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SmartPersonlizationEmailPageTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I navigate to \"siteURL\" on \"Mozilla\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter  \"searchbox_Selector\" as \"smartfocus.co.uk\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click \"searchButton\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on the \"Smartfocuslink\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I navigate to  the \"cloadMenu_box\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I hover on \"cloadMenu_box\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I   click on the \"smartPersonaliseEmail\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I  \"pageTitle\" element should be present",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "siteURL",
      "offset": 15
    },
    {
      "val": "Mozilla",
      "offset": 28
    }
  ],
  "location": "PersonalisedEmailPageTest.I_navigate_to_google(String,String)"
});
formatter.result({
  "duration": 4004337454,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "searchbox_Selector",
      "offset": 10
    },
    {
      "val": "smartfocus.co.uk",
      "offset": 34
    }
  ],
  "location": "PersonalisedEmailPageTest.I_enter_as(String,String)"
});
formatter.result({
  "duration": 311989129,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "searchButton",
      "offset": 9
    }
  ],
  "location": "PersonalisedEmailPageTest.I_click(String)"
});
formatter.result({
  "duration": 154691628,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Smartfocuslink",
      "offset": 16
    }
  ],
  "location": "PersonalisedEmailPageTest.I_click_on_the(String)"
});
formatter.result({
  "duration": 945521395,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cloadMenu_box",
      "offset": 20
    }
  ],
  "location": "PersonalisedEmailPageTest.I_navigate_to_the(String)"
});
formatter.result({
  "duration": 1345178800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cloadMenu_box",
      "offset": 12
    }
  ],
  "location": "PersonalisedEmailPageTest.I_hover_on(String)"
});
formatter.result({
  "duration": 1837068363,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "smartPersonaliseEmail",
      "offset": 18
    }
  ],
  "location": "PersonalisedEmailPageTest.I_click_on_(String)"
});
formatter.result({
  "duration": 3061946953,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pageTitle",
      "offset": 4
    }
  ],
  "location": "PersonalisedEmailPageTest.I_element_should_be_present(String)"
});
formatter.result({
  "duration": 150364758,
  "status": "passed"
});
});