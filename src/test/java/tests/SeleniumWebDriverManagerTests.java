package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebDriverManagerTests {

    @Test
    public void FillFormTest() throws InterruptedException {
        // create driver
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        // open page
        driver.get("https://academ-it.ru/mantisbt/login_page.php");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        // close window
        driver.quit();
    }
}
