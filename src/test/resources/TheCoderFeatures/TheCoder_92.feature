Feature: This feature file for contact and login feature


@test 
Scenario: Verify contact page
Given Lunch <"URL"> Application
When User click on contactus link
Then Verify contact page display

@test  
Scenario: Verify search result
Given Lunch <"URL"> Application
When User enter woman in search field
When User click on search button
Then Verify search result display

@test 
Scenario: Verify clicking Home icon return to home page
Given Lunch <"URL"> Application
When User click on contactus link
When Click Home Icon
Then Verify clicking Home icon return to home page

@test 
Scenario: Verify user login successfully
Given Lunch <"URL"> Application
When User click on SignIN link
When  Enter userName and password and click signin button
Then Verify user login successfully

