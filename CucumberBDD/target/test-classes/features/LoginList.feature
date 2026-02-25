Feature: Multiple user login using List

Scenario: Login with multiple users

  Given I launch the browser for List
  When I open the login page for List
  And I enter multiple username and password using List
    | standard_user           | secret_sauce |
    | locked_out_user         | secret_sauce |
    | problem_user            | secret_sauce |
    | performance_glitch_user | secret_sauce |
    | error_user              | secret_sauce |
    | visual_user             | secret_sauce |
  Then I close the browser for List