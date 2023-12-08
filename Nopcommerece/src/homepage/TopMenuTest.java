package homepage;

import browserfactory.BaseTest;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMenuTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";
 /*   public void selectmenu(String menu) {
        List<WebElement> topmenu = driver.findElements(By.xpath("//div[@class='header-menu']/ul"));//
        for (WebElement name : topmenu) {
            if (name.getText().equalsIgnoreCase(menu)) ;
            {
                name.click();
                break;

            }
        }
    }*/
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


  /*  public void verifyPageNavigation(String title ,String text){
        String actualtext = driver.findElement(By.className(title)).getText();
        Assert.assertEquals(actualtext,text);*/
    @Test
    public void verifyPageNavigation(){
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li/a")).click();
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[5]/a")).click();
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[6]/a")).click();
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[7]/a")).click();




    }
    public void closebrowser(){
       // driver.quit();
    }

}
