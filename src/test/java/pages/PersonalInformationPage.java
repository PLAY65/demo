package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PersonalInformationPage {

    private final SelenideElement genderMr = $x("//input[contains(@id,'id_gender-1')]");
    private final SelenideElement firstname = $x("//input[contains(@id,'firstname')]");
    private final SelenideElement lastname = $x("//input[contains(@id,'lastname')]");
    private final SelenideElement email = $x("//input[contains(@id,'email')]");
    private final SelenideElement birthday = $x("//input[contains(@id,'birthday')]");
    private final SelenideElement checkboxPrivacy = $x("//input[contains(@name,'privacy')]");
    private final SelenideElement checkboxPolicy = $x("//input[contains(@name,'psgdpr')]");
    private final SelenideElement continueButton = $x("//input[@name='submitCreate']/following-sibling::button[contains(@name,'continue')]");

    public PersonalInformationPage fillPersonalInformation() {
        genderMr.click();
        firstname.setValue("User");
        lastname.setValue("Userovich");
        email.setValue("user@mail.com");
        birthday.setValue("05/31/1970");
        checkboxPrivacy.click();
        checkboxPolicy.click();
        return new PersonalInformationPage();
    }

    public AddressPage clickContinueButton() {
        continueButton.click();
        return new AddressPage();
    }
}
