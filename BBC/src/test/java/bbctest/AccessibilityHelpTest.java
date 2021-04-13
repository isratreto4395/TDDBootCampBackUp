package bbctest;

import bbchomepagefooter.AccessibilityHelp;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static bbchomepageheader.BBCWebElements.*;

public class AccessibilityHelpTest extends WebAPI {
    AccessibilityHelp accessibilityHelp;

    @BeforeMethod
    public void init() {
        accessibilityHelp = PageFactory.initElements(driver, AccessibilityHelp.class);
    }

    @Test
    public void BBCAccessibilityHelpPageTest() {
        accessibilityHelp.BBCAccessibilityHelpPage();
        String expectedTitle = "Accessibility";
        String actualTitle = getTextByCss(accessibilityTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Ttitle did not match");
    }

    @Test //passed
    public void accessibilityIPlayerPageTest() {
        accessibilityHelp.accessibilityIPlayerPage();
        String expectedTitle = "Search results";
        String actualTitle = getTextByXpath(searchResultsText);
        Assert.assertEquals(actualTitle, expectedTitle, "Ttitle did not match");
    }

    @Test//passed
    public void searchResultsPageTest() {
        accessibilityHelp.searchResultsPage();
        String expectedTitle = "Troubleshooting problems with downloads on a mobile or tablet";
        String actualTitle = getTextByXpath(troubleShootText);
        Assert.assertEquals(actualTitle, expectedTitle, "Ttitle did not match");
    }

    @Test
    public void programmersAndAccessibilityTest() throws Exception {
        accessibilityHelp.programmersAndAccessibility();
        List<String> expectedArrayList = Arrays.asList("Home", "Clips & Videos", "Meet the team", "Podcast", "Contact Us", "Blogs & Guides", "Information & Support");
        Assert.assertEquals(getTextFromWebElementsByXpath(bbcSoundsHeader), expectedArrayList, "Wrong number of list");
    }

    @Test
    public void bbcIPlayerLinkChangeLocationTest(){
        accessibilityHelp.bbcIplayerLinkChangeLocation();
        String expectedLocation = "South East";
        String actualLocation = getTextByCss(location);
        Assert.assertEquals(actualLocation,expectedLocation,"Wrong location is entered");
    }

    @Test
    public void changeLanguageTest(){
        accessibilityHelp.changeLanguageDropDown();
        String expectedLocation = "Cymraeg";
        String actualLocation = getTextByCss(languageSelection);
        Assert.assertEquals(actualLocation,expectedLocation,"Wrong location is entered");
    }

    @Test
    public void parentalControlTest(){
    accessibilityHelp.parentalControl();
    String expectedTitle = "BBC iPlayer - Parental Controls";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle,expectedTitle,"Page title does not match");
    }

    @Test
    public void helpAndFAQTest(){
        accessibilityHelp.helpAndFAQ();
        String expectedText = "iPlayer help and FAQs";
        String actualText = getTextByCss(helpAndFAQTitle);
        Assert.assertEquals(actualText,expectedText,"Title does not match");
    }

//    @Test
//    public void channelHeaderTest(){
//        accessibilityHelp.channelsHeader();
//        String expectedText = "Featured on BBC Three";
//        String actualText = getTextByXpath(channelTitle);
//        Assert.assertEquals(actualText,expectedText,"Title does not match");
//    }

    @Test
    public void myProgrammersHeaderTest(){
        accessibilityHelp.myProgrammesHeader();
        String expectedText = "My Programmes";
        String actualText = getTextByCss(myProgammersTitle);
        Assert.assertEquals(actualText,expectedText,"Title does not match");
    }






}
