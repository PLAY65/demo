package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class ItemPage {
    private final SelenideElement buttonAddToCart = $x("//button[@type='submit']");
    private final SelenideElement buttonContinueShopping = $x("//button[@class='btn btn-secondary']");
    private final SelenideElement buttonProceedToCheckout = $x("//div[@class='cart-content-btn']/a[@class='btn btn-primary']");

    private final SelenideElement logoLink = $x("//div[@id='_desktop_logo']/a");

    private Duration await_5_seconds = Duration.ofSeconds(5);

    public ItemPage clickButtonSubmit() {
        buttonAddToCart.shouldBe(Condition.visible, await_5_seconds);
        buttonAddToCart.click();
        return new ItemPage();
    }

    public ItemPage clickButtonContinueShopping() {
        buttonContinueShopping.shouldBe(Condition.visible, await_5_seconds);
        buttonContinueShopping.click();
        buttonContinueShopping.shouldNotBe(Condition.visible, await_5_seconds);
        return new ItemPage();
    }

    public ShoppingCartPage clickButtonProceedToCheckout() {
        buttonProceedToCheckout.shouldBe(Condition.visible, await_5_seconds);
        buttonProceedToCheckout.click();
        return new ShoppingCartPage();
    }

    public StorePage clickShopLogo() {
        logoLink.click();
        return new StorePage();
    }
}
