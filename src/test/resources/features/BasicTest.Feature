Feature: Basic feature

  Background:
    Given User opens basic page
    And User accept cookies

  Scenario: User switch language to English
    Given User selects English language from dropdown
    And Selected Language is English

  Scenario: User opens Pepsico page
    Given User opens Customer Cases menu
    And User selects Pepsico menu
    Then Pepsico Page is displayed

  Scenario: User selects Next case
    Given User opens Customer Cases menu
    And User selects Pepsico menu
    And User opens Next Case
    Then BakerTilly page is displayed