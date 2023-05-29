Feature: FaceBook Login Page

  Scenario: FaceBook Title Testing
    Given open browser
    When launch site "https://www.facebook.com/"
    Then verify page title "facebook"
    When close site
