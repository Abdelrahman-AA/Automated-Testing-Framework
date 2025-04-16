package pages;

// import java.text.SimpleDateFormat;
// import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_10_FindTransactions extends A_3_BasePage {

    public Page_10_FindTransactions(WebDriver driver) {
        super(driver);
    }

    private By findTransactions_Message = By.xpath("//h1[normalize-space()='Find Transactions']");
    private By accountIdSelector = By.id("accountId");
    private By transactionId = By.id("transactionId");
    private By findTransactionByIdButton = By.id("findById");
    private By transactionDate = By.id("transactionDate");
    private By findTransactionByDateButton = By.id("findByDate");
    private By fromDate = By.id("fromDate");
    private By toDate = By.id("toDate");
    private By findTransactionByDateRangeButton = By.id("findByDateRange");
    private By TransactionAmount = By.id("amount");
    private By findTransactionByAmountButton = By.id("findByAmount");
    // private By findTransactionByIdResult =
    // By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[3]/h1[1]");
    private By foundTransactionSent = By.linkText("Funds Transfer Sent");
    private By fundsTransferReceived = By.linkText("Funds Transfer Received");
    private By transactionDetails = By.xpath("//h1[normalize-space()='Transaction Details']");

    public boolean checkFindTransactionsPageIsOpened() {
        return checkElementIsDisplayed(findTransactions_Message);
    }

    private boolean checkIfTransactions() {
        try {
            clickElement(foundTransactionSent);
            return checkElementIsDisplayed(transactionDetails);
        } catch (Exception e) {
        }
        try {
            clickElement(fundsTransferReceived);
            return checkElementIsDisplayed(transactionDetails);
        } catch (Exception e) {
        }
        return false;
    }

    public boolean foundTransactionById() {
        selectFromDropdownByIndex(accountIdSelector, 0);
        setText(transactionId, pages.A_4_DataStorage.load("transactionId"));
        clickElement(findTransactionByIdButton);
        return checkIfTransactions();
    }

    public boolean foundTransactionByDate() {
        setText(transactionDate, new java.text.SimpleDateFormat("MM-dd-yyyy").format(new java.util.Date()));
        clickElement(findTransactionByDateButton);
        return checkIfTransactions();
    }

    public boolean foundTransactionFromDateToDate() {
        setText(fromDate, new java.text.SimpleDateFormat("MM-dd-yyyy").format(new java.util.Date()));
        setText(toDate, new java.text.SimpleDateFormat("MM-dd-yyyy").format(new java.util.Date()));
        clickElement(findTransactionByDateRangeButton);
        return checkIfTransactions();
    }

    public boolean foundTransactionByAmount() {
        setText(TransactionAmount, pages.A_4_DataStorage.load("transactionAmount"));
        clickElement(findTransactionByAmountButton);
        return checkIfTransactions();
    }
}
