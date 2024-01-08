package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginPage
{

    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }


    private By username= AppiumBy.accessibilityId("test-Username");
    private By password= AppiumBy.accessibilityId("test-Password");

    private By loginButton= AppiumBy.accessibilityId("test-LOGIN");



    public HomePage loginPageSetup(String uname,String pwd)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(username).sendKeys(uname);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginButton).click();

        return new HomePage(driver);
    }



    public LoginPage invalidLogin(String uname,String pwd)
    {
        driver.findElement(username).sendKeys(uname);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginButton).click();

        return new LoginPage(driver);
    }

    private By invalidPopUp=By.xpath("//android.widget.TextView[@text=\"Username and password do not match any user in this service.\"]");

    public String errorDisplayCheck()
    {
        return driver.findElement(invalidPopUp).getAttribute("displayed");
    }


}
