package topdevicebrands;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static topdevicebrands.TopDeviceBrandsWebElements.*;

public class Samsung extends WebAPI {
    @FindBy(how = How.XPATH, using = saveOnTheLatestButton)
    public WebElement saveOnTheLatest;
    @FindBy(how = How.XPATH, using = hoverFirstItemImage)
    public WebElement hoverFirstItem;
    @FindBy(how = How.XPATH, using = firstItemAddToCompareButton)
    public WebElement firstItemAddToCompare;
    @FindBy(how = How.XPATH, using = hoverSecondItemImage)
    public WebElement hoverSecondItem;
    @FindBy(how = How.XPATH, using = secondItemAddToCompareButton)
    public WebElement secondItemAddToCompare;
    @FindBy(how = How.CSS, using = quickViewButton)
    public WebElement quickViewFirstItem;



    public void topDeviceBrandsCategoryList() {
        getTextFromWebElementsByXpath(topAccessoryBrandsList);
        //getTextFromWebElementTest(topAccessoryBrandsList);
    }

    public void samsungTab() {
        clickByLinkText(samsungLocator);
    }

    public void saveOnTheLatestGalaxyDevicePage() throws InterruptedException {
        samsungTab();
        windowHalfPageScroll();
        sleepFor(5);
        clickByXpath(saveOnTheLatestButton);

    }

    public void filterFunctionalitySaveOnSamsungPhonesPage() throws InterruptedException {
        saveOnTheLatestGalaxyDevicePage();
        waitUntilClickAble(By.xpath(addFilterButton));
        clickByXpath(addFilterButton);
        clickByXpath(brandButton);
        clickByCss(brandOption);
        clickByXpath(colorButton);
        clickByCss(colorOption);
        clickByXpath(closeFilterButton);
    }

    public void sortAndPricingOnSaveOnSamsungPhonePage() throws InterruptedException {
        filterFunctionalitySaveOnSamsungPhonesPage();
        clickById(pricingDropdown);
        clickByXpath(paymentOption);
        clickById(sortByDropdown);
        clickByXpath(sortByOptions);
    }

    public void addToCompareFunctionality() throws InterruptedException {
       sortAndPricingOnSaveOnSamsungPhonePage();
        hoverAndClick(driver,hoverSecondItem,secondItemAddToCompare);
        clickByXpath(closeButton);
    }

    public void quickViewFunctionality() throws InterruptedException {
        sortAndPricingOnSaveOnSamsungPhonePage();
        hoverAndClick(driver,hoverFirstItem,quickViewFirstItem);
    }




}
