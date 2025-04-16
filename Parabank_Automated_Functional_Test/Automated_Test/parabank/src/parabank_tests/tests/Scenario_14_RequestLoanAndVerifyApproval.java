package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario_14_RequestLoanAndVerifyApproval extends D_1_BaseTest {

    /*
    Scenario 14:
        Request a Loan and Verify Approval
            - Go to the ParaBank website.
            - Ensure that the home page is displayed.
            - Log in using valid credentials.
            - Verify that the static toolbar is visible.
            - Navigate to the "Request Loan" page.
            - Ensure that the "Request Loan" page is opened.
            - Fill in the required loan information and submit the request.
            - Verify that the loan request has been successfully processed.
            - Confirm that the loan has been approved.
            - Log out from the account.
            - Ensure that the home page is displayed again.
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
    public void openRequestLoanPage() {
        staticToolBarLinks.goTo_RequestLoan();
        Assert.assertTrue(requestLoan.checkRequestLoanPageIsOpened());
    }

    @Test(priority = 3)
    public void requestLoan() throws IOException {
        requestLoan.requestLoan();
        Assert.assertTrue(requestLoan.checkLoanRequestProcessed());
    }

    @Test(priority = 4)
    public void checkLoanApprovedLoan() {
        Assert.assertTrue(requestLoan.checkLoanApproved());
    }

    @Test(priority = 5)
    public void logOut() {
        staticToolBarLinks.goTo_LogOut();
        Assert.assertTrue(homePage.checkHomePageIsOpened());
    }

}
