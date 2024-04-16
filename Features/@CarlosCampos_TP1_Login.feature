@CarlosCampos_TP1_Login
Feature: Login

@LoginExistoso
Scenario: Login Exitoso por Correo
Given estoy en "https://app.clockify.me/es/login"
When Ingreso el correo "micorreo@mail.com"
And hago click en el botón "Continuar con correo electrónico"
Then Redirecciona a "https://app.clockify.me/enter-code" con parámetro email="micorreo@mail.com"

@CheckCodeFallido
Scenario Outline: Login fallido por <causa_fallo>
Given estoy en "https://app.clockify.me/enter-code"
When Ingreso el codigo <codigo> que he obtenido por mail hace <minutos>
Then la aplicacion muestra un ensaje de error:"Ese código no es válido. Inténtalo de nuevo."

Examples:
|codigo			| minutos				| causa_fallo 				|
|123456			| 10					| Código incorrecto         |
|A358BC 		| 31 	    			| Código Vencido            |

@CambioTipoLogin
Scenario Outline: Campos habilitados para el ingreso por <tipo>
Given estoy en "https://app.clockify.me/es/login"
When hago click en <opcion>
Then <SNCorreo> muestra campo de texto para ingresar "correo" 
And  <SNPass> muestra campo de texto para "contraseña"
And  <SNRem> muestra link de "¿Olvidaste tu contraseña?"
And  <SNIni> muestra boton de "Iniciar Sesión" deshabilidato
And  <SNBotC> muestra boton de "Continuar con correo electrónico"  deshabilidato
And  <SNBotG> muestra boton de "Continuar con google" habilitado
And  <SNMan> muestra link de "Iniciar sesión manualmente"
And  <SNCorr> muestra link de "Iniciar sesión con correo electrónico"
Examples:
|tipo			| opcion				                    | SNCorreo | SNPass   | SNRem    | SNIni    | SNBotC   | SNBotG   | SNMan    | SNCorr   |
|Manual			| Iniciar Sesisón Manualmente				| SI       | SI       | SI       | SI       | NO       | NO       | NO       | SI       |
|por Correo 	| Iniciar sesión con correo electrónico	    | SI       | NO       | NO       | NO       | SI       | SI       | SI       | NO       |


@LoginHabilitado
Scenario: Campos habilitados Login Manual
Given estoy en "https://app.clockify.me/es/login"
When hago click en el botón "Iniciar sesión manualmente"
And Ingreso el correo "micorreo@mail.com"
And Ingreso contraseña de 6 o más digitos
Then Habilito botón de "Iniciar Sesión"

@LoginManualFallido
Scenario Outline: Login fallido por <causa_fallo>
Given estoy en "https://app.clockify.me/es/login"
When hago click en el botón "Iniciar sesión manualmente"
And Ingreso el correo <correo>
And Ingreso contraseña <pass>
Then la aplicacion muestra un ensaje de error: <mensaje>

Examples:
|correo			    |pass	|mensaje                                    | causa_fallo            				|
|micorreo@mail.com	|12345  |La contraseña no es válida			        |Longitud contraseña incorrecta         |
|micorreogmail.com 	|123456	|Formato de correo electrónico no válido    |Formato Correo incorrecto                      |
|micorreo@gmailcom 	|123456	|Formato de correo electrónico no válido    |Formato Correo incorrecto                      |