Feature: Login feature of actitime
Scenario: Login with Valid data

Given The user is in the Actitime Login page
When the user enters valid username and password
And clicks on Login button
Then Home page should be displayed.

