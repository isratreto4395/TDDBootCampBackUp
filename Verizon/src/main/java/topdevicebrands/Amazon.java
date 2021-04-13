package topdevicebrands;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static topdevicebrands.TopDeviceBrandsWebElements.*;

public class Amazon extends WebAPI {

    public void amazonLocator() {
        clickByLinkText(amazonLocator);
        clickByXpath(nextButton);
    }

    public void checkAvailability() {
        amazonLocator();
        windowHalfPageScroll();
        clickByXpath(checkAvailabilityButton);
        typeByIdNEnter(searchAddressBox, address);
        typeByXpathNEnter(emailAddressBox, emailAddress);

    }


}
