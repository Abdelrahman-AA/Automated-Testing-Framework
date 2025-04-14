package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_7_TransactionDetailsPage extends A_3_BasePage {
    public Page_7_TransactionDetailsPage(WebDriver driver) {
        super(driver);
    }

    private By transactionDetails_PageMessage = By.xpath("//h1[normalize-space()='Transaction Details']");
    private By transferredAmount = By.xpath("//html[1]/body[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[5]/td[2]");
    private By transactionId = By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[1]/td[2]");

    public Boolean checkTransactionDetailsPageIsOpened() {
        return checkElementIsDisplayed(transactionDetails_PageMessage);
    }

    private String getTransferredAmount() {
        return getText(transferredAmount);
    }

    public boolean checkTransferredAmount() throws IOException {
        pages.A_4_DataStorage.save("transactionAmount", getTransferredAmount().replace("$", ""));
        return Double.parseDouble(getTransferredAmount().replace("$", "").trim()) == Double
                .parseDouble(getTestData("Amount To Transfer").trim());

    }

    public void getTransactionId() {
        pages.A_4_DataStorage.save("transactionId", getText(transactionId));
    }
}
