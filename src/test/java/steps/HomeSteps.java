package steps;

import Pages.HomePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Logs;

public class HomeSteps {

    private final HomePage homePage;

    public HomeSteps(World world) {
        this.homePage = new HomePage(world.driver);

    }

    @Given("presionamos el boton de menú")
    public void presionamosElBotonDeMenú() {

        Logs.info("Cliqueamos el boton de menu");
        homePage.clickMenu();
    }

    @When("clicamos el boton en configuraciones")
    public void clicamosElBotonEnConfiguraciones() {

        Logs.info("Cliqueamos el boton en configuraciones");
        homePage.clickBtnConfiguration();
    }

    @And("clicamos el boton de grupos")
    public void clicamosElBotonDeGrupos() {

        Logs.info("Cliqueamos el boton de grupos");
        homePage.btnGroups();
    }

    @Then("nos muestra el título de grupo")
    public void nosMuestraElTítuloDeGrupo() {

        Logs.info("Comparar titulo de grupo");
        homePage.titleGroups();
    }
}
