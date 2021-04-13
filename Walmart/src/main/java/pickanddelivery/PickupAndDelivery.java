package pickanddelivery;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import static pickanddelivery.PickupAndDeliveryWebElement.*;

public class PickupAndDelivery extends WebAPI {

    public void pickupAndDeliveryTab() {
        clickByXpath(pickupAndDeliveryTab);
        clickByXpath(popUp);
        //handling new tab
        //handleNewTab(driver);
        closeTheOldWindow();
    }

    public void quickIntro() throws InterruptedException {
        pickupAndDeliveryTab();
        Thread.sleep(5000);
        windowTwoThirdPageScroll();
        clickByXpath(startShoppingBanner);
    }

    public void pickupFrom() throws InterruptedException {
        quickIntro();
        clickByXpath(pickupAddress);
        clearField1(zipCodeSearchBox);
        typeByXpathNEnter(zipCodeSearchBox, zipcode);
        clickByXpath(selectAddress);
        clickByXpath(continueButton);
        clickByXpath(changeButton);

    }

    public void showMore() throws InterruptedException {
        quickIntro();
        windowsFullPageScrollDown();
        clickByXpath(showMore);
        Thread.sleep(5);
        windowsFullPageScrollDown();
        Thread.sleep(5);
        clickByXpath(showLess);

    }

    public void reserveATimeSlot() throws InterruptedException {
        quickIntro();
        clickByXpath(seeTimesSlotTab);

    }

}
