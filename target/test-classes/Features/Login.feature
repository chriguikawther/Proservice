# Auteur: kawther
Feature: OrangeHRM login page
Background: 
 Given admin is in login page

  Scenario: login with valid credentials
    
    When admin enter correct username "Admin" and correct password "admin123"
    Then admin is directed to the home page
    
    Scenario: login with valid credentials
    
    When admin enter incorrect username "kawther" and incorrect password "kawther123"
    Then admin in the login page that contenais message "Invalid credentials"
    
