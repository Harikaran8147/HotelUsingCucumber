Feature: User should verify the Book Hotel page

  @BookHotel
  Scenario Outline: Verify User should enter all fields and verify Book Hotel Page including GST with special request using debit card
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

    Examples: 
      | UserName                            | Password    | SelectState    | SelectCity | SelectRoomType | Check-In   | Check-Out  | No.OfRooms | No.OfAdults | No.OfChildren | selectsalution | firstname | lastname   | mobileno   | Email                               | EnterRegistrationNo | EnterCompanyName       | EnterCompanyAddress | SpecialRequest                   | cardtype   |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | Andhra Pradesh | Tirupati   | Deluxe         | 2025-05-09 | 2025-05-10 | 1-One      | 1-One       |             2 | Mr.            | Harikaran | Srinivasan | 9080277916 | harikaransrinivasan172000@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | need a parking for cars and bike | Debit Card |

  @BK
  Scenario Outline: Verify User should enter all fields and verify Book Hotel Page including GST with special request using credit card
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
    And User should add the Credit Card details for Payment with card type "<cardtype>"
      | selectcard | cardnum          | cardname | month | year | cvv |
      | Visa       | 5555555555552222 | srini    | March | 2025 | 456 |
      | mastercard | 5555555555554444 | mani     | april | 2025 | 643 |
      | Amex       | 5555555555550000 | kavi     | may   | 2025 | 456 |
      | Discover   | 5555555555556666 | hari     | june  | 2025 | 879 |
    When User should verify the hotel confirmation "Booking is Confirmed" and save order id
    And User should verify the selected hotel is booked or not

    Examples: 
      | UserName                            | Password    | SelectState    | SelectCity | SelectRoomType | Check-In   | Check-Out  | No.OfRooms | No.OfAdults | No.OfChildren | selectsalution | firstname | lastname   | mobileno   | Email                               | EnterRegistrationNo | EnterCompanyName       | EnterCompanyAddress | SpecialRequest                   | cardtype    |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | Andhra Pradesh | Tirupati   | Deluxe         | 2025-05-09 | 2025-05-10 | 1-One      | 1-One       |             2 | Mr.            | Harikaran | Srinivasan | 9080277916 | harikaransrinivasan172000@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | need a parking for cars and bike | Credit Card |

  @withoutspreq
  Scenario Outline: Verify User should enter all fields and verify Book Hotel Page including GST without special request using debit card
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
    Then User should click the guest details next button and click special request submit button without passing a data
    And User should add the Debit Card details for Payment with card type "<cardtype>"
      | selectcard | cardnum          | cardname | month | year | cvv |
      | Visa       | 5555555555552222 | srini    | March | 2025 | 456 |
      | mastercard | 5555555555554444 | mani     | april | 2025 | 643 |
      | Amex       | 5555555555550000 | kavi     | may   | 2025 | 456 |
      | Discover   | 5555555555556666 | hari     | june  | 2025 | 879 |
    When User should verify the hotel confirmation "Booking is Confirmed" and save order id
    And User should verify the selected hotel is booked or not

    Examples: 
      | UserName                            | Password    | SelectState    | SelectCity | SelectRoomType | Check-In   | Check-Out  | No.OfRooms | No.OfAdults | No.OfChildren | selectsalution | firstname | lastname   | mobileno   | Email                               | EnterRegistrationNo | EnterCompanyName       | EnterCompanyAddress | cardtype   |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | Andhra Pradesh | Tirupati   | Deluxe         | 2025-05-09 | 2025-05-10 | 1-One      | 1-One       |             2 | Mr.            | Harikaran | Srinivasan | 9080277916 | harikaransrinivasan172000@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | Debit Card |

  @withoutsplreqUsingCredit
  Scenario Outline: Verify User should enter all fields and verify Book Hotel Page including GST without special request using credit card
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
    Then User should click the guest details next button and click special request submit button without passing a data
    And User should add the Debit Card details for Payment with card type "<cardtype>"
      | selectcard | cardnum          | cardname | month | year | cvv |
      | Visa       | 5555555555552222 | srini    | March | 2025 | 456 |
      | mastercard | 5555555555554444 | mani     | april | 2025 | 643 |
      | Amex       | 5555555555550000 | kavi     | may   | 2025 | 456 |
      | Discover   | 5555555555556666 | hari     | june  | 2025 | 879 |
    When User should verify the hotel confirmation "Booking is Confirmed" and save order id
    And User should verify the selected hotel is booked or not

    Examples: 
      | UserName                            | Password    | SelectState    | SelectCity | SelectRoomType | Check-In   | Check-Out  | No.OfRooms | No.OfAdults | No.OfChildren | selectsalution | firstname | lastname   | mobileno   | Email                               | EnterRegistrationNo | EnterCompanyName       | EnterCompanyAddress | cardtype    |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | Andhra Pradesh | Tirupati   | Deluxe         | 2025-05-09 | 2025-05-10 | 1-One      | 1-One       |             2 | Mr.            | Harikaran | Srinivasan | 9080277916 | harikaransrinivasan172000@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | Credit Card |

  @withoutGST
  Scenario Outline: Verify User should enter all fields and verify Book Hotel Page without GST with special request using debit card
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
    And User should add the Special Request for "<SpecialRequest>"
    And User should add the Debit Card details for Payment with card type "<cardtype>"
      | selectcard | cardnum          | cardname | month | year | cvv |
      | Visa       | 5555555555552222 | srini    | March | 2025 | 456 |
      | mastercard | 5555555555554444 | mani     | april | 2025 | 643 |
      | Amex       | 5555555555550000 | kavi     | may   | 2025 | 456 |
      | Discover   | 5555555555556666 | hari     | june  | 2025 | 879 |
    When User should verify the hotel confirmation "Booking is Confirmed" and save order id
    And User should verify the selected hotel is booked or not

    Examples: 
      | UserName                            | Password    | SelectState    | SelectCity | SelectRoomType | Check-In   | Check-Out  | No.OfRooms | No.OfAdults | No.OfChildren | selectsalution | firstname | lastname   | mobileno   | Email                               | SpecialRequest                   | cardtype   |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | Andhra Pradesh | Tirupati   | Deluxe         | 2025-05-09 | 2025-05-10 | 1-One      | 1-One       |             2 | Mr.            | Harikaran | Srinivasan | 9080277916 | harikaransrinivasan172000@gmail.com | need a parking for cars and bike | Debit Card |

  @withoutsplReqWithoutGST
  Scenario Outline: Verify User should enter all fields and verify Book Hotel Page without GST without special request using credit card
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
    Then User should click the guest details next button and click special request submit button without passing a data
    And User should add the Debit Card details for Payment with card type "<cardtype>"
      | selectcard | cardnum          | cardname | month | year | cvv |
      | Visa       | 5555555555552222 | srini    | March | 2025 | 456 |
      | mastercard | 5555555555554444 | mani     | april | 2025 | 643 |
      | Amex       | 5555555555550000 | kavi     | may   | 2025 | 456 |
      | Discover   | 5555555555556666 | hari     | june  | 2025 | 879 |
    When User should verify the hotel confirmation "Booking is Confirmed" and save order id
    And User should verify the selected hotel is booked or not

    Examples: 
      | UserName                            | Password    | SelectState    | SelectCity | SelectRoomType | Check-In   | Check-Out  | No.OfRooms | No.OfAdults | No.OfChildren | selectsalution | firstname | lastname   | mobileno   | Email                               | cardtype    |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | Andhra Pradesh | Tirupati   | Deluxe         | 2025-05-09 | 2025-05-10 | 1-One      | 1-One       |             2 | Mr.            | Harikaran | Srinivasan | 9080277916 | harikaransrinivasan172000@gmail.com | Credit Card |

  @BookFinal
  Scenario Outline: Verify User should enter all fields and book the hotel and click the continue button without entering payment details and verify error message
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
    When User should click the submit button without entering a card details
    Then User should verify the all error message"Please select your card type","Please select your card","Please provide your card number","Please provide name on your card","Please provide your Card Expiry Date" and "Please provide your Card's security code"

    Examples: 
      | UserName                            | Password    | SelectState    | SelectCity | SelectRoomType | Check-In   | Check-Out  | No.OfRooms | No.OfAdults | No.OfChildren | selectsalution | firstname | lastname   | mobileno   | Email                               | EnterRegistrationNo | EnterCompanyName       | EnterCompanyAddress | SpecialRequest                   |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | Andhra Pradesh | Tirupati   | Deluxe         | 2025-05-09 | 2025-05-10 | 1-One      | 1-One       |             2 | Mr.            | Harikaran | Srinivasan | 9080277916 | harikaransrinivasan172000@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | need a parking for cars and bike |
