package com.orangeHRM.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportUtility {

	
	
	public static ExtentReports generateReport()
	{
		ExtentSparkReporter spark=new ExtentSparkReporter("reports/extent.html");
		
		ExtentReports extent=new ExtentReports();
		
		extent.attachReporter(spark);
		
		return extent;
	}
}
