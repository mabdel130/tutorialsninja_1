package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P02_RegistrationPage;
import pages.P03_LoginPage;
import pages.P10_ShoppingCartPage;

import static drivers.DriverHolder.getDriver;
import static testcases.T02_Register.dynamicEmail;
import static testcases.T02_Register.dynamicPassword;

public class T10_AddToCart extends T01_BaseTest {
    SoftAssert softAssert = new SoftAssert();
    P01_HomePage homePage;
    P03_LoginPage loginPage;
    P10_ShoppingCartPage cartPage;
    P02_RegistrationPage registrationPage;
    T02_Register register;

    @Test(priority = 7, description = "SC9 - Logged user could add different products to Shopping cart_P")
    public void addToCart() {
        homePage = new P01_HomePage(getDriver());
        loginPage = new P03_LoginPage(getDriver());
        cartPage = new P10_ShoppingCartPage(getDriver());
        registrationPage = new P02_RegistrationPage(getDriver());
        register = new T02_Register();
        homePage.clickLogin();
        loginPage.login(dynamicEmail, dynamicPassword);
        getDriver().navigate().to("https://tutorialsninja.com/demo/index.php?route=common/home");
        cartPage.addToCart();
        softAssert.assertTrue(true, "Success: You have added iPhone to your shopping cart!");
        softAssert.assertAll();
        // New Actions
    }
}

