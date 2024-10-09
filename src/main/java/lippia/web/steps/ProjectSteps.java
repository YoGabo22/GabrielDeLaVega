package lippia.web.steps;
import io.cucumber.java.en.Then;
import lippia.web.services.ProjectService;

public class ProjectSteps {



    @Then("El usuario verifica el nombre del projecto (.*) en projects")
    public void elUsuarioVerificaElNombreDelProjectoPrueba1EnProjects(String name) {
        ProjectService.verifyProjectName(name);
    }
}
