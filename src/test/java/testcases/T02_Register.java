package testcases;

import org.testng.annotations.Test;
import pages.*;

import static drivers.DriverHolder.getDriver;
import static util.Utlity.*;

public class T02_Register extends T01_BaseTest {

    static String dynamicFirstName = generateRandomCapitalizedFirstName();
    static String dynamicLastName = generateRandomCapitalizedLastName();
    static String dynamicEmail = generateDynamicEmail();
    static String dynamicTelephone = generateEgyptianPhoneNumber();
    static String dynamicPassword = generateDynamicPassword();
    P01_HomePage homePage;
    P02_RegistrationPage registrationPage;
    P03_LoginPage loginPage;
    P04_LogoutPage logoutPage;
    P05_ResetPasswordPage resetPasswordPage;

    @Test(priority = 1, description = "SC1 - User could register with valid data_P")
    public void register_with_valid_data() {
        homePage = new P01_HomePage(getDriver());
        loginPage = new P03_LoginPage(getDriver());
        registrationPage = new P02_RegistrationPage(getDriver());
        logoutPage = new P04_LogoutPage(getDriver());
        resetPasswordPage = new P05_ResetPasswordPage(getDriver());
        homePage.clickRegister();
        registrationPage.register(dynamicFirstName, dynamicLastName, dynamicEmail, dynamicTelephone, dynamicPassword);
        registrationPage.Your_Account_Has_Been_Created();
        registrationPage.contaftermsg();

        homePage.clickMyAccount();
        logoutPage.logout();
    }
}
