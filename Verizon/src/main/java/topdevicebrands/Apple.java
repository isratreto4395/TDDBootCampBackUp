package topdevicebrands;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static topdevicebrands.TopDeviceBrandsWebElements.*;


public class Apple extends WebAPI {
    @FindBy(how = How.LINK_TEXT, using = appleLocator)
    public WebElement appleLocate;
    @FindBy(how = How.LINK_TEXT, using = sortByRatingOptionDropdown)
    public WebElement sortBy;
    //@FindBy(how = How.LINK_TEXT,using = appleLocator) public WebElement appleLocate;
    @FindBy(how = How.XPATH, using = compareTab)
    public WebElement compare;
    @FindBy(how = How.XPATH, using = compareOptions)
    public WebElement compareOption;

    public void appleLocator() {
        clickByLinkText(appleLocator);
    }

public void compareModels() throws InterruptedException {
        appleLocator();
        hoverAndClick(driver,compare,compareOption);
        sleepFor(3);
}
}
