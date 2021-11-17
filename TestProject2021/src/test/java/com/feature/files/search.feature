@All
Feature: Amazon Search

@regression
  Scenario: Amazon Product search
    Given I have search field on amazon page
    When I search for a product name "Apple Macbook Pro" and price 100000
    Then Product name with "Apple Macbook Pro" should be displayed
    And Print below details
      | test1 | test2 | test3 | test3 | test4 |
      | test7 | test2 | test3 | test3 | test4 |
      | test6 | test2 | test3 | test3 | test4 |
    And Print below details with columns
      | first | 2nd   | 3rd   | 4th   | 5th   |
      | test7 | test2 | test3 | test3 | test4 |
      | test6 | test2 | test3 | test3 | test4 |
      
      @prod @smoke
        Scenario: Amazon Product search
    Given I have search field on amazon page
    When I search for a product name "Apple Macbook Pro" and price 100000
    Then Product name with "Apple Macbook Pro" should be displayed

      
      @smoke
      Scenario: Amazon Product search
    Given I have search field on amazon page
    When I search for a product name "Apple Macbook Pro" and price 100000
    Then Product name with "Apple Macbook Pro" should be displayed
    And Print below details with columns
      | first | 2nd   | 3rd   | 4th   | 5th   |
      | test7 | test2 | test3 | test3 | test4 |
      | test6 | test2 | test3 | test3 | test4 |
