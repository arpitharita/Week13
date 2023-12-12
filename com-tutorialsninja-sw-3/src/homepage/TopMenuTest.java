package homepage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class TopMenuTest extends Utility {
    String baseurl = "http://tutorialsninja.com/demo/index.php?";
    @Before
    public void setup() {
        openBrowser(baseurl);
    }
    public void selectmenu(String menu) {
        List<WebElement> topmenu = driver.findElements(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li"));
        for (WebElement name : topmenu){
            if (name.getText().equalsIgnoreCase(menu));
            {
                name.click();
                break;

            }
        }

    }
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {
        //1.1 Mouse hover on “Desktops” Tab and click
        //1.2 call selectMenu method and pass the menu = “Show All Desktops”
        //1.3 Verify the text ‘Desktops’
        driver.findElement(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li")).click();
        mouseHoverAndClick(By.xpath("//ul[@class='nav navbar-nav']/li/div/a"));
        Thread.sleep(3000);
        selectmenu("Show AllDesktops");
        verifyText("Desktops", By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[1]/a"), "Your Account Has Been Created!");

    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() throws InterruptedException {
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        //2.3 Verify the text ‘Laptops & Notebooks’

        driver.findElement(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[2]")).click();
        mouseHoverAndClick(By.xpath("//ul[@class='nav navbar-nav']/li[2]/div/a"));
        Thread.sleep(3000);
        selectmenu("Show AllLaptops & Notebooks");
        verifyText("Laptops & Notebooks", By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[2]"), "Your Account Has Been Created!");
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() throws InterruptedException {
        //3.1 Mouse hover on “Components” Tab and click
        //3.2 call selectMenu method and pass the menu = “Show All Components”
        driver.findElement(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[3]")).click();
        mouseHoverAndClick(By.xpath("//ul[@class='nav navbar-nav']/li[3]/div/a"));
        Thread.sleep(3000);
        selectmenu("Show AllComponents");
        verifyText("Components", By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[3]"), "Your Account Has Been Created!");

    }
    @After
    public void closebrowser(){
      //  driver.quit();
    }
}
