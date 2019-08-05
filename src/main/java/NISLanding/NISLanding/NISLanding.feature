Feature: NISLanding

Scenario: Successful login into the Landing Page
When User is in the login page 
Then User enters username and password
Then Message displayed login successfully
Then Verify the UI of landing home page
