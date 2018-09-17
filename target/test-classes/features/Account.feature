Feature: Application Login

Background:
Given validate the browser
When Browser is triggered
Then check if browser is started

@Sanity @PortalTest
Scenario: Home page dafault login 
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@PortalTest
Scenario: Home page dafault login 
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"