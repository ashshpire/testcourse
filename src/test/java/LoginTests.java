import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests {
    @Test
    void successfulLoginTest() {
        Configuration.holdBrowserOpen = true;
        //open authorization page
        open("https://github.com/login");

        //fill in login
        $("[name=login]").setValue("ashshpire");

        //fill in password
        $("[name=password]").setValue("W1b2z3d4!");
        $("[name=commit]").click();
        $("[class=text-normal]").shouldHave(text("Join GitHub Education!"));
    }
}
