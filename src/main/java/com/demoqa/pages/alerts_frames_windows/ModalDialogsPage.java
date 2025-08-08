package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import java.security.PublicKey;

public class ModalDialogsPage extends Alert_Frames_WindowsPage{

    private By smallModalButton = By.id("showSmallModal");
    private By smallModaText = By.xpath("//div[contains(text(),'small modal')]");
    private By closeButton = By.id("closeSmallModal");


    //METHODS

    public void clickSmallModalButton() {
        click(smallModalButton);
    }

    public String getSmallModalText() {
        return find(smallModaText).getText();
    }

    public void clickCloseButton() {
        click(closeButton);
    }




}
