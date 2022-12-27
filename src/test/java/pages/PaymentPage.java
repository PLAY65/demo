package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PaymentPage {

    private final SelenideElement paymentOption = $x("//input[@id='payment-option-1']");
    private final SelenideElement checkboxAgreement = $x("//input[contains(@id,'conditions')]");
    private final SelenideElement paymentConfirmationButton = $x("//div[contains(@id,'payment-confirmation')]//button");

    public PaymentPage fillPaymentInformation() {
        paymentOption.click();
        return new PaymentPage();
    }

    public PaymentPage clickAgreementCheckbox() {
        checkboxAgreement.click();
        return new PaymentPage();
    }

    public OrderedConfirmationPage clickPaymentConfirmationButton() {
        paymentConfirmationButton.click();
        return new OrderedConfirmationPage();
    }
}
