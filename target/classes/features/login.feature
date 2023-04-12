Feature: Login User HRM
  Scenario: User valid login into web HRM
    Given User open browser and url
    When User enter valid username
    And User enter valid password
    And User click button login
    Then User go to page dashboard

    Scenario: User logout
      When User click user dropdown
      And User click button logout
      Then User get logo orange HRM

  Scenario: User invalid login into web HRM
    When User enter invalid username
    And User enter invalid password
    And User click button login
    Then User get message invalid credential

  Scenario: User empty field web HRM
    Given User refresh web HRM
    When User empty username
    And User empty password
    And User click button login
    Then User get message required