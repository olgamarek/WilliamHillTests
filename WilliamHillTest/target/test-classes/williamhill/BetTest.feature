Feature: Bet on event

Scenario: Bet on football event on desktop

Given I open the browser on desktop
And  open page "http://sports.williamhill.com/betting/en-gb"
When select football event on 4 position
And  place a £0.05 bet for the home team to 'Win'
Then assert the odds 
And  assert returns offered


Scenario: Bet on football event on mobile device

Given I open the browser on mobile device
And  open page "http://sports.williamhill.com/betting/en-gb"
When select any football event
And  place a £0.05 bet for the home team to 'Win'
Then assert the odds 
And  assert returns offered
