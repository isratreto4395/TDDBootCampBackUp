package topdevicebrandsTest;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import topdevicebrands.Motorola;

import static topdevicebrands.TopDeviceBrandsWebElements.*;


public class MotorolaTest extends WebAPI {
    @FindBy(how = How.XPATH,using = motorlaPageText)public WebElement pageText;

    Motorola motorola;

    @BeforeMethod
    public void getInit(){
        motorola = PageFactory.initElements(driver, Motorola.class);
    }

    @Test
    public void motorolaTabTest(){
        motorola.motorolaTab();
        String expectedText = "Find your moto.";
        String actualText = getTextByXpath(motorlaPageText);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }

    @Test
    public void motorolaPhoneSelectionTest(){
        motorola.motorolaPhoneSelection();
        String expectedTitle = "Motorola razr: Colors, Features & Reviews | Get It Today";
        String actualTtile = driver.getTitle();
        Assert.assertEquals(actualTtile,expectedTitle,"Wrong title appeared");
    }

    @Test
    public void motorolaPhonePageWatchVideoTest() throws InterruptedException {
        motorola.motorolaPhonePageWatchVideo();
        String expectedText = "Product details";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Text did not match");

    }

    @Test
    public void chatWithUsTabTest() throws InterruptedException {
        motorola.chatWithUsTab();
        String expectedText = "Chat with us";
        String actualText = getTextByXpath(messageUs);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }
}
