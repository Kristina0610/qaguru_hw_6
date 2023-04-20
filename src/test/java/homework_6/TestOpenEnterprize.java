package homework_6;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestOpenEnterprize extends TestBaseClass {
  @Test
  void openEnrprize() {
    open("https://github.com/");
    $(".header-menu-wrapper").$(byText("Solutions")).hover();
    $(byText("Enterprise")).click();
    $(byTagName("h1")).shouldHave(text("Build like the best"));
  }
}
