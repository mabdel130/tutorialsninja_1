package pages;

import drivers.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import static drivers.DriverHolder.driver;

public class P13_OrderPage extends P00_BasePage {
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement searchbutton;
    @FindBy(xpath = "//i[@class='fa fa-search']")
    WebElement clickonsearchbutton;
    @FindBy(xpath = "//a[normalize-space()='HP LP3065']")
    WebElement selectproduct;
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addtocartbutton;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMessage;
    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    WebElement items;
    @FindBy(xpath = "//strong[normalize-space()='Checkout']")
    WebElement cheack_out;
    @FindBy(xpath = "//h4[normalize-space()='Step 1: Checkout Options']")
    WebElement cheack_outoptions;
    @FindBy(xpath = "//div[@id='checkout-checkout']//div[2]//div[1]//h4[1]")
    WebElement billing_Details;
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement billing_DetailsFirstname;
    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    WebElement billing_DetailsLastname;
    @FindBy(xpath = " //input[@id='input-payment-address-1']")
    WebElement billing_DetailsAdress;
    @FindBy(xpath = "//input[@id='input-payment-city']")
    WebElement billing_Detailscity;
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement billing_Detailpostcode;
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement countryDropdown;
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement regionDropdown;
    @FindBy(xpath = "//input[@id='button-payment-address']")
    WebElement continuBillingDetails;
    @FindBy(xpath = "//input[@id='button-shipping-address']")
    WebElement continuDeliverydetails;
    @FindBy(xpath = "//input[@id='button-shipping-method']")
    WebElement continuDeliveryMethod;
    @FindBy(xpath = "//input[@name='agree']")
    WebElement termandcondtions;
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement continuAfter_PaymentMethod;
    @FindBy(xpath = "//input[@id='button-confirm']")
    WebElement confirmorder;
    @FindBy(xpath = "//h1[normalize-space()='Your order has been placed!']")
    public WebElement confirmordermsg;
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continuAfterConfirmOrder;

    public P13_OrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void completeOrder(String item) {
        searchbutton.sendKeys(item);
        clickonsearchbutton.click();
        selectproduct.click();
        selectproduct.click();
    }

    public void cart() {
        addtocartbutton.click();
    }

    public String isOrderSuccessful() {
        return successMessage.getText();
    }

    public void itemscheck() {
        items.click();
    }

    public void cheakout() {
        cheack_out.click();
    }

    public void cheakoutoptions() {
        cheack_outoptions.click();
    }

    public void billing_details(String dynamicFirstName, String dynamicLastName, String Adress, String city, int postcode) {
        billing_Details.click();
        billing_DetailsFirstname.sendKeys(dynamicFirstName);
        billing_DetailsLastname.sendKeys(dynamicLastName);
        billing_DetailsAdress.sendKeys(Adress);
        billing_Detailscity.sendKeys(city);
        billing_Detailpostcode.sendKeys(String.valueOf(postcode));

    }

    public void selectRandomCountryAndRegion(String country, String region) {
        countryDropdown.click();
        countryDropdown.sendKeys(country);
        regionDropdown.click();
        regionDropdown.sendKeys(region);

    }


    public void contnieAfterBillingDetails() {
        continuBillingDetails.click();
    }

    public void contnieafterDeliverydetails() {
        continuDeliverydetails.click();
    }

    public void contnieAfterDeliveryMethod() {
        continuDeliveryMethod.click();
    }

    public void terms() {
        termandcondtions.click();
        continuAfter_PaymentMethod.click();
    }

    public void orderconfirmation() {
        confirmorder.click();
        confirmordermsg.getText();
        continuAfterConfirmOrder.click();
    }


}




