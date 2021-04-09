Feature: Basic feature
  Background:
    Given User opens basic page

    Scenario: User switch language to English

      Given User selects English language from dropdown
      And Selected Language is English

      Scenario: User opens Pepsico page

        Given User presses Customer Cases menu
        And User selects Pepsico menu
        Then Pepsico Page header is correct

        Scenario: User selects Next case

          Given User opens Next Case
          Then BakerTilly header is correct