package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Scenario_2_RegisterNewUserAndLogOut extends D_1_BaseTest {

        /*
          Scenario 2:
             Register a new user and Log out
                - Go to the "Register" page of the ParaBank website.
                - Fill in the registration form with valid data (First Name, Last Name, Address, Phone Number, SSN, Username, Password).
                - Click the "Register" button.
                - Verify that the registration was successful by checking for the successful registration page.
                - Log out from the successfully registered page.
                - Verify that the user is redirected to the home page after logging out.
        */
        @Test(priority = 0)
        public void clearDB(){
                int response = cleanDB();
                Assert.assertEquals(response, 204, "API call failed" + response);
        }

        @Test(priority = 1)
        public void openRegisterPage() throws IOException {
                driver.get("https://parabank.parasoft.com/parabank/register.htm");
                Assert.assertTrue(registerPage.checkRegisterPageIsOpened());
        }

        @Test(priority = 2)
        public void RegisterWith_ValidData() throws IOException{
                registerPage.registerWith_ValidData();
                Assert.assertTrue(registerPage.checkSuccessfullyRegisterAccount());
        }

        @Test(priority = 3)
        public void logOut(){
                staticToolBarLinks.goTo_LogOut();
                Assert.assertTrue(homePage.checkOfLogOut());
        }
}
