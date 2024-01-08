import Pages.HomePage;
import Pages.LoginPage;
import Pages.Setup;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Testcase1_loginTest
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
//    Test Case-1) Login with Valid username and password and validate that login is performed successfully.
// 1) Purpose:- Verify Successful Login with Valid Credentials.
// 2) Steps:- Enter valid username and password, Click login button.
// 3) Outcome:- login successfully and ensures user is redirected to Home Page.
    public void login()
    {
        new LoginPage(driver).loginPageSetup("standard_user","secret_sauce");
        String expected = new HomePage(driver).loginSuccessfull();
        Assert.assertTrue(expected.equals("true"));
    }
}
