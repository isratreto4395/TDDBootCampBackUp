package geicohomepagefootertest;

import common.WebAPI;
import geicohomepagefooter.NoticeAndPersonalDataRequest;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static geicohomepagefooter.GeicoHomePageFooterWebElements.*;

public class NoticeAndPersonalDataRequestTest extends WebAPI {
    NoticeAndPersonalDataRequest noticeAndPersonalDataRequest;

    @BeforeMethod
    public void getInit() {
        noticeAndPersonalDataRequest = PageFactory.initElements(driver, NoticeAndPersonalDataRequest.class);
    }

    @Test
    public void noticeAndPersonalDataRequestLinkTest() throws InterruptedException {
        noticeAndPersonalDataRequest.noticeAndPersonalDataRequestLink();
        String expectedTitle = "Privacy Request and Policies | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
    }

    @Test
    public void informationWeCollectWindowTest() throws InterruptedException {
        noticeAndPersonalDataRequest.informationWeCollectWindow();
        String expectedTitle = "GEICO Privacy Policy";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
    }

    @Test
    public void communicationsOptOutSiteLinkTest() throws InterruptedException {
        noticeAndPersonalDataRequest.communicationsOptOutSiteLink();
        String expectedText = "Thank You!";
        String actualText = getTextByXpath(optOutThankYouNote);
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }

    @Test
    public void returnToOptOutOptionsButtonTest() throws InterruptedException {
        noticeAndPersonalDataRequest.returnToOptOutOptionsButton();
        String expectedText = "Opt Out Options";
        String actualText = getTextByXpath(optOutOptionsHeader);
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }

    @Test
    public void optOutOfMarketingMailingAndCallListsTest() throws InterruptedException {
        noticeAndPersonalDataRequest.optOutOfMarketingMailingAndCallLists();
        String expectedText = "The following information provided will be removed from GEICO's marketing list.";
        String actualText = getTextByXpath(marketingListOptOutThankYouNote);
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }

    //@Test
    public void questionsPopUpTest() throws InterruptedException {
        noticeAndPersonalDataRequest.questionsPopUp();
    }


}
