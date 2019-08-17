Feature: As a truck driver I should be able to access vehicle under Fleet module

  Background:
    Given truck driver is on login page

  @carInfo
  Scenario: when user click on any car on the grid ,
  system should display general information about the car

    When  truck driver logs in using credentials as "storemanager85" and "UserUser123"
    And  System should display the homepage
    Then truck driver sees all Vehicle info once navigates to Vehicle page
    And truck driver clicks on any car on the grid
    Then system should display general information about the car
