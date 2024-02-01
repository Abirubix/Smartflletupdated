Feature: US121889 [Interaction] [Pre job planning] Single well target rate

Background:  User is logging in and navigating to pre-planning
Given  User launches the mobile application
When User logs in with username "rajyalakshmi724@gmail.com" and password "Amma@31348286"
Then User should be able to login
Then User clicks on the pre-planning icon in homepage
And User clicks on Frac Sequence Planning in menu tab

Scenario: TC122249 Verify API Units (bpm) - User should able to give MIN 5- MAX 200 and check Default value – 80 in single well target rate

And Verify whether the default value is 80 in Single well target rate for API
Then Select preferred unit as API and give values 6, 199 and 150 in Single well target rate and the values should be accepted

Scenario: TC122250 Verify Error message should throw if the minimum or maximum value exceeds by user in single well target rate

Then Give the value by terminating condition in  Single well target rate tab for  API Units (bpm) such as 4, 201 and 999
Then Check whether SI radio button is selectable
Then Give the value by terminating condition in  Single well target rate tab for  SI Units (bpm) such as 0, 31 and 99


Scenario: TC122248 Verify SI Units (m3/min) – User should able to give MIN 1- MAX 30 and check  Default value – 13 for single well target rate

Then Check whether SI radio button is selectable
And Verify whether the default value is 13 in Single well target rate for SI
Then Select preferred unit as SI and give values 1, 30, 2 and 29 in Single well target rate and the values should be accepted

