package tests;

import org.testng.*;

public class D_4_ExtentTestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        D_3_ExtentReportManager.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        D_3_ExtentReportManager.getTest().pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        D_3_ExtentReportManager.getTest().fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        D_3_ExtentReportManager.getTest().skip("Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        D_3_ExtentReportManager.flush();
    }
}
