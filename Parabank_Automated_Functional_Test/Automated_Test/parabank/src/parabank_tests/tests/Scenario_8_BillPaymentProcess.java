package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Scenario_8_BillPaymentProcess extends D_1_BaseTest {
    /*
     Scenario 8:
        Bill Payment Process
            - Go to the ParaBank website.
            - Log in with valid credentials.
            - Open the "Bill Pay" page.
            - Enter the payee's name, address, phone number, account number, and amount.
            - Click the "Send Payment" button to submit the bill payment.
            - Verify that the bill payment was successful by checking for a success message.
            - Log out from the "Bill Pay" page.
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
     public void goTo_BillPayPage(){
        staticToolBarLinks.goTo_BillPay();
        Assert.assertTrue(billPayPage.checkBillPayPageIsOpened());
     }

     @Test(priority = 3)
     public void doBillPay_ValidAmount() throws IOException {
        billPayPage.doBillPay_ValidAmount();
        Assert.assertTrue(billPayPage.checkSuccessfullyBillPay());
     }

     @Test(priority = 4)
     public void logOut() {
         staticToolBarLinks.goTo_LogOut();
         Assert.assertTrue(homePage.checkOfLogOut());
     }
}
