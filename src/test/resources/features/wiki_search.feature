Feature: Wikipedia Search Functionality and verifications

  Background:
    Given User is on Wikipedia home page

  Scenario:  Wikipedia Search Functionality Title Verification
  // Given User is on Wikipedia home page
    When User types Steve Jobs in the wiki search box
    And User clicks wiki search button
    Then User sees Steve Jobs is in the wiki title


  Scenario:  Wikipedia Search Functionality Title Verification
  //Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  @ScenarioOutlinePractice
  Scenario Outline: Wikipedia Search Functionality Title Verification with using DTT
  //Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title



    Examples:
      | searchValue       | expectedTitle     |
      | Steve Jobs        | Steve Jobs        |
      | Bob Marley        | Bob Marley        |
      | Lady Gaga         | Lady Gaga         |
      | Cristiano Ronaldo | Cristiano Ronaldo |
