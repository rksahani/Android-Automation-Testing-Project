import Pages.HomePage;
import Pages.LoginPage;
import Pages.Setup;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Testcase2_InvalidLoginTest {
    WebDriver driver;
    HomePage homepage;

    @BeforeMethod
    public void setup() throws MalformedURLException
    {
        driver= new Setup(driver).setupDeviceInNativeAppium();
        homepage = new HomePage(driver);
    }

    @Test
//    Test case-2) Login with invalid username or password and display error message.
    // 1) Purpose:- Verify unsuccessful Login and system response with InValid Credentials.
    // 2) Steps:- Enter invalid username and invalid password, Click login button.
    // 3) Outcome:- Ensures system displays an error message (Username and password do not match any user in this service).
    public void invalidLogin()
    {
        new LoginPage(driver).invalidLogin("standard_user","sauce_secret")
                .errorDisplayCheck();

        String expected = new LoginPage(driver).errorDisplayCheck();
        Assert.assertTrue(expected.equals("true"));
    }
}
