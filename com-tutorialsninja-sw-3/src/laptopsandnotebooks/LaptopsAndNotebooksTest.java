package laptopsandnotebooks;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;
import java.util.List;

public class LaptopsAndNotebooksTest extends Utility {
    String baseurl = "http://tutorialsninja.com/demo/index.php?";
    @Before
    public void setup() {
        openBrowser(baseurl);
    }
    public void selectmenu(String menu) {
        List<WebElement> topmenu = driver.findElements(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[2]/a"));
        for (WebElement name : topmenu) {
            if (name.getText().equalsIgnoreCase(menu)) ;
            {
                name.click();
                break;

            }
        }
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
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse hover on Laptops & Notebooks Tab and click
        //2.2 Click on “Show All Laptops & Notebooks”
        driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[2]/a")).click();
        mouseHoverAndClick(By.xpath("//ul[@class='nav navbar-nav']/li[2]/div/a"));
        Thread.sleep(3000);
        selectmenu("Show AllLaptops & Notebooks");

        //2.3 Select Sort By "Price (High > Low)"
       // selectByVisibleTextFromDropDown(By.xpath("//select[@id='input-sort']/option[5]"),"Name (A - Z)");
        ////select[@id='input-sort']/option[5]
        /*WebElement dropdown = driver.findElement(By.xpath("//select[@id='input-sort']/option[5]"));
        Select select = new Select(dropdown);
        select.selectByValue("Price (High > Low)");*/
        driver.findElement(By.xpath("//select[@id='input-sort']/option[5]")).click();

        //2.4 Select Product “MacBook”
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='content']/div[4]/div[4]/div/div[2]/div[2]/button")).click(); ////div[@id='content']/div[4]/div[4]/div/div[2]/div[2]/button

        //div[@class='product-thumb']
        //2.5 Verify the text “MacBook”
        // MacBook Pro
         String actualMessage = driver.findElement( By.linkText("MacBook")).getText(); //div[@id='content']/div/div[2]/h
         String expectedMassage = "MacBook";
         Assert.assertEquals(expectedMassage,actualMessage);

         //2.6 Click on ‘Add To Cart’ button
        driver.findElement(By.xpath("//div[@id='content']/div[4]/div[4]/div/div[2]/div[2]/button")).click();
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
        clearTextFromField(By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[4]/div/input"));
        sendTextToElement(By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[4]/div/input"),"2");
        Thread.sleep(3000);

        clickOnElement(By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[4]/div/span/button[1]"));

        String actualText4 = getTextFromElement(By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[6]"));
        String expectedText4 = "$1,204.00";
        Assert.assertEquals(expectedText4,actualText4);

        clickOnElement(By.xpath("//div[@class='buttons clearfix']/div[2]/a"));
        Thread.sleep(3000);

        //clickOnElement(By.xpath("//div[@class='panel-collapse collapse in']/div[1]/div[1]/div[1]"));
        clickOnElement(By.xpath("//div[@class='panel-collapse collapse in']/div[1]/div[1]/div[1]/div[2]/label/input"));
        clickOnElement(By.xpath("//input[@id='button-account']"));

        //String actualText5 = getTextFromElement(By.xpath("//div[@class='panel-collapse collapse in']/div[1]/div[1]/div[1]/h2"));
        //String expectedText5 = "New Customer";
        //Assert.assertEquals(expectedText5,actualText5);
        Thread.sleep(3000);
        sendTextToElement(By.xpath("//input[@id='input-payment-firstname']"),"brown");
        sendTextToElement(By.xpath("//input[@id='input-payment-lastname']"),"Patel");
        sendTextToElement(By.xpath("//input[@id='input-payment-email']"),"brown2911@gmail.com");
        sendTextToElement(By.xpath("//input[@id='input-payment-telephone']"),"06532489722");
        sendTextToElement(By.xpath("//input[@id='input-payment-address-1']"),"1901kingstreet");
        sendTextToElement(By.xpath("//input[@id='input-payment-city']"),"Brampton");
        sendTextToElement(By.xpath("//input[@id='input-payment-postcode']"),"M9V3T1");
        selectByValueFromDropdown(By.xpath("//select[@id='input-payment-country']"),"38");
        Thread.sleep(3000);
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='input-payment-zone']"),"Ontario");
        clickOnElement(By.xpath("//input[@id='button-guest']"));
        Thread.sleep(3000);

        sendTextToElement(By.xpath("//div[@id='collapse-payment-method']/div[1]/p[2]/textarea"),"not good");
        Thread.sleep(3000);
        clickOnElement(By.xpath("//div[@id='collapse-payment-method']/div[1]/div[2]/div[1]/input[1]"));
        Thread.sleep(3000);
        clickOnElement(By.xpath("//div[@id='collapse-payment-method']/div[1]/div[2]/div[1]/input[2]"));

    }

}
