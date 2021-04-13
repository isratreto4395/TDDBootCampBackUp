package geicohomepagefooter;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static autoinsurance.AutoInsurance.*;
import static geicohomepagefooter.GeicoHomePageFooterWebElements.*;

public class LegalAndSecurity extends WebAPI {
    @FindBy(how = How.XPATH, using = applicationDropdown)public WebElement application;
    @FindBy(how = How.XPATH,using = typeOfVulnerabilityIdentifiedDropdown)public WebElement typeOfVulnerabilityIdentified;
    @FindBy(how = How.ID,using = stateInputBox)public WebElement state;

    public void legalAndSecurityLink() throws InterruptedException {
        windowsFullPageScrollDown();
        clickById(acceptCookiesButton);
        sleepFor(5);
        clickByXpath(legalAndSecurityLocator);
    }

    public void statesOperationLink() throws InterruptedException {
        legalAndSecurityLink();
        clickByXpath(statesOfOperationOrderLocator);
        handleNewTab(driver);
    }

    public void fraudAwarenessLink() throws InterruptedException {
        legalAndSecurityLink();
        clickByXpath(fraudAwareness);
    }

    public void checkScams() throws InterruptedException {
        fraudAwarenessLink();
        clickByXpath(checkScamsLocator);
        clickByXpath(phishingScams);
        navigateBack();
    }

    public void reportSecurityVulnerabilityLink() throws InterruptedException {
        legalAndSecurityLink();
        clickByXpath(reportASecurityVulnerabilityLocator);
    }

    public void contactOurCustomerServiceAgentsByEmailPage() throws InterruptedException {
        reportSecurityVulnerabilityLink();
        geicoReadFile();
        selectOptionByVisibleText(application,applicationOption);
        selectOptionByVisibleText(typeOfVulnerabilityIdentified,typeOfVulnerabilityIdentifiedOption);
        clickByXpath(securityResearcherRadioButton);
        typeById(stateInputBox,stateList);
        typeById(commentsBox,comment);
        typeOnElementByIdNTab(nameInput,sheet.getRow(2).getCell(2).getStringCellValue());
        typeOnElementNew(email,sheet.getRow(2).getCell(3).getStringCellValue());
    }









}
