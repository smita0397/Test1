
Feature: Application is running without login

	Scenario: Application should be able to function without log in.
	
	Given application is online
	When application url "www.flipkart.com" opens
	And user able to search product.
	
	
	
	
	