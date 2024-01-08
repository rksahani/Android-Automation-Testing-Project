import Action.MobileActions;
import Pages.*;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Testcase4_RemoveItem
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
//Testcase-4) Validate Removing Items from the Cart and Empty Cart.
//Purpose: Verify the system correctly removes items from the cart.
//Steps: Add an item to the cart, remove the item, check the cart status.
//Expected Result: Confirm the cart is empty after item removal.
    public void removeItemTest()
    {
        new LoginPage(driver).loginPageSetup("standard_user","secret_sauce")
                .enterBagPack()
                .removeItem();

        String Flag  ;
        try {
            driver.findElement(AppiumBy.accessibilityId("test-Item"));
            Flag= "true";
        } catch (org.openqa.selenium.NoSuchElementException e) {
            Flag ="false";
        }
    }
}
