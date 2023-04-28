package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.CheckoutInfoPage;
import utlities.ExtentFactory;

public class CheckoutInfoTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
    public void startUrl() {
	 	
   	    PageDriver.getCurrentDriver().manage().window().maximize();
   	   	report = ExtentFactory.getInstance();
   			parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Checkout Page</b></p>")
   							.assignAuthor("QA TEAM").assignDevice("Windows");
	
	}
	
	@Test
	public void checkoutDetails() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b></b>Checkout Process</p>");
		CheckoutInfoPage checkoutInfoPage = new CheckoutInfoPage(childTest);
		checkoutInfoPage.couponCode();
		checkoutInfoPage.billing_first_name();
		checkoutInfoPage.billing_last_name();
		checkoutInfoPage.select2_billing_country();
		checkoutInfoPage.billing_address_1();
		checkoutInfoPage.billing_address_2();
		checkoutInfoPage.billing_postcode();
		checkoutInfoPage.billing_phone();
		checkoutInfoPage.billing_email();
		
	}
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
