package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTests {

    @Test
    public void WaitTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30, 500);

        driver.get("https://news.s7.ru/news?id=13441");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("author")));
        WebElement author = driver.findElement(By.id("author"));
        author.sendKeys("Selenium");
        Thread.sleep(3000);

        driver.quit();
    }
}
