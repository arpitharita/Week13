package electronics;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static browserfactory.BaseTest.driver;

public class ElectronicsTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";

    public void selectMenu(String menu){
        WebElement menuLink = driver.findElement(By.xpath(menu));
        menuLink.click();
    }
    public void verify(String title,String text){
        String actualtext = driver.findElement(By.className(title)).getText();
        Assert.assertEquals(actualtext,text);
    }

    @Before
    public void setup() {
        openBrowser(baseurl);
    }
    @Test
    public void Testnametextverified(){
        //1.1 Mouse Hover on “Electronics” Tab
        //1.2 Mouse Hover on “Cell phones” and click
        //1.3 Verify the text “Cell phones”
    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully(){
        //2.1 Mouse Hover on “Electronics” Tab
        //2.2 Mouse Hover on “Cell phones” and click
        //2.3 Verify the text “Cell phones”
        //2.4 Click on List View Tab
        //2.5 Click on product name “Nokia Lumia 1020” link
        //2.6 Verify the text “Nokia Lumia 1020”
        //2.7 Verify the price “$349.00”
        //2.8 Change quantity to 2
        //2.9 Click on “ADD TO CART” tab
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top
        //green Bar
        //After that close the bar clicking on the cross button.
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        //
        //2.12 Verify the message "Shopping cart"
        //2.13 Verify the quantity is 2
        //2.14 Verify the Total $698.00
        //2.15 click on checkbox “I agree with the terms of service”
        //2.16 Click on checkout
        //“2.17 Verify the Text “Welcome, Please Sign In!”
        //2.18 Click on “REGISTER” tab
        //2.19 Verify the text “Register”
        //2.20 Fill the mandatory fields
        //2.21 Click on “REGISTER” Button
        //2.22 Verify the message “Your registration completed”
        //2.23 Click on “CONTINUE” tab
        //2.24 Verify the text “Shopping cart”
        //2.25 click on checkbox “I agree with the terms of service”
        //2.26 Click on “CHECKOUT”
        //2.27 Fill the Mandatory fields
        //2.28 Click on “CONTINUE”
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        //2.30 Click on “CONTINUE”
        //2.31 Select Radio Button “Credit Card”
        //2.32 Select “Visa” From Select credit card dropdown
        //2.33 Fill all the details
        //2.34 Click on “CONTINUE”CHECKOUT”
        //
        //2.35 Verify “Payment Method” is “Credit Card”
        //2.36 Verify “Shipping Method” is “2nd Day Air”
        //2.37 Verify Total is “$698.00”
        //2.38 Click on “CONFIRM”
        //2.39 Verify the Text “Thank You”
        //2.40 Verify the message “Your order has been successfully processed!”
        //2.41 Click on “CONTINUE”
        //2.42 Verify the text “Welcome to our store”
        //2.43 Click on “Logout” link
        //2.44 Verify the URL is “https://demo.nopcommerce.com/”
    }

}
