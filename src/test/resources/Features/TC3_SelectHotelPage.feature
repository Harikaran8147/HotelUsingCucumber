@selectHotel
Feature: User should verify the Select hotel page

  Scenario Outline: Verify User should enter all fields and select the hotel then click the dismiss
    Given User is on OMR login page
    When User Login with valid "<UserName>" and "<Password>"
    Then User should verify the after Login "Welcome Harikaran"
    When User should pass all the fields "<SelectState>" , "<SelectCity>" , "<SelectRoomType>" , "<Check-In>" , "<Check-Out>" , "<No.OfRooms>" , "<No.OfAdults>" and "<No.OfChildren>"
    Then User should verify after click the search and success message as "Select Hotel"
    And User should save the first Hotel Name and Hotel Price
    When User should Click the continue button
    Then User after click the continue alert pop up is display and click on cancel button

    Examples: 
      | UserName                            | Password    | SelectState    | SelectCity | SelectRoomType | Check-In   | Check-Out  | No.OfRooms | No.OfAdults | No.OfChildren |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | Andhra Pradesh | Tirupati   | Deluxe         | 2024-05-09 | 2024-05-10 | 1-One      | 1-One       |             2 |

  Scenario Outline: Verify User should enter all fields and select the hotel then click the alert
    Given User is on OMR login page
    When User Login with valid "<UserName>" and "<Password>"
    Then User should verify the after Login "Welcome Harikaran"
    When User should pass all the fields "<SelectState>" , "<SelectCity>" , "<SelectRoomType>" , "<Check-In>" , "<Check-Out>" , "<No.OfRooms>" , "<No.OfAdults>" and "<No.OfChildren>"
    Then User should verify after click the search and success message as "Select Hotel"
    And User should save the first Hotel Name and Hotel Price
    When User should Click the continue button
    Then User after click the continue alert pop up is display and click on ok button

    Examples: 
      | UserName                            | Password    | SelectState    | SelectCity | SelectRoomType | Check-In   | Check-Out  | No.OfRooms | No.OfAdults | No.OfChildren |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | Andhra Pradesh | Tirupati   | Deluxe         | 2024-05-09 | 2024-05-10 | 1-One      | 1-One       |             2 |
