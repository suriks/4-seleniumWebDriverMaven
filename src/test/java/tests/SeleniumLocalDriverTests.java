package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocalDriverTests {

    @Test
    public void FillFormTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://academ-it.ru/mantisbt/login_page.php");
        driver.manage().window().maximize();

        driver.quit();
    }

}
