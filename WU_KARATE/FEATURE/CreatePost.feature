Feature: Testing API calls using Karate framework

  Background:
    * url 'https://restful-booker.herokuapp.com'

  Scenario: Perform a POST request
    Given path '/booking'
    And request '{"firstname":"Josh","lastname":"Allen","totalprice":111,"depositpaid":true,"bookingdates":{"checkin":"2018-01-01","checkout":"2019-01-01"},"additionalneeds":"super bowls"}'
    And header Content-Type = 'application/json'
    And header Accept = 'application/json'
    When method post
    Then status 200