package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P03_LoginPage;
import pages.P05_ResetPasswordPage;

import static drivers.DriverHolder.getDriver;
import static testcases.T02_Register.dynamicEmail;

public class T05_ResetPassword extends T01_BaseTest {
    SoftAssert softAssert = new SoftAssert();
    P01_HomePage homePage;
    P03_LoginPage loginPage;
    P05_ResetPasswordPage resetPasswordPage;

    @Test(priority = 1, description = "SC3 - User could reset his/her password successfully_P")
    public void resetPassword() {
        homePage = new P01_HomePage(getDriver());
        loginPage = new P03_LoginPage(getDriver());
        resetPasswordPage = new P05_ResetPasswordPage(getDriver());
        homePage.clickLogin();
        resetPasswordPage.resetPassword(dynamicEmail);
        String expectedMessage = "An email with a confirmation link has been sent your email address.";
        softAssert.assertEquals(resetPasswordPage.getSuccessMessage(),
                expectedMessage, "An email with a confirmation link has been sent your email address.");
        softAssert.assertAll();
    }
}

