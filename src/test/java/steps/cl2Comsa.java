package steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.Logs;

public class cl2Comsa {
    private final  WebDriver driver;
    private String url;


    public cl2Comsa(World world) {
        driver = world.driver;
    }

    @Given("Ingresar a la página de login de Comsatel {string}")
    public void ingresarALaPáginaDeLoginDeComsatel(String url) {
        driver.get(url);
    }

    @When("Ingreso a las credenciales con usuario {string} y contraseña {string}")
    public void login(String user, String pass) {
        Logs.info("Escribo el usuario");
        driver.findElement(By.id("desUsuario")).sendKeys(user);

        Logs.info("Escribo el password");
        driver.findElement(By.id("desClave")).sendKeys(pass);

        Logs.info("Click en el boton de login");
        driver.findElement(By.cssSelector("button[type=submit]")).click();
    }

    @Then("login exitoso")
    public void loginExitoso() {
        System.out.println("Login exitoso");
    }



}
