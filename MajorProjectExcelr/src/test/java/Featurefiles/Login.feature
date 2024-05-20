Feature: Login to the user account
  I want to use this template for my feature file

  @loginuser
  Scenario: Login to the account
    Given I am visiting sign in page of Luma website
    When I navigate to sign in page
    And I add sign in information as 'mpande@gmail.com' and 'password_123'
    Then I want to get logged in to my account
    And I check the outcomes
