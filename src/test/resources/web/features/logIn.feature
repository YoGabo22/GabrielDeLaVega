@LogIn
Feature: Clockify log in

  @ToBeAutomated @LogInFromHomePage @Do
  Scenario: Access to Log in from clockify home page successfully
    Given The client is on clockify home page
    When The client click on LogIn button
    Then The client get access to clockify LogIn page

  @Smoke @Candidate @LogInManually
  Scenario Outline: The client manually log in to clockify successfully
    Given The client is on clockify log in page
    When The client click on 'Log in manually'
    And the client set the email "<email>"
    And the client set the password "<password>"
    And the client click on LogIn button
    Then The client is on the dashboard

    Examples:
      | email                  | password |
      | cfiguera83@gmail.com   | XXXXXX   |
      | cfiguera83@hotmail.com | XXXXXX   |