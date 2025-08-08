package Part3_4.com.demoqa.tests.part3.forms;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clcikFemaleRadioButton();
        boolean isFemaleRadioSelected = formsPage.isFemaleSelected();
        Assert.assertTrue(isFemaleRadioSelected,
                "\n Female Radio Button is Not Selected\n");
    }

}
