Feature: OAuth Token Generation

  @smoke
  Scenario: Generate access token successfully
    Given OAuth server is available
    When I request an access token
    Then I should receive a valid token

@wip
  Scenario: Generate access token successfully 2
    Given OAuth server is available
    When I request an access token
    Then I should receive a valid token

@fast
  Scenario: Generate access token successfully 3
    Given OAuth server is available
    When I request an access token
    Then I should receive a valid token


@regression
  Scenario: Generate access token successfully 4
    Given OAuth server is available
    When I request an access token
    Then I should receive a valid token

