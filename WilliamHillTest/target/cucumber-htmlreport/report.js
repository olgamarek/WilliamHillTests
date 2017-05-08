$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("williamhill/BetTest.feature");
formatter.feature({
  "line": 1,
  "name": "Bet on event",
  "description": "",
  "id": "bet-on-event",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Bet on football event on desktop",
  "description": "",
  "id": "bet-on-event;bet-on-football-event-on-desktop",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I open the browser on desktop",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "open page \"http://sports.williamhill.com/betting/en-gb\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "select football event on 4 position",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "place a £0.05 bet for the home team to \u0027Win\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "assert the odds",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "assert returns offered",
  "keyword": "And "
});
formatter.match({
  "location": "BettingTest.openBrowserOnDesktop()"
});
formatter.result({
  "duration": 2424192181,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://sports.williamhill.com/betting/en-gb",
      "offset": 11
    }
  ],
  "location": "BettingTest.openPage(String)"
});
formatter.result({
  "duration": 3911857029,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 25
    }
  ],
  "location": "BettingTest.selectFootballEventOnSelectedPosition(int)"
});
formatter.result({
  "duration": 753357549,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0.05",
      "offset": 9
    }
  ],
  "location": "BettingTest.placeABetForTheHomeTeamToWin(String)"
});
formatter.result({
  "duration": 717730013,
  "status": "passed"
});
formatter.match({
  "location": "BettingTest.assertTheOdds()"
});
formatter.result({
  "duration": 127662134,
  "status": "passed"
});
formatter.match({
  "location": "BettingTest.assertReturnsOffered()"
});
formatter.result({
  "duration": 110747780,
  "status": "passed"
});
formatter.after({
  "duration": 1054947010,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Bet on football event on mobile device",
  "description": "",
  "id": "bet-on-event;bet-on-football-event-on-mobile-device",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I open the browser on mobile device",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "open page \"http://sports.williamhill.com/betting/en-gb\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "select any football event",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "place a £0.05 bet for the home team to \u0027Win\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "assert the odds",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "assert returns offered",
  "keyword": "And "
});
formatter.match({
  "location": "BettingTest.openBrowserOnDMobile()"
});
formatter.result({
  "duration": 1946597524,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://sports.williamhill.com/betting/en-gb",
      "offset": 11
    }
  ],
  "location": "BettingTest.openPage(String)"
});
formatter.result({
  "duration": 3276165665,
  "status": "passed"
});
formatter.match({
  "location": "BettingTest.selectAnyFootballEvent()"
});
formatter.result({
  "duration": 632618084,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0.05",
      "offset": 9
    }
  ],
  "location": "BettingTest.placeABetForTheHomeTeamToWin(String)"
});
formatter.result({
  "duration": 827438434,
  "status": "passed"
});
formatter.match({
  "location": "BettingTest.assertTheOdds()"
});
formatter.result({
  "duration": 104515884,
  "status": "passed"
});
formatter.match({
  "location": "BettingTest.assertReturnsOffered()"
});
formatter.result({
  "duration": 105437911,
  "status": "passed"
});
formatter.after({
  "duration": 815301041,
  "status": "passed"
});
});