package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Scenario_6_OpenNew_CHECKING_Accounts extends D_1_BaseTest {
    /*
    Scenario 6:
        Open New CHECKING Account
            - Go to the ParaBank website.
            - Log in with valid credentials.
            - Open the "New Account" page.
            - Choose the "CHECKING" account type and open a new account.
            - Verify that the new account was successfully opened by checking for confirmation messages.
            - Navigate back to the home page and verify that the customer account page is successfully loaded.
            - Log out from the customer account page.
            - Go back to the home page and verify that it is loaded successfully.
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
    public void goTo_OpenNewAccountPage() {
        staticToolBarLinks.goTo_OpenNewAccount();
        Assert.assertTrue(newAccountPage.checkNewAccountPageIsOpened());
    }

    @Test(priority = 3)
    public void openNewCHECKINGAccount() {
        newAccountPage.openNewCHECKINGAccount();
        Assert.assertTrue(newAccountPage.checkSuccessfulNewAccountOpened_1());
    }

    @Test(priority = 4)
    public void checkNewCHECKINGAccountIsOpened() {
        Assert.assertTrue(newAccountPage.checkSuccessfulNewAccountOpened_2());
    }

    @Test(priority = 5)
    public void logOut() {
        staticToolBarLinks.goTo_LogOut();
        Assert.assertTrue(homePage.checkOfLogOut());
    }
}
