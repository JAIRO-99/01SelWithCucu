package steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ejemplo {

    private final WebDriver driver;
    private String urlActual;
    private String urlesperado;

    public ejemplo(World world) {
        driver = world.driver;
    }

    @Given("Navego a la página {string}")
    public void navegarUrl(String url) {
        // Write code here that turns the phrase above into concrete actions
        driver.get(url);
        urlesperado = url;
    }

    @When("Obtengo la url con el driver")
    public void obtengoLaUrlConElDriver() {
        // Write code here that turns the phrase above into concrete actions
       urlActual = driver.getCurrentUrl();
    }

    @Then("Verifico la url obtenida sea igual a la cual se navegó")
    public void verificarUrl() {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertEquals(urlActual, urlesperado);
    }
}
