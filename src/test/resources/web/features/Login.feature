@Login
Feature: Como usuario necesito hacer login en clockify

Background:
  Given El usuario se encuentra en la pagina princicpal
  And El usuario hace click en 'Log in'

@LogInExitoso
Scenario: El usuario hace login exitoso de forma manual
  When El usuario hace click en 'Log in manually'
  And El usuario ingresa el email 'oblivion1609@hotmail.com'
  And El usuario ingresa la contraseña 'SnapShot33·'
  And El usuario hace click en el boton 'Log In'
  Then El usuario se encuentra en la pagina TimeTracker

@LoginFallido @EmailFail
Scenario: El usuario hace login fallido de forma manual
  When El usuario hace click en 'Log in manually'
  And El usuario ingresa el email 'oblivion1609@hotmail.com'
  And El usuario ingresa la contraseña '12345e'
  And El usuario hace click en el boton 'Log In'
  Then El usuario visualiza mensaje 'Invalid email or password' de contraseña incorrrecta

















#  @Regression @Candidate @SearchCrowdar
#  Scenario: The client search by "crowdar"
#    Given The client is on google page
#    When The client search for word crowdar
#    Then The client verify that results are shown properly
#
#  @Smoke @NoCandidate @SearchAutomation
#  Scenario: The client search by "Automation"
#    Given The client is on google page
#    When The client search for word Automation
#    Then The client verify that results are shown properly
#
#  @Regression @ToBeAutomated @SearchDocker
#  Scenario: The client search by "Docker"
#    Given The client is on google page
#    When The client search for word Docker
#    Then The client verify that results are shown properly
#
#  @Smoke @Automated @SearchLippia
#  Scenario: The client search by "Lippia"
#    Given The client isn't on google page
#    When The client search for word Lippia
#    Then The client verify that results are shown properly