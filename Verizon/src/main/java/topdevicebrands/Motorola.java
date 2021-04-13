package topdevicebrands;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static topdevicebrands.TopDeviceBrandsWebElements.*;


public class Motorola extends WebAPI {
    @FindBy(how = How.LINK_TEXT, using = sortByRatingOptionDropdown)
    public WebElement sortBy;

    public void motorolaTab() {
        clickByLinkText(motorolaLocator);
        windowHalfPageScroll();
    }

    public void motorolaPhoneSelection() {
        motorolaTab();
        windowHalfPageScrollUp();
        clickByXpath(buyNowButton);

    }

    public void motorolaPhonePageWatchVideo() throws InterruptedException {
        windowHalfPageScroll();
        motorolaPhoneSelection();
        sleepFor(5);
        clickByXpath(watchVideoLink);
    }

    public void chatWithUsTab() throws InterruptedException {
        motorolaPhoneSelection();
        clickByXpath(chatButton);
        sleepFor(5);
        clickByXpath(chatBox);
    }


}
