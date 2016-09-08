@SmartPersonlizationEmailPageTest
Feature: Smart PersonlizationEmai title page
	I want to use this template for my feature file

@SmartPersonlizationEmailPageTest
Scenario Outline: verify title page 
Given  I navigate to "siteURL" on "<browser>"
When   I enter  "searchbox_Selector" as "smartfocus.co.uk"
And    I click "searchButton"
When  I click on the "Smartfocuslink"
Then   I navigate to  the "cloadMenu_box"
And    I hover on "cloadMenu_box"
And    I   click on the "smartPersonaliseEmail"
Then   I  "pageTitle" element should be present
Examples:
|browser | 
|Mozilla |
#|SiteName  		    
#|	VerificationObject |
 
#|smartfocus.co.uk		|    TitlePage 			   |