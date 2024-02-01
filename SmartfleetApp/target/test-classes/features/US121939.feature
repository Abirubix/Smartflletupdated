Feature: US121939 [Interaction] [Pre job planning] Simulfrac stage transition time

Background:  User is logging in and navigating to pre-planning
Given  User launches the mobile application
When User logs in with username "rajyalakshmi724@gmail.com" and password "Amma@31348286"
Then User should be able to login
Then User clicks on the pre-planning icon in homepage
And User clicks on Frac Sequence Planning in menu tab


Scenario: TC122294 Verify Error message should throw if the minimum or maximum value exceeds by user in simulfrac stage transition time

Then Check the error message is displayed if values given are 0.01, 0.09, 5.1 and 9.1 in Simulfrac stage transition time 

@US121939
Scenario: TC122292 Verify for  API Units (dec) – Range-->(MIN 0.1--> MAX 5.0) for Default value – 0.3(Simulfrac stage transition time Tab)

Then Check whether the default value is 0.30 in Simulfrac stage transition time for API units
Then Select units as API and Give values  0.11, 0.1, 5.0 and 4.9 in Simulfrac stage transition time Tab and the values should be accepted

@US121939
Scenario: TC122291 Verify for SI Units(dec) – Range--> MIN 0.1 to MAX 5.0 for Default value – 0.3(Simulfrac stage transition time)

Then Check whether the default value is 0.30 in Simulfrac stage transition time for SI units
Then Select units as SI and Give values  0.11, 0.1, 5.0 and 4.9 in Simulfrac stage transition time Tab and the values should be accepted

@US121939
Scenario: TC122290 Verify only decimal values are allowed  in Simulfrac stage transition time

And Give decimal values 1.0 and 5.0 in Simulfrac stage transition time  tab the values should be accepted
And Give integer values 9 and 0 in Simulfrac stage transition time  tab the values should not be accepted