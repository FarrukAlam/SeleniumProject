Feature: Getting the weather from www.Bing.com
Scenario: Searching for weather in Bing.com shows you the weather
Given that I am in www.Bing.com
When I click on the search box
And enter the keyword weather nyc
Then the currect weather for NYC should be shown