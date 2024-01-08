import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.Setup;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

public class Testcase3_AddItemTest
{
    WebDriver driver;
    LoginPage login;

    @BeforeMethod
    public void setup() throws MalformedURLException
    {
        driver= new Setup(driver).setupDeviceInNativeAppium();
        login=new LoginPage(driver);
    }

    @Test
//Test-case3) Add Any Item to the cart and validate that Title and price of the Item at Home page equals the item and price at the cart.
//Purpose: Ensure consistency between the displayed item on the home page and in the cart.
//Steps: Add an item to the cart, compare item title and price.
//Expected Result: Confirm that the title and price match between the home page and the cart.
    public void itemTest()
    {
        new LoginPage(driver)
                .loginPageSetup("standard_user","secret_sauce")
                .enterBagPack()
                .cartPage();

        String homepageProductName = new HomePage(driver).validateName();
        String homepageProductPrice=new HomePage(driver).validatePrice();
        String cartpageProductName=new CartPage(driver).validateName();
        String cartpageProductPrice =new CartPage(driver).validatePrice();

        System.out.println(homepageProductName + homepageProductPrice);

        Assert.assertEquals(homepageProductName,cartpageProductName,"Sauce Labs Backpack");
        Assert.assertEquals(homepageProductPrice,cartpageProductPrice,"$29.99");
    }
}
