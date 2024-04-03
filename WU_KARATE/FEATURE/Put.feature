Feature: Testing API calls using Karate framework

  Background:
    * url 'https://restful-booker.herokuapp.com'
  Scenario: Perform a Put request
    Given path 'booking/774'
    And request '{"firstname":"Josh","lastname":"chavan","totalprice":111,"depositpaid":true,"bookingdates":{"checkin":"2018-01-01","checkout":"2019-01-01"},"additionalneeds":"super bowls"}'
    And header Content-Type  = 'application/json'
    And header Accept = 'application/json'
    And header Authorization = 'Basic YWRtaW46cGFzc3dvcmQxMjM='
    When method put
    Then status 200
