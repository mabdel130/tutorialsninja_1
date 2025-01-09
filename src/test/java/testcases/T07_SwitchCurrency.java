package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P02_RegistrationPage;
import pages.P03_LoginPage;
import pages.P07_CurrencyPage;

import static drivers.DriverHolder.getDriver;
import static testcases.T02_Register.dynamicEmail;
import static testcases.T02_Register.dynamicPassword;

public class T07_SwitchCurrency extends T01_BaseTest {
    P07_CurrencyPage currencyPage;
    P01_HomePage homePage;
    P03_LoginPage loginPage;
    T02_Register register;
    P02_RegistrationPage registration;

    @Test(priority = 3, description = "SC5 - Logged User could switch between currencies US-Euro_P")
    public void switchCurrency() {
        homePage = new P01_HomePage(getDriver());
        loginPage = new P03_LoginPage(getDriver());
        currencyPage = new P07_CurrencyPage(getDriver());
        registration = new P02_RegistrationPage(getDriver());
        register = new T02_Register();
        homePage.clickLogin();
        loginPage.login(dynamicEmail, dynamicPassword);
        currencyPage.switchToEuro();
        currencyPage.switchToUSD();
    }
}
