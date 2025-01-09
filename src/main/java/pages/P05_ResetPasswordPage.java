package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P05_ResetPasswordPage extends P00_BasePage {
    public P05_ResetPasswordPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='form-group']//a[normalize-space()='Forgotten Password']")
    WebElement forgetmypass;
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement Addmyemail;
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement Continue;
    @FindBy(xpath = "//*[@id=\"account-login\"]/div[1]")
    WebElement successMessage;

    public void resetPassword(String dynamicEmail) {
        forgetmypass.click();
        this.Addmyemail.sendKeys(dynamicEmail);
        Continue.click();
    }

    public String getSuccessMessage() {

        return successMessage.getText();
    }
}

