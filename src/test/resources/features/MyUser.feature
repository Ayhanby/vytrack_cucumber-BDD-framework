Feature: My user information

  Background:
    Given The user is on login page

  @wip
  Scenario: Quick Launchpad on Dashboard

    When  User enters credentials as "storemanager85" and "UserUser123"
    Then  clicks on login button
    And  System should display the homepage
    Then Click on Username
    And  Select My User option
    Then User should see the my user general info


      |Username       | storemanager85                                                 |
      |Birthday       | N/A                                                            |
      |Emails         | storemanager85@cybertekschool.com Hangouts CallHangouts Call   |
      |Phone          |  N/A                                                           |
      |Business Units |  N/A                                                           |
      |Title          |  N/A                                                           |
