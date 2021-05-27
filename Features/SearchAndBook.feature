Feature: demo portal automation book ticket

Scenario Outline: book a flight ticket for source <departure> and destination <destination>

        Given user navigate to flight booking screen
When user select the departure "<departure>" city
And user select destination "<destination>" city
And Search for flight
Then User Should be able to see the search result

Examples:
|departure  |destination |
        |Paris  |Rome|
        |Portland |London |



Scenario Outline: book a flight ticket for source <departure> and destination <destination>

        Given user navigate to flight booking screen
When user select the departure "<departure>" city
And user select destination "<destination>" city
And Search for flight
And user select a flight and supply user details
Then user should be able to book the flight

Examples:
|departure  |destination |
        |Paris  |Rome|
        |Portland |London |