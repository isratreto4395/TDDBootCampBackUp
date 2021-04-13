package geicohomepagefooter;

import common.WebAPI;
import org.openqa.selenium.By;

import static geicohomepagefooter.GeicoHomePageFooterWebElements.*;

public class PrivacyPolicy extends WebAPI {

    public void privacyPolicyLink() throws InterruptedException {
        windowsFullPageScrollDown();
        clickById(acceptCookiesButton);
        sleepFor(5);
        clickByXpath(privacyPolicyLocator);
        handleNewTab(driver);
    }

    public void theInformationWeCollectLink() throws InterruptedException {
        privacyPolicyLink();
        clickByLinkText(collectInformation);
        clickByXpath(californiaResidentCategoriesOfPersonalInfo);
    }

    public void confidentialityAndSecurityLink() throws InterruptedException {
        privacyPolicyLink();
        clickByXpath(confidentialityNSecuritym);
        clickByXpath(internetSecurityPolicy);
    }

    public void securtyPolicyPage() throws InterruptedException {
        confidentialityAndSecurityLink();
        windowsFullPageScrollDown();
        clickByLinkText(geicoApp);
        navigateBack();
        clickByLinkText(driveEasy);
    }




}
