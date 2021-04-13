package topdevicebrandsTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import topdevicebrands.Apple;

public class AppleTest extends WebAPI {
    Apple apple;

    @BeforeMethod
    public void getInit() {
        apple = PageFactory.initElements(driver, Apple.class);
    }

    @Test
    public void appleLocatorTest(){
        apple.appleLocator();
        String expectedTitle = "New Apple iPhone Release Date, Price, Features, & Reviews";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title did not match");
    }

    @Test
    public void compareModelsTest() throws InterruptedException {
        apple.compareModels();
        String expectedTitle = "Compare Apple iPads | New iPad (8th Gen) 10.2, Air, Pro & More | Verizon";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title did not match");

    }


}
