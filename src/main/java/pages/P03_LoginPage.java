package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_LoginPage extends P00_BasePage {
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement dynamicEmail;
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement dynamicPassword;
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;

    public P03_LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void login(String dynamicEmail, String dynamicPassword) {
        this.dynamicEmail.sendKeys(dynamicEmail);
        this.dynamicPassword.sendKeys(dynamicPassword);
        loginButton.click();
    }

}
