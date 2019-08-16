Feature: Quick Launchpad

  Background:
    Given The user is on login page

  @quicklaunchpad
  Scenario: Quick Launchpad on Dashboard

    When  User enters credentials as "storemanager85" and "UserUser123"
    Then  clicks on login button
    And  System should display the homepage
    Then user goes to the "Dashboards" page
    Then user should see quick launchpad

      |Accounts   | Contacts    |  Opportunities  |
