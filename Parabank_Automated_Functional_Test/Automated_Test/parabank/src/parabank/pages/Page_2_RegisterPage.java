package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Page_2_RegisterPage extends A_3_BasePage {

    public Page_2_RegisterPage(WebDriver driver) {
        super(driver);
    }

    private By registerPage_WelcomeMessage = By.xpath("//h1[normalize-space()='Signing up is easy!']");
    private By customer_firstName = By.id("customer.firstName");
    private By customer_lastName = By.id("customer.lastName");
    private By customer_address_street = By.id("customer.address.street");
    private By customer_address_city = By.id("customer.address.city");
    private By customer_address_state = By.id("customer.address.state");
    private By customer_address_zipCode = By.id("customer.address.zipCode");
    private By customer_phoneNumber = By.id("customer.phoneNumber");
    private By customer_ssn = By.id("customer.ssn");
    private By customer_username = By.id("customer.username");
    private By customer_password = By.id("customer.password");
    private By customer_repeatedPassword = By.id("repeatedPassword");
    private By registerButton = By.xpath("//input[@value='Register']");
    private By welcomeMessage = By.xpath("//h1[@class='title']");

    public Boolean checkRegisterPageIsOpened() {
        return checkElementIsDisplayed(registerPage_WelcomeMessage);
    }

    private void setCustomerFirstName(String c_FirstName) {
        setText(customer_firstName, c_FirstName);
    }

    private void setCustomerLastName(String c_LastName) {
        setText(customer_lastName, c_LastName);
    }

    private void setAddressStreet(String addressStreet) {
        setText(customer_address_street, addressStreet);
    }

    private void setAddressCity(String addressCity) {
        setText(customer_address_city, addressCity);
    }

    private void setAddressState(String addressState) {
        setText(customer_address_state, addressState);
    }

    private void setAddressZipCode(String addressZipCode) {
        setText(customer_address_zipCode, addressZipCode);
    }

    private void setCustomerPhoneNumber(String c_PhoneNumber) {
        setText(customer_phoneNumber, c_PhoneNumber);
    }

    private void setCustomerSNN(String c_SNN) {
        setText(customer_ssn, c_SNN);
    }

    private void setCustomerUserName(String c_UserName) {
        setText(customer_username, c_UserName);
    }

    private void setCustomerPassword(String c_Password) {
        setText(customer_password, c_Password);
    }

    private void setRepeatedPassword(String c_repeatedPassword) {
        setText(customer_repeatedPassword, c_repeatedPassword);
    }

    private void clickRegisterButton() {
        clickElement(registerButton);
    }

    public void registerWith_ValidData() throws IOException {
        setCustomerFirstName(getTestData("Valid First Name"));
        setCustomerLastName(getTestData("Valid Last Name"));
        setAddressStreet(getTestData("Valid Street"));
        setAddressCity(getTestData("Valid City"));
        setAddressState(getTestData("Valid State"));
        setAddressZipCode(getTestData("Valid Zip Code"));
        setCustomerPhoneNumber(getTestData("Valid Phone Number"));
        setCustomerSNN(getTestData("Valid SSN"));
        setCustomerUserName(getTestData("Valid Username"));
        setCustomerPassword(getTestData("Valid Password"));
        setRepeatedPassword(getTestData("Valid Password"));
        clickRegisterButton();
    }

    public Boolean checkSuccessfullyRegisterAccount() throws IOException {
        return getText(welcomeMessage).equals("Welcome " + getTestData("Valid Username"));
    }

}
