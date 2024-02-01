Feature: US1225784 [CR][Pre-Job Planning] display metrics as tiles

Background:  User is logging in and navigating to pre-planning
Given  User launches the mobile application
When User logs in with username "rajyalakshmi724@gmail.com" and password "Amma@31348286"
Then User should be able to login
Then User clicks on the pre-planning icon in homepage

Scenario: TC125984 Verify  elapsed time are only measured in days

Then verify the elapsed time label and elapsed time value to be 6 days

Scenario: TC125984 Verify the metrics are displayed as two tiles

And User should be able to see the metric are displayed as two tiles. Tile one with Elapsed time with original and express fiber. Tile two with stages measured by express fiber