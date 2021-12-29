Feature: SearchGoogle
  Scenario: I want to use feature search on Goole
    Given I open browser
    And Open Google Website
    And Located on google website
    When I search "Akhdan Pangestuaji"
    Then Showing result related with "Akhdan Pangestuaji"