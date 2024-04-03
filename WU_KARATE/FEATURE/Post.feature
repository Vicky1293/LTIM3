Feature: Testing API calls using Karate framework

  Background:
    * url 'https://restful-booker.herokuapp.com'

  Scenario: Perform a POST request
    Given path '/auth'
    And request '{"username" : "admin","password" : "password123"}'
    And header Content-Type = 'application/json'
    When method post
    Then status 200