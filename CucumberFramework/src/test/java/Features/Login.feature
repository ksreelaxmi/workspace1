Feature: Application Login

Scenario: Home Page Default Login
Given User is on Netbanking Landing page
When User is login into application with "John" and password "562"
Then Home page will be populated
And card dispalyed are "true"

Scenario: Home Page Default Login
Given User is on Netbanking Landing page
When User is login into application with "jons" and password "8231"
Then Home page will be populated
And card dispalyed are "false"