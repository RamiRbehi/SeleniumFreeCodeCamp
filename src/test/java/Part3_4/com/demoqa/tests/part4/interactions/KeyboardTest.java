package Part3_4.com.demoqa.tests.part4.interactions;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyboardTest extends BaseTest {

    @Test

    public void testApplicationUsingKeyboard() {
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("Rami Ben Taieb");
        textBoxPage.setEmail("ramibentaieb@gmail.com");
        textBoxPage.setCurrentAddress("1234 Selenium Avenue");
        textBoxPage.setCurrentAddress("Suite 1520");
        textBoxPage.setCurrentAddress("Ben Arous, Tunisia");
        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("Suite 1520"),
                "\n Actual Address Does Not Contain 'Suite 1520' \n");
    }

}
