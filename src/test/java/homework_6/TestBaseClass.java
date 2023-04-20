package homework_6;

import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.*;

public class TestBaseClass {
  @BeforeAll
  static void beforeAll() {
    browser = "firefox";
    browserSize = "1520x800";
    holdBrowserOpen = true;
    timeout = 6000;
  }
}
