package tests;



import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.ViewProductDetailsPage;
import utlities.ExtentFactory;


public class ViewProductDetailsTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
    public void startUrl() {
	 	
   	    PageDriver.getCurrentDriver().manage().window().maximize();
   		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>View Product Page</b></p>")
						.assignAuthor("QA TEAM").assignDevice("Windows");
	
	}
	
	@Test
	public void PageDetails() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b></b>View Product</p>");
		ViewProductDetailsPage viewProductDetailsPage = new ViewProductDetailsPage(childTest);
		viewProductDetailsPage.detailsClick();
		viewProductDetailsPage.addToCartClick();
		viewProductDetailsPage.viewCartList();
		viewProductDetailsPage.clickCheckout();
		
	}
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}
	
}
