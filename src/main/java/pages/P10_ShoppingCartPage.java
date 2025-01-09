package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P10_ShoppingCartPage extends P00_BasePage {
    @FindBy(xpath = "//div[3]//div[1]//div[3]//button[1]//i[1]")
    WebElement addToCartButton;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement Add_to_cart_msg;

    public P10_ShoppingCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public String isCartTableDisplayed() {
        return Add_to_cart_msg.getText();
    }
}

