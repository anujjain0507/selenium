Feature: DGSL Application Test 

Scenario: Validate dgsl Home Page Test 

	Given user open the browser 
	Then user is on login page 
	Then user log into app 
	Then validate logged in user name 
	Then verify the activity matrix link 
	Then verify the inbox link 
	Then verify the search link 
	Then verify the vendor tab 
	Then verify the my profile tab 
	
Scenario Outline: Validate dgsl Vendor Manual Registration Test 

	Given User click on the Vendor Registration Menu 
	Then Click on the add button 
	Then enter the "<Vendor name>" and "<commodity>" and "<contact person>" and"<emailid>" and "<phone no>" 
	Then select the "<activity>" 
	Then submit the record 
	Then close the transaction 
	Then Wait for 5 sec 
	Then open the Specific records 
	Then select the next "<activity2"> 
	Then submit the transaction 
	Then close transaction 
	
	Examples: 
		|	Vendor name	|	commodity	|	contact person	|	emailid						|	phone no	|	activity			|	activity2	|
		|	MSC			|	Electrical	|	pooja			|	pooja.patil@datamatics.com	|	1236547895	|	Self Registration	|	Approve		|