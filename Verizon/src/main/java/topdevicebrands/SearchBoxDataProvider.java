package topdevicebrands;

import common.WebAPI;
import org.testng.annotations.DataProvider;

import static topdevicebrands.TopDeviceBrandsWebElements.*;

public class SearchBoxDataProvider extends WebAPI {

    @DataProvider(name = "SearchItems")
    public static Object[] searchBoxData() {
        return new Object[]{
                ("Samsung"),
                ("LG"),
                ("Motorola"),
                ("Apple"),
                ("Amazon"),
                ("Google")
        };
    }

    public void searchBoxFunctionality(String item) throws InterruptedException {
        clickByXpath(searchBoxLocator);
        sleepFor(3);
        typeByXpathNEnter(searchBoxInputBox, item);
        sleepFor(3);
    }
}
