Feature: Application Login

@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "Jonh" and "4321"
Then Home page is populated
And Cards are displayed "true"