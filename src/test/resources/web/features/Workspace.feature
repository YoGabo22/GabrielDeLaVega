@Workspace
Feature: Workspace

  @Project @Smoke @Clockify
  Scenario: Create project successfully
    Given The client is on clockify home page
    When The client click on 'Create new project'
    And the client set the new project name
    And the client click on 'Create'
    Then The system shown the new created project