
@Adactin
Feature: Automation for Adactin hotel Application

	Background:
	
	 	Given User launch "edge" browser
	 	And User navigate to url "http://adactinhotelapp.com/"
		Given User enter the username "jokee10699"
   	And User enter the password "000000"
   	Then User click the login button	
 
 @TC-101
 Scenario Outline: To verify whether the check-out date field accepts a later date than check-In date 
  
  Given User select the Location as in test data.
  And User select the Hotel as in test data.
  And User select the Room Type as in test data.
  And User select the No-of rooms as in test data.
  And User Enter check-indate <check-In>  later than the check-outdate <check-Out> field as in test data 
  And User click the search Button
	Then User Verify that system gives an error saying <error>
 	
 	Examples:
 	|check-In|check-Out|error|
 	|"29/01/2023"|"27/01/2023"|"Check-In Date shall be before than Check-Out Date"|
 	|"28/01/2023"|"26/01/2023"|"Check-In Date shall be before than Check-Out Date"|
 	

  																													 
@TC-102
Scenario: To verify whether locations in Select Hotel page are displayed according to the location selected 
							in Search Hotel.
					
	Given User select the Location as in test data.
  And User select the Hotel as in test data.
  And User select the Room Type as in test data.
  And User select the No-of rooms as in test data.
  And user enter the check-In date "25/01/2023"
	And user enter the check-Out date "26/01/2023"
	And User click the search Button		
	Then user verify locations selected in select Hotel as same as Search Hotel
	
	
					





