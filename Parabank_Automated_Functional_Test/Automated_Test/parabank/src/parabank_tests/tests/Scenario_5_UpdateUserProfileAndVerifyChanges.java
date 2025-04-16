package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario_5_UpdateUserProfileAndVerifyChanges extends D_1_BaseTest {
    /*
        Scenario 5:
            Update User Profile and Verify Changes
                - Go to the ParaBank website.
                - Log in with valid credentials.
                - Open the "Update Profile" page.
                - Edit the first name of the user.
                - Verify that the change is successful by checking for a success message.
                - Log out from the "Update Profile" page.
                - Log in again with the same credentials to ensure the profile was updated successfully.
                - Verify that the updated first name appears correctly in the welcome message.
                - Reopen the "Update Profile" page and check that the updated first name is saved in the form.
     */

     @Test(priority = 0)
     public void openHomePage() {
         driver.get("https://parabank.parasoft.com/parabank/");
         Assert.assertTrue(homePage.checkHomePageIsOpened());
     }
 
     @Test(priority = 1)
     public void logIn_1() throws IOException {
         homePage.loginWith_ValidData();
         Assert.assertTrue(staticToolBarLinks.checkStaticToolBarLinksIsDisplayed());
     }
 
     @Test(priority = 2)
     public void openUUpdateContactInfoPage_1() {
        staticToolBarLinks.goTo_UpdateContactInfo();
        Assert.assertTrue(updateProfilePage.checkUpdateProfilePageIsOpened());
     }

     @Test(priority = 3)
     public void editFirsName_ValidData() throws IOException {
        updateProfilePage.editFirsName_ValidData();
        Assert.assertTrue(updateProfilePage.check_SuccessfulMessage());
     }

     @Test(priority = 4)
     public void logOut_1() {
        staticToolBarLinks.goTo_LogOut();
        Assert.assertTrue(homePage.checkOfLogOut());
    }

    @Test(priority = 5)
    public void logIn_2() throws IOException {
        homePage.loginWith_ValidData();
        Assert.assertTrue(staticToolBarLinks.checkStaticToolBarLinksIsDisplayed());
    }

    @Test(priority = 6)
    public void checkFName_1() throws IOException {
        Assert.assertTrue(staticToolBarLinks.check_FirstNameByWelcome());
    }

    @Test(priority = 7)
    public void openUUpdateContactInfoPage_2() {
       staticToolBarLinks.goTo_UpdateContactInfo();
       Assert.assertTrue(updateProfilePage.checkUpdateProfilePageIsOpened());
    }

    @Test(priority = 8)
    public void checkFName_2() throws IOException {
        Assert.assertTrue(updateProfilePage.checkFirstNameFromForm());
    }

     @Test(priority = 9)
     public void logOut() {
         staticToolBarLinks.goTo_LogOut();
         Assert.assertTrue(homePage.checkOfLogOut());
     }
}
