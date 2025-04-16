package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Scenario_9_TransferAmountAndVerifyAccountsOverviewAndDetails extends D_1_BaseTest {

    /*
    Scenario 9:
        Transfer Amount and Verify Accounts Overview & Details
            - Go to the ParaBank website.
            - Log in with valid credentials.
            - Verify that the static toolbar is displayed.
            - Navigate to the "Transfer Funds" page.
            - Ensure the "Transfer Funds" page is opened.
            - Enter a valid transfer amount and submit.
            - Verify that the amount was successfully transferred (via confirmation messages).
            - Go to the "Accounts Overview" page.
            - Ensure the "Accounts Overview" page is opened.
            - Get the main account number from the overview.
            - Click on the account number to open its details.
            - Ensure the "Account Details" page is opened.
            - Verify that the account number on the details page matches the one from the overview.
            - Navigate to "Account Activity" → "Funds Transfer Sent".
            - Ensure the "Transaction Details" page is opened.
            - Verify the transferred amount appears correctly in the transaction details.
            - Log out from the account.
            - Ensure that the home page is displayed again.
    */

    String mainAccountNum;

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
    public void goTo_TransferFunds() {
        staticToolBarLinks.goTo_TransferFunds();
        Assert.assertTrue(transferFundsPage.checkTransferFundsPageIsOpened());
    }

    @Test(priority = 3)
    public void doTransfer_ValidAmount() throws IOException {
        transferFundsPage.doTransfer_ValidAmount();
        Assert.assertTrue(transferFundsPage.checkSuccessfulTransferTheAmount_1());
    }

    @Test(priority = 4)
    public void checkSuccessfulTransferTheAmount() {
        Assert.assertTrue(transferFundsPage.checkSuccessfulTransferTheAmount_2());
    }

    @Test(priority = 5)
    public void goTo_AccountsOverview() {
        staticToolBarLinks.goTo_AccountsOverview();
        Assert.assertTrue(accountsOverviewPage.checkAccountsOverviewPageIsOpened());
    }

    @Test(priority = 6)
    public void goTo_AccountDetailsPage() {
        mainAccountNum = accountsOverviewPage.getAccountNum();
        accountsOverviewPage.clickAccountNum();
        Assert.assertTrue(accountDetailsPage.checkAccountDetailsPageIsOpened());
    }

    @Test(priority = 7)
    public void checkAccountNum() {
        Assert.assertEquals(mainAccountNum, accountDetailsPage.getAccountNum());
    }

    @Test(priority = 8)
    public void checkTransactionDetailsPageIsOpened() {
        accountDetailsPage.goAccountActivity();
        accountDetailsPage.goToFundsTransferSent();
        Assert.assertTrue(transactionDetailsPage.checkTransactionDetailsPageIsOpened());
    }

    @Test(priority = 9)
    public void checkTransferredAmount() throws IOException {
        transactionDetailsPage.getTransactionId();
        Assert.assertTrue(transactionDetailsPage.checkTransferredAmount());
    }

    @Test(priority = 10)
    public void logOut() {
        staticToolBarLinks.goTo_LogOut();
        Assert.assertTrue(homePage.checkOfLogOut());
    }
}
