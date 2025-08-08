package Part2.com.saucedemo.test.products;

import Part2.com.saucedemo.base.BaseTest;
import com.saucedemo.pages.ProductPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class ProductsTest  extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductPage productsPage = loginPage.
                logIntoApplication("standard_user", "secret_sauce");

        assertTrue(productsPage.isProductsHeaderDispalyed(),
                "\n Products Header is not Displayed\n");
    }
}
