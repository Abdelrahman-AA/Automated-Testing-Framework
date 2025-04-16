package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_12_requestLoan extends A_3_BasePage {

    public Page_12_requestLoan(WebDriver driver) {
        super(driver);
    }

    private By applyForLoanPageMessage = By.xpath("//h1[normalize-space()='Apply for a Loan']");
    private By loanAmount = By.id("amount");
    private By downPayment = By.id("downPayment");
    private By fromAccount = By.id("fromAccountId");
    private By applyNowButton = By.xpath("//input[@value='Apply Now']");
    private By loanRequestProcessed = By.xpath("//h1[normalize-space()='Loan Request Processed']");
    private By loanApproved = By.id("loanStatus");

    public Boolean checkRequestLoanPageIsOpened() {
        return checkElementIsDisplayed(applyForLoanPageMessage);
    }

    private void setLoanAmount_ValidData() throws IOException {
        setText(loanAmount, getTestData("LoanAmount"));
    }

    private void setLoanDownPayment_ValidData() throws IOException {
        setText(downPayment, getTestData("DownPayment"));
    }

    private void selectAccount() {
        selectFromDropdownByIndex(fromAccount, 0);
    }

    private void clickApplyNowButton() {
        clickElement(applyNowButton);
    }

    public void requestLoan() throws IOException {
        setLoanAmount_ValidData();
        setLoanDownPayment_ValidData();
        selectAccount();
        clickApplyNowButton();
    }

    public Boolean checkLoanRequestProcessed() {
        return checkElementIsDisplayed(loanRequestProcessed);
    }

    public Boolean checkLoanApproved() {
        return getText(loanApproved).contains("Approved");
    }

}
