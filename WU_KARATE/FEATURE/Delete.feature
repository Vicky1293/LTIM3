Feature: Testing API calls using Karate framework

  Background:
    * url 'https://restful-booker.herokuapp.com'
  Scenario: Perform a delete request
    Given path 'booking/774'
    And header Cookie = token="57ba0dece7546b6"
    And header Authorization = 'Basic YWRtaW46cGFzc3dvcmQxMjM='
    When method delete
    Then status 201