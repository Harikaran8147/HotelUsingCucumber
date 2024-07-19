@login
Feature: verify User is on OMR login page

  Scenario Outline: verify User enter the valid login credentials
    Given User is on OMR login page
    When User Login with valid "<UserName>" and "<Password>"
    Then User should verify the after Login "Welcome Harikaran"

    Examples: 
      | UserName                            | Password    |
      | harikaransrinivasan172000@gmail.com | Greens@1234 |

  Scenario Outline: verify User enter the valid login credentials using Enter key
    Given User is on OMR login page
    When User Login with "<UserName>" and "<Password>" using the Enter key
    Then User should verify the after Login "Welcome Harikaran"

    Examples: 
      | UserName                            | Password    |
      | harikaransrinivasan172000@gmail.com | Greens@1234 |

  Scenario Outline: verify User enter the Invalid login credentials
    Given User is on OMR login page
    When User Login with invalid "<UserName>" and "<Password>"
    Then User should verify the after Login Error message "Invalid Login details or Your Password might have expired. Click here to reset your password"

    Examples: 
      | UserName                            | Password |
      | harikaransrinivasan172000@gmail.com | error678 |
