package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

abstract class A_3_BasePage extends A_1_TestDataExcelReader {
    WebDriver driver;
    private WebDriverWait wait;

    protected A_3_BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement getWebElement(By by) {
        return driver.findElement(by);
    }

    protected String getFromDropdownByIndex(By by, int i) {
        WebElement dropdown = getWebElement(by);
        Select select = new Select(dropdown);
        List<WebElement> options = select.getOptions();
        return options.get(i).getText();
    }

    protected void selectFromDropdownByIndex(By by, int i) {
        WebElement dropdown = getWebElement(by);
        Select select = new Select(dropdown);
        select.selectByIndex(i);
    }

    protected void setText(By by, String text) {
        waitUntilElementIsDisplayed(by);
        driver.findElement(by).sendKeys(text);
    }

    protected void clickElement(By by) {
        waitUntilElementIsDisplayed(by);
        waitUntilElementIsClickable(by);
        driver.findElement(by).click();
    }

    protected void clearField(By by) {
        waitUntilElementIsDisplayed(by);
        waitUntilElementIsClickable(by);
        getText(by);
        clickElement(by);
        driver.findElement(by).clear();
    }

    protected String getText(By by) {
        waitUntilElementIsDisplayed(by);
        return driver.findElement(by).getText();
    }

    protected String getValue(By by) {
        waitUntilElementIsDisplayed(by);
        return driver.findElement(by).getDomProperty("value");
    }

    protected Boolean checkElementIsDisplayed(By by) {
        waitUntilElementIsDisplayed(by);
        return driver.findElement(by).isDisplayed();
    }

    protected Boolean checkElementIsEnabled(By by) {
        waitUntilElementIsDisplayed(by);
        return driver.findElement(by).isEnabled();
    }

    protected void waitUntilElementIsDisplayed(By by) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected void waitUntilElementIsClickable(By by) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

}
