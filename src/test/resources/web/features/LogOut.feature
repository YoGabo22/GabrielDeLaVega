@LogOut
Feature: Como usuario necesito hacer logout en clockify
Background:
  Given El usuario se encuentra en el Time Tracker con usuario 'oblivion1609@hotmail.com' y contraseña 'SnapShot33·'

@LogOutExitoso
Scenario: El usuario se desloguea de forma exitosa
  When El usuario hace click en su perfil
  And El usuario hace click en Log Out
  Then El usuario se encuentra en la pagina para login