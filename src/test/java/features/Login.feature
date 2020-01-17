Feature: Portal Login

#Background keyword implies that this needs to be run before any other test is run
#Background will only run for this test
Background: 
Given validate the browser
When Browser is triggered
Then Check if browser is started

#Basic Example with no regular expression
@SanityTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username and password
Then Home page is populated
And Cards are displayed "true"


#Basic Example with no regular expression
@RegTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username and password
Then Home page is populated
And Cards are displayed "true"


#Basic Example with no regular expression
@RegTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username and password
Then Home page is populated
And Cards are displayed "true"


#Basic Example with no regular expression
@SmokeTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username and password
Then Home page is populated
And Cards are displayed "true"


#Basic Example with no regular expression
@SmokeTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username and password
Then Home page is populated
And Cards are displayed "true"