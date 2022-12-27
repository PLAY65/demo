package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class OrderedConfirmationPage {

    private final SelenideElement orderConfirmedMessage = $x("//h3[contains(., 'Your order is confirmed')]");

    public void checkOrderConfirmedMessage() {
        orderConfirmedMessage.shouldBe(Condition.visible, Duration.ofSeconds(5));
    }
}
