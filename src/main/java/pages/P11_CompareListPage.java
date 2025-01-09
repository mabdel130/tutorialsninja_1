package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P11_CompareListPage extends P00_BasePage {
    @FindBy(xpath = "//div[3]//div[1]//div[3]//button[3]//i[1]")
    WebElement addToCompareButton;
    @FindBy(xpath = "//body//div[@id='common-home']//div[@class='row']//div[@class='row']//div[2]//div[1]//div[3]//button[3]")
    WebElement compareMSG;

    public P11_CompareListPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void addToCompareList() {
        addToCompareButton.click();
    }

    public String compare_Msg() {
        return compareMSG.getText();
    }
}

