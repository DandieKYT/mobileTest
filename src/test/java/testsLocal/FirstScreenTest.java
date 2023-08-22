package testsLocal;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class FirstScreenTest {
    @Test
    void checkoutTest() {
        $(id("org.wikipedia.alpha:id/primaryTextView")).shouldBe(Condition.text("The Free Encyclopedia …in over 300 languages"));
        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();

        $(id("org.wikipedia.alpha:id/primaryTextView")).shouldBe(Condition.text("New ways to explore"));
        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();

        $(id("org.wikipedia.alpha:id/primaryTextView")).shouldBe(Condition.text("Reading lists with sync"));
        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();

        $(id("org.wikipedia.alpha:id/primaryTextView")).shouldBe(Condition.text("Send anonymous data"));
        $(id("org.wikipedia.alpha:id/acceptButton")).click();
    }
}
