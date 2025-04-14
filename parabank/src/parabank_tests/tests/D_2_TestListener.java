package tests;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class D_2_TestListener implements ITestListener {

    private void takeScreenshot(ITestResult result, String status) {
        Object testClass = result.getInstance();
        WebDriver driver = ((tests.D_1_BaseTest) testClass).driver;

        if (driver != null) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String testClassName = result.getTestClass().getName().replaceAll(".*\\.", "");
            String testName = result.getName();

            String folderName = "screenshots/" + status;
            String fileName = folderName + "/" + testClassName + "_" + testName + "_" + status + "_" + timeStamp + ".png";

            try {
                Files.createDirectories(new File(folderName).toPath());
                // Files.copy(source.toPath(), new File(fileName).toPath());
                Files.copy(
                        source.toPath(),
                        new File(fileName).toPath(),
                        StandardCopyOption.REPLACE_EXISTING
                );
                System.out.println("✔ Screenshot saved to: " + fileName);
            } catch (IOException e) {
                System.err.println("✖ Failed to save screenshot: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot(result, "FAILED");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        takeScreenshot(result, "SKIPPED");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        takeScreenshot(result, "PASSED");
    }
}