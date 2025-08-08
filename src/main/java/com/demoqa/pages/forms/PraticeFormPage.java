package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.*;

public class PraticeFormPage extends FormsPage{

    private By femaleRadioButton = By.id("gender-radio-2");

    private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");

    private By submitButton = By.id("submit");

    public void clcikFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJs(femaleRadioButton);
    }

    public boolean isFemaleSelected() {
        return find(femaleRadioButton).isSelected();
    }


    //Methods for checkbox

    public void clickSportsCheckbox() {
        if (!find(sportsHobbyCheckbox).isSelected()) {
            scrollToElementJS(sportsHobbyCheckbox);
            clickJs(sportsHobbyCheckbox);
        }
    }

    public void clickReadingCheckbox() {
        if (!find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            clickJs(readingHobbyCheckbox);
        }
    }

    public void clickMusicCheckbox() {
        if (!find(musicHobbyCheckbox).isSelected()) {
            scrollToElementJS(musicHobbyCheckbox);
            clickJs(musicHobbyCheckbox);
        }
    }

    public void unclickReadingCheckbox() {
        if (find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            clickJs(readingHobbyCheckbox);
        }
    }

    public boolean isReadingSelected(){
        return find(readingHobbyCheckbox).isSelected();
    }

    public void clickSubmitButton() {
//        scrollToElementJS(submitButton);
        click(submitButton);
    }

}
