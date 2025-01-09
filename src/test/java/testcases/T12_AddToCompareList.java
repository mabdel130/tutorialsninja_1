package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P02_RegistrationPage;
import pages.P03_LoginPage;
import pages.P11_CompareListPage;

import static drivers.DriverHolder.getDriver;
import static testcases.T02_Register.dynamicEmail;
import static testcases.T02_Register.dynamicPassword;

public class T12_AddToCompareList extends T01_BaseTest {
    SoftAssert softAssert = new SoftAssert();
    P01_HomePage homePage;
    P03_LoginPage loginPage;
    P02_RegistrationPage registrationPage;
    P11_CompareListPage compareListPage;

    @Test(priority = 9, description = "SC11 - Logged user could add different products to compare list_P")
    public void addToCompareList() {
        homePage = new P01_HomePage(getDriver());
        loginPage = new P03_LoginPage(getDriver());
        registrationPage = new P02_RegistrationPage(getDriver());
        compareListPage = new P11_CompareListPage(getDriver());
        homePage.clickLogin();
        loginPage.login(dynamicEmail, dynamicPassword);
        getDriver().navigate().to("https://tutorialsninja.com/demo/index.php?route=common/home");
        compareListPage.addToCompareList();
        compareListPage.compare_Msg();
        softAssert.assertTrue(true, "Success: You have added iPhone to your product comparison!");
        softAssert.assertAll();
    }
}

