Feature: Hotal Booking In Adactin Application 


@Smoketest 
Scenario Outline: User Login In The Web Application 

	Given user Launch The Application 
	
	When user Enter The "<Username>" In Username Fiels 
	
	And user Enter The "<Password>" In Password Fiels 
	
	Then user Click on The Login Button And It Navigates To The Search Hotel Page 
	
	Examples:
	|Username|Password|
	|aaaa|123|
	|ccc|456|
	|firewall|B9Y7HQ|
	
@Sanitytest 
Scenario:
User Search And Select the Hotel Rooms And Details In The Seatch Hotel Page 

	When user Select The Location In Select Location Fiels 
	
	Then user Click On The Seatch Button And It Navigates To The Select Hotel Page 
	
Scenario: User Select The Hotel In Select Hotel Page 

	When user Select The Hotels In Select Hotel Fiels 
	
	Then user Click On The Continue Button And It Navigates To The Booking Hotel Page 
	
	
Scenario: 

	When user Enter The First Name In First Name Fiels 
	
	And user Enter The Last Name in Last Name Fiels 
	
	And user Enter The Billing Address In Billing Address Fiels 
	
	And user Enter The Credit Card No In Credit Card No Fiels 
	
	And user Select The Credit Card Type In Credit Card Type Fiels 
	
	And user Select The Expiry Month In The Expiry Month Fiels 
	
	And user Select The Expiry Year In The Expriry Year Fiels 
	
	And user Enter The Cvv Number In Cvv Number Fiels 
	
	Then user Click Book Now Button And it Will Naviget To Booking Confirmation Page 
	
Scenario: 

	When user Click My Itinerary Button 
	
	Then user Click The Log Out Button 
