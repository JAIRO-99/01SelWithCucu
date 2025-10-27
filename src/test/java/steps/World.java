package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Logs;

public class World {
    WebDriver driver;

    @BeforeAll
    public static void beforeAll() {
        Logs.info("Before All");
    }

    @AfterAll
    public static void afterAll() {
        Logs.info("After All");
    }
    
    @Before
    public void setUp()
    {
    Logs.debug("Iniciando WebDriver");
        driver = new ChromeDriver();

        Logs.debug("Maximizando pantalla");
        driver.manage().window().maximize();

        Logs.debug("Eliminado coockies");
        driver.manage().deleteAllCookies();

    }

    @After
    public void tearDown()
    {
        Logs.debug("Finalizando WebDriver");
        driver.quit();
    }
}
