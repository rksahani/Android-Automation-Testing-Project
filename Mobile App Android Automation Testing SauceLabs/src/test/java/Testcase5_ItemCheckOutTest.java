import Pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Testcase5_ItemCheckOutTest
{
    WebDriver driver;
    HomePage homepage;

    @BeforeMethod
    public void setup() throws MalformedURLException
    {
        driver= new Setup(driver).setupDeviceInNativeAppium();
        homepage = new HomePage(driver);
    }

    @Test
//Testcase-5) Online Ordering and complete the flow from adding element to cart till the checkout, Also Validate the price and success purchase.
//Purpose: Complete the entire purchase flow and validate the success of the order.
//Steps: Add item to cart, proceed to checkout, complete necessary details(First name, Last Name, PostalCode), confirm purchase.
//Expected Result: Confirmed successful purchase, validated the final price, and ensure that the user receives a confirmation of the order and verified that name and price of item matches to the HomePage name and price of item.
    public void checkOut()
    {
        String homeItemName;
        String homeItemPrice;
        String overviewItemNames;
        String overviewItemPrices;

        new LoginPage(driver).loginPageSetup("standard_user","secret_sauce")
                .enterBagPack();

        homeItemName=new HomePage(driver).validateName();
        homeItemPrice=new HomePage(driver).validatePrice();

               new CartPage(driver).checkOut()
                .checkOutProcess("Rakesh","Kumar","394107");

        overviewItemNames=new CheckoutOverview(driver).validateOverviewNames();
        overviewItemPrices=new CheckoutOverview(driver).validateOverviewPrices();

        System.out.println(overviewItemNames);
        System.out.println(overviewItemPrices);
        System.out.println(homeItemName);
        System.out.println(homeItemPrice);

                new CheckoutOverview(driver)
                        .checkoutdone()
                        .completePurchase();

        Assert.assertEquals(homeItemName,overviewItemNames,"Sauce Labs Backpack");
        Assert.assertEquals(homeItemPrice,overviewItemPrices,"$29.99");
    }
}
