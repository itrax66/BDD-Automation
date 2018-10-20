# new feature
# Tags: optional

Feature: Testing the sign up option

  Scenario: Creating a new user
    Given I am in the Sign Up page
    When I submit the first name "itay"
    And I submit the last name "stainfeld"
    And I submit the email adress "hello@walla.com"
    And I submit the phone 1 "12321321123"
    And I submit the phone 2 "324324234234"
    And I submit the job role "Partner/Integrator"