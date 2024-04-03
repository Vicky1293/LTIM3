Feature: Testing API calls using Karate framework

  Background:
    * url 'https://restful-booker.herokuapp.com'

  Scenario: Perform a GET request
    Given path '/booking'
    When method get
    Then status 200