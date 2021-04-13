package geicohomepagefootertest;

import common.WebAPI;
import geicohomepagefooter.PrivacyPolicy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static geicohomepagefooter.GeicoHomePageFooterWebElements.*;


public class PrivacyPolicyTest extends WebAPI {
    PrivacyPolicy policy;

    @BeforeMethod
    public void initialization() {
        policy = PageFactory.initElements(driver, PrivacyPolicy.class);
    }

    @Test
    public void privacyPolicyLinkTest() throws InterruptedException {
        policy.privacyPolicyLink();
        String expectedText = "GEICO RESPECTS YOUR PRIVACY";
        String actualText = getTextByXpath(privacyPageTitle);
        Assert.assertEquals(actualText,expectedText,"Geico header text is incorrect");
    }

    @Test
    public void theInformationWeCollectLinkTest() throws InterruptedException {
        policy.theInformationWeCollectLink();
        String expectedText = "NOTICE OF COLLECTION FOR CALIFORNIA RESIDENTS.";
        String actualText = getTextByXpath(noticeForCaliforniaResident);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }

@Test
    public void confidentialityAndSecurityLinkTest() throws InterruptedException {
        policy.confidentialityAndSecurityLink();
        String expectedText = "SECURITY POLICY";
        String actualText = getTextByXpath(securityPolicy);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }

    @Test
    public void securityPolicyPageTest() throws InterruptedException {
        policy.securtyPolicyPage();
        String expectedText = "Safe drivers save more on insurance.";
        String actualText = getTextByXpath(driveEasyHeaderText);
        Assert.assertEquals(actualText, expectedText, "Text did not match");

    }


}
