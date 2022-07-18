@Regression
Feature: Library app login feature
  User Story:As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are: librarian, student, admin

  Background: For each scenario user is on Library login page
    Given user is on the library login page

  @librarian @employee @smoke

  Scenario: Login as librarian
    Given user on the library login page
    When user enter librarian username
    And user enters librarian password
    Then user should see dashboard

 @student @smoke

 Scenario: Login as student
  Given user on the library login page
  When user enter student username
  And user enters student password
  Then user should see dashboard


   Scenario: Login as admin
     Given user on the library login page
     When user enter admin username
     And user enters admin password
     Then user should see dashboard