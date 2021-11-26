package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrderConfirmationPage {
    @FindBy(xpath ="//div[text()='Your order has been processed successfully']")
    WebElement orderConfirmationMessage;


    public OrderConfirmationPage(WebDriver driver){
        PageFactory.initElements(driver,this);


    }
    public String statusOfOrder(){
         String successfulMessage=orderConfirmationMessage.getText();
         return successfulMessage;




    }

}
