package homework_6;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestDragAndDrop extends TestBaseClass {
  @Test
    // Тест НЕ РАБОТАЕТ
  void dragAndDropWithActions() {
    //Открыть сайт https://the-internet.herokuapp.com/drag_and_drop
    open("https://the-internet.herokuapp.com/drag_and_drop");
    //Проверить, чт находимся на нужной странице
    $(".example").shouldHave(text("Drag and Drop"));
    //Проверить исходное положение прямоугольников
    $("#column-a").shouldHave(exactText("A"));
    $("#column-b").shouldHave(exactText("B"));
    //Навести курсор на прямоугольник В
    $("#column-b").hover();
    //Кликнуть по прямоугольнику В, зажать ЛК мышки и перетащить на другое место, отпустить ЛК
    actions().clickAndHold().moveByOffset(-200, 0).release().perform();
    //Проверить положение прямоугольников
    $("#column-a").shouldHave(exactText("B"));
  }

  @Test
  void dragAndDrop() {
    //Открыть сайт https://the-internet.herokuapp.com/drag_and_drop
    open("https://the-internet.herokuapp.com/drag_and_drop");
    //Проверить, чт находимся на нужной странице
    $(".example").shouldHave(text("Drag and Drop"));
    //Проверить исходное положение прямоугольников
    $("#column-a").shouldHave(exactText("A"));
    $("#column-b").shouldHave(exactText("B"));
    //Поменять местами прямоугольники
    $("#column-a").dragAndDropTo($("#column-b"));
    //Проверить положение прямоугольников
    $("#column-a").shouldHave(exactText("B"));
  }
}
