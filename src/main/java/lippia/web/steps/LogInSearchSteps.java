package lippia.web.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import lippia.web.services.GoogleSearchResultService;
import lippia.web.services.LogInSearchResultService;
import lippia.web.services.LogInService;

public class LogInSearchSteps {

    //Get Access to log In From Home Page
    @Given("^The client is on clockify home page$")
    public void ClockifyHomePage() {
        LogInService.navegarWebClockify();
    }

    @When("^The client click on LogIn button(.*)$")
    public void TheClientClickOnLogIn(String criteria) {
        LogInService.clickLogInButton();
    }

    @Then("The client get access to clockify LogIn page")
    public void TheClientGetAccessToClockifyLogIn() {
        LogInSearchResultService.verifyResults();
    }


    //LogIn
    @Given("^The client is on clockify log in page$")
    public void LogInPage() {
        LogInService.navegarWebLogIn();
    }

    @When("The client click on 'Log in manually'")
    public void theClientClickOnButton(String arg0) {
        LogInService.clickManuallyLogIn();
    }

    @And("the client set the email {string}")
    public void theClientSetTheEmail(int arg0) {
        LogInService.SetEMail();
    }

    @And("the client set the password {string}")
    public void theClientSetThePassword(int arg0) {
        LogInService.SetPassword();
    }

    @And("the client click on LogIn button")
    public void theClientClickOnLogInButton() {
        LogInService.clickLogIn();
    }



}
