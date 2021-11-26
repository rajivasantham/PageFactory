package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeliveryPage {
    @FindBy(xpath = "//span[text()='UPS Two Day (USD)']/preceding-sibling::input")
    private WebElement upsGroundRadio;

    @FindBy(css = "input[value='Save and Continue']")
    public WebElement saveAndContinueButton;

    WebDriverWait wait;
    public  DeliveryPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver,5);
    }

    public void selectShippingMethod(){
       // wait.until(ExpectedConditions.visibilityOf(upsGroundRadio));
        upsGroundRadio.click();
        saveAndContinueButton.click();

    }

}




