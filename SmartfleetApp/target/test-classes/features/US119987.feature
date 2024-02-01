Feature: US119987 [Pre-Job Planning] Well Schematic in landscape mode

Background:  User is logging in and navigating to pre-planning
Given  User launches the mobile application
When User logs in with username "rajyalakshmi724@gmail.com" and password "Amma@31348286"
Then User should be able to login
Then User clicks on the pre-planning icon in homepage

Scenario: TC120796 Verify the landscape mode

When tapped on the right corner of the plot
Then the well should be displayed in landscape mode

Scenario: TC120798 Verify the portrait mode.

When tapped on the right corner of the plot
Then the well should be displayed in landscape mode
And Tap on the icon to close landscape mode then it should display the portrait mode


Scenario: TC120791 Verify the wells schematic in job planning

And User should be able to see the well and stage schematic