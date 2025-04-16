package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_4_NewAccountPage extends A_3_BasePage {
    public Page_4_NewAccountPage(WebDriver driver) {
        super(driver);
    }

    private By openNewAccountPage_WelcomeMessage = By.xpath("//h1[@class='title' and text()='Open New Account']");
    private By accountType = By.id("type");
    private By openNewAccountButton = By.xpath("//input[@type='button' and @value='Open New Account']");
    private By accountOpened = By.xpath("//h1[@class='title' and text()='Account Opened!']");
    private By successfullyAccountOpenedMessage = By.xpath("//p[text()='Congratulations, your account is now open.']");


    public Boolean checkNewAccountPageIsOpened() {
        return checkElementIsDisplayed(openNewAccountPage_WelcomeMessage);
    }

    private void selectAccountType(int accountTypeI) {
        selectFromDropdownByIndex(accountType, accountTypeI);
    }

    private void clickToOpenNewAccount() {
        clickElement(openNewAccountButton);
    }

    public void openNewCHECKINGAccount(){
        selectAccountType(0);
        clickToOpenNewAccount();
    }
    public void openNewSAVINGSAccount(){
        selectAccountType(1);
        clickToOpenNewAccount();
    }

    public boolean checkSuccessfulNewAccountOpened_1() {
        return checkElementIsDisplayed(accountOpened);
    }

    public boolean checkSuccessfulNewAccountOpened_2() {
        return checkElementIsDisplayed(successfullyAccountOpenedMessage);
    }

}
