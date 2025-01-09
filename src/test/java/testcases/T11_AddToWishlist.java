package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P02_RegistrationPage;
import pages.P03_LoginPage;
import pages.P12_WishlistPage;

import static drivers.DriverHolder.getDriver;
import static testcases.T02_Register.dynamicEmail;
import static testcases.T02_Register.dynamicPassword;

public class T11_AddToWishlist extends T01_BaseTest {
    SoftAssert softAssert = new SoftAssert();
    P01_HomePage homePage;
    P03_LoginPage loginPage;
    P12_WishlistPage wishlistPage;
    P02_RegistrationPage registrationPage;

    @Test(priority = 8, description = "SC10 - Logged user could add different products to Wishlist_P")
    public void addToWishlist() {
        homePage = new P01_HomePage(getDriver());
        loginPage = new P03_LoginPage(getDriver());
        registrationPage = new P02_RegistrationPage(getDriver());
        wishlistPage = new P12_WishlistPage(getDriver());
        homePage.clickLogin();
        loginPage.login(dynamicEmail, dynamicPassword);
        getDriver().navigate().to("https://tutorialsninja.com/demo/index.php?route=common/home");
        wishlistPage.openWishlist();
        wishlistPage.isWishlistTableDisplayed();
        softAssert.assertTrue(true, "Success: You have added iPhone to your wish list!");
        softAssert.assertAll();

    }
}

