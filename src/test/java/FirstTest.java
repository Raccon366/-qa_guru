import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;


public class FirstTest {

    @Test
    public void testGoogle() {
        open("https://www.google.com/");
        $(byName("q")).val("Selenide Test");
        $(byName("btnK")).click();
    }

}
