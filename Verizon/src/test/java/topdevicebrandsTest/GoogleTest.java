package topdevicebrandsTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import topdevicebrands.Google;

import static topdevicebrands.TopDeviceBrandsWebElements.*;


public class GoogleTest extends WebAPI {

    Google google;

    @BeforeMethod
    public void getInit(){
        google = PageFactory.initElements(driver, Google.class);
    }

    @Test
    public void googleTabTest(){
        google.googleTab();
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Page title is incorrect");
    }

    @Test
    public void buyNowTest(){
        google.buyNow();
        String expectedTitle = "Confirm Your Location";
        String actualTitle = getTextByXpath(confirmLocationText);
        Assert.assertEquals(actualTitle,expectedTitle,"Page title is incorrect");
    }

    @Test
    public void messageBannerTest(){
        google.messageBanner();
        String expectedText = "Chat with us";
        String actualText = getTextByXpath(messageUs);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }

    @Test
    public void accessoriesTabTest(){
        google.accessoriesTab();
        String expectedText = "Garmin Accessories for Your 10.5 Inch Ipad Pro | Shop Verizon Today";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }

    @Test
    public void addFilterFunctionalityTest(){
        google.addFilterFunctionality();
        String expectedText = "Showing 0 items";
        String actualText = getTextByXpath(filterResult);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }

    @Test
    public void compatibilityCheckTest(){
        google.compatibilityCheck();
        String expectedText = "All Accessories for Galaxy S21 5G";
        String actualText = getTextByXpath(compatiblePhoneItemAccessoryHeader);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }


}
