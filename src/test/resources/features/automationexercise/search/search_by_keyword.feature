@Search
Feature: Search by keyword from the home page
  As a non connected user
  I need to buy new product
  So I want to search it in order to know its price and details

  @search=unknownUser
  Rule: a non connected user should be able to search for a product from the home page

  @search
  Example: Searching for a 'jeans'
    Given John Do is looking for a product on automationexercise.com
    When he looks up "Jeans"
    Then he should see information about "Jeans"

  @search_ScenarioOutline
  Scenario Outline: Searching for a product
    Given John Do is looking for a product on automationexercise.com
    When he looks up "<term>"
    Then he should see information about "<term>"

    Examples:
      | term   |
      | Jeans  |
      | Frozen |
      | Saree  |

