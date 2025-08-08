package Part3_4.com.demoqa.tests.part3.elements;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinksTest extends BaseTest {
    @Test
    public void testLinks() {
        var linkPage = homePage.goToElements().clickLinks();
        linkPage.clickBadRequestLink();
        String actualResponse = linkPage.getReponse();
        Assert.assertTrue(actualResponse.contains("400")
                            && actualResponse.contains("Bad Request"),
                "\n Actual Response (" + actualResponse +")\n Does Not Contain '400' and 'Bad Request' \n");
    }

}
