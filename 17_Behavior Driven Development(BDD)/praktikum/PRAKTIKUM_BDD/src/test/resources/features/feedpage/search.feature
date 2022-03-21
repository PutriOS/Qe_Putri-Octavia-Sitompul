Feature: Search
  As a user
  I want to find people
  so that I can see the person with the name I'm looking for

  Scenario: Search person
    Given I go to feed page
    When Enter name into the Search text box field
    And Search with enter keyword
    Then all names will be displayed

