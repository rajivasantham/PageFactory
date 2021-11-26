package pageFactory;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ScreenShots;

public class Spree extends BaseTest{
    @Test
            public void automatingSpree() throws Exception {
            ScreenShots screenshot=new ScreenShots(driver);
            LoginToPage lp = new LoginToPage(driver);
            lp.login();
            screenshot.getScreenShot();
            HomePage hp=new HomePage(driver);
            Search sr=new Search(driver);
            sr.Searching();
            Addtocart ac=new Addtocart(driver);
            ac.addingtocart();
            Assert.assertEquals(ac.getCartValue(),"$31.98","The Total value matched");
            Checkout ch=new Checkout(driver);
            ch.clickCheckoutbutton();
            AddressPage ap=new AddressPage(driver);
            ap.enterBillingAddress();
            DeliveryPage dp=new DeliveryPage(driver);
            dp.selectShippingMethod();
            PaymentPage pp=new PaymentPage(driver);
            pp.paymentInformation();
            OrderConfirmationPage op=new OrderConfirmationPage(driver);
            op.statusOfOrder();
            screenshot.getScreenShot();
            Assert.assertEquals(op.statusOfOrder(),"Your order has been processed successfully");






        }

    }
