package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SelenideTests {

    @Test
    public void FillFormTest() {
        // maximize window
        Configuration.startMaximized = true;

        // open page
        open("https://academ-it.ru/mantisbt/login_page.php");
    }
}
