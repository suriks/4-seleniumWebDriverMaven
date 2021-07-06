package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTests {

    @Test
    public void RadioButtonTest() throws InterruptedException {

        // create driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // open page
        driver.get("https://academ-it-school.ru/payment?course=java_begin");
        driver.manage().window().maximize();

        // select radio button
        WebElement radioButtonTesting = driver.findElement(By.cssSelector("input[name='CourseType'][value='Testing']"));
        radioButtonTesting.click();

        // check that radio button is selected
        Assertions.assertTrue(radioButtonTesting.isSelected());

        Thread.sleep(3000);

        // close window
        driver.quit();
    }
}
