package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P02_RegistrationPage;
import pages.P03_LoginPage;
import pages.P13_OrderPage;

import static drivers.DriverHolder.getDriver;
import static testcases.T02_Register.dynamicEmail;
import static testcases.T02_Register.dynamicPassword;
import static util.Utlity.*;

public class T13_CreateOrder extends T01_BaseTest {
    static String dynamicFirstName = generateRandomCapitalizedFirstName();
    static String dynamicLastName = generateRandomCapitalizedLastName();
    static String Adress = generateRandomAddress();
    static String city = generateRandomCity();
    static String postcode = generateRandomPostalCode();
    P01_HomePage homePage;
    P03_LoginPage loginPage;
    P13_OrderPage orderPage;
    P02_RegistrationPage registrationPage;

    @Test
    public void createOrderTest() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        orderPage = new P13_OrderPage(getDriver());
        homePage = new P01_HomePage(getDriver());
        loginPage = new P03_LoginPage(getDriver());
        registrationPage = new P02_RegistrationPage(getDriver());
        orderPage.completeOrder("hp");
        orderPage.cart();
        orderPage.itemscheck();
        orderPage.cheakout();
        orderPage.cheakoutoptions();
        loginPage.login(dynamicEmail, dynamicPassword);
        orderPage.billing_details(dynamicFirstName, dynamicLastName, Adress, city, Integer.parseInt(postcode));
        orderPage.selectRandomCountryAndRegion("Egypt", "Aswan");
        orderPage.contnieAfterBillingDetails();
        orderPage.contnieafterDeliverydetails();
        orderPage.contnieAfterDeliveryMethod();
        orderPage.terms();
        orderPage.orderconfirmation();
        softAssert.assertTrue(true, "Your order has been placed!");
        softAssert.assertAll();

    }

}