Feature: US121585 [Interaction] [Pre job planning] Single Well Count

@verifyslider
Scenario: TC122043 Verify the slider present in single well count
Given  User launches the mobile application
When User logs in with username "rajyalakshmi724@gmail.com" and password "Amma@31348286"
Then User should be able to login
Then User clicks on the pre-planning icon in homepage
And User clicks on Frac Sequence Planning in menu tab
Then Check for single well count label 
And Check whether the single well count slider is displayed
Then Check for the single well count slider with 0%, 0.25%, 0.50%, 0.75% and 1.0%