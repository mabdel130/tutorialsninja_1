package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class P09_SubCategoryPage extends P00_BasePage {
    WebDriver driver;
    Actions actions;

    @FindBy(xpath = "//ul[@class='dropdown-menu']/li/a")
    private List<WebElement> subCategories;

    public P09_SubCategoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }

    public void hoverRandomSubCategory() {
        if (!subCategories.isEmpty()) {
            Random random = new Random();
            int randomIndex = random.nextInt(subCategories.size());
            WebElement randomSubCategory = subCategories.get(randomIndex);
            actions.moveToElement(randomSubCategory).perform();
            System.out.println("Hovered over sub-category: " + randomSubCategory.getText());
        } else {
            System.out.println("No sub-categories found to hover over!");
        }
    }

}
