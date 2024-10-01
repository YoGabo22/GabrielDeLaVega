@Project
Feature:

  @Smoke @Clockify
  Scenario: Crear proyecto de forma exitosa
    Given se está ubicado en "https://app.clockify.me/projects?archived=ACTIVE&containsClient=true&clientStatus=ACTIVE&containsUser=true&page=1&limit=50&sortColumn=NAME&sortOrder=ASCENDING"
    And se está en uso del workspace "Arsenal"
    When se presiona el botón "Create new project"
    And se ingresa "FC Barcelona" en el campo "Enter project name"
    And se presiona el botón "Create"
    Then el sistema ha creado un nuevo proyecto
    And se visualiza el nuevo proyecto en "Projects"