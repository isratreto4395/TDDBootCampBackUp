package registration;

import bbc_geico_verizon_excelReadAndWrite.ReadBBCRegistrationExcel;
import bbc_geico_verizon_excelReadAndWrite.WriteBBCRegistrationExcel;
import common.WebAPI;
import org.testng.annotations.DataProvider;

import static bbc_geico_verizon_excelReadAndWrite.ReadBBCRegistrationExcel.filePath;
import static bbchomepageheader.BBCWebElements.*;


public class RegistrationWithDataProviderTestNG extends WebAPI {

    @DataProvider(name = "RegistrationDataFromExcel")
    public Object[][] getRegistrationDataFromExcel() {
        return ReadBBCRegistrationExcel.getRegistrationTestData("BBCRegistrationAccountInfo");
    }

    public void registrationWithDataProvider(int day, int month, int year, String email, String password) throws InterruptedException {
        WriteBBCRegistrationExcel.writeExcel(filePath);
        clickByXpath(registrationIcon);
        clickByXpath(registerNowLink);
        sleepFor(5);
        clickByXpath(age);
        typeOnElementWithInteger(dayInput, day);
        typeOnElementWithInteger(monthInput, month);
        typeOnElementWithInteger(yearInput, year);
        sleepFor(3);
        clickById(continueButton);
        typeOnElementNew(emailAddress, email);
        typeOnElementNew(passwordField, password);
        clickById(showPassword);
        sleepFor(5);
        clickById(continueButton);
        sleepFor(3);


    }

}
