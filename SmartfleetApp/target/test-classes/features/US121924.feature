Feature: US121924 [Interaction] [Pre job planning] Simulfrac hydraulic efficiency

Background:  User is logging in and navigating to pre-planning
Given  User launches the mobile application
When User logs in with username "rajyalakshmi724@gmail.com" and password "Amma@31348286"
Then User should be able to login
Then User clicks on the pre-planning icon in homepage
And User clicks on Frac Sequence Planning in menu tab

@US121924
Scenario: TC122271 Verify Error message should throw if the minimum or maximum value exceeds by user in simulfrac hydraulic efficiency tab

Then Check the error message is displayed if values given are 0.01, 0.09, 1.1 and 1.9 in simulfrac hydraulic efficiency

@US121924
Scenario: TC122270 Verify for  API Units (dec) – Range-->(MIN 0.1--> MAX 1.0) for Default value – 0.85(Simulfrac hydraulic efficiency Tab)

Then Check whether the default value is 0.85 in simulfrac hydraulic efficiancy for API units
Then Select units as API and Give values 0.1, 1.0, 0.11 and 0.99 in simulfrac hydraulic efficiency Tab and the values should be accepted

@US121924
Scenario: TC122269 Verify for SI Units(dec) – Range-->(MIN 0.1--> MAX 1.0) for Default value – 0.85(Simulfrac hydraulic efficiency Tab)

Then Check whether SI radio button is selectable
Then Check whether the default value is 0.85 in simulfrac hydraulic efficiancy for SI units
Then Select units as SI and Give values 0.1, 1.0, 0.11 and 0.99 in simulfrac hydraulic efficiency Tab and the values should be accepted

@US121924
Scenario: TC122268 Verify only decimal values are allowed  in Simulfrac  hydraulic efficiency tab

And Give decimal values 0.1 and 1.0 in simulfrac  hydraulic efficiency tab the values should be accepted
And Give integer values 2 and 0 in simulfrac  hydraulic efficiency tab the values should not be accepted
