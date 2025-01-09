package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_RegistrationPage extends P00_BasePage {
    @FindBy(xpath = "//input[@id='input-firstname']")
    private static WebElement firstNameField;

    @FindBy(xpath = "//input[@id='input-lastname']")
    private static WebElement lastNameField;

    @FindBy(xpath = "//input[@id='input-email']")
    private static WebElement emailField;
    @FindBy(xpath = "//input[@id='input-telephone']")
    private static WebElement telephoneField;
    @FindBy(xpath = "//input[@id='input-password']")
    private static WebElement passwordField;
    @FindBy(xpath = "//input[@id='input-confirm']")
    private static WebElement confirmPasswordField;
    @FindBy(xpath = "//input[@value='0']")
    private static WebElement subscribe;
    @FindBy(xpath = "//input[@name='agree']")
    private static WebElement privacy_Policy;
    @FindBy(xpath = "//input[@value='Continue']")
    private static WebElement continueButton;
    public String dynamicEmail;
    public String dynamicPassword;
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    private WebElement AccountCreatedMSG;
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    private static WebElement continueButtonAftermsg;

    public P02_RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void register(String dynamicFirstName, String dynamicLastName, String dynamicEmail, String dynamicTelephone, String dynamicPassword) {
        firstNameField.sendKeys(dynamicFirstName);
        lastNameField.sendKeys(dynamicLastName);
        emailField.sendKeys(dynamicEmail);
        telephoneField.sendKeys(dynamicTelephone);
        passwordField.sendKeys(dynamicPassword);
        confirmPasswordField.sendKeys(dynamicPassword);
        subscribe.click();
        privacy_Policy.click();
        continueButton.click();
    }

    public void Your_Account_Has_Been_Created() {
        System.out.println(AccountCreatedMSG.getText());
    }

    public void contaftermsg() {
        continueButtonAftermsg.click();
    }

}
