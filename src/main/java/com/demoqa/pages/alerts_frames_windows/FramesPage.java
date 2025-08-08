package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class FramesPage extends Alert_Frames_WindowsPage{

    private By textInFrame = By.id("sampleHeading");
    //Switch To Frames Using String
    private String iFrameBigBox = "frame1";
    //
    private By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");

    //SWITCH TO FRAME USING WEBELEMENT
    private By iFrameSmallBox = By.xpath("//div[@id='frame2Wrapper']/iframe");



    //METHOD OF Switch To Frames Using String
    private void switchToBigBox() {
//        driver.switchTo().frame(iFrameBigBox);
        switchToFrameString(iFrameBigBox);
    }

    private void switchToSmallBox() {
        //THIS IS A METHOD TO SWITCH TO FRAME USING INDEX
//        switchToFrameIndex(1);

        //THIS IS ANOTHER METHOD TO SWITCH TO FRAME USING WEB ELEMENT
        switchToFrameElement(find(iFrameSmallBox));
    }


    //METHOD
    public String getTextInBigFrame() {
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text " + bigFrameText);
//        driver.switchTo().defaultContent();
        //I can change 'defaultContent()' to 'parentFrame()' and still works fine
        //Although I can use defaultContent() more because it goes back to the main page
        switchToDefaultContent();
        return bigFrameText;
    }

    public String getTextInSmallFrame() {
        switchToSmallBox();
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }

    public String getHeaderFramesText() {
        return find(headerFramesText).getText();
    }


}
