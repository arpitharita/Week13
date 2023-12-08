package computer;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestSuite extends BaseTest {

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
    public void Testname () throws InterruptedException {
        //1.1 Click on Computer Menu.
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li/a")).click();

        //1.2 Click on Desktop
        Thread.sleep(3000);
        driver.findElement(By.linkText("Desktops")).click(); ////ul[@class='sublist first-level']/li/a

        //1.3 Select Sort By position "Name: Z to A"
        driver.findElement(By.xpath("//div[@class='product-selectors']/div[2]/select/option[3]")).click();

        //1.4 Verify the Product will arrange in Descending order.
        driver.findElement(By.xpath("//div[@class='page-body']/div[2]")).click();
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Click on Computer Menu.
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li/a")).click();

        //2.2 Click on Desktop
        Thread.sleep(3000);
        driver.findElement(By.linkText("Desktops")).click(); ////ul[@class='sublist first-level']/li/a

        //2.3 Select Sort By position "Name: A to Z"
        driver.findElement(By.xpath("//div[@class='product-selectors']/div[2]/select/option[2]")).click();

        //2.4 Click on "Add To Cart"
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='item-grid']/div/div/div[2]/div[3]/div[2]/button")).click();

        //2.5 Verify the Text "Build your own computer"
        String actualtext = driver.findElement(By.linkText("Build your own computer")).getText();////div[@class='product-essential']/div[2]/div/h1
        String expectedtext = "Build your own computer";
        Assert.assertEquals(actualtext,expectedtext);
        Thread.sleep(3000);

        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        driver.findElement(By.xpath("//select[@name='product_attribute_1']/option[2]")).click();

        //2.7.Select "8GB [+$60.00]" using Select class.
        driver.findElement(By.xpath("//select[@name='product_attribute_2']/option[4]")).click();

        //2.8 Select HDD radio "400 GB [+$100.00]"
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='product_attribute_3_7']")).click();

        //2.9 Select OS radio "Vista Premium [+$60.00]"
        driver.findElement(By.xpath("//input[@id='product_attribute_4_9']")).click();
        Thread.sleep(3000);

        //A 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
        //[+$5.00]"
        driver.findElement(By.xpath("//input[@id='product_attribute_5_10']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='product_attribute_5_12']")).click();
        Thread.sleep(3000);

        //2.11 Verify the price "$1,475.00"
        driver.findElement(By.xpath("//div[@class='product-price']/span")).click();

        //2.12 Click on "ADD TO CARD" Button.
        driver.findElement(By.xpath("//button[@id='add-to-cart-button-1']")).click();

        //2.13 Verify the Message "The product has been added to your shopping cart" on Top
        //green Bar
        Thread.sleep(3000);
        String actualtext1 = driver.findElement(By.xpath("//p[@class='content']")).getText();
        String expetedtext1 = "The product has been added to your shopping cart";
        Assert.assertEquals(expetedtext1,actualtext1);
        Thread.sleep(3000);

        //After that close the bar clicking on the cross button.
        Thread.sleep(3000);
    //    driver.findElement(By.xpath("//span[@class='close']")).click();////span[@class='close'] ////div[@class='bar-notification success']/span"

        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        driver.findElement(By.linkText("Shopping cart")).click();
      //  driver.findElement(By.linkText("Go to cart")).click();////button[@class='button-1 cart-button']

        //2.15 Verify the message "Shopping cart"
        driver.findElement(By.xpath("//div[@class='page-title']/h1")).click();

        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        driver.findElement(By.xpath("//input[@class='qty-input']")).click();

        //2.17 Verify the Total"$2,950.00"
        driver.findElement(By.xpath("//span[@class='product-subtotal']")).click();

        //2.18 click on checkbox “I agree with the terms of service”
        driver.findElement(By.xpath("//div[@class='terms-of-service']/input")).click();

        //2.19 Click on “CHECKOUT”
        driver.findElement(By.xpath("//div[@class='checkout-buttons']/button")).click();

        //2.20 Verify the Text “Welcome, Please Sign In!”
        Thread.sleep(3000);
        String actualtext3 = driver.findElement(By.xpath("//div[@class='page login-page']/div/h1")).getText();
        String expectedtect3 = "Welcome, Please Sign In!";
        Assert.assertEquals(expectedtect3,actualtext3);
        Thread.sleep(3000);

        //2.21Click on “CHECKOUT AS GUEST” Tab
        driver.findElement(By.xpath("//button[@class='button-1 checkout-as-guest-button']")).click();

        //2.22 Fill the all mandatory field
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@data-val-required='First name is required.']")).sendKeys("brown");
        driver.findElement(By.xpath("//input[@data-val-required='Last name is required.']")).sendKeys("pitter");
        driver.findElement(By.xpath("//input[@data-val-required='Email is required.']")).sendKeys("brown2312@gmail.com");
        driver.findElement(By.xpath("//select[@data-val-required='Country is required.']")).sendKeys("Canada");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//select[@data-trigger='state-select']")).sendKeys("Ontario");
       // driver.findElement(By.xpath("//select[@id='BillingNewAddress_StateProvinceId']")).sendKeys("Ontario");
        driver.findElement(By.xpath("//input[@data-val-required='City is required']")).sendKeys("etobicoke");
        driver.findElement(By.xpath("//input[@data-val-required='Street address is required']")).sendKeys("1901kingstreet");
        driver.findElement(By.xpath("//input[@data-val-required='Zip / postal code is required']")).sendKeys("m9v3t1");
        driver.findElement(By.xpath("//input[@data-val-required='Phone is required']")).sendKeys("06655459645");
        Thread.sleep(3000);
      //  driver.findElement(By.xpath("")).sendKeys("");

        //2.23 Click on “CONTINUE”
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='button-1 new-address-next-step-button']")).click();

        //2.24 Click on Radio Button “Next Day Air($0.00)”
        Thread.sleep(3000);
        driver.findElement(By.xpath( "//input[@id='shippingoption_1']")).click();////input[@value='Next Day Air___Shipping.FixedByWeightByTotal']
        ////div[@class='method-name']/input[2]

        //2.25 Click on “CONTINUE”
        driver.findElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']")).click();

        //2.26 Select Radio Button “Credit Card”
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='paymentmethod_1']")).click();////input[@id='paymentmethod_1'],//input[@name='paymentmethod'],//input[@value='Payments.Manual']
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']")).click();

        //2.27 Select “Master card” From Select credit card dropdown
        Thread.sleep(3000);
        driver.findElement(By.xpath("//select[@id='CreditCardType']/option[2]")).click();

        //2.28 Fill all the details
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@data-val-required='Enter cardholder name']")).sendKeys("brownpitter");
        driver.findElement(By.xpath("//input[@name='CardNumber']")).sendKeys("4810943078202911");
        driver.findElement(By.xpath("//select[@data-val-required='Expire month is required']")).sendKeys("6");
        driver.findElement(By.xpath("//select[@data-val-required='Expire year is required']")).sendKeys("2024");
        driver.findElement(By.xpath("//input[@name='CardCode']")).sendKeys("230");

        //2.29 Click on “CONTINUE”
        driver.findElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']")).click();

        //2.30 Verify “Payment Method” is “Credit Card”
        Thread.sleep(3000);
        String actualtext4 = driver.findElement(By.xpath("//li[@class='payment-method']/span[2]")).getText();
        String expectedtext4 = "Credit Card";
        Assert.assertEquals(expectedtext4,actualtext4);

        //2.32 Verify “Shipping Method” is “Next Day Air”
        Thread.sleep(3000);
        String actualtext5 = driver.findElement(By.xpath("//li[@class='shipping-method']/span[2]")).getText();
        String expectedtext5 = "Next Day Air";
        Assert.assertEquals(expectedtext5,actualtext5);

        //2.33 Verify Total is “$2,950.00” ////span[@class='product-subtotal']
        Thread.sleep(3000);
        String actualtext6 = driver.findElement(By.xpath("//span[@class='product-subtotal']")).getText();
        String expectedtext6 = "$2,950.00";
        Assert.assertEquals(expectedtext6,actualtext6);

        //2.34 Click on “CONFIRM”
        driver.findElement(By.xpath("//button[@class='button-1 confirm-order-next-step-button']")).click();

        //2.35 Verify the Text “Thank You”//div[@class='page-title']/h1

        //2.36 Verify the message “Your order has been successfully processed!”
        //2.37 Click on “CONTINUE”
        //2.37 Verify the text “Welcome to our store”
    }

}
