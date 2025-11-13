package steps;

import Pages.LoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import utilities.Logs;

public class LoginStep {

    private final LoginPage loginPage;
    private final String url = "https://oauth2.dev.comsatel.com.pe/realms/Apps/protocol/openid-connect/auth?client_id=cl2-svrbasico&redirect_uri=https%3A%2F%2Fcl2webportal.qa.comsatel.com.pe%2Fhome%2Funidad%2Fmapa&state=dd6c1730-b8b4-44b6-8d9c-c4ab63357b51&response_mode=fragment&response_type=code&scope=openid&nonce=825856c0-fec1-4374-888a-e841efa4458e&code_challenge=rHW0XKvM-GZqRS-d0zS9b9fkVcPCEa7TRKQSMjCJUF4&code_challenge_method=S256";
    private final String user = "qacomsatel@gmail.com";
    private final String pass = "welcome1";

    public LoginStep(World world) {
        this.loginPage = new LoginPage(world.driver);
    }

    @Given("que el usuario navega al login de comsatel")
    public void navigateComsatel() {
        Logs.info("navegar a la url de login de comsatel");
       loginPage.navigateToLogin(url);
    }

    @Then("el login es exitoso")
    public void loginSucess() {
        Logs.info("el login es exitoso");
        loginPage.login(user, pass);

        Logs.info("Click boton de login");
        loginPage.clickLogin();

    }
}
