Feature: US121866 [Interaction] [Pre job planning] Simulfrac Well Lateral Length

Background:  User is logging in and navigating to pre-planning
Given  User launches the mobile application
When User logs in with username "rajyalakshmi724@gmail.com" and password "Amma@31348286"
Then User should be able to login
Then User clicks on the pre-planning icon in homepage
And User clicks on Frac Sequence Planning in menu tab

Scenario: TC122125 Verify the error message if the user exceeds minimum or maximum value 

And Check whether the API radio button is selected by default
Then Give values in Simulfrac Well Lateral Length. This value should be terminating condition. For API units, give values 999 and 20001
Then Error message should be displayed for Simulfrac Well Lateral Length when API unit is selected
Then Check whether SI radio button is selectable
And Give values in Simulfrac Well Lateral Length. This value should be terminating condition. For SI units, give values 299 and 6001
Then Error message should be displayed for Simulfrac Well Lateral Length when SI unit is selected
	
Scenario: TC122122 Verify the range values for Simulfrac Well Lateral Length  by select preferred units as API Units

And Check whether the API radio button is selected by default
Then Select preferred units as API Units, User have to give values as 1001, 10000 and 19999 in Simulfrac Well Lateral Length and the values should be accepted

Scenario: TC122121 Verify the range values for Simulfrac Well Lateral Length  by select preferred units as SI Units

Then Check whether SI radio button is selectable
And Select preferred units as SI Units, Give values in Simulfrac Well Lateral Length as 301, 4250 and 5999 in Simulfrac Well Lateral Length and the values should be accepted