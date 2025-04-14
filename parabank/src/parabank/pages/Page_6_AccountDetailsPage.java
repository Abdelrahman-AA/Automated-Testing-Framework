package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_6_AccountDetailsPage extends A_3_BasePage {
    public Page_6_AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    private By accountDetails_PageMessage = By.xpath("//h1[normalize-space()='Account Details']");
    // private By accountNum = By.id("accountId");
    private By accountNum = By.cssSelector("td#accountId");
    private By goAccountActivityButton = By.xpath("//input[@value='Go']");
    private By fundsTransferSentCTA = By.linkText("Funds Transfer Sent");

    public Boolean checkAccountDetailsPageIsOpened() {
        return checkElementIsDisplayed(accountDetails_PageMessage);
    }

    public String getAccountNum() {
        return getText(accountNum);
    }

    public void goAccountActivity() {
        clickElement(goAccountActivityButton);
    }

    public void goToFundsTransferSent(){
        clickElement(fundsTransferSentCTA);
    }
}
