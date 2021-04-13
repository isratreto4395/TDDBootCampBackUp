package bbctest;

import registration.Registration;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static bbchomepageheader.BBCWebElements.*;

public class RegistrationTest extends WebAPI {
    Registration registration;

    @BeforeMethod
    public void initialization() {
        registration = PageFactory.initElements(driver, Registration.class);
    }

   // @Test
    public void signInPageVerifyTest(){
        registration.signInPageVerify();
        String expectedText = "Sign in";
        String actualText = getTextByXpath(signInText);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }

    @Test //read and write excel
    public void registrationTest() throws InterruptedException {
        registration.registration();
        String expectedText = "OK you’re signed in. Now, want to keep up to date?";
        String actualText = getTextByXpath(confirmRegistrationText);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }
}
