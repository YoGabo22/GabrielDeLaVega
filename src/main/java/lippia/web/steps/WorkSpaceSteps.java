package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.ProjectService;
import lippia.web.services.WorkSpaceService;

public class WorkSpaceSteps {

    @And("El usuario ingresa nombre (.*)")
    public void elUsuarioIngresaNombreWork1(String Wname) {
        WorkSpaceService.setName(Wname);

    }

    @And("El usuario hace click en 'Create' para crear el workspace")
    public void elUsuarioHaceClickEnCreate() {
        WorkSpaceService.create();

    }

    @Then("El usuario confirma en la lista que el workspace (.*) ha sido creado")
    public void elUsuarioConfirmaEnLaListaQueElWorkspaceWork1HaSidoCreado(String name) {
        WorkSpaceService.verifyWorkSpaceName(name);
    }
}
