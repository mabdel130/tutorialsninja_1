package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class P08_MainCategoryPage extends P00_BasePage {
    WebDriver driver;


    public P08_MainCategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    By categoryMenuItems = By.cssSelector("ul.nav.navbar-nav > li");

    public String hoverRandom_mainCategory() {
        List<WebElement> categories = driver.findElements(categoryMenuItems);

        if (categories.size() > 0) {
            Random random = new Random();
            int randomIndex = random.nextInt(categories.size());

            WebElement randomCategory = categories.get(randomIndex);

            Actions actions = new Actions(driver);
            actions.moveToElement(randomCategory).perform();

            return randomCategory.getText();
        } else {
            throw new RuntimeException("No categories found on the page!");
        }
    }

    public void hoverOverMainCategory(WebElement randomMainCategory) {
    }

    public List<Object> getMainCategories() {
        return List.of();
    }
}
