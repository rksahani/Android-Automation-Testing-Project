package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutInformation
{
    WebDriver driver;
    public CheckOutInformation(WebDriver driver)
    {
        this.driver=driver;
    }

    private By fname= By.xpath("//android.widget.EditText[@content-desc=\"test-First Name\"]");
    private By lname= By.xpath("//android.widget.EditText[@content-desc=\"test-Last Name\"]");
    private By pcode= By.xpath("//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]");

    private By continueCheckout = By.xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]");
    public CheckoutOverview checkOutProcess(String name,String lastname,String postalcode)
    {
        driver.findElement(fname).sendKeys(name);
        driver.findElement(lname).sendKeys(lastname);
        driver.findElement(pcode).sendKeys(postalcode);
        driver.findElement(continueCheckout).click();

        return new CheckoutOverview(driver);

    }



}
