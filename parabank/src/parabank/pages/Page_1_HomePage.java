package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Page_1_HomePage extends A_3_BasePage {

    public Page_1_HomePage(WebDriver driver) {
        super(driver);
    }

    private By logo = By.xpath("//img[@title='ParaBank']");
    private By userName_Field = By.xpath("//input[@name='username']");
    private By password_Field = By.xpath("//input[@name='password']");
    private By login_button = By.xpath("//input[@value='Log In']");
    private By registerCTA = By.linkText("Register");
    private By forgotLoginInfoCTA = By.linkText("Forgot login info?");

    public Boolean checkHomePageIsOpened() {
        waitUntilElementIsDisplayed(logo);
        return checkElementIsDisplayed(logo) && checkElementIsDisplayed(userName_Field);
    }

    public void openRegisterPage() {
        clickElement(registerCTA);
    }

    public void openForgotLoginInfoPagePage() {
        clickElement(forgotLoginInfoCTA);
    }

    private void setUserNameToLogin(String userName) {
        setText(userName_Field, userName);
    }

    private void setPasswordToLogin(String password) {
        setText(password_Field, password);
    }

    private void clickLoginButton() {
        clickElement(login_button);
    }

    public void loginWith_ValidData() throws IOException {
        setUserNameToLogin(getTestData("Valid Username"));
        setPasswordToLogin(getTestData("Valid Password"));
        clickLoginButton();
    }

    public boolean checkOfLogOut() {
        return checkElementIsDisplayed(registerCTA);
    }
}
