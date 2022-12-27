package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AddressPage {
    private final SelenideElement firstAddress = $x("//input[@name='address1']");
    private final SelenideElement postCode = $x("//input[@name='postcode']");
    private final SelenideElement nameCity = $x("//input[@name='city']");
    private final SelenideElement continueConfirmAddressButton = $x("//button[contains(@name,'confirm-address')]");

    public AddressPage fillAddressInformation() {
        firstAddress.setValue("street Krasivaya");
        postCode.setValue("12345");
        nameCity.setValue("Minsk");
        return new AddressPage();
    }

    public ShippingMethodPage clickContinueButtonConfirmAddress() {
        continueConfirmAddressButton.shouldBe(Condition.enabled).click();
        return new ShippingMethodPage();
    }
}
