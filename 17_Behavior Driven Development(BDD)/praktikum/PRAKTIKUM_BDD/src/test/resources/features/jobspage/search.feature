Feature: Search
  As a user
  I want to find jobs
  so that I can see the jobs I'm looking for

  Scenario: Search jobs
    Given I go to jobs page
    When Enter jobs and location into the Search text box field
    And Click button search
    Then All jobs according to location will be displayed

    