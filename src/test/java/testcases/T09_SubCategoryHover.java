package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.P08_MainCategoryPage;
import pages.P09_SubCategoryPage;

import static drivers.DriverHolder.getDriver;

public class T09_SubCategoryHover extends T01_BaseTest {
    P08_MainCategoryPage mainCategoryPage;
    P09_SubCategoryPage subCategoryPage;

    @Test(priority = 1, description = "SC1 - Randomly hover over subcategories of the first three main categories_P")
    public void testRandomHoverOnSubCategories() {
        mainCategoryPage = new P08_MainCategoryPage(getDriver());
        subCategoryPage = new P09_SubCategoryPage(getDriver());
        for (int i = 0; i >= 3; i++) {
            WebElement mainCategory = (WebElement) mainCategoryPage.getMainCategories().get(i);
            System.out.println("Hovering over main category: " + mainCategory.getText());
            mainCategoryPage.hoverOverMainCategory(mainCategory);
            subCategoryPage.hoverRandomSubCategory();
        }
    }
}

