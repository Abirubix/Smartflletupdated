Feature: US119985 [Pre-Job Planning]Setting Menu

Background: User is logging in and navigating to pre-planning
Given  User launches the mobile application
When User logs in with username "rajyalakshmi724@gmail.com" and password "Amma@31348286"
Then User should be able to login
Then User clicks on the pre-planning icon in homepage
And User clicks on Frac Sequence Planning in menu tab

Scenario: TC120835 Verify the single well count

Then Check for single well count label 
And Check whether the single well count slider is displayed
Then Check for the single well count slider with 0%, 0.25%, 0.50%, 0.75% and 1.0%

Scenario: TC120836 Verify the SimulFrac Well Count

Then Check for simulfrac well count label
And Check whether the simulfrac well count slider is displayed
Then Check for the simulfrac well count slider with 0%, 0.25%, 0.50%,0.75% and 1.0%


Scenario: TC120834 Verify the option for preferred unit

Then Check for Select Preferred Units label
Then Check for API label
And Check for SI label
And Check whether the API radio button is selected by default
Then Check whether SI radio button is selectable
And Check wheteher the API radio button is selectable