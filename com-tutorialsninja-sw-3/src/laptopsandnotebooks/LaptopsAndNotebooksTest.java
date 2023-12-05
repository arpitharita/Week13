package laptopsandnotebooks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utilities.Utility;

public class LaptopsAndNotebooksTest extends Utility {
    String baseurl = "http://tutorialsninja.com/demo/index.php?";
    @Before
    public void setup() {
        openBrowser(baseurl);
    }
    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully(){
        //Test name verifyProductsPriceDisplayHighToLowSuccessfully()
        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        //1.2 Click on “Show All Laptops & Notebooks”
        //1.3 Select Sort By "Price (High > Low)"////select[@id='input-sort']/option[5]

        //1.4 Verify the Product price will arrange in High to Low order.

    }
    @Test
    public void verifyThatUserPlaceOrderSuccessfully(){
        //2.1 Mouse hover on Laptops & Notebooks Tab and click
        //2.2 Click on “Show All Laptops & Notebooks”
        //2.3 Select Sort By "Price (High > Low)"
        //select[@id='input-sort']/option[5]
        //2.4 Select Product “MacBook”
        //div[@class='product-thumb']
        //2.5 Verify the text “MacBook”
        // MacBook Pro
        //2.6 Click on ‘Add To Cart’ button
        ////button[@id='button-cart']
        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”

        //2.8 Click on link “shopping cart” display into success message

        //2.9 Verify the text "Shopping Cart"
        //2.10 Verify the Product name "MacBook"
        //2.11 Change Quantity "2"
        //2.12 Click on “Update” Tab
        //2.13 Verify the message “Success: You have modified your shopping cart!”
        //2.14 Verify the Total £737.45
        //2.15 Click on “Checkout” button
        //2.16 Verify the text “Checkout”
        //2.17 Verify the Text “New Customer”
        //2.18 Click on “Guest Checkout” radio button
        //2.19 Click on “Continue” tab
        //2.20 Fill the mandatory fields
        //2.21 Click on “Continue” Button
        //2.22 Add Comments About your order into text area
        //2.23 Check the Terms & Conditions check box
        //2.24 Click on “Continue” button
        //2.25 Verify the message “Warning: Payment method required!”

    }
    @After
    public void closebrowser(){
        driver.quit();
    }

}
