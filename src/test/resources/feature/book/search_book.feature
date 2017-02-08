@ST_53499 @Story_BookSearch
Feature: Book search
 To allow a customer to find his favourite books quickly, the library must offer multiple ways to search for a book.

Background: 

And today is 2015-11-18

@SC_202566 @Critical @Test_1
Scenario: Search books by publication year
Given a book with the title 'One good book', written by 'Anonymous', published in 14 March 2013
And another book with the title 'Some other book', written by 'Tim Tomson', published in 23 August 2014
And another book with the title 'How to cook a dino', written by 'Fred Flintstone', published in 01 January 2012
When the customer searches for books published between 2013 and 2014
Then 2 books should have been found
And Book 1 should have the title 'Some other book'
And Book 2 should have the title 'One good book'
Then i want do smth with "smth"

@SC_202567
Scenario: 
Given a $100 microwave was sold on 2015-11-03
And today is 2016-10-31
Then the salary management system is initialized with the following data

@SC_202568
Scenario: salary management
Given the salary management system is initialized with the following data
When the boss increases the salary for the <user> with id <id> by 5%
Then the payroll for the employee with <id> should display a salary of <salary>
And i want save this string to Git
And this string must be pulled from Git
And this also must be re-stored on GIT!!!!
And 34wteyeyy