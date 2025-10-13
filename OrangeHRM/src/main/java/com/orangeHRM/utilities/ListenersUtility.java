package com.orangeHRM.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenersUtility implements ITestListener{
	String name;
	ExtentReports report;
	ExtentTest test;
	
	@Override
	public void onStart(ITestContext context) {
	System.out.println("<<<<<<<< Automation Project Code Started Sucessfully >>>>>>>>");
	report = ReportUtility.generateReport();
	}

	@Override
	public void onTestStart(ITestResult result) {
		name = result.getName();
		System.out.println("Test method "+name+" started successfully");
		test = report.createTest(name);
		test.log(Status.INFO, "Test got Started...");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test method "+name+" passed...");
		test.log(Status.PASS, "Test got Passed...");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test method "+name+" Failed...");
		DriverUtility.captureScreenshot("Failed_"+name);
		test.log(Status.FAIL, "Test got Failed...");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test method "+name+" Skipped");
		test.log(Status.SKIP, "Test got Skipped...");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

		
	}


	@Override
	public void onFinish(ITestContext context) {
		System.out.println("<<<<<<<< Automation Project Code Completed Sucessfully >>>>>>>>");
		report.flush();
	}

}
