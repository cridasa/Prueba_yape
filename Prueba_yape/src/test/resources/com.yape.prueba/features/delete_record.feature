Feature: RestApi - DELETE - record
  I as an User
  Want to use the api
  To delete booking record

  @service
  Scenario: delete record DELETE
    Given set the bases this url "restful-booker API"
    When delete record with "EndPoint DELETE Record"
    Then validate that statusCodes response was <201>
