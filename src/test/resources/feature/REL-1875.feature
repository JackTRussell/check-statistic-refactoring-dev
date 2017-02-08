@ST_53498 @tagtagtag @this_is_story_tag @new_changes
Feature: Just feature for testing
I want to see new description with new changes

@SC_202564 @fifth_scenario_tag
Scenario: Fifth scenario
Given the salary management system is initialized with the following data
And another book with the title 'Some other book', written by 'Tim Tomson', published in 23 August 2014
And another book with the title 'How to cook a dino', written by 'Fred Flintstone', published in 01 January 2012
When the customer searches for books published between 2013 and 2014
Then 2 books should have been found
And Book 1 should have the title 'Some other book'
And Book 2 should have the title 'One good book'
Then i want do smth with "smth"

@SC_202563 @fifth_scenario_tag
Scenario Outline: Fifth scenario
Given the salary management system is initialized with the following data
When the boss increases the salary for the <user> with id <id> by 5%
Then the payroll for the employee with <id> should display a salary of <salary>
And i want save this string to Git
And this string must be pulled from Git
And this also must be re-stored on GIT!!!!
And 34wteyeyy

Examples: 
|user|id|salary|
|donald|1|60000.0|
|dewie|2|62000.0|
|mickey|3|35000.0|
|stive|4|45000.0|