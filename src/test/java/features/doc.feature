Feature: Automate Leaftap Application
@smoke
Scenario Outline: TC001_LogIn and LogOut

Given Launch ChromeBrowser and Load URL
And Enter Username as <username>
And Enter Password as <password>
When Click the LogIn button 
Then It's navigated HomePage
And Click the LogOut button
And Close browser

Examples: 
|username|password|
|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|
@wip
Scenario Outline: TC002_LogIn and LogOut for Failure

Given Launch ChromeBrowser and Load URL
And Enter Username as <username>
And Enter Password as <password>
When Click the LogIn button 
Then It's navigated same page
But Verify error message
And Close browser

Examples: 
|username|password|
|Sumaiya|crmsfa|
|DemoCSR|crmsfa1|

@regression
Scenario Outline: TC003_CreateLead

Given Launch ChromeBrowser and Load URL
	And Enter Username as DemoSalesManager
    And Enter Password as crmsfa
	And Click the LogIn button 
	And click CRMSFA
	And click leads link
	When click createLead	
	And enter the company as <company>
	And enter the firstname as <fName>
	And enter the lastname as <lName>
	And choose source as Website
	And click the create lead button
	Then its navigated ViewLeadPage 
	And verify the firstname
	And Close browser
	
	Examples: 
	|company|fName|lName|
	|ABC|Hema|Mali|
	|XYZ|Hema1|Mali|
	|TCS|Hema2|Mali|