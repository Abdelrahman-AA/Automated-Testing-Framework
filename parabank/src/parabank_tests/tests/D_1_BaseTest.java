package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

import pages.*;

public class D_1_BaseTest extends A_2_CleanDB {
    WebDriver driver;

    Page_0_StaticToolBarLinks staticToolBarLinks;
    Page_1_HomePage homePage;
    Page_2_RegisterPage registerPage;
    Page_3_ForgotLoginInfoPage forgotLoginInfoPage;
    Page_4_NewAccountPage newAccountPage;
    Page_5_AccountsOverviewPage accountsOverviewPage;
    Page_6_AccountDetailsPage accountDetailsPage;
    Page_7_TransactionDetailsPage transactionDetailsPage;
    Page_8_TransferFundsPage transferFundsPage;
    Page_9_BillPayPage billPayPage;
    Page_10_FindTransactions findTransactions;
    Page_11_UpdateProfilePage updateProfilePage;
    Page_12_requestLoan requestLoan;

    @BeforeClass
    public void testSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        staticToolBarLinks = new Page_0_StaticToolBarLinks(driver);
        homePage = new Page_1_HomePage(driver);
        registerPage = new Page_2_RegisterPage(driver);
        forgotLoginInfoPage = new Page_3_ForgotLoginInfoPage(driver);
        newAccountPage = new Page_4_NewAccountPage(driver);
        accountsOverviewPage = new Page_5_AccountsOverviewPage(driver);
        accountDetailsPage = new Page_6_AccountDetailsPage(driver);
        transactionDetailsPage = new Page_7_TransactionDetailsPage(driver);
        transferFundsPage = new Page_8_TransferFundsPage(driver);
        billPayPage = new Page_9_BillPayPage(driver);
        findTransactions = new Page_10_FindTransactions(driver);
        updateProfilePage = new Page_11_UpdateProfilePage(driver);
        requestLoan = new Page_12_requestLoan(driver);

    }

    @AfterClass
    public void endClassTest() {
        driver.quit();
    }

    @AfterSuite
    public void endSuiteTest() {
        int response = cleanDB();
        Assert.assertEquals(response, 204, "API call failed" + response);
    }
}
