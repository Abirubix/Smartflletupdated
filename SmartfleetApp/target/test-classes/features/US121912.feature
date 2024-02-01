Feature: US121912 [Interaction] [Pre job planning] Single hydraulic efficiency 

Background:  User is logging in and navigating to pre-planning
Given  User launches the mobile application
When User logs in with username "rajyalakshmi724@gmail.com" and password "Amma@31348286"
Then User should be able to login
Then User clicks on the pre-planning icon in homepage
And User clicks on Frac Sequence Planning in menu tab

Scenario: TC122266 Verify Error message should throw if the minimum or maximum value exceeds by user in single hydraulic efficiency

Then Check the error message is displayed if values given are 0.01, 0.09, 1.1 and 1.9 in single hydraulic efficiency

@US121912

Scenario: TC122258 Verify for  API Units (dec) – Range-->(MIN 0.1--> MAX 1.0) for Default value – 0.75(Single hydraulic efficiency Tab)

Then Check whether the default value is 0.75 in single hydraulic efficiancy for API units
Then Select units as API and Give values 0.1, 1.0, 0.11 and 0.99 in Single hydraulic efficiency Tab and the values should be accepted


@US121912
Scenario: TC122256 Verify for SI Units(dec) – Range-->(MIN 0.1--> MAX 1.0) for Default value – 0.75(Single hydraulic efficiency Tab)

Then Check whether SI radio button is selectable
Then Check whether the default value is 0.75 in single hydraulic efficiancy for SI units
Then Select units as SI and Give values 0.1, 1.0, 0.11 and 0.99 in Single hydraulic efficiency Tab and the values should be accepted

@TC122255
Scenario: TC122255 Verify only decimal values are allowed  in Single  hydraulic efficiency tab

And Give decimal values 0.1 and 1.0 in Single  hydraulic efficiency tab the values should be accepted
And Give integer values 2 and 0 in Single  hydraulic efficiency tab the values should not be accepted
