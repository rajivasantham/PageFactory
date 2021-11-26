package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginToPage{
    WebDriver driver;
    @FindBy(linkText = "Login")
    private WebElement login;
    @FindBy(name="spree_user[email]")
   private  WebElement userEmail;
   @FindBy(id="spree_user_password")
   private WebElement userPassword;
   @FindBy(css="input#spree_user_remember_me")
   private WebElement remembermecheckBox;
   @FindBy(css="input[value='Login']")
   WebElement submit;
    WebDriverWait wait;

   public LoginToPage(WebDriver driver) {
       PageFactory.initElements(driver, this);
       wait = new WebDriverWait(driver,10);
   }

    public void login() {
        wait.until(ExpectedConditions.visibilityOf(login));
       login.click();
        userEmail.sendKeys("trivi@gmail.com");
        userPassword.sendKeys("123456");
        remembermecheckBox.click();
        submit.click();
    }
}
