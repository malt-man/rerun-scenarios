@Test
Feature: Example
  Passed scenarios are re-run when executing via cucumber.options="--tags @RunThis".

  @RunThis
  Scenario: Pass
    Given 1 cucumber
    When 2 cucumbers are added
    Then number of cucumbers is 3

  @RunThis
  Scenario: Fail
    Given 1 cucumber
    When 0 cucumbers are added
    Then number of cucumbers is 2
