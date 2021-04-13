package autoinsurancetest;

import autoinsurance.AutoInsurance;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static autoinsurance.AutoInsuranceWebElements.*;

public class AutoInsuranceTest extends WebAPI {
    AutoInsurance insurance;

    @BeforeMethod
    public void getinit() {
        insurance = PageFactory.initElements(driver, AutoInsurance.class);
    }

    @Test//passed
    public void autoInsuranceTabTest() {
        insurance.autoInsuranceTab();
        String expectedText = "What would you like to protect?";
        String actualText = getTextByXpath(firstStepVerification);
        Assert.assertEquals(actualText, expectedText, "Current text does not match");
    }

    @Test//passed
    public void geicoQuoteRegistrationStepOneTest() {
        insurance.geicoQuoteRegistrationStepOne();
        String expectedText = "We need your date of birth.";
        String actualText = getTextByXpath(secondStepVerification);
        Assert.assertEquals(actualText, expectedText, "Current text does not match");
    }

    @Test//passed
    public void registrationStepTwoDateFieldTest() {
        insurance.registrationStepTwoDateField();
        String expectedText = "We need your name.";
        String actualText = getTextByXpath(thirdStepVerification);
        Assert.assertEquals(actualText, expectedText, "Current text does not match");
    }

    @Test//passed
    public void registrationStepThreeNameFieldTest() throws InterruptedException {
        insurance.registrationStepThreeNameField();
        String expectedText = "Address";
        String actualText = getTextByXpath(fourthStepVerification);
        Assert.assertEquals(actualText, expectedText, "Current text does not match");
    }

    @Test//passed
    public void registrationStepFourAddressFieldTest() throws InterruptedException {
        insurance.registrationStepFourAddressField();
        String expectedText = "Let me know what vehicle you'd like to insure.";
        String actualText = getTextByXpath(fifthStepVerification);
        Assert.assertEquals(actualText, expectedText, "Current text does not match");
    }

    @Test
    public void findAnAgentLinkTest(){
        insurance.findAnAgentLink();
        String expectedTitle = "Find a GEICO Insurance Agent | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title did not match");
    }

    @Test//passed
    public void findAnAgentNearYouSearchBoxTest() {
        insurance.findAnAgentNearYouSearchBox();
        String expectedText = "Find a GEICO Insurance Agent | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title does not match");
    }

    @Test//passed
    public void translateToSpanishTest() {
        insurance.translateToSpanish();
        String expectedText = "Encuentra un Agente de Seguros de GEICO";
        String actualText = getTextByXpath(translatedHeader);
        Assert.assertEquals(actualText, expectedText, "Header does not match");
    }

    @Test
    public void browseByStateDropDownTest() {
        insurance.browseByStateDropDown();
        String expectedText = "Washington Insurance Agents";
        String actualText = getTextByXpath(insuranceAgentPage);
        Assert.assertEquals(actualText, expectedText, "text does not match");
    }

    @Test
    public void localCityInsuranceAgentTest() {
        insurance.localCityInsuranceAgent();
        String expectedText = "Spokane Insurance Agent";
        String actualText = getTextByXpath(headline);
        Assert.assertEquals(actualText, expectedText, "text does not match");
    }


}
