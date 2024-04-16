@CarlosCampos_TP1_workspace
Feature: workspace

Background: 
Given estoy en "https://app.clockify.me/workspaces"

@CrearWorkspaceExistoso
Scenario: Crear un nuevo workspace
When hago click en botón "Crear nuevo espacio de trabajo"
And hago ingreso un nombre entre 2 y 250 caracteres
Then habilito el botón "crear"

@CrearWorkspaceFallido
Scenario: Falla al crear un nuevo workspace por nombre duplicado
When hago click en botón "Crear nuevo espacio de trabajo"
And hago ingreso un nombre de workspace que ya se encuentra Creado respetando las mayúsculas y minúsculas 
And hago click en botón "Crear"
Then Muestra el mensaje de error "Espacio de trabajo con el nombre 'xxxxx' ya existe"

@ActivarWorkspace
Scenario: Activar un workspace correctamente
When hago click en el link "Activar" de un workspace
Then Muestra el mensaje de confirmacion "Se cambió el espacio de trabajo predeterminado"
And muestro el nombre del workspace activo en la barra superior.

@ConfirmEliminarWorkspace
Scenario: Confirmación para Eliminar un workspace
When hago click en X para eliminar un workspace que no se encuentre activo
Then Muestra el confirmacion para eliminar un espacio de trabajo

@EliminarWorkspaceFallido
Scenario: Eliminar un workspace Fallido por tener proyectos activos
When hago click en X para eliminar un workspace que no se encuentre activo
And ingreso una palabra distinta a DELETE en la ventana de confirmacion
Then No se habilita el botón de "Eliminar espacio de trabajo"