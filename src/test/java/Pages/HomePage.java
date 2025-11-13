package Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BasePage;

public class HomePage extends BasePage {

    private final By menu = By.cssSelector("btn-desplegable-side");
    private final By btnClean = By.xpath("//button[.//span[text()='Limpiar']]");
    private final By btnSearch =  By.xpath("//button[.//span[text()='Buscar']]");
    private final By filter = By.className("p-element");
    private final By btnConfiguration = By.xpath("//div[text()=' Configuraciones ']");
    private final By btnGroups = By.xpath("//div[text()=' Grupos ']");
    private final By titleGroups = By.xpath("//h2[normalize-space()='Grupos']");
    private final String titleWait = "Grupos";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickMenu(){
        driver.findElement(menu).click();
    }

    public void clickBtnConfiguration(){
    driver.findElement(btnConfiguration).click();
    }
    public void btnGroups(){
        driver.findElement(btnGroups).click();
    }
    public void titleGroups(){
        String actText = driver.findElement(titleGroups).getText().trim();
        Assertions.assertEquals(titleWait, actText);
    }

}
