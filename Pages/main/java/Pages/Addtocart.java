package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addtocart {
    WebDriver driver;
    @FindBy(css = "span[title='Ruby on Rails Tote']")
    WebElement product;
    @FindBy(id = "quantity")
    WebElement quantities;
    @FindBy(id = "add-to-cart-button")
    WebElement add;
    @FindBy(css ="td[class='lead']")
    private WebElement cartTotal;
    WebDriverWait  wait;

    public Addtocart(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver,30);

    }

    public void addingtocart() {
        product.click();
        quantities.clear();
        quantities.sendKeys("2");
        add.click();


    }
    public String getCartValue(){
        //wait.until(ExpectedConditions.visibilityOf(cartTotal));
        String  Total=cartTotal.getText();
        return Total;
    }
}
