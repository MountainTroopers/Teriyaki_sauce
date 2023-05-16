Feature: This is a WaterFall Login Functionality

Scenario: Verify user can login

Given Open Demoblaze "<URL>" Application
Then Click Login
Then Enter username and password and Click Login2 
Then Verify user login successfully
