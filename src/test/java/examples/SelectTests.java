package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTests {

    @Test
    public void SelectTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://htmlbook.ru/html/select");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.name("select2"));
        Select select = new Select(element);

//        select.selectByIndex(3);
        select.selectByVisibleText("Шапокляк");

        Thread.sleep(3000);

        Assertions.assertEquals("Шапокляк", select.getFirstSelectedOption().getText());

        driver.quit();
    }
}
