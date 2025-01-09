package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P07_CurrencyPage extends P00_BasePage {
    @FindBy(xpath = "//i[@class='fa fa-caret-down']")
    WebElement currencyDropdown;
    @FindBy(xpath = "//button[contains(text(),'€Euro')]")
    WebElement euroOption;
    @FindBy(xpath = "//button[normalize-space()='$US Dollar']")
    WebElement usdOption;

    public P07_CurrencyPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void switchToEuro() {
        currencyDropdown.click();
        euroOption.click();
    }

    public void switchToUSD() {
        currencyDropdown.click();
        usdOption.click();
    }
}

