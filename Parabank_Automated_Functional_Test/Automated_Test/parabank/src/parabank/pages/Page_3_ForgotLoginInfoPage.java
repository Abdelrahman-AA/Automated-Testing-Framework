package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Page_3_ForgotLoginInfoPage extends A_3_BasePage {
    public Page_3_ForgotLoginInfoPage(WebDriver driver) {
        super(driver);
    }

    private By forgotLoginInfoPage_Message = By.xpath("//h1[normalize-space()='Customer Lookup']");
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By address_street = By.id("address.street");
    private By address_city = By.id("address.city");
    private By address_state = By.id("address.state");
    private By address_zipCode = By.id("address.zipCode");
    private By ssn = By.id("ssn");
    private By find_MyLoginInfo_Button = By.xpath("//input[@value='Find My Login Info']");
    private By userNameAndPassword = By.xpath("//b[normalize-space()='Username']/parent::p");
    private By getUNamePasswordMessage = By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/p[1]");

    public Boolean checkForgotLoginInfoPageIsOpened() {
        return checkElementIsDisplayed(forgotLoginInfoPage_Message);
    }

    private void setCustomerFirstName(String c_FirstName) {
        setText(firstName, c_FirstName);
    }

    private void setCustomerLastName(String c_LastName) {
        setText(lastName, c_LastName);
    }

    private void setAddressStreet(String addressStreet) {
        setText(address_street, addressStreet);
    }

    private void setAddressCity(String addressCity) {
        setText(address_city, addressCity);
    }

    private void setAddressState(String addressState) {
        setText(address_state, addressState);
    }

    private void setAddressZipCode(String addressZipCode) {
        setText(address_zipCode, addressZipCode);
    }

    private void setCustomerSNN(String c_SNN) {
        setText(ssn, c_SNN);
    }

    private void clickFindMyLoginInfoButton() {
        clickElement(find_MyLoginInfo_Button);
    }

    public void askLoginInfo_ValidData() throws IOException {
        setCustomerFirstName(getTestData("Valid First Name"));
        setCustomerLastName(getTestData("Valid Last Name"));
        setAddressStreet(getTestData("Valid Street"));
        setAddressCity(getTestData("Valid City"));
        setAddressState(getTestData("Valid State"));
        setAddressZipCode(getTestData("Valid Zip Code"));
        setCustomerSNN(getTestData("Valid SSN"));
        clickFindMyLoginInfoButton();
    }

    private String getUserNameAndPassword() {
        return getText(userNameAndPassword);
    }

    public boolean checkUserNameIsSame() throws IOException{
      return  getUserNameAndPassword().contains("Username: " + getTestData("Valid First Name"));
    }

    public boolean checkPasswordIsSame() throws IOException{
      return  getUserNameAndPassword().contains("Password: " + getTestData("Valid Password"));
    }

    public Boolean checkGetUNamePasswordMessage() {
        return checkElementIsDisplayed(getUNamePasswordMessage);
    }
}
