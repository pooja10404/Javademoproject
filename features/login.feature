@RunWith
Feature: Login to OrangeHRM Application
	Scenario: login with valid credentials
	Given User enters valid login credentials
	Then User should be able to login sucessfully