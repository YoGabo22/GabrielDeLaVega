package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;
import lippia.web.services.TimeTrackerService;

public class TimeTrackerSteps extends PageSteps {


    @Then("El usuario se encuentra en la pagina TimeTracker")
    public void elUsuarioSeEncuentraEnLaPaginaTimeTracker() {
        LoginService.verifyLogin();
    }

    @When("El usuario hace click en 'Project'")
    public void elUsuarioHaceClickEnProject() {
        TimeTrackerService.createProject();
    }

    @And("El usuario hace click en 'Create new project'")
    public void elUsuarioHaceClickEnCreateNewProject() {
        TimeTrackerService.createNewProject();
    }

    @And("El usuario ingresa nombre (.*)")
    public void elUsuarioIngresaNombrePrueba1(String name) {
        TimeTrackerService.setName(name);

    }

    @And("El usuario hace click en 'Create'")
    public void elUsuarioHaceClickEnCreate() {
        TimeTrackerService.create();

    }


//    @Then("El usuario hace click dentro del menu de Clockify en {string}")
//    public void elUsuarioHaceClickDentroDelMenuDeClockifyEnProject() {
//        TimeTrackerService.projects();
//
//    }


    @When("El usuario hace click en el menu de workspace")
    public void elUsuarioHaceClickEnElMenuDeWorkspace() {
        TimeTrackerService.workspace();

    }

    @And("El usuario hace click en Manage Workspace")
    public void elUsuarioHaceClickEnManageWorkspace() {
        TimeTrackerService.manageWorkSpace();
    }

    @And("El usuario hace click en 'Create New Workspace'")
    public void elUsuarioHaceClickEnCreateNewWorkspace() {

        TimeTrackerService.createNewWorkSpace();
    }


}
