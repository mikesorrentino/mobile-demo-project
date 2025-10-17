Feature: MainFeatureTest.feature

  @Test
  Scenario: Test scenario
    Given The user installed the application
    When The user clicks on the GET Started button
    When The user adds account number, username and password and clicks login
    Then Verify user was taken to Location selection screen
