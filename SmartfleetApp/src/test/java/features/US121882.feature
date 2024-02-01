Feature: US121882 [Interaction] [Pre job planning] Single well stage volume

Background:  User is logging in and navigating to pre-planning
Given  User launches the mobile application
When User logs in with username "rajyalakshmi724@gmail.com" and password "Amma@31348286"
Then User should be able to login
Then User clicks on the pre-planning icon in homepage
And User clicks on Frac Sequence Planning in menu tab

Scenario: TC122221  Error message should throw if the minimum or maximum value exceeds by user

And Check whether the API radio button is selected by default
Then Select the preferred units as API and give the value as 99, 0 and 30001 in Single well stage volume and an alert message should be shown
Then Check whether SI radio button is selectable
Then Select the preferred units as SI and give the value as 19, 0 and 4501 in Single well stage volume and an alert message should be shown

Scenario: TC122149 Verify API Units (bbl) - User should able to give values (MIN 100- MAX 30000) and check Default value is 5000

And Check whether the API radio button is selected by default
Then Select the preferred units as API  in Single well stage volume verify whether the default value is 5000
And Give values 101, 9999 and 29999
