Feature: Sause demo application test

  Scenario: login, sort, add products, checkout and finish purchase
    Given I navigate to sauce demo web site
    When I enter user name and password
    And I click on the login button
    Then I sort the products from high to low
    Then I add the cheapest product to basket
    Then I add the second costliest product to basket
    Then I open the basket
    Then I click on checkout button
    Then I enter contact details
    Then I click on continue button
    Then I click on finish button 
    And I close the browser