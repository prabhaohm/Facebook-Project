
@Smoke
Feature: Validate the login functionality of facebook page

Background:
#Given User should launch the chrome browser and load the url

@Pink
Scenario: Validate the login with invalid username and invalid password

When User should input invalid username and invalid passworD in the textbox
           #2D MAP --> Header
            |Person|Colour|Fruits|
            |Ajay  |Green |Apple|
            |Kumar |Pink  |Grapes|
            |Kavin |Red   |hello|
            |Vimal |Yellow|how|
And User should click the login button
And User should print the Title of the page
And User should print current url of my page
Then User should navigate to incorrect credential page

@Yellow @Hello
Scenario: Validate the login with valid username and invalid password

When User should input valid username and invalid password in the textbox
And User should click the login button
And User should print the current url of the page
And User should print the Title of the page
Then User should navigate to incorrect credential page
 
 
 
 
 
 Scenario Outline: Validate the login with invalid username and valid password 
When User should input invalid username"<Fruits>" and valid password"<Colours>" in the textbox
And User should click the login button
And User should print the current url of the page
And User should print the Title of the page
#Then User should navigate to incorrect credential page


Examples:
        |Fruits|Colours |
        |Apple|Green    |
        