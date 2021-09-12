package extentlisteners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testcases.BaseTest;
import utility.TakeScreenShotOfApp;

public class ExtentListeners extends BaseTest implements ITestListener {

	
ExtentReports  extent	= ExtentReportGen.extentReportGenerator();
public static ExtentTest test ;
	
	@Override
	public void onTestStart(ITestResult result) {
	 test = extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	test.log(Status.PASS, "Test case has been passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		try {
			test.addScreenCaptureFromPath(TakeScreenShotOfApp.captureScreenShot(driver, result.getName()), "Failed screenshot");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		extent.flush();
	}
	
	
	

}
