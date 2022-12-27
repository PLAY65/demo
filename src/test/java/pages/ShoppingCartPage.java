package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class ShoppingCartPage {

    private final SelenideElement cartProductCount = $x("//span[@class='cart-products-count']");
    private final SelenideElement buttonContinueShopping = $x("//button[@class='btn btn-secondary']");
    private final SelenideElement buttonProceedToCheckoutCart = $x("//div[@class='text-sm-center']/a[@class='btn btn-primary']");

    public ShoppingCartPage checkNumberItemsInCard(int itemsNumber) {
        cartProductCount.shouldBe(Condition.visible, Duration.ofSeconds(15)).shouldHave(Condition.text("(" + itemsNumber + ")"));
        return new ShoppingCartPage();
    }

    public PersonalInformationPage clickButtonProceedToCheckoutCart() {
        buttonProceedToCheckoutCart.click();
        return new PersonalInformationPage();
    }
}
