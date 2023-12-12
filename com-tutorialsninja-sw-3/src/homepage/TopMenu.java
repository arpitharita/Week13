package homepage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenu extends Utility {
    String baseUrl = "http://tutorialsninja.com/demo/index.php?";

    public void selectMenu(String menu){
        clickOnElement(By.xpath(menu));
    }
    @Before
    public void setup(){
        openBrowser(baseUrl);
    }
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {
        mouseHoverAndClick(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[1]/a"));
        selectMenu("//ul[@class='nav navbar-nav']/li[1]/div[1]/a");
        verifyText("Desktops",By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[1]/a"), "Your Account Has Been Created!");

    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
    {
        mouseHoverToElement(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[2]/a"));
        selectMenu("//ul[@class='nav navbar-nav']/li[2]/div/a");
        verifyText("Laptops & Notebooks",By.xpath("//div[@id='content']/h2"), "Your Account Has Been Created!");
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully()
    {
        mouseHoverToElement(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[3]/a"));
        selectMenu("//ul[@class='nav navbar-nav']/li[3]/div/a");
        verifyText("Components",By.xpath("//div[@id='content']/h2"), "Your Account Has Been Created!");

    }
    @After
    public void endTest()
    {
        //closeBrowser();
    }




}
