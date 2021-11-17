Feature: SignIn functionality

  Scenario Outline: Verify successful sign in
    Given User lauch an application
    When user enters "<Username>" and "<Password>"

    Examples: 
      | Username  |  | Password |
      | hkc@d.com |  | test123  |
      | sdr@c.com |  | abcdefg  |
