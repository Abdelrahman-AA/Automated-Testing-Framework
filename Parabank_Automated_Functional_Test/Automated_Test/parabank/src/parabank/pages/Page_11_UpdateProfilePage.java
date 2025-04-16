package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Page_11_UpdateProfilePage extends A_3_BasePage {
    
    public Page_11_UpdateProfilePage(WebDriver driver) {
        super(driver);
    }

    private By updateProfilePage_Message = By.xpath("//h1[normalize-space()='Update Profile']");
    private By customer_firstName = By.id("customer.firstName");
    private By customer_lastName = By.id("customer.lastName");
    private By customer_address_street = By.id("customer.address.street");
    private By customer_address_city = By.id("customer.address.city");
    private By customer_address_state = By.id("customer.address.state");
    private By customer_address_zipCode = By.id("customer.address.zipCode");
    private By customer_phoneNumber = By.id("customer.phoneNumber");
    private By updateProfileButton = By.xpath("//input[@value='Update Profile']");
    private By successfulMessage = By.xpath("//p[contains(text(),'Your updated address and phone number have been ad')]");

    public Boolean checkUpdateProfilePageIsOpened(){
        return checkElementIsDisplayed(updateProfilePage_Message);
    }

    private void editFirsName (String newName){
        clearField(customer_firstName);
        setText(customer_firstName, newName);
        clickElement(updateProfileButton);
    }

    public void editFirsName_ValidData() throws IOException{
        editFirsName(getTestData("Valid First Name") + "AA");
    }

    public boolean check_SuccessfulMessage(){
        return checkElementIsDisplayed(successfulMessage);
    }

    private String getFnameFromForm(){
        return getValue(customer_firstName);
    }

    public boolean checkFirstNameFromForm() throws IOException{
     return   getFnameFromForm().contains(getTestData("Valid First Name") + "AA");
    }
}
