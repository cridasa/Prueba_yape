Feature: Booking Search
  Me as a Booking user
  Want Enter the platform and reserve
  For access to different products of Booking

  @WebHappyPath
  Scenario Outline: Booking Search Successful
    Given "QA" Make a reservation in "Booking Page"
    When Enter a <destination> the <initial> date and the <final> date
    And Select <room>  for number <adults> and number <child>
    Then can display the <value> of the room

    Examples:
      | destination | initial    | final      | room | adults | child | value  |
      | Cusco       | 14/03/2023 | 28/03/2023 | 1    | 2      | 1     | COP 169.660 |

  @WebUnhappyPath
  Scenario Outline: Booking Search date incorrect
    Given "QA" Make a reservation in "Booking Page"
    When Enter a <destination> the <initial> date and the <final> date
    And Select <room>  for number <adults> and number <child>
    Then can display the message date is not correct

    Examples:
      | destination | initial    | final      | room | adults | child |
      | Cusco       | 14/02/2023 | 28/02/2023 | 1    | 2      | 1     |