package desktops;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class DesktopsTest extends Utility {
    String baseurl = "http://tutorialsninja.com/demo/index.php?";
    @Before
    public void setup() {
        openBrowser(baseurl);
    }
    public void selectmenu(String menu) {
        List<WebElement> topmenu = driver.findElements(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li/a"));
        for (WebElement name : topmenu) {
            if (name.getText().equalsIgnoreCase(menu)) ;
            {
                name.click();
                break;

            }
        }
    }
    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        //1.1 Mouse hover on Desktops Tab.and click
        //1.2 Click on “Show All Desktops”
        driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).click();
        mouseHoverAndClick(By.xpath("//ul[@class='nav navbar-nav']/li/div/a"));
        Thread.sleep(3000);
        selectmenu("Show AllDesktops");

        //1.3 Select Sort By position "Name: Z to A"
        driver.findElement(By.xpath("//select[@id='input-sort']/option[3]")).click();

        //1.4 Verify the Product will arrange in Descending order.
       verifyText("Name (Z - A)",By.xpath("//select[@id='input-sort']/option[3]"), "Your Account Has Been Created!");


    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Mouse hover on Desktops Tab. and click
        //2.2 Click on “Show All Desktops”
        driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).click();
        mouseHoverAndClick(By.xpath("//ul[@class='nav navbar-nav']/li/div/a"));
        Thread.sleep(3000);
        selectmenu("Show AllDesktops");
        //2.3 Select Sort By positio    n "Name: A to Z"
        driver.findElement(By.xpath("//select[@id='input-sort']/option[2]")).click();
        Thread.sleep(3000);

        //2.4 Select product “HP LP3065”
        Thread.sleep(30000);
        driver.findElement(By.xpath("//div[@id='content']/div[4]/div[3]/div/div[2]/div[2]/button")).click();////div[@id='content']/div[4]/div[3]/div/div[2]/div[2]/button/i/span
        ////div[@id='content']/div[4]/div[3]/div/div[2]/div/h4/a
        ////div[@id='content']/div[4]/div[3]/div

        //2.5 Verify the Text "HP LP3065"
        Thread.sleep(3000);
       //  verifyText("HP LP3065",By.xpath("//div[@id='content']/div/div[2]/h1"));
        String  actualMessage = driver.findElement( By.xpath("//div[@id='content']/div/div[2]/h1")).getText();////div[@id='product-product']/ul/li[3]/a
        String expectedMessage= "HP LP3065";
        Assert.assertEquals( expectedMessage, actualMessage);

        //2.6 Select Delivery Date "2022-11-30"
        driver.findElement(By.xpath("//input[@data-date-format='YYYY-MM-DD']")).sendKeys("2011-04-22");

        //2.7.Enter Qty "1” using Select class.
        driver.findElement(By.xpath("//input[@name='quantity']")).sendKeys("1");////div[@class='form-group']/input[1]
        // //input[@name='quantity']

        //2.8 Click on “Add to Cart” button
        driver.findElement(By.xpath("//button[@id='button-cart']")).click();

        //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
      //  verifyText("Success: You have added\n" + "HP LP3065\n" + " to your\n" + "shopping cart\n" + "!",By.xpath("//div[@class='alert alert-success alert-dismissible']"));
       Thread.sleep(3000);
        String actualMessage1 = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
        String expectedMessage1= "Success: You have added HP LP3065 to your shopping cart!\n" +
                "×";
        Assert.assertEquals( expectedMessage1, actualMessage1);

        //2.10 Click on link “shopping cart” display into success message
        driver.findElement(By.linkText("shopping cart")).click();

        //2.11 Verify the text "Shopping Cart"
        driver.findElement(By.xpath("//div[@id='content']/h1")).getText();

        //2.12 Verify the Product name "HP LP3065"
        driver.findElement(By.linkText("HP LP3065")).getText();

        //2.13 Verify the Delivery Date "2022-11-30"
        Thread.sleep(3000);
        driver.findElement(By.linkText("Delivery Date:2011-04-22")).getText();
        //2.14 Verify the Model "Product21"
        driver.findElement(By.linkText("Product 21")).getText();

        //2.15 Verify the Todat "£74.73"
        driver.findElement(By.linkText("$122.00")).getText();
    }
    @After
    public void closebrowser(){
       // driver.quit();
    }

}
