package topdevicebrandsTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import topdevicebrands.LG;

import static topdevicebrands.TopDeviceBrandsWebElements.*;


public class LGTest extends WebAPI {

    LG lg;

    @BeforeMethod
    public void getInit() {
        lg = PageFactory.initElements(driver, LG.class);
    }

    @Test
    public void lGTabTest(){
        lg.lGTab();
        String expectedTitle = "LG 5G & Value Phones, Accessories, Comparisons & More - Verizon";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Wrong title");
    }

    @Test
    public void lGvalueAndPerformanceTest() {
        lg.lGvalueAndPerformance();
        String expectedHeader = "LG Stylo™ 6";
        String actualHeader = getTextByXpath(phoneHeader);
        Assert.assertEquals(actualHeader,expectedHeader,"Wrong header");
  }

  @Test
    public void addToCartTest() throws InterruptedException {
        lg.addToCart();
      String expectedHeader = "Customize your device.";
      String actualHeader = getTextByXpath(pageHeader);
      Assert.assertEquals(actualHeader,expectedHeader,"Wrong header");

  }


    @Test
    public void feedbackTest() throws InterruptedException {
        lg.feedback();
        String expectedHeader = "LG Stylo 6 | Find Features, Prices and Reviews | Shop Today";
        String actualHeader = driver.getTitle();
        Assert.assertEquals(actualHeader, expectedHeader, "Wrong header");

    }
}
