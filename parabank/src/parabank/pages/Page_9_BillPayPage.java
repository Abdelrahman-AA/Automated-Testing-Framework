package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_9_BillPayPage extends A_3_BasePage {

    public Page_9_BillPayPage(WebDriver driver) {
        super(driver);
    }

    private By billPayPage_PageMessage = By.xpath("//h1[normalize-space()='Bill Payment Service']");
    private By payeeName = By.xpath("//input[@name='payee.name']");
    private By payeeAddressStreet = By.xpath("//input[@name='payee.address.street']");
    private By payeeAddressCity = By.xpath("//input[@name='payee.address.city']");
    private By payeeAddressState = By.xpath("//input[@name='payee.address.state']");
    private By payeeAddressZipCode = By.xpath("//input[@name='payee.address.zipCode']");
    private By payeePhoneNumber = By.name("payee.phoneNumber");
    private By payeeAccountNumber = By.xpath("//input[@name='payee.accountNumber']");
    private By verifyAccount = By.xpath("//input[@name='verifyAccount']");
    private By amount = By.xpath("//input[@name='amount']");
    private By fromAccountId = By.xpath("//select[@name='fromAccountId']");
    private By sendPaymentButton = By.xpath("//input[@value='Send Payment']");
    private By billPaymentComplete = By.xpath("//h1[@class='title' and text()='Bill Payment Complete']");

    public Boolean checkBillPayPageIsOpened() {
        return checkElementIsDisplayed(billPayPage_PageMessage);
    }

    private void setPayeeName(String payee_Name) {
        setText(payeeName, payee_Name);
    }

    private void setPayeeAddressStreet(String payee_AddressStreet) {
        setText(payeeAddressStreet, payee_AddressStreet);
    }

    private void setPayeeAddressCity(String payee_AddressCity) {
        setText(payeeAddressCity, payee_AddressCity);
    }

    private void setPayeeAddressState(String payee_AddressState) {
        setText(payeeAddressState, payee_AddressState);
    }

    private void setPayeeAddressZipCode(String payee_AddressZipCode) {
        setText(payeeAddressZipCode, payee_AddressZipCode);
    }

    private void setPayeePhoneNumber(String payee_PhoneNumber) {
        setText(payeePhoneNumber, payee_PhoneNumber);
    }

    private void setPayeeAccountNumberAndVerifyAccount(int fromIdAccount) {
        setText(payeeAccountNumber, getFromDropdownByIndex(fromAccountId, fromIdAccount));
        setText(verifyAccount, getFromDropdownByIndex(fromAccountId, fromIdAccount));
    }

    private void setAmount(String p_amount) {
        setText(amount, p_amount);
    }

    private void clickSendPaymentButton() {
        clickElement(sendPaymentButton);
    }

    public void doBillPay_ValidAmount() throws IOException {
        setPayeeName(getTestData("payeeName"));
        setPayeeAddressStreet(getTestData("payeeAddressStreet"));
        setPayeeAddressCity(getTestData("payeeAddressCity"));
        setPayeeAddressState(getTestData("payeeAddressState"));
        setPayeeAddressZipCode(getTestData("payeeAddressZipCode"));
        setPayeePhoneNumber(getTestData("payeePhoneNumber"));
        setPayeeAccountNumberAndVerifyAccount(0);
        setAmount(getTestData("Amount To BillPay"));
        clickSendPaymentButton();

    }

    public Boolean checkSuccessfullyBillPay() {
        return checkElementIsDisplayed(billPaymentComplete);
    }
}
