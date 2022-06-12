package products;

import base.Pages;
import helpers.RandomHelper;
import models.SocialTitle;
import org.testng.annotations.Test;
import pages.checkout.PersonalInfoCheckoutPage;
import static org.assertj.core.api.Assertions.*;

public class CheckoutTests extends Pages {

    @Test
    public void shouldBuyProduct(){
        productsGridPage.openProductWithName("HUMMINGBIRD T-SHIRT");

        productDetailsPage.addToCart();

        cartPopupPage.proceedToCheckout();

        cartPage.proceedToCheckout();

        personalInfoCheckoutPage
                .selectSocialTitle(SocialTitle.Mr)
                .setFirstName("Dżordż")
                .setLastName("Klunej")
                .setEmail(RandomHelper.getRandomEmail())
                .setPassword("haselko18")
                .acceptPolices();

        personalInfoCheckoutPage.goToAddressCheckoutStep();

        addressCheckoutPage.setAddress("Testowa 15")
                .selectState("Texas")
                .setPostcode("00007")
                .setCity("Pacanowo")
                .confirmAddresses();

        shippingCheckoutPage.confirmDeliveryOption();

        paymentsCheckoutPage.peyByCheck()
                .agreeToThermsOfService()
                .confirmPayment();

        assertThat(checkoutConfirmationPage.getOrderConfirmationMsg()).contains("YOUR ORDER IS CONFIRMED");

        String orderNumber = checkoutConfirmationPage.getOrderNumber();
        System.out.println("Order number is "+orderNumber);
        topMenuPage.goToMyAccount();

        myAccountPage.goToHistoryOfOrders();
        assertThat(orderDetailsPage.setReferenceOrderNumber()).contains(orderNumber);

        // ***dla chętnych: weryfikacja danych kupionego produktu (nazwa, cena, ilosc, cena laczna)

        // pkt 5 do zmiennej zapisz wygenerowany numer zamowienia

        // otworz zamowienie o numerze z pkt 5
        // sprzeczy czy tekst "Order Reference JBCERFQZQ - placed on 06/11/2022" zawiera numer zamowienia z pkt5
        // ****dla chetnych spr pozostałe szczegoly zamowienia

    }
}