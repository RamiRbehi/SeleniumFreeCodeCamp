package Part3_4.com.demoqa.tests.part4.screenshots;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

public class CaptureFailedScreenshotsTest  extends BaseTest {

    @Test
    public void testClickingSubmitWithoutJavaScriptExecutor() {
        var practiceFormPage = homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickSubmitButton();
    }

}
