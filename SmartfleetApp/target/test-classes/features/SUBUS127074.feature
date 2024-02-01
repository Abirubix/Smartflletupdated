Feature: US127074 [Subscriptions][Pad Subscription] User should not be allowed to submit multiple request for a single pad

Background: User is logging in and navigating to pre-planning
Given  User launches the mobile application
When User logs in with username "rajyalakshmi724@gmail.com" and password "Amma@31348286"
Then User should be able to login

Scenario: TC127097 Verify the editing functionality for pads with  subscription(Near well, cross Well or Complete)
Then Verify the editing functionality for pads with  subscription(Near well, cross Well or Complete)

@nosub
Scenario: TC127096 Verify the editing functionality for pads with no subscription
Then Verify the editing functionality for pads with no subscription