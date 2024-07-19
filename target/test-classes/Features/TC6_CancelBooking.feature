@last
Feature: User should verify the cancel booking

  Scenario Outline: Verify User should have to book a hotel and change the booking and cancel booking for respective orderid
    Given User is on OMR login page
    When User Login with "<UserName>" and "<PassWord>"
    Then User should verify the after Login "Welcome Harikaran"
    When User should pass all the fields "<SelectState>" , "<SelectCity>" , "<SelectRoomType>" , "<Check-In>" , "<Check-Out>" , "<No.OfRooms>" , "<No.OfAdults>" and "<No.OfChildren>"
    Then User should verify after click the search and success message as "Select Hotel"
    And User should save the Hotel Name and Hotel Price
    When User should Click on the Hotel continue button
    Then User after click the Hotel continue alert pop up is display and click on ok button
    And User should verify the success message of "Book Hotel"
    When User should add the Guest details "<selectsalution>","<firstname>","<lastname>","<mobileno>" and "<Email>"
    And User should add the GST details "<EnterRegistrationNo>","<EnterCompanyName>" and "<EnterCompanyAddress>"
    And User should add the Special Request for "<SpecialRequest>"
    And User should add the Debit Card details for Payment with card type "<cardtype>"
      | selectcard | cardno           | cardname | month | year | cvv |
      | Visa       | 5555555555552222 | srini    | march | 2024 | 456 |
      | mastercard | 5555555555554444 | mani     | april | 2024 | 643 |
      | Amex       | 5555555555550000 | kavi     | may   | 2024 | 456 |
      | Discover   | 5555555555556666 | hari     | june  | 2024 | 879 |
    When User should verify the hotel confirmation "Booking is Confirmed" and save order id
    And User should verify the selected hotel is booked or not
    When User should navigate into the my booking page
    Then User should verify the "Bookings" is present or not
    When User should search the "<orderid>"
    Then User should verify the respective order id is present or not
    And User should verify the respective hotel name is present or not
    And User should verify the respective hotel price is present or not
    Then User edit the checkin date
    When User should verify the booking success message of "Booking updated successfully"
    When User should search the cancel id "<orderidforcancel>"
    Then User should verify the respective cancel order id is present or not
    And User should verify the respective cancel hotel name is present or not
    And User should verify the respective cancel hotel price is present or not
    Then User should verify cancel message "Your booking cancelled successfully"

    Examples: 
      | UserName                            | Password    | SelectState    | SelectCity | SelectRoomType | Check-In   | Check-Out  | No.OfRooms | No.OfAdults | No.OfChildren | selectsalution | firstname | lastname   | mobileno   | Email                               | EnterRegistrationNo | EnterCompanyName       | EnterCompanyAddress | SpecialRequest                   | cardtype | orderid     | orderidforcancel |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | Andhra Pradesh | Tirupati   | Deluxe         | 2024-05-09 | 2024-05-10 | 1-One      | 1-One       |             2 | Mr.            | Harikaran | Srinivasan | 9080277916 | harikaransrinivasan172000@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | need a parking for cars and bike | visa     | #JIYSF74586 | JIYSF74586       |

  @cancelExistingOrderId
  Scenario Outline: Verify User should have to cancel the existing orderid
     Given User is on OMR login page
    When User Login with valid "<UserName>" and "<Password>"
    Then User should verify the after Login "Welcome Harikaran"
    When User should navigate into the my Account page
    Then User should verify the "Bookings" is present or not
    When User should cancel the Existing id
    Then User should verify the cancel message "Your booking cancelled successfully"
    Examples: 
      | UserName                            | Password    |
      | harikaransrinivasan172000@gmail.com | Greens@1234 |

  @cancelFirstOrderId
  Scenario Outline: Verify User should have to book and cancel the first orderid
    Given User is on OMR login page
    When User Login with valid "<UserName>" and "<Password>"
    Then User should verify the after Login "Welcome Harikaran"
    When User should navigate into the my Account page
    Then User should verify the "Bookings" is present or not
    When User should cancel the firstorder id
    Then User should verify the cancel message "Your booking cancelled successfully"

    Examples: 
      | UserName                            | Password    |
      | harikaransrinivasan172000@gmail.com | Greens@1234 |
