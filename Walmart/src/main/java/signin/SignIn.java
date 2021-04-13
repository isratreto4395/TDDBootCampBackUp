package signin;

import common.WebAPI;

import java.io.IOException;
import java.util.Properties;

import static databases.ConnectToSqlDB.loadProperties;
import static signin.SignInWebElements.*;

public class SignIn extends WebAPI {


    public void walmartSignIn() throws IOException {
        Properties properties = loadProperties();
        String email = properties.getProperty("WalmartEmailAddress");
        String password = properties.getProperty("WalmartPassword");
        clickByXpath(accountLocator);
        clickByXpath(signInLocator);
        typeById(emailInputBox,email);
        typeById(passwordInputBox,password);
        clickByXpath(keepMeSignInCheckBox);
        clickByCss(signInButton);
    }












}
