
Feature: Create new user account
  I want to use this template for my feature file

  @Createacc
  Scenario: Create user account
    Given I am visiting home page of Luma website
    And I navigate to create user account page
    When I add personal information as 'Manali' and 'Pande'
    And I add sign in information as 'mpande@gmail.com' and 'password_123' and 'password_123'
    Then I want to create an account
    And I check the outcomes

