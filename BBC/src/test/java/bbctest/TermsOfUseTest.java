package bbctest;

import bbchomepagefooter.TermsOfUse;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static bbchomepageheader.BBCWebElements.*;

public class TermsOfUseTest extends WebAPI {
    TermsOfUse termsOfUse;

    @BeforeMethod
    public void init() {
        termsOfUse = PageFactory.initElements(driver, TermsOfUse.class);
    }

    @Test//passed
    public void termsOfUsePageTest() {
        termsOfUse.termsOfUsePage();
        String expectedText = "What are the rules for commenting and uploading?";
        String actualText = getTextByXpath(rules);
        Assert.assertEquals(actualText, expectedText, "Title is not a match");

    }

    @Test
    public void fullVersionOfBBCTermsOfUseTest() {
        termsOfUse.fullVersionOfBBCTermsOfUse();
        String expectedTitle = "Terms of Use for the BBC’s digital services - Using the BBC";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Ttitle did not match");
    }
}
