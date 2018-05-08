Feature:  IRCTC Application Test

Scenario: To verify the IRCTC login

Given  user open the browser
When user enter the username and password
Then user wait for the enter capitcha
Then user click on the Login Button

Scenario: To find the train
When user enter the from station
Then user enter the To station
Then user select the date
Then user click on the search button

