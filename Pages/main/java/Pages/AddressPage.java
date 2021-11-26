package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressPage {
    WebDriver driver;
    @FindBy(id = "order_bill_address_attributes_firstname")
    private WebElement firstNameTextBox;

    @FindBy(id = "order_bill_address_attributes_lastname")
    private WebElement lastNameTextBox;

    @FindBy(id = "order_bill_address_attributes_address1")
    private WebElement address1TextBox;

    @FindBy(id = "order_bill_address_attributes_address2")
    private WebElement address2TextBox;

    @FindBy(id = "order_bill_address_attributes_city")
    private WebElement cityTextBox;

    @FindBy(id = "order_bill_address_attributes_state_id")
    private WebElement stateDropDown;

    @FindBy(id = "order_bill_address_attributes_zipcode")
    private WebElement zipCodeTextBox;

    @FindBy(id = "order_bill_address_attributes_country_id")
    private WebElement countryDropDown;

    @FindBy(id = "order_bill_address_attributes_phone")
    private WebElement phoneTextBox;

    @FindBy(css = "input[value='Save and Continue']")
    private WebElement saveAndContinueButton;

    //@FindBy(id = "order_use_billing")
    //private WebElement shippingSameBillingCheckBox;

    @FindBy(id = "save_user_address")
    private WebElement saveUserAddCheckBox;
    @FindBy(id = "order_bill_address_id_0")
    private WebElement otherAddress;

    WebDriverWait wait;

    public AddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
    }

    public void enterBillingAddress() {
        boolean firstNamedisplayed = firstNameTextBox.isDisplayed();
        if (firstNamedisplayed == false) {
            otherAddress.click();
            firstNameTextBox.clear();
            firstNameTextBox.sendKeys("raji");
            lastNameTextBox.clear();
            lastNameTextBox.sendKeys("v");
            address1TextBox.clear();
            address1TextBox.sendKeys("streetno10");
            address2TextBox.clear();
            address2TextBox.sendKeys("roadno:9");
            cityTextBox.clear();
            cityTextBox.sendKeys("Kansas");
            Select selectState = new Select(stateDropDown);
            selectState.selectByValue("2835");
            Select selectCountry = new Select(countryDropDown);
            selectCountry.selectByValue("233");
            zipCodeTextBox.clear();
            zipCodeTextBox.sendKeys("23344");
            phoneTextBox.clear();
            phoneTextBox.sendKeys("8374572940");
            saveAndContinueButton.click();
            //shippingSameBillingCheckBox.click();
        }
    }
}



