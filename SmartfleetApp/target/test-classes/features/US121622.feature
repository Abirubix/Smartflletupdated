Feature: US121622 [Interaction] [Pre job planning] Express fiber Well 

@US121622
Scenario: TC122134 Validate  selected wells are in the field and validate user can unselect the well by clicking the close button
Given  User launches the mobile application
When User logs in with username "rajyalakshmi724@gmail.com" and password "Amma@31348286"
Then User should be able to login
Then User clicks on the pre-planning icon in homepage
And User clicks on Frac Sequence Planning in menu tab
Then User slides the simulfrac well count slider to 1%
And clicks on Express Fiber Well dropdown
And clicks on SF1, SF2 and Z1 in the dropdown and the values will be displayed in Express Fiber Well field
When clicked on clear all, all the selected options will be deselected and cleared in Express Fiber Well field