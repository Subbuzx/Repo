Feature: HRMS

  Scenario: Verify Title
    Given OpenApplication
    When openLinks
    And VerifyTitle
    Then CloseApplication
