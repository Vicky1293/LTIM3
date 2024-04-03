Feature: Testing APIs provided by https://restful-booker.herokuapp.com

#  Background:
#    * url 'https://restful-booker.herokuapp.com'

  Background:
    * url 'https://restful-booker.herokuapp.com'
  Scenario: Perform a POST request
    Given path '/booking'
    And header Content-Type = 'application/json'
    And request '{"username" : "admin","password" : "password123"}'
    When method post
    Then status 200




#  Scenario: GET request to get all bookings
#    Given path '/booking'
#    When method GET
#    Then status 200
#
#  Scenario: POST request to create a booking
#    Given path '/booking'
#    And request  '{"firstname" : "Vikram","lastname" : "Katkar","totalprice" : 114,"depositpaid" : true,"bookingdates" : {"checkin" : "2018-03-01","checkout" : "2019-01-01"},"additionalneeds" : "Breakfast"}'
#    When method POST
#    Then status 200


#  Scenario: PUT request to update a booking
#    Given path '/booking/1'
#    And request '{ "firstname": "Jane", "lastname": "Doe", "totalprice": 150, "depositpaid": true, "bookingdates": { "checkin": "2024-03-06", "checkout": "2024-03-07" }, "additionalneeds": "Lunch" }'
#    When method PUT
#    Then status 200

#  Scenario: PATCH request to partially update a booking
#    Given path '/booking/1'
#    And request '{ "totalprice": 200 }'
#    When method PATCH
#    Then status 200
#
#  Scenario: DELETE request to delete a booking
#    Given path '/booking/1'
#    When method DELETE
#    Then status 200