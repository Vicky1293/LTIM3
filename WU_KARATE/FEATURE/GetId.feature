Feature: Testing API calls using Karate framework

  Background:
    * url 'https://restful-booker.herokuapp.com'

  Scenario: Perform a get request
    Given path 'booking/1596'
    And header Accept = 'application/json'
    When method get
    Then status 200