Feature: Karofi Login Feature

  @TC01
  Scenario: Verify Login screen match design when Location = Vietnam
    Given Karofi app is opened
    When I select Vietnam as location
    Then Vietnam login screen should be displayed correctly

  @TC02
  Scenario: Verify Login screen matches design when Location is not Vietnam
    Given Karofi app is opened
    When I select "England" as location
    Then Login screen for other countries should be displayed correctly

  @TC03
  Scenario: Successful login with valid credentials for Vietnam
    Given Karofi app is opened
    And I select Vietnam as location
    When I login with phone number "0966179292" and password "abc123"
    Then I should be logged in and redirected to Home screen
