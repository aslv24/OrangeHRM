package com.orangeHRM.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportUtility {

	
	
	public static ExtentReports generateReport()
	{
		ExtentSparkReporter spark=new ExtentSparkReporter("reports/extent.html");
		
		spark.config().setDocumentTitle("Automation Project");
		
		spark.config().setTheme(Theme.DARK);
		
		spark.config().setReportName("Test Results");
		
		spark.config().setEncoding("UTF-8");
		
		spark.config().setTimeStampFormat("dd-MM-yyyy hh:mm:ss a EEEE");
		
		ExtentReports extent=new ExtentReports();
		
		extent.attachReporter(spark);
		
		return extent;
	}
}
