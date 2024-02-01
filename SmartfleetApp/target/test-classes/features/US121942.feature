Feature: US121942 [Interaction] [Pre job planning] Wireline Run time, Stack Frac portion only.

Background:  User is logging in and navigating to pre-planning
Given  User launches the mobile application
When User logs in with username "rajyalakshmi724@gmail.com" and password "Amma@31348286"
Then User should be able to login
Then User clicks on the pre-planning icon in homepage
And User clicks on Frac Sequence Planning in menu tab


Scenario: TC122298 Verify Error message should throw if the minimum or maximum value exceeds by user in Wireline Run time, Stack Frac portion only

Then Check the error message is displayed if values given are 0.01, 0.09, 5.1 and 9.1 in Wireline Run time

@US121942
Scenario: TC122297 Verify for  API Units (dec) – Range-->(MIN 0.1--> MAX 5.0) for Default value – 2.0(Wireline Run time, Stack Frac portion only Tab)

Then Check whether the default value is 2.00 in Wireline Run time for API units
Then Select units as API and Give values  0.11, 0.1, 5.0 and 4.9 in Wireline Run time Tab and the values should be accepted 

@US121942
Scenario: TC122296 Verify for SI Units(dec) – Range-->  MIN 0.1 -->MAX 5.0 for Default value – 2.0(Wireline Run time, Stack Frac portion only)

Then Check whether the default value is 2.00 in Wireline Run time for SI units
Then Select units as SI and Give values  0.11, 0.1, 5.0 and 4.9 in Wireline Run time Tab and the values should be accepted

@US121942
Scenario: TC122295 Verify only decimal values are allowed  in Wireline Run time, Stack Frac portion only.

And Give decimal values 1.0 and 5.0 in Wireline Run time  tab the values should be accepted
And Give integer values 9 and 0 in Wireline Run time tab the values should not be accepted
