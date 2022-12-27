package storeTest;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.StorePage;

public class StoreTest extends BaseTest {

    private final static String STORE_URL = "https://demo.prestashop.com/";

    @Test
    public void buyTwoItems() {

        new StorePage(STORE_URL).pageLoaded()       //Open StoragePage
                .switchIntoMainStoreFrame()
                .clickFirstProduct()                    //Click first item and navigate to ItemPage
                .clickButtonSubmit()
                .clickButtonContinueShopping()
                .clickShopLogo()                        //Click logo and navigate to StoragePage
                .clickSecondProduct()                   //Click second item and navigate to ItemPage
                .clickButtonSubmit()
                .clickButtonProceedToCheckout()         //Open CartPage
                .checkNumberItemsInCard(2)   //Check that two items in cart
                .clickButtonProceedToCheckoutCart()     //Open PersonalInformationPage
                .fillPersonalInformation()              //Fill PersonalInformationPage
                .clickContinueButton()
                .fillAddressInformation()               //Fill address
                .clickContinueButtonConfirmAddress()
                .fillShippingInformation()              //Fill shipping information
                .clickContinueButton()
                .fillPaymentInformation()               //Fill payment information
                .clickAgreementCheckbox()
                .clickPaymentConfirmationButton()       //Click payment confirmation button
                .checkOrderConfirmedMessage();          //Check confirmation message appeared
    }
}
