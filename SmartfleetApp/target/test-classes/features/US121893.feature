Feature: US121893 [Interaction] [Pre job planning]Simulfrac well target rate

Background:  User is logging in and navigating to pre-planning
Given  User launches the mobile application
When User logs in with username "rajyalakshmi724@gmail.com" and password "Amma@31348286"
Then User should be able to login
Then User clicks on the pre-planning icon in homepage
And User clicks on Frac Sequence Planning in menu tab

Scenario: TC122253 Verify API Units (bpm) - User should able to give MIN 5- MAX 200 and check Default value – 120 in simulfrac well target rate

And Check if the default value is 120 for simulfrac well target rate in API unit
Then Select preferred unit as API and give values 5, 6, 199 and 200 in simulfrac well target rate and the values should be accepted

Scenario: TC122254 Verify Error message should throw if the minimum or maximum value exceeds by user in simulfrac well target rate

Then Give the value by terminating condition in  Simulfrac well target rate tab for  API Units (bpm) such as 4, 201 and 2000
Then Check whether SI radio button is selectable
Then Give the value by terminating condition in  Simulfrac well target rate tab for  SI Units (bpm) such as 31 and 2000

Scenario: TC122252 Verify SI Units (m3/min) – User should able to give MIN 0- MAX 30 and check  Default value – 19 for simulfrac well target rate

Then Check whether SI radio button is selectable
And Verify whether the default value is 19 in Simulfrac well target rate for SI
Then Select preferred unit as SI and give values 0, 30, 2 and 29 in Simulfrac well target rate and the values should be accepted

