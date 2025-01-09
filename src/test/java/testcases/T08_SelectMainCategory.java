package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P03_LoginPage;
import pages.P08_MainCategoryPage;

import static drivers.DriverHolder.getDriver;
import static testcases.T02_Register.dynamicEmail;
import static testcases.T02_Register.dynamicPassword;

public class T08_SelectMainCategory extends T01_BaseTest {
    P03_LoginPage loginPage;
    P08_MainCategoryPage categoryPage;
    P01_HomePage homePage;
    SoftAssert softAssert = new SoftAssert();

    @Test(priority = 1, description = "SC1 - User logs in and hovers over a random category_P")
    public void testLoginAndHoverRandomCategory() {
        homePage = new P01_HomePage(getDriver());
        loginPage = new P03_LoginPage(getDriver());
        categoryPage = new P08_MainCategoryPage(getDriver());
        homePage.clickLogin();
        loginPage.login(dynamicEmail, dynamicPassword);
        String hoveredCategory = categoryPage.hoverRandom_mainCategory();
        System.out.println("Successfully hovered over category: " + hoveredCategory);

    }

}
