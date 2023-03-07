Feature: RestApi - PATCH - Update record
  I as an User
  Want to use the api
  To update booking record

  @service
  Scenario: update record PATCH
    Given set this base url "restful-booker API"
    When patch update record with "EndPoint PATCH UpdateRecord"
    Then validate that statusCode was <200> response
