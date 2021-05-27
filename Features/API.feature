Feature: API portal automation book ticket

Scenario Outline: API testing

        Given user hit spacex api
When user receives the responce with "<code>"
Then User Should be able to see the flight number

Examples:
|code  |
        |200  |
