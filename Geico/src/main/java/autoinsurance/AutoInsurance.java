package autoinsurance;

import bbc_geico_verizon_excelReadAndWrite.WriteGeicoAutoInsuranceExcel;
import common.WebAPI;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static autoinsurance.AutoInsuranceWebElements.*;


public class AutoInsurance extends WebAPI {
    @FindBy(how = How.XPATH, using = browseByStateDropdown)
    public WebElement stateDropdown;


    public static String filePath = "../Geico/GeicoExcelData/GeicoInsuranceRegister.xlsx";
    public static File file = new File(filePath);
    public static FileInputStream inputStream;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;

    public static void geicoReadFile() {

        try {
            inputStream = new FileInputStream(file);
            workbook = new XSSFWorkbook(inputStream);
            sheet = workbook.getSheet("GeicoRegistrationAccountInfo");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void autoInsuranceTab() {
        clickByCss(autoInsuranceLocator);
        typeOnElementNew(zipCodeBox, zipCode);
        clickByXpath(startQuoteButton);
    }

    public void geicoQuoteRegistrationStepOne() {
        autoInsuranceTab();
        clickByXpath(nextButton);
    }

    public void registrationStepTwoDateField() {
        WriteGeicoAutoInsuranceExcel.geicoWriteExcel(filePath);
        geicoReadFile();
        geicoQuoteRegistrationStepOne();
        typeOnElementByXpathNEnter(dateField, sheet.getRow(1).getCell(0).getStringCellValue());
    }

    public void registrationStepThreeNameField() throws InterruptedException {
        registrationStepTwoDateField();
        typeOnElementByXpathNTab(firstNameInputBox, sheet.getRow(1).getCell(1).getStringCellValue());
        typeOnElementByXpath(lastNameInputBox, sheet.getRow(1).getCell(2).getStringCellValue());
        sleepFor(5);
        clickByXpath(nextButton1);
    }

    public void registrationStepFourAddressField() throws InterruptedException {
        registrationStepThreeNameField();
        typeOnElementByIdNTab(addressInputBox, sheet.getRow(1).getCell(3).getStringCellValue());
        typeOnElementNew(aptInputBox, sheet.getRow(1).getCell(4).getStringCellValue());
        sleepFor(5);
        clickByXpath(nextButton1);
        clickById(selectOriginalAddressInput);
        //takeEnterKeysByID(selectOriginalAddressInput);
        sleepFor(5);
        clickByXpath(nextButton1);
    }
    public void findAnAgentLink(){
        clickByLinkText(findAndAgentLink);
    }

    public void findAnAgentNearYouSearchBox() {
       findAnAgentLink();
        typeByIdNEnter(addressBox, address);
    }

    public void translateToSpanish() {
        findAnAgentLink();
        clickByXpath(translateButton);
    }

    public void browseByStateDropDown() {
        findAnAgentLink();
        clearField(addressBox);
       //windowsPageScrollToLocator(By.xpath(browseByStateDropdown));
        selectOptionByVisibleText(stateDropdown,state);
        clickByXpath(stateAgentsButton);
    }

    public void localCityInsuranceAgent(){
        browseByStateDropDown();
        clickByXpath(closestCity);
    }


}
