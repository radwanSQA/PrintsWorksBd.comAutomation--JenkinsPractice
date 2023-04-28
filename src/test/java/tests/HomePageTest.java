package tests;


import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.HomePage;
import utlities.ExtentFactory;




public class HomePageTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
    public void startUrl() {
		
   	PageDriver.getCurrentDriver().get(baseURL);
   	PageDriver.getCurrentDriver().manage().window().maximize();
   	report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Home Page</b></p>")
						.assignAuthor("QA TEAM").assignDevice("Windows");
		
	}
	
	@Test
	public void menuVisit() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b></b>Home Page Menu Visit</p>");
		HomePage homePage = new HomePage(childTest);
		homePage.HomePageMenuVisit();
	}
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}

}
