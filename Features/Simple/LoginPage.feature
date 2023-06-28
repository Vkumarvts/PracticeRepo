
Feature:  Login

  
  Scenario: Successful login with valid credentials
    Given I lounch chrome Browser
    When I Open URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And user enter Email as "admin@yourstore.com" and password as "admin@yourstore.com"
    And Click on Login
    Then page title should be "Admin area demo"
    When user click on logout link
    Then Page title shold be "Admin area demo"
    And close browser

