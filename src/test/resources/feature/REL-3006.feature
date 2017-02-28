@ST_53770
Feature: DocString variations
Feature which leads to this issue 

@SC_203625
Scenario: First
Given a simple DocString
Given a DocString with "content type"
And a DocString with "wrong indentation"
And a DocString with "alternative separator"

@SC_203626
Scenario: Second
Given a simple DocString
Given a DocString with "content type"
And a DocString with "wrong indentation"
And a DocString with "alternative separator"

@SC_203627
Scenario: Third
Given a simple DocString
Given a DocString with "content type"
And a DocString with "wrong indentation"
And a DocString with "alternative separator"
And type