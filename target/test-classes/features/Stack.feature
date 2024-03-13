
@tagStack
Feature: Verify and Validate 'Stack' Widget


  @tag1
  Scenario: Verify and Validate the 'get started' button under Stack page
    Given Enter  into the DS Algo portal with Valid URL
    When Click on 'Get Started' Button in Stack section in the home page
    Then 'Stack' Stack page should open 

  
    @tag2perationsinStack 
    Scenario: Validate the links in Topics Covered section for Stack page
    Given Enter  into the DS Algo portal with Valid URL
    When Go to Topics Covered section and click 'Operations in Stack ' link
    Then 'Operations in Stack' Operations in stack page should open 
    
    When Click 'Try here>>>' button at the bottom of the page
    Then Editor box should open with run button in Assessment page in the same window
    
    When Type Sample <print"hello"> and click run button
    Then Result should displayed in the bottom of the page "hello"
    
    When Clear the Editor Box an type sample other language System.out.println("hello") and click run button
    Then Alert should displayed as 'NameError: name 'System' is not defined on line <line 1>' with ok button
    
    When Click OK button and click browser right arrow to go back
    Then 'Operations in Stack'  Operations in stack page should displayed
    
    
    @tag3Implementation
    Scenario: Validate the links in Topics Covered section for Stack page
    Given Enter  into the DS Algo portal with Valid URL
    When Go to Topics Covered section and click 'Implementation' link
    Then 'Implementation' Implementation page should open 
    
    When Click 'Try here>>>' button at the bottom of the page
    Then Editor box should open with run button in Assessment page in the same window
    
    When Type Sample <print"hello"> and click run button
    Then Result should displayed in the bottom of the page "hello"
    
    When Clear the Editor Box an type sample other language System.out.println("hello") and click run button
    Then Alert should displayed as 'NameError: name 'System' is not defined on line <line 2>' with ok button
    
    When Click OK button and click browser right arrow to go back
    Then 'Implementation' Implementation page should displayed
  
  
  
  @tag4Applications
    Scenario: Validate the links in Topics Covered section for Stack page
    Given Enter  into the DS Algo portal with Valid URL
    When Go to Topics Covered section and click 'Applications' link
    Then 'Applications' Applications page should open 
    
    When Click 'Try here>>>' button at the bottom of the page
    Then Editor box should open with run button in Assessment page in the same window
    
    When Type Sample <print"hello"> and click run button
    Then Result should displayed in the bottom of the page "hello"
    
    When Clear the Editor Box an type sample other language System.out.println("hello") and click run button
    Then Alert should displayed as 'NameError: name 'System' is not defined on line <line 3>' with ok button
    
    When Click OK button and click browser right arrow to go back
    Then 'Applications' Application page should displayed
    
    
    When Click Practice Question link in the Linked List section on the right side
    Then Empty Practice Question page should displayed on the same window



