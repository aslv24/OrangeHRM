package com.orangeHRM.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.orangeHRM.TestUtility.DriverHelper;
import com.orangeHRM.TestUtility.ReportHelper;

public class ListenersHelper implements ITestListener{

	ExtentReports reports;
	ExtentTest test;
	
	@Override
	public void onStart(ITestContext context) {
		reports = ReportHelper.generateReports();
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		test = reports.createTest(result.getName());
		test.log(Status.INFO, "Test got Started...");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test got Passed...");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test got Failed..."+"  :: "+result.getThrowable());
		System.out.println("<<<<<<<<<<<<<< Test Got Failed.... >>>>>>>>>>>>>>>");
		DriverHelper.captureScreenShot("fail");
		String screenShotAsBASE64 = DriverHelper.captureScreenShotAsBASE64();
		test.addScreenCaptureFromBase64String(screenShotAsBASE64,"screenshot captured...");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test got Skipped...");
	}

	

	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
	}

}
