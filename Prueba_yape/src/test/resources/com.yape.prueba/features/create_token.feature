Feature: RestApi - POST - Create token
  I as an User
  Want to use the api
  To generate a token

  @service
  Scenario: create token with POST request
    Given set the base url "restful-booker API"
    When generates the token with "EndPoint POST CreateToken"
    Then validates that statusCode was <200>
    And response contains field "token"
