Feature: RestApi - GET - Ping
  I as an User
  Want to use the api
  To do a ping

  @service
  Scenario: create ping with GET request
    Given sets the base url "restful-booker API"
    When generates with "End Point GET Ping"
    Then validate that statusCode was <201>