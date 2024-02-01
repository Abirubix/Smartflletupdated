Feature: US126808  [Active pad] Add subscription info to the User Icon page

Background: User is logging in and navigating to pre-planning
Given  User launches the mobile application
When User logs in with username "rajyalakshmi724@gmail.com" and password "Amma@31348286"
Then User should be able to login

Scenario: TC127443 Verify the list of subscriptions
Then Verify the list of subscriptions