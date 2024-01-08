package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutComplete
{
    WebDriver driver;

    public CheckoutComplete(WebDriver driver)
    {
        this.driver=driver;
    }

    By completepage=By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]");

    public void completePurchase()
    {
        driver.findElement(completepage).isDisplayed();
    }
}
