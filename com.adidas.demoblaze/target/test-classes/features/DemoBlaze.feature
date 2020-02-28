@Regression
Feature: DemoBlaze Page Test Cases 
Background:
	Given DemoBlaze Web Page is opened

@TC_01
Scenario: Verify that the amount is correct at the checkout 
	When I click on "Laptops"
	And I click on "Sony vaio i5"
	And I note down the price
	And I click on "Add to cart"
	And I click on OK in alertbox
	And I go to Homepage
	And I click on "Laptops"
	And I click on "Dell i7 8gb"
	And I click on "Add to cart"
	And I click on OK in alertbox
	And I click on "Cart"
	And I delete "Dell i7 8gb" 
	And I click on button "Place Order"
	And I Enter the name as "Archit Goel"
	And I Enter the Country as "India"
	And I Enter the City as "Gurgaon"
	And I Enter the Credit Card as "1234567812345678"
	And I Enter the Month as "07"
	And I Enter the Year as "2020"
	And I click on button "Purchase"
	Then I capture the Purchase Id
	And I capture the Amount
	And I validate the Amount should be correct
	And I click on button "OK"
	
