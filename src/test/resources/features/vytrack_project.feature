Feature: User should be able to click Export Grid dropdown
  User story: As a user, when I am on Vytrack Fleet Vehicles, I should be able to see Export Grid dropdown,
  Refresh, Reset and Grid Settings Buttons.

  @smoke
  Scenario: Click Export Grid
    Given User on the Vytrack login page
    When User enter the username
    When User enter the password
    Then User click on login
    Then User click on vehicles
    Then User click on export grid



