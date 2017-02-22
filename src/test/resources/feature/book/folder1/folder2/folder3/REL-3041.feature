@ST_59906
Feature: DocString variations
Feature which leads to this issue

@SC_225609
Scenario Outline: 
Given a simple DocString
Given a DocString with "content type"
And a DocString with "wrong indentation"
And a DocString with "alternative" <first column> <second column>

Examples: 
|first column|second column|
|data1|data2|