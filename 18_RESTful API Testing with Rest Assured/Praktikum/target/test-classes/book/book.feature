Feature: User
  As an admin
  I want to get detail book
  So that I can get data book

  Scenario: GET - As an admin I have to be able to get detail book
    Given I set an endpoint for GET detail book
    When I request GET the book
    Then I validate the status code is 200
    And validate the data detail book

  Scenario: GET - As an admin I have to be able to get All book
    Given I set an endpoint for GET all book
    When I request GET the book
    Then I validate the status code is 200

  Scenario: POST - As an admin I want to create new book with valid data book
    Given I set an endpoint for POST new book
    When I request POST new valid data book
    Then I validate the status code new book is 201
    And validate new data book

  Scenario: POST - As an admin I want to create new book with invalid data book
    Given I set an endpoint for POST new book
    When I request POST new invalid data book
    Then I validate the status code is 401

  Scenario: PUT -  As an admin I want to update data book with valid data book
    Given I set PUT api endpoints
    When I send PUT HTTP valid data request
    Then I validate the status code is 200
    And I receive valid data for updated book

  Scenario: PUT -  As an admin I want to update data book with invalid data book
    Given I set PUT api endpoints
    When I send PUT HTTP Invalid data request
    Then I validate the status code is 400

  Scenario: Delete -  As an admin I want to delete data book with valid data
    Given I set Delete api endpoints valid
    When I send Delete HTTP data request
    Then I validate the status code is 204

  Scenario: Delete -  As an admin I want to delete data book with invalid data
    Given I set Delete api endpoints invalid
    When I send Delete HTTP data request
    Then I validate the status code is 401
