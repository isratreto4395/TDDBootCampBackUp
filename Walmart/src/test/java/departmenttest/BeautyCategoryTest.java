package departmenttest;

import common.WebAPI;
import departments.BeautyCategory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static departments.BeautyCategoryWebElement.*;

public class BeautyCategoryTest extends WebAPI {

    BeautyCategory beautyCategory;

    @BeforeMethod
    public void getInit() {
        beautyCategory = PageFactory.initElements(driver, BeautyCategory.class);
    }

    @Test(priority = 1) //passed
    public void beautyButtonLocateTest() {
        beautyCategory.beautyButtonLocate();
        String expectedText ="Beauty";
        String actualText = getTextByXpath(buttonTitle);
        Assert.assertEquals(actualText,expectedText,"Text did not match");

    }

    @Test(priority = 2) //passed
    public void shopAllBeautyGiftEligibleTest() {
        beautyCategory.shopAllBeautyGiftEligible();
        String expectedText = "Gift eligible";
        String actualText = getTextByXpath(optionTitle);
        Assert.assertEquals(actualText, expectedText, "Text did not match");
    }

    @Test(priority = 3) //passed
    public void shopAllPremiumBeautyTest() {
        beautyCategory.shopAllPremiumBeauty();
        String expectedText = "Premium Beauty - Walmart.com - Walmart.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text did not match");

    }

    @Test(priority = 4) //passed
    public void blackOwnedBeautyNavigateBackAndForwardTest() {
        beautyCategory.blackOwnedBeautyNavigateBackAndForward();
        String expectedText = "Black Owned Hair Products";
        String actualText = getTextByXpath(pageTitle1);
        Assert.assertEquals(actualText, expectedText, "Text did not match");
    }

    @Test(priority=5)//passed
    public void premiumBeautyWebelementListToStringListTest(){
        beautyCategory.premiumBeautyWebelementListToStringList();
        List<String> expectedElements = Arrays.asList("Beauty","Brands We Love!","Makeup","Hair Care & Hair Tools","Skincare","Perfume & Cologne","Bath & Body", "Nail", "Premium Beauty", "Men's Grooming", "Beauty Gift Guide");
        List<String> actualElements = getListOfString(getListOfWebElementsByXpath(premiumBeautyListOfCategory));
        Assert.assertEquals(actualElements,expectedElements,"Wrong number of elements");
    }

    @Test(priority =6)//passed
    public void personalCareOptionTest(){
        beautyCategory.personalCareOption();
        String expectedText = "Personal Care";
        String actualText = getTextByXpath(headerText);
        Assert.assertEquals(actualText, expectedText, "Text did not match");
    }

    @Test(priority = 7)//passed
    public void storingPersonalCareOptionListsInDatabaseTest(){
        beautyCategory.storingPersonalCareOptionListsInDatabase();
        List<String> expectedArrayList = Arrays.asList("Personal Care", "Bath & Body", "Oral Care", "Shaving", "Hair Care & Hair Tools", "Men's Essentials", "Personal Health", "Savings Spotlight");
        Assert.assertEquals(getTextFromWebElementsByCss(personalCareOptionList), expectedArrayList, "Wrong number of list");
    }

    @Test(priority = 8)//passed
    public void personalCareByBrandFindYourHappyPlaceTest() throws InterruptedException {
        beautyCategory.personalCareByBrandFindYourHappyPlace();
        String expectedTitle = "Find Your Happy Place Home For The Holidays Nutmeg and Sweet Cream Body Lotion 10 fl oz";
        String actaulTitle = getTextByXpath(productTitle);
        Assert.assertEquals(actaulTitle,expectedTitle,"Title did not match");
    }

    @Test(priority = 9)//passed
    public void addingLotionToCartTest() throws InterruptedException {
        beautyCategory.addingLotionToCart();
        String expectedText = "See gift option in cart";
        String actualText = getTextByXpath(option);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }

    @Test(priority = 10)//passed
    public void UpdatingItemQuantityFromShoppingCartTest() throws InterruptedException {
        beautyCategory.updatingItemQuantityFromShoppingCart();
        String expectedText = "Your cart: 3 items";
        String actualText = getTextById(cartUpdate);
        Assert.assertEquals(actualText, expectedText, "Wrong number on cart");
    }

    @Test(priority = 11)//passed
    public void removingItemFromShoppingCartTest() throws InterruptedException {
        beautyCategory.removingItemFromShoppingCart();
        String expectedText = "0 items in your cart";
        String actualText = getTextByXpath(cartUpdateAfterRemovingItem);
        Assert.assertEquals(actualText, expectedText, "Wrong number on cart");
    }

    @Test(priority = 12)//passed
    public void undoRemovingItemFromShoppingCartTest() throws InterruptedException {
        beautyCategory.undoRemovingItem();
        String expectedText = "Find Your Happy Place Moisturizing Body Lotion, Home For The Holidays, Nutmeg And Sweet Cream, For Dry Skin, 10 fl oz";
        String actualText = getTextByXpath(undoItemTitle);
        Assert.assertEquals(actualText, expectedText, "Wrong number on cart");
    }

    @Test(priority = 13)
    public void filterDeliveryTest() {
        beautyCategory.filteringBathAndBodyItem();
        String expectedText = "Deliver to home";
        String actualText = getTextByXpath(filterDeliveryOption);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }

    @Test(priority = 14)
    public void filterProductTest(){
        beautyCategory.filteringBathAndBodyItem();
        String expectedText = "Aveeno";
        String actualText = getTextByXpath(filterBrand);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }

    @Test(priority = 15)
    public void clearAllFilterTest(){
        beautyCategory.clearAllFilter();
        String expectedText = "Gifting";
        String actualText = getTextByXpath(giftingFilter);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }

    @Test(priority = 16)
    public void ratingsAndReviewsOfFilteredItemTest(){
        beautyCategory.ratingsAndReviewsOfFilteredItem();
        String expectedText = "428 reviews mention Smell";
        String actualText = getTextByXpath(ratingsCount);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }

    @Test(priority = 17)
    public void checkoutTest() throws InterruptedException {
        beautyCategory.checkout();
        String expectedText = "Pick up Today";
        String actualText = getTextByXpath("//div[@class='store-promise-date clearfix']");
        Assert.assertEquals(actualText, expectedText, "Text did not match");
    }

    @Test(priority = 18)//passed
    public void exclusivesTabTest() {
        beautyCategory.exclusivesTab();
        String expectedText = "Exclusives - Walmart.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text did not match");

    }

    @Test(priority = 19)//passed
    public void newArrivalsTabTest() {
        beautyCategory.newArrivalsTab();
        String expectedText = "New Arrivals - Walmart.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text did not match");
    }

    @Test(priority = 20)//passed
    public void bestSellersTabTest() {
        beautyCategory.bestSellersTab();
        String expectedText = "Best Sellers - Walmart.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text did not match");

    }
@Test
    public void readPersonalCareTableFromDBTest() throws Exception {
        beautyCategory.readPersonalCareTableFromDB();
    }
//

    }
