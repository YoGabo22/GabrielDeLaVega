@Project
Feature: Como usuario necesito crear projectos dentro de Clockify



@ProjectoExitoso
Scenario: El usuario crea un projecto de forma exitosa
  Given El usuario se encuentra en el Time Tracker con usuario 'oblivion1609@hotmail.com' y contraseña 'SnapShot33·'
  When El usuario hace click en 'Project'
  And El usuario hace click en 'Create new project'
  And El usuario ingresa nombre 'Prueba1'
  And El usuario hace click en 'Create'
  Then El usuario verifica el nombre del projecto Prueba1 en projects

