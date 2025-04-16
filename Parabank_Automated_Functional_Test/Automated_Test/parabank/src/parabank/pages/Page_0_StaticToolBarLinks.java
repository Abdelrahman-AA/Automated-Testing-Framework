package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_0_StaticToolBarLinks extends A_3_BasePage {

    public Page_0_StaticToolBarLinks(WebDriver driver) {
        super(driver);
    }

    private By openNewAccountCTA = By.linkText("Open New Account");
    private By accountsOverviewCTA = By.linkText("Accounts Overview");
    private By transferFundsCTA = By.linkText("Transfer Funds");
    private By billPayCTA = By.linkText("Bill Pay");
    private By findTransactionsCTA = By.linkText("Find Transactions");
    private By updateContactInfoCTA = By.linkText("Update Contact Info");
    private By requestLoanCTA = By.linkText("Request Loan");
    private By logOutCTA = By.linkText("Log Out");
    private By accountPage_WelcomeMessage = By.xpath("//p[@class='smallText']");
    private By welcomeAndName = By.xpath("//p[@class='smallText']");

    public boolean checkStaticToolBarLinksIsDisplayed() {
        return checkElementIsDisplayed(logOutCTA);
    }

    public void goTo_OpenNewAccount() {
        clickElement(openNewAccountCTA);
    }

    public void goTo_AccountsOverview() {
        clickElement(accountsOverviewCTA);
    }

    public void goTo_TransferFunds() {
        clickElement(transferFundsCTA);
    }

    public void goTo_BillPay() {
        clickElement(billPayCTA);
    }

    public void goTo_FindTransactions() {
        clickElement(findTransactionsCTA);
    }

    public void goTo_UpdateContactInfo() {
        clickElement(updateContactInfoCTA);
    }

    public void goTo_RequestLoan() {
        clickElement(requestLoanCTA);
    }

    public void goTo_LogOut() {
        clickElement(logOutCTA);
    }

    public Boolean checkCustomerAccountPageIsOpened() {
        return checkElementIsDisplayed(accountPage_WelcomeMessage);
    }

    public boolean check_FirstNameByWelcome() throws IOException {
        return getText(welcomeAndName).contains(getTestData("Valid First Name") + "AA");
    }
}
