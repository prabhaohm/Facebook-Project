@Sanity
Feature: Validate the forgotten password functionality
Scenario: Validate the forgotten with invalid mobile number
#Given User should open chrome browser and load url
When User should click the forgotten password link
And User should input invalid mobile number on the textbox
And User should click the search button
Then User should navigate to recover page

