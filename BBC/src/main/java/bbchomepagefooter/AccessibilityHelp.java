package bbchomepagefooter;

import common.WebAPI;
import datadriven.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static bbchomepageheader.BBCWebElements.*;

public class AccessibilityHelp extends WebAPI {

    @FindBy(how = How.ID, using = locationDropdownBar)
    public WebElement changeLocation;
    @FindBy(how = How.ID, using = langaugeDropdownBar)
    public WebElement changeLanguage;

    public void BBCAccessibilityHelpPage() {
        windowsFullPageScrollDown();
        clickByXpath(bbcAccessibility);
        clickByXpath(fAQS);
    }

    public void accessibilityIPlayerPage() {
        BBCAccessibilityHelpPage();
        typeByIdNEnter(searchBox, searchText);
    }

    public void searchResultsPage() {
        accessibilityIPlayerPage();
        clickByXpath(troubleShoot);
    }

    public void programmersAndAccessibility() throws Exception {
        BBCAccessibilityHelpPage();
        navigateBack();
        windowHalfPageScroll();
        clickByXpath(bbcSoundsLink);
        List<String> BBCSoundOptions = getTextFromWebElementsByXpath(bbcSoundsHeader);
        DataSource.insertDataIntoDB(BBCSoundOptions, "bbcSound", "categories");
        DataSource.getItemsListFromDB("bbcSound", "categories");
    }

    public void iPlayerLink() {
        clickByXpath(bbcAccessibility);
        windowHalfPageScroll();
        clickByLinkText(bbciPlayerLocator);
    }

    public void bbcIplayerLinkChangeLocation() {
        iPlayerLink();
        selectOptionByVisibleText(changeLocation, locationRegion);
    }

    public void changeLanguageDropDown() {
        iPlayerLink();
        windowsFullPageScrollDown();
        selectOptionByVisibleText(changeLanguage, langauge);

    }
    public void parentalControl() {
        iPlayerLink();
        windowsFullPageScrollDown();
        clickByXpath(parentalControlsLocator);
    }

    public void helpAndFAQ() {
        iPlayerLink();
        windowsFullPageScrollDown();
        clickByXpath(helpANdFAQLocator);
    }

//    public void channelsHeader(){
//        iPlayerLink();
//        clickByXpath(channelsLocator);
//        clickByXpath(channelThree);
//    }

    public void myProgrammesHeader(){
        iPlayerLink();
        clickByXpath(myProgrammersLocator);
    }


}
