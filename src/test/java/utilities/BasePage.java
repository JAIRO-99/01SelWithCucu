package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickClean (By locator)
    {
    driver.findElement(locator);
    }

    protected WebElement clickSearch (By locator) {

       return driver.findElement(locator);
    }
    protected WebElement clickFilter (By locator) {

        return driver.findElement(locator);
    }

}
