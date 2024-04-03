Feature: Testing API calls using Karate framework

  Background:
    * url 'https://restful-booker.herokuapp.com'

  Scenario: Perform a Patch request
    Given path 'booking/774'
    And request '{"totalprice":707}'
    And header Content-Type  = 'application/json'
    And header Accept = 'application/json'
    And header Authorization = 'Basic YWRtaW46cGFzc3dvcmQxMjM='
    When method patch
    Then status 200