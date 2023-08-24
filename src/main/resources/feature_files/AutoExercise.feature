@AutoExer
Feature:
Scenario Outline: Test Case 1: Register User
Given I am on auto-exercise home page
Then I Verify that home page is visible successfully
And Click on 'Signup / Login' button
Then I Verify 'New User Signup!' is visible
And  I Enter "<name>" and "<email address>"
And  Click 'Signup' button
Then I Verify that 'ENTER ACCOUNT INFORMATION' is visible
When Fill details: Title, "<Password>" and "<Date of birth>"
And Select checkbox 'Sign up for our newsletter!'
And Select checkbox 'Receive special offers from our partners!'
And Fill details: "<First name>", "<Last name>", "<Company>", "<Address>", "<Country>", "<State>", "<City>", "<Zipcode>", "<Mobile Number>"
And Click 'Create Account button'
Then Verify that 'ACCOUNT CREATED!' is visible
And Click Continue button
Then Verify that 'Logged in as username' is visible

Examples:
| name | email address        | Password |Date of birth| First name | Last name | Company    | Address  | Country | State  | City       | Zipcode | Mobile Number |
| solo | odexsolo77@gmail.com | Yahoo77  |15/02/1990 |solomon    | odele     | eledavibes | 60 brega | Canada  | Dublin | Balbriggan | k32     | 0899736888    |