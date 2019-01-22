#Author: shaikh@kencloud.co.in
#Keywords Summary : Login Test
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Dolna Test Feature
  I want to use this template for my feature file

  @tag1
  Scenario: Login Scenario
    Given User is already on the Login Page
    #And some other precondition
    When Title of the Login Page is #1 Free CRM software in the cloud for sales and service
    Then user enters username	and password
    Then Click on the Login Button
    Then User is on Home Page
    #And Check the Home page title



 
