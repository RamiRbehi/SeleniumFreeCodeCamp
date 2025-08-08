package Part3_4.com.demoqa.tests.part4.windows;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.GetUtility.getURL;

public class WindowsTest extends BaseTest {

    @Test

    public void testNewWindowURL() {
        var windowsPage = homePage.goToAlertsFramsWindowsCard().clickWindowsBrowser();
        windowsPage.clickNewWindowButton();
        windowsPage.switchToNewWindow();
        String actualURL = getURL();
        String expectedURL = "https://demoqa.com/sample";
        Assert.assertEquals(actualURL, expectedURL,
                "Actual & expected URL's Do Not Match");
    }

}















































