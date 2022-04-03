Feature: HepsiBuradaLogin

  Scenario: LoginCasesCrudOperation
    Given I am on the home page
    When I click on the login page button
    When I enter the "kayıtlıolmayanemail@gmail.com" email address
    When I click on the sign in button
    And I check to wrong email error message
    When I enter the "kayıtlıemail@gmail.com" email address
    When I click on the sign in button
    When I enter the "hatalışifre" password
    When I click on the login
    And I check to wrong password error message
    When I enter the "dogrusifre" password
    When I click on the login
    Then Wait for the home page to load and checkout login

  Scenario: LoginCaseWithWrongEmail
    Given I am on the home page
    When I click on the login page button
    When I enter the "kayıtlıolmayanemail@gmail.com" email address
    When I click on the sign in button
    And I check to wrong email error message
    When I enter the "kayıtlıemailm@gmail.com" email address
    When I click on the sign in button

  Scenario: LoginCaseWithEmailAndWrongPassword
      Given I am on the home page
      When I click on the login page button
      When I enter the "kayıtlıemail@gmail.com" email address
      When I click on the sign in button
      When I enter the "hatalışifre" password
      When I click on the login
      And I check to wrong password error message
      When I enter the "dogrusifre" password
      When I click on the login
      Then Wait for the home page to load and checkout login,

  Scenario: LoginCaseWithBackForEmail
    Given I am on the home page
    When I click on the login page button
    When I enter the "kayıtlıemail@gmail.com" email address
    When I click on the sign in button
    When I click on the back button
    When I enter the "kayıtlıolmayanemail@gmail.com" email address
    When I click on the sign in button
    And I check to wrong email error message
    When I enter the "kayıtlıemail@gmail.com" email address
    When I enter the "dogrusifre" password
    When I click on the login
    Then Wait for the home page to load and checkout login

    Scenario: LoginCaseWithDifferentAccount
      Given I am on the home page
      When I click on the login page button
      When I enter the "kayıtlıemail@gmail.com" email address
      When I click on the sign in button
      When I click on the different account button
      When I enter the "farklıamakayıtlıemail@gmail.com" email address
      When I click on the sign in button
      When I enter the "dogrusifre" password
      When I click on the login
      Then Wait for the home page to load and checkout login

    Scenario: LoginCaseEmailAndForgetPassword
      Given I am on the home page
      When I click on the login page button
      When I enter the "kayıtlıemail@gmail.com" email address
      When I click on the sign in button
      When I click on the forget password button
      When I click on the open to gmail application button

    Scenario: LoginCaseNeedHelp
        Given I am on the home page
        When I click on the login page button
        When I click on the need help button
        When I click on the get back button

  Scenario: LoginCaseWithWrongPhone
    Given I am on the home page
    When I click on the login page button
    When I enter the "kayıtlıOlmayanTelefonNumarası" phone number
    When I click on the sign in button
    And I check to wrong phone error message
    When I enter the "kayıtlıTelefonNumarası" phone number
    When I click on the sign in button

  Scenario: LoginCaseWithPhoneAndWrongPassword
    Given I am on the home page
    When I click on the login page button
    When I enter the "kayıtlıTelefonNumarası" phone number
    When I click on the sign in button
    When I enter the "hatalışifre" password
    When I click on the login
    And I check to wrong password error message
    When I enter the "dogrusifre" password
    When I click on the login
    Then Wait for the home page to load and checkout login,

  Scenario: LoginCaseWithBackForPhone
    Given I am on the home page
    When I click on the login page button
    When I enter the "kayıtlıTelefonNumarası" phone number
    When I click on the sign in button
    When I click on the back button
    When I enter the "kayıtlıOlmayanTelefonNumarası" phone number
    When I click on the sign in button
    And I check to wrong phone error message
    When I enter the "kayıtlıTelefonNumarası" phone number
    When I enter the "dogrusifre" password
    When I click on the login
    Then Wait for the home page to load and checkout login

  Scenario: LoginCaseWithDifferentAccount
    Given I am on the home page
    When I click on the login page button
    When I enter the "kayıtlıTelefonNumarası" phone number
    When I click on the sign in button
    When I click on the different account button
    When I enter the "kayıtlıamaFarklıTelefonNumarası" phone number
    When I click on the sign in button
    When I enter the "dogrusifre" password
    When I click on the login
    Then Wait for the home page to load and checkout login

  Scenario: LoginCasePhoneAndForgetPassword
    Given I am on the home page
    When I click on the login page button
    When I enter the "kayıtlıTelefonNumarası" phone number
    When I click on the sign in button
    When I click on the forget password button
    When I click on the open to gmail application button








