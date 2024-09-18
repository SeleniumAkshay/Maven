package Selenium;

import com.aventstack.extentreports.Status;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentEx {
	
	public static void main(String[] args) {
		ExtentReports report=new ExtentReports("./Data/extent.html");
		ExtentTest test = report.startTest("demo");
		test.log(LogStatus.INFO,"browser");
		report.endTest(test);
		report.flush();
	}

}
