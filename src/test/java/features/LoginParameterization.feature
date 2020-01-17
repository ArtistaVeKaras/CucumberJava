Feature: Application Login Para

#Example with Parameterisation passing multiple arguments 
#Remember to user Scenario Outline
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login in to the application with <username> and <password>
Then Home page is populated
And Cards are displayed "false"

Examples:
| username | password |
| user1    | pass1    |
| user2    | pass2    |
| user3    | pass3    |
| user4    | pass4    |
| user5    | pass5    |

