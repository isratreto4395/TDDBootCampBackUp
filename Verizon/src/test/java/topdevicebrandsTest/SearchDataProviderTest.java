package topdevicebrandsTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import topdevicebrands.SearchBoxDataProvider;

public class SearchDataProviderTest extends WebAPI {
    SearchBoxDataProvider searchBox;

    @BeforeMethod
    public void initialization() {
        searchBox = PageFactory.initElements(driver, SearchBoxDataProvider.class);
    }

    @Test(dataProvider = "SearchItems", dataProviderClass = SearchBoxDataProvider.class)
    public void testSearchBoxFunctionality(String item) throws InterruptedException {
        searchBox.searchBoxFunctionality(item);
        String expectedItem = "Search Results for " + item + " at Verizon";
        String actualItem = driver.getTitle();
        Assert.assertEquals(actualItem, expectedItem, "Title is not a match");
    }
}
