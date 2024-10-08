package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LogOutService;
import lippia.web.services.LoginService;

public class LogOutSteps {

    @When("El usuario hace click en su perfil")
    public void elUsuarioHaceClickEnSuPerfil() {
        LogOutService.verPerfil();
    }

    @And("El usuario hace click en Log Out")
    public void elUsuarioHaceClickEnLogOut() {
        LogOutService.closeSession();
    }

    @Then("El usuario se encuentra en la pagina para login")
    public void elUsuarioSeEncuentraEnLaPaginaParaLogin() {
        LogOutService.verifyLogOut();
    }
}
