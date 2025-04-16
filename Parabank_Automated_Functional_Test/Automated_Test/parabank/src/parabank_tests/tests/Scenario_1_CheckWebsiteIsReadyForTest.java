package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario_1_CheckWebsiteIsReadyForTest extends D_1_BaseTest {

    /*
    Scenario 1:
        1: Open Home Page
            - Go to the ParaBank website.
            - Verify that the home page is loaded successfully.
            - This ensures that the main entry point to the application is working fine.

        2: Open Register Page
            - Go to the ParaBank website.
            - Open the "Register" page.
            - Verify that the "Register" page is loaded successfully.
            - This ensures that the registration functionality is accessible and works as expected.
    */

// @ 1: Open Home Page
    @Test(priority = 0)
    public void openHomePage() {
        driver.get("https://parabank.parasoft.com/parabank/");
        Assert.assertTrue(homePage.checkHomePageIsOpened());
    }

// 2: Open Register Page
    @Test(priority = 1)
    public void openRegisterPage() {
        driver.get("https://parabank.parasoft.com/parabank/");
        homePage.openRegisterPage();
        Assert.assertTrue(registerPage.checkRegisterPageIsOpened());
    }

}
