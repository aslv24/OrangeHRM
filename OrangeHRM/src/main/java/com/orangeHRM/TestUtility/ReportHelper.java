package com.orangeHRM.TestUtility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.orangeHRM.TestBase.Constants;

public class ReportHelper {

	
	public static ExtentReports generateReports()
	{
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(Constants.reportPath+"//extentreports"+System.currentTimeMillis()+".html");
		
		sparkReporter.config().setDocumentTitle("OrangeHRM");
		
		sparkReporter.config().setReportName("Automation Results of OrangeHRM");
		
		sparkReporter.config().setTheme(Theme.DARK);
		
		sparkReporter.config().setTimeStampFormat("dd:MM:yyyy - hh:mm:ss, EEEE");
		
		ExtentReports extentReports=new ExtentReports();
		
		extentReports.attachReporter(sparkReporter);
		
		return extentReports;
	}
}
