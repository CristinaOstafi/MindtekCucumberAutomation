@editYard
Feature: Validating Edited Yard with Database
  Background: Logging in to Elar Logistics
    Given User navigates to Elar Logistics application
    When User logs in to Elar Logistics with username "student@mindtekbootcamp.com" and password "ilovejava"
    And User clicks on log in button
    Then User clicks on Yards tab

    Scenario: Create Yard
      Given User clicks on Add yard button
      When User fills out all required fields
        | Name           | City    | State | Zip code | Spots |
        | Imagine Dragon | Chicago | IL    | 6111     | 201   |
      Then User clicks on Add Yard saver