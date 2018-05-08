Feature: Manual Vendor Creation

Scenario: Manual Vendor Creation scenario

Given User go in login page
When login page titlt is IPP
Then enters username and password
|	username	|	password		|
| 	pruser1		|	Sysadmin@123	|
Then click on Login button
Then wait for Inbox Page
Then Click on vendor Registration page
Then wait for the add button
Then click on the add button
Then enters Vendor data
| vendorname	|	Commodity	 	|	ContactPerson		|	Email							|	PhoneNumber		|
| Datamatics	|	Software	 	|	Jyoti Rasker		|	jyoti.raskar@datamatics.com		|	9874563210		|
Then select the activity name
Then click on the submit button
Then Close browser
