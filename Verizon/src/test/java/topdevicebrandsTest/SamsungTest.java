package topdevicebrandsTest;

import org.testng.annotations.Test;
import topdevicebrands.Samsung;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import java.util.Arrays;
import java.util.List;

import static topdevicebrands.TopDeviceBrandsWebElements.*;


public class SamsungTest extends WebAPI {
    Samsung samsung;

    @BeforeMethod
    public void init() {
        samsung = PageFactory.initElements(driver, Samsung.class);
    }

    //@Test
    public void topDeviceBrandsCategoryListTest() {
        samsung.topDeviceBrandsCategoryList();
        List<String> expectedArrayList = Arrays.asList("Samsung", "Apple", "LG", "Motorola", "Google", "Amazon");
        //List<String> actualArrayList = Arrays.asList(topAccessoryBrandsList);
        Assert.assertEquals(getTextFromWebElementsByXpath(topAccessoryBrandsList), expectedArrayList, "The list is incorrect");
    }

    @Test(priority =1)//passed
    public void samsungTabTest(){
        samsung.samsungTab();
        String expectedTitle = "Samsung Galaxy Phones, Tablets, & Watches";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Ttitle is wrong");
    }

    @Test(priority = 2)//passed
    public void saveOnTheLatestGalaxyDevicePageTest() throws InterruptedException {
        samsung.saveOnTheLatestGalaxyDevicePage();
        String expectedTitle = "Save on Samsung Galaxy Phones | Shop Today";
        String actualTitle = getTextByXpath(saveOnSamsungPageHeader);
        Assert.assertEquals(actualTitle,expectedTitle,"Ttitle is wrong");
    }

    @Test(priority = 3)//passed
    public void brandFilterTest() throws InterruptedException {
        samsung.filterFunctionalitySaveOnSamsungPhonesPage();
        String expectedOption = "Samsung";
        String actualOption = getTextByXpath(brandOptionDisplayed);
        Assert.assertEquals(actualOption,expectedOption,"Filtered text is wrong");
    }

    @Test(priority = 4)//passed
    public void colorFilterTest() throws InterruptedException {
        samsung.filterFunctionalitySaveOnSamsungPhonesPage();
        String expectedOption = "Purple";
        String actualOption = getTextByXpath(colorOptionDisplayed);
        Assert.assertEquals(actualOption,expectedOption,"Filtered text is wrong");
    }

    @Test(priority = 5)//passed
    public void pricingDropdownTest() throws InterruptedException {
        samsung.sortAndPricingOnSaveOnSamsungPhonePage();
        String expectedOption = "2-Year Contract";
        String actualOption = getTextByXpath(paymentOption);
        Assert.assertEquals(actualOption,expectedOption,"Filtered option is wrong");
    }

    @Test(priority = 6)//passed
    public void sortByDropdownTest() throws InterruptedException {
        samsung.sortAndPricingOnSaveOnSamsungPhonePage();
        String expectedOption = "Featured";
        String actualOption = getTextByXpath(sortByOptions);
        Assert.assertEquals(actualOption,expectedOption,"Filtered options is wrong");
    }

    @Test(priority = 7)//passed
    public void addToCompareFunctionalityTest() throws InterruptedException {
        samsung.addToCompareFunctionality();
        String expectedTitle = "Save on Samsung Galaxy Phones | Shop Today";
        String actualTitle = getTextByXpath(saveOnSamsungPageHeader);
        Assert.assertEquals(actualTitle, expectedTitle, "Ttitle is wrong");
    }

    @Test(priority = 8)//passed
    public void quickViewFunctionalityTest() throws InterruptedException {
        samsung.quickViewFunctionality();
        String expectedText = "Galaxy S21 5G";
        String actualText = getTextByXpath(quickViewText);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }


}
