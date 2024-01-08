package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage
{
    WebDriver driver;
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }

  private   By homeMenu=By.xpath("//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView");

private By products=By.xpath("//android.widget.TextView[@text=\"PRODUCTS\"]");

public void productDisplay()
{
    driver.findElement(products).isDisplayed();
}
     public void homeMenuDisplay()
     {
         driver.findElement(homeMenu).isDisplayed();
     }


    private  By bagPack=By.xpath("//android.widget.TextView[@content-desc=\"test-Item title\" and @text=\"Sauce Labs Backpack\"]");
    private  By bikeLight=By.xpath("//android.widget.TextView[@content-desc=\"test-Item title\" and @text=\"Sauce Labs Bike Light\"]");
    private  By tshirt=By.xpath("//android.widget.TextView[@content-desc=\"test-Item title\" and @text=\"Sauce Labs Bolt T-Shirt\"]");
    private  By jacket=By.xpath("//android.widget.TextView[@content-desc=\"test-Item title\" and @text=\"Sauce Labs Fleece Jacket\"]");
    private  By onesie =By.xpath("//android.widget.TextView[@content-desc=\"test-Item title\" and @text=\"Sauce Labs Fleece Jacket\"]");
    private  By redTshirt =By.xpath("//android.widget.TextView[@content-desc=\"test-Item title\" and @text=\"Sauce Labs Fleece Jacket\"]");


    private By add_to_cart = By.xpath("//android.widget.TextView[@text=\"ADD TO CART\"]");
    private By cart=By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView");
//private By cart1=By.xpath("//android.widget.TextView[@text=\"1\"]");
    public CartPage enterBagPack()
    {

        driver.findElement(add_to_cart).click();
        driver.findElement(cart).click();


        return new CartPage(driver);
    }


    public void enterBikeLight()
    {
        driver.findElement(bikeLight).click();
    }

    public void enterTshirt()
    {
        driver.findElement(tshirt).click();
    }

    public void enterJacket()
    {
        driver.findElement(jacket).click();
    }

    public void enterOnesie()
    {
        driver.findElement(onesie).click();
    }

    public void enterRedTshirt()
    {
        driver.findElement(redTshirt).click();
    }


    public String loginSuccessfull()
    {
       return driver.findElement(homeMenu).getAttribute("displayed");
    }

private By homeProductName=By.xpath("//android.widget.TextView[@text=\"Sauce Labs Backpack\"]");
    private By homeProductPrice=By.xpath("//android.widget.TextView[ @text=\"$29.99\"]");

    public String validateName()
    {
      return   driver.findElement(homeProductName).getText();

    }
    public String validatePrice()
    {
       return driver.findElement(homeProductPrice).getText();
    }

}
