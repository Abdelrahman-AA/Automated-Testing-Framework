package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_5_AccountsOverviewPage extends A_3_BasePage {
        public Page_5_AccountsOverviewPage(WebDriver driver) {
        super(driver);
    }

    private By accountsOverview_PageMessage = By.xpath("//h1[normalize-space()='Accounts Overview']");
    private By accountNum = By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]");


    public Boolean checkAccountsOverviewPageIsOpened() {
        return checkElementIsDisplayed(accountsOverview_PageMessage);
    }

    public String getAccountNum (){
      return  getText(accountNum);
    }

    public void clickAccountNum(){
        clickElement(accountNum);
    }

}
