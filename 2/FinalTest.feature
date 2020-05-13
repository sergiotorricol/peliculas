Feature: Final Test

  Background: Common
    Given I have connection with Todo.ly

  Scenario: Create and Update Project

    When I send a POST request to projects.json end point with the json
    """
   {
          "Content": "New Project"
   }
    """
    Then the response code should be 200
    #And I expected the New Project is displayed in json response
    And I expected a json response equal to
    """
    {

                  "Id": IGNORE,
                  "Content": "New Project",
                  "ItemsCount": IGNORE,
                  "Icon": IGNORE,
                  "ItemType": IGNORE,
                  "ParentId": IGNORE,
                  "Collapsed": IGNORE,
                  "ItemOrder": IGNORE

    }
    """
    And I save the attribute Id in the variable : ID_PROJECT
    When I send a POST request to projects/ID_PROJECT.json end point with the json
    """
    {
          "Content": "Project UPDATE"
    }
    """
    Then the response code should be 200
    And I expected a json response equal to
    """
     {
          "Id":"ID_PROJECT",
          "Content": "Project UPDATE"
    }
    """