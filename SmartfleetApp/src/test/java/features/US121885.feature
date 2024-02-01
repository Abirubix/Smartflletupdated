Feature: US121885 [Interaction] [Pre job planning] Simulfrac well stage volume

Background:  User is logging in and navigating to pre-planning
Given  User launches the mobile application
When User logs in with username "rajyalakshmi724@gmail.com" and password "Amma@31348286"
Then User should be able to login
Then User clicks on the pre-planning icon in homepage
And User clicks on Frac Sequence Planning in menu tab

Scenario: TC122232  Error message should throw if the minimum or maximum value exceeds by user for simulfrac well stage volume

Then Give the values 99 and 30001 for API Units by terminating condition in  Simulfrac well stage volume tab
Then Check whether SI radio button is selectable
And Give the values 19 and 4501 for SI Units by terminating condition in  Simulfrac well stage volume tab

Scenario: TC122231 Verify API Units (bbl) for simulfrac  well stage volume - User should able to give values (MIN 100- MAX 30000) and check Default value is 5000

And Verify whether the default value is 5000 in Simulfrac well stage volume for API
Then Select preferred unit as API and give values as 101, 29999 and 15000 in Simulfrac well stage volume and the values should be accepted

Scenario: TC122230 Verify SI Units (m3) for simulfrac well stage volume– User should able to give value(MIN 20- MAX 4500) and check  Default value – 800

Then Check whether SI radio button is selectable
And Check whether the default value is 800 in Simulfrac well stage volume for SI
And Select Preferred unit as SI and give values 21, 4499 and 2500 in  Simulfrac well stage volume and the values should be accepted
