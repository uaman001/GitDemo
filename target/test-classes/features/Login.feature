Feature: Application Login

@SmokeTest
Scenario: Home page dafault login 
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@MobileTest
Scenario: Home page dafault login 
Given User is on NetBanking landing page
When User login into application with "john" and password "4321"
Then Home page is populated
And Cards displayed are "false"

#DataTable
@SanityTest
Scenario: Home page dafault login 
Given User is on NetBanking landing page
When User sign up with following details
|jenny | abcd | john@mail.com | Australia| 23456|
Then Home page is populated
And Cards displayed are "false"


#Parameterization
@RegTest
Scenario Outline: Home page dafault login 
Given User is on NetBanking landing page
When User login in to application with <username> and password <password>
Then Home page is populated
And Cards displayed are "true"

Examples:
|username | password |
|user1	  | pass1 	 |
|user2	  | pass2 	 |
|user3	  | pass3 	 |
|user4	  | pass4 	 |