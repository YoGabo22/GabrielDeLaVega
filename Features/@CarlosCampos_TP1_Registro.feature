@CarlosCampos_TP1_Registro
Feature: Registro

Background: 
Given estoy en "https://app.clockify.me/es/signup"

@RegistroExistoso
Scenario: Registro Exitoso por Google
When No ingreso el correo electrónico
And hago click en el check de "Acepto CAKE.com"
Then habilita el boton "Continuar con Google"
And No habilita el boton "Continuar con correo electrónico"

@RegistroExistoso
Scenario: Registro Exitoso con correo electrónico
When Ingreso el correo "micorreo@mail.com"
And hago click en el check de Acepto CAKE.com
Then habilita el botón "Continuar con correo electrónico"
And No habilita el botón "Continuar con Google" 

@checkEmailFallido
Scenario: Redirecciona al check correo sin asociar al correo ingresado 
When Ingreso el correo "micorreo@mail.com"
And hago click en el check de Acepto CAKE.com
And hago click en el botón "Continuar con correo electrónico"
Then Redirecciona a "https://app.clockify.me/enter-code" sin enviar el correo ingresado como parámetro.  

@RegistroFalido
Scenario: Registro Fallido por Formato en Correo
When Ingreso el correo "micorreo"
And cambio el foco del campo email
Then Muestra un ensaje de error: "Email format is not valid" 

@TerminosUsoFalido
Scenario: No muestra los términos de Uso en idioma correcto
When slecciono un idioma distinto a "English"  
And Hago click en el link "Condiciones de Uso"
Then Redirecciona a "https://cake.com/terms" mostrando el texto de las condiciones de uso en un idioma distinto al seleccionado previamente. 
#-- Ese es un error encontrado en la plataforma