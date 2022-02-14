Feature: Login to application

Scenario Outline: Validating Login Page
Given Intialize the browser with chrome
And Navigate to "https://qaclickacademy.com"
And click on Signin button on Home Page
When User enters <username> and <password>
Then Verify that user is successfully logged in
And Close browsers

Examples: 
|username           |password|
|test146@gmail.com  |123456  |
|test526@gmail.com  |956890  |
