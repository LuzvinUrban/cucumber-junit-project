@smoke @Regression @login
Feature: Library app login feature
  User Story:

  As a user, I should be able to log in with correct credentials to different accounts and dashboards snd should be displayed

  Accounts are : librarian, student, admin


  Background: For the scenarios in the feature file, user is expected to be log in page
    Given user is on the library login page


  @smoke @librarian @employee
  Scenario: Login as a librarian
    Given user is on the library login page
    When user enters librarian username
    And user enters librarian password
    Then user should see dashboard

@student @db
Scenario: Login as a student
  Given user is on the library login page
  When user enters student username
  And user enters student password
  Then user should see dashboard

  @admin @employee @smoke
Scenario: Log in as admin
  Given user is on the library login page
  When user enters admin username
  And user enters admin password
  Then user should see dashboard

