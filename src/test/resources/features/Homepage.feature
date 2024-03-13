
@tag
Feature: UI of Home Page
Home page UI and its functions
@Background:

@tag1
Scenario Outline: Drop down list on the right corner
of the header in the home page.
Given Enter DS Algo portal
When Click the Data structure dropdown arrow
Then Check Dropdown Values
When Click All dropdown Values
Then DS page should displayed

@tag1
Scenario: Register and Signin link in home page.
Given Enter DS Algo portal
When Click on Register link
Then Registration page open
When Click on Signin link
Then Login page Open 

@tag1
Scenario: Get Started buttons in home page
Given Enter DS Algo portal
When Click on ' Get Started 'button in Data Structure-Introduction
Then You are not logged in message displayed.
When Click on Get Started Button in Array
Then  You are not logged in message displayed.
When Click on Get Started button in Linked List
Then You are not logged in message displayed.
When Click on Get Started Button in Stack
Then  You are not logged in message displayed.
When Click on Get Started Button in Queue
Then  You are not logged in message displayed.
When Click on Get Started button in Tree
Then You are not logged in message displayed.
When Click on Get Started Button in Graph
Then  You are not logged in message displayed.
