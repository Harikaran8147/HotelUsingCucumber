Feature: User should verify the change booking

  @changeBooking
  Scenario Outline: Verify User should have to book a hotel and modify the change booking for respective orderid
    Given User is on OMR login page
    When User Login with valid "<UserName>" and "<Password>"
    Then User should verify the after Login "Welcome Harikaran"
    When User should pass all the fields "<SelectState>" , "<SelectCity>" , "<SelectRoomType>" , "<Check-In>" , "<Check-Out>" , "<No.OfRooms>" , "<No.OfAdults>" and "<No.OfChildren>"
    Then User should verify after click the search and success message as "Select Hotel"
    And User should save the first Hotel Name and Hotel Price
    When User should Click the continue button
    Then User after click the continue alert pop up is display and click on ok button
    And User should verify the success message of "Book Hotel"
    When User should add the Guest details "<selectsalution>","<firstname>","<lastname>","<mobileno>" and "<Email>"
    And User should add the GST details "<EnterRegistrationNo>","<EnterCompanyName>" and "<EnterCompanyAddress>"
    And User should add the Special Request for "<SpecialRequest>"
    And User should add the Debit Card details for Payment with card type "<cardtype>"
      | selectcard | cardnum          | cardname | month | year | cvv |
      | Visa       | 5555555555552222 | srini    | March | 2025 | 456 |
      | mastercard | 5555555555554444 | mani     | april | 2025 | 643 |
      | Amex       | 5555555555550000 | kavi     | may   | 2025 | 456 |
      | Discover   | 5555555555556666 | hari     | june  | 2025 | 879 |
    When User should verify the hotel confirmation "Booking is Confirmed" and save order id
    And User should verify the selected hotel is booked or not
    When User should navigate into the my booking page
    Then User should verify the "Bookings" is present or not
    When User should search the "<orderid>"
    Then User should verify the respective order id,hotel name and hotel price is present or not
    Then User edit the checkin date
    When User should verify the booking success message of "Booking updated successfully"

    Examples: 
      | UserName                            | Password    | SelectState    | SelectCity | SelectRoomType | Check-In   | Check-Out  | No.OfRooms | No.OfAdults | No.OfChildren | selectsalution | firstname | lastname   | mobileno   | Email                               | EnterRegistrationNo | EnterCompanyName       | EnterCompanyAddress | SpecialRequest                   | cardtype   | orderid     |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | Andhra Pradesh | Tirupati   | Deluxe         | 2024-05-09 | 2024-05-10 | 1-One      | 1-One       |             2 | Mr.            | Harikaran | Srinivasan | 9080277916 | harikaransrinivasan172000@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | need a parking for cars and bike | Debit Card | #SUZDR80007 |

  @ExistingOrderId
  Scenario Outline: Verify User should have to modify the checkin date for existing order id
    Given User is on OMR login page
    When User Login with valid "<UserName>" and "<Password>"
    Then User should verify the after Login "Welcome Harikaran"
    When User should navigate into the my Account page
    Then User should verify the "Bookings" is present or not
    When User should search the "<orderid>"
    When User edit the existing orderid checkin date
    When User should verify the booking success message of "Booking updated successfully"

    Examples: 
      | UserName                            | Password    | orderid     |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | #LPDLS59538 |

  @FirstOrderId
  Scenario Outline: Verify User should have to modify checkin date for first displayed order id
    Given User is on OMR login page
    When User Login with valid "<UserName>" and "<Password>"
    Then User should verify the after Login "Welcome Harikaran"
    When User should navigate into the my Account page
    Then User should verify the "Bookings" is present or not
    When User should search the "<orderid>"
    When User edit the first displayed orderid and checkin date
    When User should verify the booking success message of "Booking updated successfully"

    Examples: 
      | UserName                            | Password    | orderid     |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | #XKBFH01182 |
