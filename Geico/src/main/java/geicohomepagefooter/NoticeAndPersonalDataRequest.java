package geicohomepagefooter;

import bbc_geico_verizon_excelReadAndWrite.WriteGeicoAutoInsuranceExcel;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static autoinsurance.AutoInsurance.*;
import static geicohomepagefooter.GeicoHomePageFooterWebElements.*;

public class NoticeAndPersonalDataRequest extends WebAPI {
    @FindBy(how = How.XPATH, using = questionsBoxSubjectListDropDown)
    public WebElement subjectList;

    public void noticeAndPersonalDataRequestLink() throws InterruptedException {
        windowsFullPageScrollDown();
        clickById(acceptCookiesButton);
        sleepFor(5);
        clickByXpath(noticeAndPersonalDataLocator);
    }

    public void informationWeCollectWindow() throws InterruptedException {
        noticeAndPersonalDataRequestLink();
        clickByXpath(informationWeCollectLocator);
        handleNewTab(driver);
    }

    public void communicationsOptOutSiteLink() throws InterruptedException {
        WriteGeicoAutoInsuranceExcel.geicoWriteExcel(filePath);
        geicoReadFile();
        noticeAndPersonalDataRequestLink();
        clickByLinkText(communicationsOptOutSiteLocator);
        clickByXpath(emailsOptOutOptions);
        sleepFor(3);
        typeOnElementByIdNEnter(emailAddressBox, sheet.getRow(1).getCell(11).getStringCellValue());
    }

    public void returnToOptOutOptionsButton() throws InterruptedException {
        communicationsOptOutSiteLink();
        clickByXpath(returnToOptOutOptions);
    }

    public void optOutOfMarketingMailingAndCallLists() throws InterruptedException {
        returnToOptOutOptionsButton();
        clickByXpath(marketingMailsAndCallsOptOutOptions);
        typeOnElementNew(firstNameInputBox, sheet.getRow(1).getCell(1).getStringCellValue());
        typeOnElementByIdNTab(lastNameInputBox, sheet.getRow(1).getCell(2).getStringCellValue());
        typeOnElementByIdNTab(streetInputBox, sheet.getRow(1).getCell(3).getStringCellValue());
        typeOnElementNew(cityInputBox, sheet.getRow(1).getCell(5).getStringCellValue());
        typeOnElementByIdNTab(stateInputBox, sheet.getRow(1).getCell(6).getStringCellValue());
        typeOnElementByIdNTab(zipCodeInputBox, sheet.getRow(1).getCell(7).getStringCellValue());
        clickByXpath(geicoPolicyHolderRadioButton);
        typeOnElementByIdNTab(areaCodeInputBox, sheet.getRow(1).getCell(8).getStringCellValue());
        typeOnElementByIdNTab(secondPhoneCodeInputBox, sheet.getRow(1).getCell(9).getStringCellValue());
        typeOnElementNew(thirdPhoneCodeInputBox, sheet.getRow(1).getCell(10).getStringCellValue());
        clickByXpath(submitButton);

    }

    public void questionsPopUp() throws InterruptedException {
        noticeAndPersonalDataRequestLink();
        //clickByXpath(questionsBox);
        selectOptionByVisibleText(subjectList, selectASubjectDropdownOption);
    }


}
