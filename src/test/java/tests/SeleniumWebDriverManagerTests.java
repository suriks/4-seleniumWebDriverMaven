package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverManagerTests {

    @Test
    public void FillFormTest(){

        // create driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // open page
        driver.get("https://academ-it.ru/mantisbt/login_page.php");
        driver.manage().window().maximize();

        // close window
        driver.quit();
    }
}
