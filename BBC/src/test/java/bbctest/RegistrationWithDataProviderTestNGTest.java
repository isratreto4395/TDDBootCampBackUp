package bbctest;

import bbc_geico_verizon_excelReadAndWrite.ReadBBCRegistrationExcel;
import bbc_geico_verizon_excelReadAndWrite.WriteBBCRegistrationExcel;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static bbchomepageheader.BBCWebElements.confirmRegistrationText;
import static registration.Registration.*;

import registration.Registration;
import registration.RegistrationWithDataProviderTestNG;

public class RegistrationWithDataProviderTestNGTest extends WebAPI {
    RegistrationWithDataProviderTestNG registration;

    @BeforeMethod
    public void initialization() {
        registration = PageFactory.initElements(driver, RegistrationWithDataProviderTestNG.class);
    }

    @Test(dataProvider = "RegistrationDataFromExcel", dataProviderClass = RegistrationWithDataProviderTestNG.class)
    public void registrationTest(int birthDay, int birthMonth, int birthYear, String email, String password) throws InterruptedException {
        registration.registrationWithDataProvider(birthDay,birthMonth,birthYear,email,password);
        String expectedText = "OK you’re signed in. Now, want to keep up to date?";
        String actualText = getTextByXpath(confirmRegistrationText);
        Assert.assertEquals(actualText,expectedText,"Text did not match");

    }

}
