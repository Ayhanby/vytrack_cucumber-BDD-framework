Feature:   As a user, I should be able to see
  the homepage title

  @homepagetitle

  Scenario: User logs into homepage successfully

    Given user opens login page
    When User enters credentials as "user187" and "UserUser123"
    Then  clicks on login button
    And  System should display the homepage
    Then title should be displayed as "title"