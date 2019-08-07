@login
Feature: Login page

  As a User, when I enter valid user credentials,
  I should be able to login

  Background:
    Given The user is on login page


  @truckdriver
  Scenario: Login as truck driver


    When  User enters credentials as "user187" and "UserUser123"
    Then  clicks on login button
    And  System should display the homepage
    Then  title should be displayed as "title"


  @salesmanager
  Scenario: Login as sales manager


    When  User enters credentials as "salesmanager287" and "UserUser123"
    Then  clicks on login button
    And System should display the homepage
    Then  title should be displayed as "title"


  @storemanager
  Scenario: Login as store manager


    When  User enters credentials as "storemanager223" and "UserUser123"
    Then  clicks on login button
    And System should display the homepage
    Then  title should be displayed as "title"