package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario_4_ForgetLoginInformation extends D_1_BaseTest {
    /*
    Scenario 4:
        Forget Login Information
            - Go to the ParaBank website.
            - Open the "Forgot Login Information" page.
            - Enter the customer's first name, last name, street address, city, state, zip code, and SSN.
            - Click on the "Find My Login Info" button to retrieve login information.
            - Verify that the displayed username and password are correct based on the provided data.
            - If the "Log Out" button is displayed, log out from the "Forgot Login Information" page.
    */

    @Test(priority = 0)
    public void openHomePage() {
        driver.get("https://parabank.parasoft.com/parabank/");
        Assert.assertTrue(homePage.checkHomePageIsOpened());
    }

    @Test(priority = 1)
    public void openLoginInformation() throws IOException {
        homePage.openForgotLoginInfoPagePage();
        Assert.assertTrue(forgotLoginInfoPage.checkForgotLoginInfoPageIsOpened());
    }
    @Test(priority = 2)
    public void askForLoginInformation() throws IOException {
        forgotLoginInfoPage.askLoginInfo_ValidData();
        Assert.assertTrue(forgotLoginInfoPage.checkGetUNamePasswordMessage());
    }

    @Test(priority = 3)
    public void checkUNameAndPassword() throws IOException {
        Assert.assertTrue(forgotLoginInfoPage.checkUserNameIsSame(),"UserName Not the Same");
        Assert.assertTrue(forgotLoginInfoPage.checkPasswordIsSame(),"Password Not the Same");
    }

    @Test(priority = 4)
    public void logOut() {
        if (staticToolBarLinks.checkStaticToolBarLinksIsDisplayed()) {
        staticToolBarLinks.goTo_LogOut();
        Assert.assertTrue(homePage.checkOfLogOut());
        }
    }
}
