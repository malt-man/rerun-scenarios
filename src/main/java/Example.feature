@Test
Feature: rerun

  Scenario: Pass
    Given 1 cucumber
    When 2 cucumbers are added
    Then number of cucumbers is 3


  Scenario: Fail
    Given 1 cucumber
    When 0 cucumbers are added
    Then number of cucumbers is 2
