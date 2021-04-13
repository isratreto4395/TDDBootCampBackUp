package topdevicebrands;

import common.WebAPI;
import static topdevicebrands.TopDeviceBrandsWebElements.*;

public class Google extends WebAPI {

    public void googleTab(){
        clickByLinkText(googleLocator);
    }

    public void buyNow(){
        googleTab();
        clickByXpath(makeTheSwitchTab);
        clickByXpath(buyNowButton);
        windowHalfPageScroll();
        clickByXpath(continueButton);
    }

    public void messageBanner(){
        googleTab();
        clickByXpath(messageBanner);
        typeByXpathNEnter(chatBox,chatText);
    }

    public void accessoriesTab(){
        googleTab();
        clickByXpath(accessoriesTab);
    }

    public void addFilterFunctionality(){
        accessoriesTab();
        clickByXpath(addFilterButton);
        clickByXpath(brandButton);
        clickByCss(brandOption);
        clickByXpath(colorButton);
        clickByCss(color);
        clickByXpath(categoryButton);
        clickByCss(categoryOption);
        clickByXpath(specialOfferButton);
        clickByCss(specialOfferOption);
        clickByXpath(closeFilterButton);
    }

    public void compatibilityCheck(){
        accessoriesTab();
        typeByIdNEnter(compatibleSearchBox,SearchItem);
        clickByXpath(compatibleSearchItem);



    }

}
