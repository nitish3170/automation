Feature: LoggedIn User View
  Scenario: Validate user after login
    Given User navigates to the Login Page
    When User successfully enters the log in details
    Then User should be able to view the product category page
