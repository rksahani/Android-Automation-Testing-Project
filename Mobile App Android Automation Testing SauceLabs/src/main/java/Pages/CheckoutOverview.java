package Pages;

import Action.MobileActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutOverview
{
    WebDriver driver;

    public CheckoutOverview(WebDriver driver)
    {
        this.driver=driver;
    }

    private By finishButton =By.xpath("//android.view.ViewGroup[@content-desc=\"test-FINISH\"]");
    private By titleShown = By.xpath("//android.widget.TextView[@text=\"Sauce Labs Backpack\"]");
    private By priceShown = By.xpath("//android.widget.TextView[@text=\"$29.99\"]");
   public CheckoutComplete checkoutdone()
   {
       MobileActions mb=new MobileActions(driver);
       mb.scrollDownToSpecificText("FINISH");
       driver.findElement(finishButton).click();

       return new CheckoutComplete(driver) ;
   }
    public String validateOverviewNames()
    {
//        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(d -> driver.findElement(overviewItemName));
        return   driver.findElement(titleShown).getText();
    }
    public String validateOverviewPrices()
    {
//        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(d -> driver.findElement(overviewItemPrice));
        return driver.findElement(priceShown).getText();
    }
}
