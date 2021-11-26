package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {
     @FindBy(id="order_payments_attributes__payment_method_id_3")
     WebElement checkoption;
      @FindBy(css = "input[value='Save and Continue']")
      private WebElement saveAndContinueButton;
      WebDriverWait wait;
      public PaymentPage(WebDriver driver){
          PageFactory.initElements(driver,this);
            wait = new WebDriverWait(driver,5);

}
          public void paymentInformation(){
          WebDriver driver;
          checkoption.click();
          saveAndContinueButton.click();
}


}
