package Part3_4.com.demoqa.tests.part4.frames;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class FramesTest extends BaseTest {


    public void testFramesBigBox() {
       var framesPage = homePage.goToAlertsFramsWindowsCard().clickFrame().clickFrame();
       String actualBigBoxText = framesPage.getTextInBigFrame();
       String expectedBigBoxText = "This is a sample page";
        Assert.assertEquals(actualBigBoxText, expectedBigBoxText,
                "\n Actual & Expected Text Do Not Match \n");

        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText,
                "\n Actual & Expected Header Do Not Match\n");

    }

    public void testFrameSmallBox() {
       var framesPage = homePage.goToAlertsFramsWindowsCard().clickFrame();
        String actualSmallBoxText = framesPage.getTextInSmallFrame();
        String expectedSmallBoxText = "This is a sample page";
        Assert.assertEquals(actualSmallBoxText, expectedSmallBoxText,
                "\n Actual & Expected Text Do Not Match \n");

        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText,
                "\n Actual & Expected Header Text Do Not Match\n");
    }

}

