package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ShippingMethodPage {

    private final SelenideElement deliveryMessage = $x("//textarea[@name='delivery_message']");
    private final SelenideElement continueDeliveryOptionButton = $x("//button[@name='confirmDeliveryOption']");

    public ShippingMethodPage fillShippingInformation() {
        deliveryMessage.setValue("be careful with this t-shirts");
        return new ShippingMethodPage();
    }

    public PaymentPage clickContinueButton() {
        continueDeliveryOptionButton.click();
        return new PaymentPage();
    }
}
