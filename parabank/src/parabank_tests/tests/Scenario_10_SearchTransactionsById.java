package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario_10_SearchTransactionsById extends D_1_BaseTest {

    /*
    Scenario 10:
        Search Transactions by Transaction ID
            - Go to the ParaBank website.
            - Log in with valid credentials.
            - Verify that the static toolbar is displayed.
            - Navigate to the "Find Transactions" page.
            - Ensure the "Find Transactions" page is opened.
            - Enter a known Transaction ID and search.
            - Verify the transaction with the given ID is found and displayed.
            - Log out and ensure the home page is displayed again.
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
    public void goTo_FindTransactionsPage() {
        staticToolBarLinks.goTo_FindTransactions();
        Assert.assertTrue(findTransactions.checkFindTransactionsPageIsOpened());
    }

    @Test(priority = 3)
    public void foundTransactionById() {
        Assert.assertTrue(findTransactions.foundTransactionById());
    }

    @Test(priority = 4)
    public void logOut() {
        staticToolBarLinks.goTo_LogOut();
        Assert.assertTrue(homePage.checkOfLogOut());
    }
}
