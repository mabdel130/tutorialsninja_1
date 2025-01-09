package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_HomePage extends P00_BasePage {
    WebDriver driver;
    @FindBy(xpath = "//span[@class='caret']")
    WebElement myAccount;
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
    WebElement loginOption;
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement search;
    @FindBy(xpath = "//i[@class='fa fa-search']")
    WebElement Confirm_search;

    public P01_HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public P01_HomePage() {
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMyAccount() {
        myAccount.click();
    }

    public void clickLogin() {
        myAccount.click();
        loginOption.click();
    }

    public void clickRegister() {
        myAccount.click();
        registerLink.click();
    }

    public void clickSearch(String item) {

        this.search.sendKeys(item);
    }

    public void search_confirmation() {
        Confirm_search.click();
    }
}
