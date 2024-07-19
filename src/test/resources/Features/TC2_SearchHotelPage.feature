Feature: User should verify the search hotel page

  @hari
  Scenario Outline: Verify User should enter all fields and verify select hotel page
    Given User is on OMR login page
    When User Login with valid "<UserName>" and "<Password>"
    Then User should verify the after Login "Welcome Harikaran"
    When User should pass all the fields "<SelectState>" , "<SelectCity>" , "<SelectRoomType>" , "<Check-In>" , "<Check-Out>" , "<No.OfRooms>" , "<No.OfAdults>" and "<No.OfChildren>"
    Then User should verify after click the search and success message as "Select Hotel"

    Examples: 
      | UserName                            | Password    | SelectState    | SelectCity | SelectRoomType | Check-In   | Check-Out  | No.OfRooms | No.OfAdults | No.OfChildren |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | Andhra Pradesh | Tirupati   | Deluxe         | 2024-05-09 | 2024-05-10 | 1-One      | 1-One       |             2 |

  Scenario Outline: Verify User enter only mandatory fields and verify select hotel page
    Given User is on OMR login page
    When User Login with valid "<UserName>" and "<Password>"
    Then User should verify the after Login "Welcome Harikaran"
    When User should pass only the mandatory fields "<SelectState>" , "<SelectCity>" , "<Check-In>" , "<Check-Out>" , "<No.OfRooms>" and "<No.OfAdults>"
    Then User should verify after click the search and success message as "Select Hotel"

    Examples: 
      | UserName                            | Password    | SelectState    | SelectCity | Check-In   | Check-Out  | No.OfRooms | No.OfAdults |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | Andhra Pradesh | Tirupati   | 2024-05-28 | 2024-05-29 | 1-One      | 1-One       |

  Scenario Outline: Verify User Click search without any fields and getting error message
    Given User is on OMR login page
    When User Login with valid "<UserName>" and "<Password>"
    Then User should verify the after Login "Welcome Harikaran"
    Then User should verify the all error message as "Pleaseselectstate" , "Pleaseselect city" , "PleaseselectCheck-indate" , "PleaseselectCheck-outdate" , "Pleaseselectno.ofrooms" and "Pleaseselectno.ofadults"

    Examples: 
      | UserName                            | Password    |
      | harikaransrinivasan172000@gmail.com | Greens@1234 |

  Scenario Outline: Verify User should enter all fields and verify the all hotel name ends with respective roomtype
    Given User is on OMR login page
    When User Login with valid "<UserName>" and "<Password>"
    Then User should verify the after Login "Welcome Harikaran"
    When User should pass all the fields "<SelectState>" , "<SelectCity>" , "<SelectRoomType>" , "<Check-In>" , "<Check-Out>" , "<No.OfRooms>" , "<No.OfAdults>" and "<No.OfChildren>"
    Then User should verify after click the search and success message as "Select Hotel"
    Then User should verify all hotel name ends with respective room type "Deluxe"

    Examples: 
      | UserName                            | Password    | SelectState    | SelectCity | SelectRoomType | Check-In   | Check-Out  | No.OfRooms | No.OfAdults | No.OfChildren |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | Andhra Pradesh | Tirupati   | Deluxe         | 2024-05-09 | 2024-05-10 | 1-One      | 1-One       |             2 |

  @four
  Scenario Outline: Verify User should enter all fields and Select the all Room Types
    Given User is on OMR login page
    When User Login with valid "<UserName>" and "<Password>"
    Then User should verify the after Login "Welcome Harikaran"
    When User should click all room types in the fields "<SelectState>" , "<SelectCity>" , "<SelectRoomType>" , "<Check-In>" , "<Check-Out>" , "<No.OfRooms>" , "<No.OfAdults>" and "<No.OfChildren>"
    Then User should verify after click the search and success message as "Select Hotel"
    Then User should verify all room types "Standard/Deluxe/Suite/Luxury/Studio"

    Examples: 
      | UserName                            | Password    | SelectState    | SelectCity | SelectRoomType                      | Check-In   | Check-Out  | No.OfRooms | No.OfAdults | No.OfChildren |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | Andhra Pradesh | Tirupati   | Standard/Deluxe/Suite/Luxury/Studio | 2024-05-09 | 2024-05-10 | 1-One      | 1-One       |             2 |

  Scenario Outline: User should verify the sorting funtionality hotel price from low to high
    Given User is on OMR login page
    When User Login with valid "<UserName>" and "<Password>"
    Then User should verify the after Login "Welcome Harikaran"
    When User should pass all the fields "<SelectState>" , "<SelectCity>" , "<SelectRoomType>" , "<Check-In>" , "<Check-Out>" , "<No.OfRooms>" , "<No.OfAdults>" and "<No.OfChildren>"
    Then User should verify after click the search and success message as "Select Hotel"
    When User to click the price low to high Check Box
    Then User should verify the all prices will be on "low to high"

    Examples: 
      | UserName                            | Password    | SelectState    | SelectCity | SelectRoomType | Check-In   | Check-Out  | No.OfRooms | No.OfAdults | No.OfChildren |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | Andhra Pradesh | Tirupati   | Deluxe         | 2024-05-09 | 2024-05-10 | 1-One      | 1-One       |             2 |

  Scenario Outline: User should verify the sorting funtionality hotel price from high to low
    Given User is on OMR login page
    When User Login with valid "<UserName>" and "<Password>"
    Then User should verify the after Login "Welcome Harikaran"
    When User should pass all the fields "<SelectState>" , "<SelectCity>" , "<SelectRoomType>" , "<Check-In>" , "<Check-Out>" , "<No.OfRooms>" , "<No.OfAdults>" and "<No.OfChildren>"
    Then User should verify after click the search and success message as "Select Hotel"
    When User to click the price high to low Check Bok
    Then User should verify the all prices will be descending to ascending order "high to low"

    Examples: 
      | UserName                            | Password    | SelectState    | SelectCity | SelectRoomType | Check-In   | Check-Out  | No.OfRooms | No.OfAdults | No.OfChildren |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | Andhra Pradesh | Tirupati   | Deluxe         | 2024-05-09 | 2024-05-10 | 1-One      | 1-One       |             2 |

  Scenario Outline: User should verify the sorting funtionality hotel name Ascending
    Given User is on OMR login page
    When User Login with valid "<UserName>" and "<Password>"
    Then User should verify the after Login "Welcome Harikaran"
    When User should pass all the fields "<SelectState>" , "<SelectCity>" , "<SelectRoomType>" , "<Check-In>" , "<Check-Out>" , "<No.OfRooms>" , "<No.OfAdults>" and "<No.OfChildren>"
    Then User should verify after click the search and success message as "Select Hotel"
    When User to click the Ascending Check Bok
    Then User should verify the all hotel name will be on ascending order"Ascending"

    Examples: 
      | UserName                            | Password    | SelectState    | SelectCity | SelectRoomType | Check-In   | Check-Out  | No.OfRooms | No.OfAdults | No.OfChildren |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | Andhra Pradesh | Tirupati   | Deluxe         | 2024-05-09 | 2024-05-10 | 1-One      | 1-One       |             2 |

  @five
  Scenario Outline: User should verify the sorting funtionality hotel name Descending
    Given User is on OMR login page
    When User Login with valid "<UserName>" and "<Password>"
    Then User should verify the after Login "Welcome Harikaran"
    When User should pass all the fields "<SelectState>" , "<SelectCity>" , "<SelectRoomType>" , "<Check-In>" , "<Check-Out>" , "<No.OfRooms>" , "<No.OfAdults>" and "<No.OfChildren>"
    Then User should verify after click the search and success message as "Select Hotel"
    When User to click the Descending Check Bok
    Then User should verify the all hotel name will be on descending order "Descending"

    Examples: 
      | UserName                            | Password    | SelectState    | SelectCity | SelectRoomType | Check-In   | Check-Out  | No.OfRooms | No.OfAdults | No.OfChildren |
      | harikaransrinivasan172000@gmail.com | Greens@1234 | Andhra Pradesh | Tirupati   | Deluxe         | 2024-05-09 | 2024-05-10 | 1-One      | 1-One       |             2 |
