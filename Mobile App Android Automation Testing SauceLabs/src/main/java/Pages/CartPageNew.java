package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPageNew
{
    WebDriver driver;

    public CartPageNew(WebDriver driver)
    {
        this.driver=driver;
    }
    private By itemsInCart = AppiumBy.accessibilityId("test-Item");

    public String itemPresent(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> driver.findElement(itemsInCart));
        return driver.findElement(itemsInCart).getAttribute("displayed");
    }
}
