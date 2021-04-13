package departments;

import common.WebAPI;
import databases.ConnectToSqlDB;
import datadriven.DataSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static departments.BeautyCategoryWebElement.*;

public class BeautyCategory extends WebAPI {
    @FindBy(how = How.XPATH, using = beautyButtonLocator)
    public WebElement beautyButton;
    @FindBy(how = How.XPATH, using = sortByLocator)
    public WebElement sortBy;
    @FindBy(how = How.XPATH, using = increasingQuantityBox)
    public WebElement increasingQuantity;
    @FindBy(how = How.CSS, using = increasingQuantityFromCartDropDown)
    public WebElement increasingQuantityFromCart;
    @FindBy(how = How.XPATH, using = premiumBeauty)
    public WebElement premiumBeautyLocator;

    public void beautyButtonLocate(){
        clickByXpath(homepageDropdown);
        windowsFullPageScrollSideBar(beautyButton);
        clickByXpath(beautyButtonLocator);
    }

    public void shopAllBeautyGiftEligible() {
        beautyButtonLocate();
        clickByXpath(shopAllBeautyCategory);
        clickById(moisturizersSideTab);
        clickById(giftEligibleCheckBox);
    }

    //navigate back
    public void shopAllPremiumBeauty() {
        beautyButtonLocate();
        clickByXpath(shopAllPremiumBeautyCategory);
        clickByXpath(brandsWelove);
        navigateBack();
    }

    public void blackOwnedBeautyNavigateBackAndForward() {
        beautyButtonLocate();
        clickByXpath(blackOwnedBeauty);
        clickByXpath(sideBarMenu);
        navigateBack();
        navigateForward();
    }

    public void premiumBeautyWebelementListToStringList() {
        beautyButtonLocate();
        windowsFullPageScrollSideBar(premiumBeautyLocator);
        clickByXpath(premiumBeauty);
        List<WebElement> element = getListOfWebElementsByXpath(premiumBeautyListOfCategory);
        List<String> list = getListOfString(element);
        List<String> premiumBeautyOptions = getTextFromWebElementsByXpath(premiumBeautyListOfCategory);
        DataSource.insertDataIntoDB(premiumBeautyOptions,"premiumBeauty","premiumOptions");

    }
    public void readPremiumBeautyTableFromDB() throws Exception {
        DataSource.getItemsListFromDB("premiumBeauty","premiumOptions");
    }

    public void personalCareOption() {
        beautyButtonLocate();
        clickByXpath(personalCareButton);
    }

    //putting personal care options in a list
    public void storingPersonalCareOptionListsInDatabase() {
        personalCareOption();
        List<String> personalCareOptions = getTextFromWebElementsByCss(personalCareOptionList);
        DataSource.insertDataIntoDB(personalCareOptions,"personalCare","options");
    }

    public void readPersonalCareTableFromDB() throws Exception {
        storingPersonalCareOptionListsInDatabase();
        DataSource.getItemsListFromDB("personalCare","Options");
    }

    public void personalCareByBrandFindYourHappyPlace() throws InterruptedException {
        personalCareOption();
        windowHalfPageScroll();
        clickByXpath(findYourHappyPlaceLocator);
        clickByCss(genderSelection);
        //dropdown
        selectOptionByVisibleText(sortBy, priceLowToHight);
        sleepFor(3);
        clickByXpath(lotionItemSelect);
    }

    public void addingLotionToCart() throws InterruptedException {
        personalCareByBrandFindYourHappyPlace();
        selectOptionByVisibleText(increasingQuantity, quantityAmmount);
        clickByXpath(addingLotionToCart);
    }

    public void updatingItemQuantityFromShoppingCart() throws InterruptedException {
        addingLotionToCart();
        //clickByCss(captchaCheckBox);
        clickByXpath(viewCart);
        selectOptionByVisibleText(increasingQuantityFromCart, cartQuantityAmmount);
    }

    public void removingItemFromShoppingCart() throws InterruptedException {
        updatingItemQuantityFromShoppingCart();
        clickByXpath(removeItemFromCart);
    }

    public void undoRemovingItem() throws InterruptedException {
        removingItemFromShoppingCart();
        clickByXpath(undoRemove);
    }


    public void filteringBathAndBodyItem() {
        personalCareOption();
        clickByXpath(bathAndBodyTabLocator);
        clickByXpath(bathShowerAndSpaMenuButton);
        clickByLinkText(bodyWashAndShowerGelTab);
        clickByXpath(delivertoHomeFilter); //radio button
        windowHalfPageScroll();
        typeByCssNEnter(brandFilterInputBox, brandTypes);
        clickByCss(brand);

    }

    public void clearAllFilter() {
        filteringBathAndBodyItem();
        clickByXpath(clearFilter);
    }

    public void ratingsAndReviewsOfFilteredItem() {
        filteringBathAndBodyItem();
        clickByXpath(filteredItemSelect);
        clickByXpath(ratingsLocator);
        clickByXpath(seeAllReview);
        //clickByXpath(fiveStarReview);
        windowHalfPageScroll();
        clickByXpath(frequentMention);
        windowHalfPageScroll();
    }

    public void checkout() {
        ratingsAndReviewsOfFilteredItem();
        windowsFullPageScrollUp();
        clickByXpath(backToItemButton);
        clickByXpath(addToCartItem);
        clickByXpath(checkout);
        clickByXpath(continueWithoutAccount);
        clickById(pickUpFree);
        clickByXpath(editAddressInCheckoutPage);
        clickByXpath(pickupLocation);
        waitTimeExplicit(continueButton);
        clickByXpath(continueButton);
    }

    public void exclusivesTab() {
        beautyButtonLocate();
        clickByXpath(exclusives);
    }

    public void newArrivalsTab() {
        beautyButtonLocate();
        clickByXpath(newArrivals);
    }

    public void bestSellersTab() {
        beautyButtonLocate();
        clickByXpath(bestSellers);
    }

    public void featureBrandsTab(){
        beautyButtonLocate();
        waitUntilClickAble(By.xpath(beautyTutorialTab));
        clickByXpath(beautyTutorialTab);
    }

}
