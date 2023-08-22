package testsLocal;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

    public class TestBase {
        @BeforeAll
        static void beforeAll() {
            Configuration.browser = AndroidLocalDriver.class.getName();
            Configuration.browserSize = null;
            Configuration.timeout = 5000;
        }

        @BeforeEach
        void addListener() {
            SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
            open();
        }

        @AfterEach
        void afterEach() {
            Attach.screenshotAs("Last screenshot");
            Attach.pageSource();

            closeWebDriver();
        }
    }

}
