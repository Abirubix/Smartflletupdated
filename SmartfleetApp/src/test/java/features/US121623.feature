Feature: US121623 [Interaction] [Pre job planning] Single Well Lateral Length

Background:  User is logging in and navigating to pre-planning
Given  User launches the mobile application
When User logs in with username "rajyalakshmi724@gmail.com" and password "Amma@31348286"
Then User should be able to login
Then User clicks on the pre-planning icon in homepage

Scenario: TC122070 Verify  by giving wrong values in Single Well Lateral Length tab without applying condition for unit API

And User clicks on Frac Sequence Planning in menu tab
And Check whether the API radio button is selected by default
Then Give the wrong value like 20, 30, 900, 25 and 20001, by terminating condition


Scenario: TC122074 Verify  by giving wrong values in Single Well Lateral Length tab without applying condition for unit SI

And User clicks on Frac Sequence Planning in menu tab
Then Check whether SI radio button is selectable
Then Give the wrong value like 90, 30.6, 230, 6001, 8002 by terminating condition


Scenario: TC122071 Verify the default value in Single Well Lateral Length Tab(API Units)

And User clicks on Frac Sequence Planning in menu tab
And Check whether the API radio button is selected by default
Then Verify the default value in  Single Well Lateral Length Tab(API Units) is 9507


Scenario: TC122075 Verify the default value in Single Well Lateral Length Tab(SI Units)

And User clicks on Frac Sequence Planning in menu tab
Then Check whether SI radio button is selectable
Then Verify the default value in  Single Well Lateral Length Tab(SI Units) is 3007


Scenario: TC122069 Verify the value in Single Well Lateral Length by applying condition for unit API

And User clicks on Frac Sequence Planning in menu tab
And Check whether the API radio button is selected by default
Then Preferred unit is in API, give values as 1001 and 19999 in  Single Well Lateral Length tab and the values should be accepted


Scenario: TC122073 Verify the value in Single Well Lateral Length by applying condition for unit SI

And User clicks on Frac Sequence Planning in menu tab
Then Check whether SI radio button is selectable
Then Preferred unit is in SI, give values as 301 and 5999 in  Single Well Lateral Length tab and the values should be accepted