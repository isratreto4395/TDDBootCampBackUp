package bbchomepagefooter;

import common.WebAPI;

import static bbchomepageheader.BBCWebElements.*;

public class TermsOfUse extends WebAPI {

    public void termsOfUsePage() {
        windowsFullPageScrollDown();
        clickByXpath(termsOfUseLocator);
        windowHalfPageScroll();
        clickByXpath(accessingBBC);
        navigateBack();
        windowHalfPageScroll();
        clickByXpath(joiningIn);
    }

    public void fullVersionOfBBCTermsOfUse() {
        termsOfUsePage();
        windowTwoThirdPageScroll();
        clickByXpath(fullVersionOfRules);
        clickByXpath(downloadRulesAsPDF);
    }
}
