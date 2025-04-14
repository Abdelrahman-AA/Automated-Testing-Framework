package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Page_8_TransferFundsPage extends A_3_BasePage {
    public Page_8_TransferFundsPage(WebDriver driver) {
        super(driver);
    }

    private By transferFunds_PageMessage = By.xpath("//h1[normalize-space()='Transfer Funds']");
    private By amount = By.id("amount");
    private By fromAccountNum = By.id("fromAccountId");
    // private By fromAccountNum =
    // By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[1]/select[1]");
    private By toAccountNum = By.id("toAccountId");
    // private By toAccountNum =
    // By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[1]/select[2]");
    private By transferButton = By.xpath("//input[@value='Transfer']");
    private By transferDone = By.xpath("//h1[normalize-space()='Transfer Complete!']");
    private By successfullyTransferMessage = By.xpath("//div[@id='showResult']//p[1]");

    public Boolean checkTransferFundsPageIsOpened() {
        return checkElementIsDisplayed(transferFunds_PageMessage);
    }

    private void setTransferAmount(String m_Amount) {
        setText(amount, m_Amount);
    }

    private void selectTransferFromAccountNum(int nAccount) {
        selectFromDropdownByIndex(fromAccountNum, nAccount);
    }

    private void selectTransferToAccountNum(int nAccount) {
        selectFromDropdownByIndex(toAccountNum, nAccount);
    }

    private void clickToTransferTheAmount() {
        clickElement(transferButton);
    }

    public void doTransfer_ValidAmount() throws IOException {
        setTransferAmount(getTestData("Amount To Transfer"));
        selectTransferFromAccountNum(0);
        selectTransferToAccountNum(2);
        clickToTransferTheAmount();
    }

    public boolean checkSuccessfulTransferTheAmount_1() {
        return checkElementIsDisplayed(transferDone);
    }

    public boolean checkSuccessfulTransferTheAmount_2() {
        return checkElementIsDisplayed(successfullyTransferMessage);
    }

}
