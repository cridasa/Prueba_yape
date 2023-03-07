Feature: RestApi - PUT - Update record
  I as an User
  Want to use the api
  To update booking record

  @service
  Scenario: update record PUT
    Given set the bases url "restful-booker API"
    When update record with "EndPoint PUT UpdateRecord"
    Then validate that statusCodes was <200>
