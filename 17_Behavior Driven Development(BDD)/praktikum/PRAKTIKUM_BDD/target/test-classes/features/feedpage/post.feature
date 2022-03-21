Feature: Post
  As a user
  I want to make a post
  so that I can share my post with everyone

  Scenario: Post a photo
    Given I am in feed page
    When I click Start a post button
    And click photo icon to upload photo
    And click done button
    And click post button
    Then the photo uploaded successfully is displayed

  Scenario: Post a vidio
    Given I go to feed page
    When I click Start a post button
    And click vidio icon to upload vidio
    And click done button
    And click post button
    Then the vidio uploaded successfully is displayed

  Scenario: Post a document
    Given I go to feed page
    When I click Start a post button
    And click document icon to upload document
    And click done button
    And click post button
    Then the document uploaded successfully is displayed