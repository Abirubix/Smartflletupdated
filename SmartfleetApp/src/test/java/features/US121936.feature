Feature: US121936 [Interaction]  [Pre job planning] Single stage transition time 

Background:  User is logging in and navigating to pre-planning
Given  User launches the mobile application
When User logs in with username "rajyalakshmi724@gmail.com" and password "Amma@31348286"
Then User should be able to login
Then User clicks on the pre-planning icon in homepage
And User clicks on Frac Sequence Planning in menu tab

@US121963
Scenario: TC122285 Verify Error message should throw if the minimum or maximum value exceeds by user in single stage transition time

Then Check the error message is displayed if values given are 0.01, 0.09, 5.1 and 9.1 in Single stage transition time 

@US121963
Scenario: TC122284 Verify for  API Units (dec) – Range-->(MIN 0.1--> MAX 5.0) for Default value – 0.3(Single stage transition time Tab)

Then Check whether the default value is 0.30 in Single stage transition time for API units
Then Select units as API and Give values  0.11, 0.1, 5.0 and 4.9 in Single stage transition time Tab and the values should be accepted

@US121963
Scenario: TC122275 Verify for SI Units(dec) – Range--> MIN 0.1 to MAX 5.0 for Default value – 0.3(Single stage transition time)

Then Check whether the default value is 0.30 in Single stage transition time for SI units
Then Select units as SI and Give values  0.11, 0.1, 5.0 and 4.9 in Single stage transition time Tab and the values should be accepted

@US121963
Scenario: TC122274 Verify only decimal values are allowed  in Single stage transition time

And Give decimal values 1.0 and 5.0 in Single stage transition time  tab the values should be accepted
And Give integer values 9 and 0 in Single stage transition time  tab the values should not be accepted

