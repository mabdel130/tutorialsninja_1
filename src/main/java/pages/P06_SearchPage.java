package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P06_SearchPage extends P00_BasePage {
    @FindBy(xpath = "//img[@title='iMac']")
    WebElement title;
    @FindBy(xpath = "//div[@id='content']//div[1]//div[1]//div[2]//div[1]//p[2]")
    WebElement price;

    public P06_SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String get_title() {
        return title.getAttribute("title");
    }

    public String getprice() {
        return price.getText();
    }
}

