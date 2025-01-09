package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P04_LogoutPage extends P00_BasePage {
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement Logout;

    public P04_LogoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void logout() {
        Logout.click();
    }
}
