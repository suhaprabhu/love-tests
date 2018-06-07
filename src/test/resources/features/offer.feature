Feature: Offer Summary

Scenario: I should see a previous searched hotel in home page

Given I visit the offer summary page
    And I go home
    And I check still interested section for "The Bay Hotel And Suites"
    And I book the room
    And I see the offer summary page again

Given I visit the home page
    And I select destination "Spain"