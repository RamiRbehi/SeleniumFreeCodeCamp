package Part3_4.com.demoqa.tests.part4.dynamic_wait;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class DynamicWaitTest extends BaseTest {

    public void testVisibleAfterButtonText() {
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
       String actualText = dynamicPage.getVisibleAfterButtonText();
       String expectedText = "Visible After 5 Seconds";
        Assert.assertEquals(actualText, expectedText,
                "\n Actual & Expected Text Do Not Match \n");
    }

    public void testProgressBar() {

        var progressBarPage = homePage.goToWidgets().clickProgressBar();
        progressBarPage.clickStartButton();
        String actualValue = progressBarPage.getProgressValue();
        String expectedValue = "100%";
        Assert.assertEquals(actualValue,expectedValue,
                "\n Value Is Not 100% \n");
    }
























}
