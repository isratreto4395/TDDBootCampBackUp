package topdevicebrands;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static topdevicebrands.TopDeviceBrandsWebElements.*;


public class LG extends WebAPI {

    public void lGTab(){
        clickByLinkText(lG);
    }

    public void lGvalueAndPerformance() {
        lGTab();
        clickByXpath(lGVauleAndPerformanceLocator);
        clickByXpath(buyNowButton);
    }

    public void addToCart() throws InterruptedException {
        lGvalueAndPerformance();
        clickByXpath(fullRetailOption);
        clickByXpath(continueButton);
        typeByXpath(zipCodeInputBox,zipCode);
        clickByXpath(confrimLocationButton);
        sleepFor(5);
        clickByXpath(newCustomerButton);
    }

    //do feedback , chat box, contact us, log in
    public void feedback() throws InterruptedException {
        lGvalueAndPerformance();
        clickByXpath(feedbackButton);
        sleepFor(5);
        windowHandle();

    }
}
