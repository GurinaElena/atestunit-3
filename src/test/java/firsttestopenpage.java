
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class firsttestopenpage {

    private WebDriver driver;

    @BeforeAll
   static void setUpAll () {
        System.setProperty("webdriver.chrome.driver", "C:\\tmp\\chromedriver.exe");

     }

         @Test
        void shouldTest() {
        open("http://localhost:9999");
        SelenideElement form = $("[id=root]");
        form.$("[data-test-id=name] input").setValue("Гурина Елена");
        form.$("[data-test-id=phone] input").setValue("+79159638319");
        form.$("[data-test-id=agreement]").click();
        form.$(".button").click();
        $("[data-test-id=order-success]").shouldHave(exactText(" Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }
}







