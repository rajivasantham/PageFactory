package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search {
    WebDriver driver;
   @FindBy(id="taxon")
    private WebElement dropdown;
    @FindBy(css="a[href='/t/bags']")
    private WebElement bags;
    public Search(WebDriver driver){

        PageFactory.initElements(driver,this);
}
    public void Searching(){

    Select select = new Select(dropdown);
    select.selectByVisibleText("Categories");
   bags.click();


}
}
