package geicohomepagefootertest;

import common.WebAPI;
import geicohomepagefooter.LegalAndSecurity;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static geicohomepagefooter.GeicoHomePageFooterWebElements.*;

public class LegalAndSecurityTest extends WebAPI {
    LegalAndSecurity legalAndSecurity;

    @BeforeMethod
    public void getInit() {
        legalAndSecurity = PageFactory.initElements(driver, LegalAndSecurity.class);
    }

    @Test
    public void legalAndSecurityLinkTest() throws InterruptedException {
        legalAndSecurity.legalAndSecurityLink();
        String expectedTitle = "Legal & Security | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
    }

    @Test
    public void statesOperationLinkTest() throws InterruptedException {
        legalAndSecurity.statesOperationLink();
        String expectedTitle = "STATES OF OPERATION";
        String actualTitle = getTextByXpath(statesOperationPageTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
    }

    @Test
    public void fraudAwarenessLinkTest() throws InterruptedException {
        legalAndSecurity.fraudAwarenessLink();
        String expectedText = "Security And Fraud Awareness";
        String actualText = getTextByXpath(securityAndfraudAwarenessPageHeader);
        Assert.assertEquals(actualText, expectedText, "Header text does not match");
    }

    @Test
    public void checkScamsTest() throws InterruptedException {
        legalAndSecurity.checkScams();
        String expectedText = "Sweepstakes Fraudulent Letters And Checks | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Header text does not match");
    }

    @Test
    public void reportSecurityVulnerabilityLinkTest() throws InterruptedException {
        legalAndSecurity.reportSecurityVulnerabilityLink();
        String expectedText = "Contact Our Customer Service Agents By Email";
        String actualText = getTextByXpath(contactUsHeader);
        Assert.assertEquals(actualText, expectedText, "Header text does not match");
    }

    @Test
    public void contactOurCustomerServiceAgentsByEmailPageTest() throws InterruptedException {
        legalAndSecurity.contactOurCustomerServiceAgentsByEmailPage();
        String expectedText = "Contact Our Customer Service Agents By Email | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title does not match");
    }


}
