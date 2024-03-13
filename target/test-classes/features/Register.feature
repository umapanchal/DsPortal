
@tagRegister
Feature: Verify the 'Registration' Page

  @tag1
  Scenario: Validate  the Registration page fields without  details
    Given Enter  into the DS Algo portal with Valid URL
    When Click Register Button
    Then 'Please fillout this field'  tooltip should  displayed in the all empty field
    
   When Click Login Link
   Then Login page should Open on the same window
   
   When Click on Register link on the top left corner of the Home page.
   Then Registration page should Open on the same window
    
    
    @tag2
    Scenario: Validate  the Login page fields without  details
    Given Enter  into the DS Algo portal with Valid URL
    When Enter valid <user name> ,<password>,<Password confirmation>
    Then Home Page should displayed with message 'New Account Created. You are logged in as <user name>.
    
    When Click on Register link on the top left corner of the Home page.
    Then Registration page should Open on the same window
    
    When Enter invalid <user name> and valid <password>,<Password confirmation> and click register button
    Then Warning message for invalid username should displayed as 'Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only'

   When Enter valid <user name> and invalid <password>,<Password confirmation> and click register button
   Then Warning message for invalid password should displayed 
   
   
   @tag3
   Scenario: Validate  the Registration page fields with invalid  details
   Given Enter  into the DS Algo portal with Valid URL
   When Enter valid <user name> and mismatched between <password>and <Password confirmation> and click register button
   Then 'password_mismatch:The two password fields didn’t match.' Warning message should be displayed.
   