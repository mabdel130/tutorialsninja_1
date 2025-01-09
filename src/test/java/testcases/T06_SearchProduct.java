package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P02_RegistrationPage;
import pages.P03_LoginPage;
import pages.P06_SearchPage;

import static drivers.DriverHolder.getDriver;
import static testcases.T02_Register.dynamicEmail;
import static testcases.T02_Register.dynamicPassword;

public class T06_SearchProduct extends T01_BaseTest {
    SoftAssert softAssert = new SoftAssert();
    P01_HomePage homePage;
    P06_SearchPage searchPage;
    P03_LoginPage loginPage;
    P02_RegistrationPage registration;
    T02_Register register;

    @Test(priority = 2, description = "SC4 - Logged User could search for any product_P")
    public void searchForProduct() {
        searchPage = new P06_SearchPage(getDriver());
        homePage = new P01_HomePage(getDriver());
        loginPage = new P03_LoginPage(getDriver());
        registration = new P02_RegistrationPage(getDriver());
        register = new T02_Register();
        homePage.clickLogin();
        loginPage.login(dynamicEmail, dynamicPassword);
        homePage.clickSearch("iMac");
        homePage.search_confirmation();
        softAssert.assertEquals(searchPage.get_title(), "iMac", "Product title mismatch!");
        softAssert.assertNotNull(searchPage.getprice(), "Product price not displayed!");
        softAssert.assertAll();

    }

}
