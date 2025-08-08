package Part3_4.com.demoqa.tests.part4.alerts;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.SwitchToUtility.*;

@Test
public class AlertsTest extends BaseTest {


    public void testInformationAlert() {
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramsWindowsCard().clickAlert();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(), expectedAlertText,
                "\n Actual & Expected Messages do Not Match \n");

        acceptAlert();
    }

    public void testConfirmationAlert() {
       var alertsPage = homePage.goToAlertsFramsWindowsCard().clickAlert();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String actualConfirmationResult = alertsPage.getConfirmationResult();
        String expectedConfirmationResult = "You selected Cancel";
        Assert.assertEquals(actualConfirmationResult, expectedConfirmationResult,
                "\n You Did Not Select Cancel\n");
    }
    public void testPromptAlert() {
        String alertText = "Selenium With Java";
        var alertsPage = homePage.goToAlertsFramsWindowsCard().clickAlert();
        alertsPage.clickPromptAlertButton();
        setAlertText(alertText);
        acceptAlert();
        String actualPromptResult = alertsPage.getPromptAlertResult();
        String expectedPromptResult = "You entered " + alertText;
        Assert.assertEquals(actualPromptResult, expectedPromptResult,
                "\n Actual & Expected Result Do Not Match\n");
    }
}
