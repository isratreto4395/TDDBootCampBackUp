package signintest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import signin.SignIn;

import java.io.IOException;

import static signin.SignInWebElements.*;

public class SignInTest extends WebAPI {

    SignIn signIn;

    @BeforeMethod
    public void getInit(){
        signIn = PageFactory.initElements(driver,SignIn.class);
    }

    @Test
    public void walmartSignIntest() throws IOException {
        signIn.walmartSignIn();
        String expectedText = "Login" ;
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Title is wrong");
    }

}
