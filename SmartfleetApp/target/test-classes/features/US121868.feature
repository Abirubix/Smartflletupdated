Feature: US121868 [Interaction] [Pre job planning] Stages per Single Well 

Background:  User is logging in and navigating to pre-planning
Given  User launches the mobile application
When User logs in with username "rajyalakshmi724@gmail.com" and password "Amma@31348286"
Then User should be able to login
Then User clicks on the pre-planning icon in homepage
And User clicks on Frac Sequence Planning in menu tab

Scenario: TC122083 Verify by giving values within the ranges in Stages per Single Well for API unit

And Check whether the API radio button is selected by default
Then Select preferred units as API Units, User have to give values as 1, 2, 58, 149 and 150 in Stages per singleWell and the values should be accepted
Then Give the value as 0, 151 and 159 in Stages per singleWell and an alert message should be shown

Scenario: TC122082 Verify by giving values within the ranges in Stages per Single Well for SI unit

Then Check whether SI radio button is selectable
Then Select preferred units as SI Units, User have to give values as 1, 2, 58, 149 and 150 in Stages per singleWell and the values should be accepted
Then Give the value as 0, 151 and 159 in Stages per singleWell and an alert message should be shown


Scenario: TC122084 Verify the default value in Stages per Single Well tab for both preferred units(API/SI)

And Check whether the API radio button is selected by default
Then In API unit Verify the default value in Stages per Single Well tab is 30
Then Check whether SI radio button is selectable
And In SI unit Verify the default value in Stages per Single Well tab  is 30