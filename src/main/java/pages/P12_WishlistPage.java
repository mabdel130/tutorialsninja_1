package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P12_WishlistPage extends P00_BasePage {
    @FindBy(xpath = "//body//div[@id='common-home']//div[@class='row']//div[@class='row']//div[2]//div[1]//div[3]//button[2]//i[1]")
    WebElement addToWishlistButton;
    @FindBy(xpath = "//div[3]//div[1]//div[3]//button[2]//i[1]")
    WebElement adductorWishlistmsg;

    public P12_WishlistPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void openWishlist() {
        addToWishlistButton.click();
    }

    public String isWishlistTableDisplayed() {
        return adductorWishlistmsg.getText();
    }
}

