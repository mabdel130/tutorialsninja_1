package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P02_RegistrationPage;
import pages.P03_LoginPage;

import static drivers.DriverHolder.getDriver;
import static testcases.T02_Register.dynamicEmail;

public class T03_Login extends T01_BaseTest {
    P01_HomePage homePage;
    P03_LoginPage loginPage;
    P02_RegistrationPage registrationPage;
    T02_Register register;

    @Test(priority = 1, description = "SC1 - User could log in with valid email and password_P")
    public void user_can_login_With_Valid_Data() {
        homePage = new P01_HomePage(getDriver());
        loginPage = new P03_LoginPage(getDriver());
        registrationPage = new P02_RegistrationPage(getDriver());
        homePage.clickLogin();
        loginPage.login(register.dynamicEmail, register.dynamicPassword);
    }

    @Test(priority = 2, description = "SC2 - User cannot log in with an invalid email_N")
    public void userCannotLoginWithInvalidEmail() {
        homePage = new P01_HomePage(getDriver());
        loginPage = new P03_LoginPage(getDriver());
        homePage.clickLogin();
        String invalidEmail = "invalid_email@test.com";
        loginPage.login(invalidEmail, register.dynamicPassword);
    }

    @Test(priority = 3, description = "SC3 - User cannot log in with an invalid password_N")
    public void userCannotLoginWithInvalidPassword() {
        homePage = new P01_HomePage(getDriver());
        loginPage = new P03_LoginPage(getDriver());
        homePage.clickLogin();
        String invalidPassword = "wrongPassword123";
        loginPage.login(dynamicEmail, invalidPassword);
    }

    @Test(priority = 4, description = "SC4 - User cannot log in with empty fields_N")
    public void userCannotLoginWithEmptyFields() {
        homePage = new P01_HomePage(getDriver());
        loginPage = new P03_LoginPage(getDriver());
        homePage.clickLogin();

        loginPage.login("", "");
    }
}
