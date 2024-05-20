Feature: Title of your feature
  I want to use this template for my feature file

  @Buynewitem
  Scenario Outline: Buy new item from Luma website
    Given I want to go to Luma homepage
    And I want to go to women section and buy pants
    When I want to select an item
    And I want to select size and color
    And I want to add the item into the cart
    Then I want to go to cart
    And I want to do the checkout
    And I want to add shipping address as "<email>" and "<firstname>" and "<lastname>" and "<streetaddress>" and "<city>" and "<state>" and "<zipcode>" and "<country>" and "<phoneno>"
    Then I want to place the order

    Examples: 
      | email            | firstname | lastname | streetaddress                 | city         | state   | zipcode | country       | phoneno |
      | mpande@gmail.com | Manali    | Pande    | B-102,Atlante,Pimple Saudagar | Indianapolis | Indiana |  411044 | United States |  787897 |
