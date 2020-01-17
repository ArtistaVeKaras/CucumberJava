Feature: Application Login

#Example with Regular Expression
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "Jin" and "1234"
Then Home page is populated
And Cards are displayed "true"

Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "Jonh" and "4321"
Then Home page is populated
And Cards are displayed "false"






