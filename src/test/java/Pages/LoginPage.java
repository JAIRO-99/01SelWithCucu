package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BasePage;
import utilities.Logs;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By txtUser = By.id("desUsuario");
    private final By txtPass = By.id("desClave");
    private final By btnLogin = By.cssSelector("button[type=submit]");

    public void navigateToLogin(String url) {
        Logs.info("Obtener la url" + url);
        driver.get(url);
    }

    public void login(String usuario, String clave) {

        Logs.info("Escriba el usuario " + usuario);
        driver.findElement(txtUser).sendKeys(usuario);

        Logs.info("Escriba el clave " + clave);
        driver.findElement(txtPass).sendKeys(clave);

    }

    public void clickLogin() {

        Logs.info("Click en el boton de login");
        driver.findElement(btnLogin).click();
    }
}
