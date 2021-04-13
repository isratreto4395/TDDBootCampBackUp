package bbchomepageheader;

import common.WebAPI;

import static bbchomepageheader.BBCWebElements.*;

public class Worklife extends WebAPI {

    public void worklifeTab(){
        clickByXpath(workLifeLocator);
    }

    public void whatIsWorklifeTab(){
        worklifeTab();
        clickByXpath(whatIsWorkLife);
    }

    public void howWeWorkTab(){
        worklifeTab();
        clickByXpath(howWEWork);
    }

    public void howWeLiveTab(){
        worklifeTab();
        clickByXpath(howWeLive);
    }

    public void howWeThinkTab(){
        worklifeTab();
        clickByXpath(hamburgerMenu);
        clickByXpath(howWeThink);
    }

    public void equalityMattersTab(){
        worklifeTab();
        clickByXpath(equalityMatters);
    }

    public void remoteControlTab(){
        worklifeTab();
        clickByXpath(remoteControl);
    }

    public void worklifeReadMore(){
        worklifeTab();
        clickByXpath(readMore);
    }





}
