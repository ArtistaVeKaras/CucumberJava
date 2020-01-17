Feature: Application Login DataTable

#Example with DataTable passing multiple arguments
Scenario: Home page default login
Given User is on NetBanking landing page
When User sign in with the following details
| jenny | abcd | jonh@asd.com | Australia | 234234 |

Then Home page is populated
And Cards are displayed "false"