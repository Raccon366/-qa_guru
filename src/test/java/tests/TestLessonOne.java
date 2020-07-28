package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

class TestLessonOne {

    @Test
    void testSelenideSearchSelenideInGoogle() {
        // Открыть google
        open("https://google.com");
        // Ввести Selenide в поиск
        $(byName("q")).setValue("Selenide").pressEnter();
        // Проверить, что Selenide появился в результатах поиска
        $("html").shouldHave(text("ru.selenide.org"));
    }

    @Test
    void testSelenideSearchGitInGoogle() {
        // Открыть google
        open("https://google.com");
        // Ввести Selenide в поиск
        $(byName("q")).setValue("Git").pressEnter();
        // Проверить, что Selenide появился в результатах поиска
        $("html").shouldHave(text("git-scm.com"));
    }

    @Test
    void testSelenideSearchQaGuruInGoogle() {
        // Открыть google
        open("https://google.com");
        // Ввести Selenide в поиск
        $(byName("q")).setValue("qa guru").pressEnter();
        // Проверить, что Selenide появился в результатах поиска
        $("html").shouldHave(text("qa.guru"));
    }

    @Test
    void testSelenideSearchSelenideInYandex() {
        // Открыть google
        open("https://yandex.ru");
        // Ввести Selenide в поиск
        $x(".//input[@aria-label='Запрос']").setValue("Selenide").pressEnter();
        // Проверить, что Selenide появился в результатах поиска
        $("html").shouldHave(text("ru.selenide.org"));
    }
}
