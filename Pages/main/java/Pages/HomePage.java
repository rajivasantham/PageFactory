package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(css="div.alert.alert-success")
    public WebElement alert;


    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void verifyLandingPage(){
        String welcomeMessage= alert.getText();

        //String welcomeMessageAlert = driver.findElement(By.cssSelector("div.alert.alert-success")).getText();
       // Assert.assertEquals(welcomeMessageAlert, "Logged in successfully");
    }
}
