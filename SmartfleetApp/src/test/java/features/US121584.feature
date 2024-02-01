Feature: US121584 [Interaction] [Pre job planning] Select preferred units.

Background:  User is logging in and navigating to pre-planning
Given  User launches the mobile application
When User logs in with username "rajyalakshmi724@gmail.com" and password "Amma@31348286"
Then User should be able to login
Then User clicks on the pre-planning icon in homepage
And User clicks on Frac Sequence Planning in menu tab

Scenario: TC122040 Verify the tabs after selected the Preferred units as API

Then Check for Select Preferred Units label
Then Check for API label
And Check whether the API radio button is selected by default
Then Verify whether Single well Lateral Length  tab  is in (ft)
And verify whether  Simulfrac Well lateral length tab is in (ft)
And verify whether Single well stage volume tab is in (bbl)
And Verify whether Simulfrac well stage volume tab is in (bbl)
And Verify whether Single well target rate tab is in (bpm)
And Verify whether Simulfrac well target rate  tab is in (bpm)

Scenario: TC122041 Verify the tabs after selected the Preferred units as SI

Then Check for Select Preferred Units label
And Check for SI label
Then Check whether SI radio button is selectable
Then Verify whether Single well Lateral Length  tab  is in (m)
And verify whether  Simulfrac Well lateral length tab is in (m)
And verify whether Single well stage volume tab is in (m3)
And Verify whether Simulfrac well stage volume tab is in (m3)
And Verify whether Single well target rate tab is in (m3/min)
And Verify whether Simulfrac well target rate  tab is in (m3/min)