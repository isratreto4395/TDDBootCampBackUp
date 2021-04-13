package bbctest;

import bbchomepageheader.Reel;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static bbchomepageheader.BBCWebElements.*;

public class ReelTest extends WebAPI {

    Reel reel;

    @BeforeMethod
    public void getinit(){
        reel = PageFactory.initElements(driver,Reel.class);
    }

    @Test(priority = 1)
    public void reelTabTest(){
        reel.reeltab();
        String expectedText = "Home - BBC Reel";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText, "Page title is not a match");
    }

    @Test(priority = 2)
    public void editorsPickTest(){
        reel.editorsPick();
        String expectedText = "The nuclear lighthouses built by the Soviets in the Arctic";
        String actualText = getTextByCss(movieTitle);
        Assert.assertEquals(actualText,expectedText, "Page title is not a match");
    }

    @Test(priority = 3)
    public void playlistsTest(){
        reel.playlists();
        String expectedText = "The trailblazing first woman lawmaker of India";
        String actualText = getTextByCss(playlistVideoTitle);
        Assert.assertEquals(actualText,expectedText, "Page title is not a match");
    }

    @Test(priority = 4)
    public void longShotsTest(){
        reel.longShots();
        String expectedText = "LongShots: Seven new films you should know about";
        String actualText = getTextByCss(longShotsTitle);
        Assert.assertEquals(actualText,expectedText, "Page title is not a match");
    }


}
