package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToUtility extends Utility{

    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }
//Alert Text Method
    public static String getAlertText() {
       return switchTo().alert().getText();
    }
//Alert Accept Method
    public static void acceptAlert() {
        switchTo().alert().accept();
    }

//dismiss Method
    public static void dismissAlert() {
        switchTo().alert().dismiss();
    }

//Set Text Method
    public static void setAlertText(String text) {
        switchTo().alert().sendKeys(text);
    }

    //SwitchTo frame
    public static void switchToFrameString(String value) {
        switchTo().frame(value);
    }

    public static void switchToDefaultContent() {
        switchTo().defaultContent();
    }

    public static void switchToFrameIndex(int index) {
        switchTo().frame(index);
    }

    public static void switchToFrameElement(WebElement element) {
        switchTo().frame(element);
    }


    public static void switchToWindow(String handle) {
        switchTo().window(handle);
    }





}
