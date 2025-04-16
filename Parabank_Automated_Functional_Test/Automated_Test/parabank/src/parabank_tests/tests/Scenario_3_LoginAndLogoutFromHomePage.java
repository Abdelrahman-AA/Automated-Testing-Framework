package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario_3_LoginAndLogoutFromHomePage extends D_1_BaseTest {
    
    /*
    Scenario 3:
        Login and Logout from Home Page
            - Go to the ParaBank website.
            - Log in with valid credentials (Username and Password).
            - Verify that the customer account page is loaded successfully.
            - Log out from the customer account page.
            - Verify that the user is redirected back to the home page.
    */

    @Test(priority = 0)
    public void openHomePage() {
        driver.get("https://parabank.parasoft.com/parabank/");
        Assert.assertTrue(homePage.checkHomePageIsOpened());
    }

    @Test(priority = 1)
    public void logIn() throws IOException {
        homePage.loginWith_ValidData();
        Assert.assertTrue(staticToolBarLinks.checkStaticToolBarLinksIsDisplayed());
    }

    @Test(priority = 2)
    public void logOut() {
        staticToolBarLinks.goTo_LogOut();
        Assert.assertTrue(homePage.checkOfLogOut());
    }
}
