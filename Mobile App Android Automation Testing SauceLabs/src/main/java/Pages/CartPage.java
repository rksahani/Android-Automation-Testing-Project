package Pages;

import io.appium.java_client.AppiumBy;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage
{ WebDriver driver;
    public CartPage(WebDriver driver)
    {
        this.driver=driver;
    }

private By removeButton=By.xpath("//android.widget.TextView[@text=\"REMOVE\"]");
    private By cartProductAdded= By.xpath("(//android.widget.TextView[@text=\"1\"])[1]");
    public void cartPage()

    {

       driver.findElement(cartProductAdded).isDisplayed();


    }

    private By checkout=By.xpath("//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]");
   public CheckOutInformation checkOut()
   {
       driver.findElement(checkout).click();
       return new CheckOutInformation(driver);
   }
    private By numerOfCartOnTop=By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView");

    private By buttonRemove= AppiumBy.accessibilityId("test-REMOVE");
    private By continueShopping=By.xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUE SHOPPING\"]");
    private By itemsInCart = AppiumBy.accessibilityId("test-Item");
    public CartPageNew removeItem()
    {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> driver.findElement(buttonRemove));
        driver.findElement(buttonRemove).click();
        return new CartPageNew(driver);

    }
//    public String itemPresent(){
//        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(d -> driver.findElement(itemsInCart));
//        return driver.findElement(itemsInCart).getAttribute("displayed");
//    }

//    public String itemPresent(){
//        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(d -> driver.findElement(itemsInCart));
//        return driver.findElement(itemsInCart).getAttribute("enabled");
//    }

    private By cartProductName=By.xpath("//android.widget.TextView[@text=\"Sauce Labs Backpack\"]");
    private By cartProductPrice=By.xpath("//android.widget.TextView[@text=\"$29.99\"]");

    public String validateName()
    {
        return driver.findElement(cartProductName).getText();

    }
    public String validatePrice()
    {
        return driver.findElement(cartProductPrice).getText();
    }

}
