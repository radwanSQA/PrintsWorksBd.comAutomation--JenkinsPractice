package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utlities.CommonMethods;
import utlities.GetScreenShot;

public class CheckoutInfoPage extends CommonMethods{
	
	ExtentTest test;
	public CheckoutInfoPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
		
	}
	
	@FindAll({
		@FindBy(id="coupon_code")
	})
	WebElement coupon_code;
	
	@FindAll({
		@FindBy(id="billing_first_name")
	})
	WebElement billing_first_name;
	
	@FindAll({
		@FindBy(id="billing_last_name")
	})
	WebElement billing_last_name;
	
	@FindAll({
		@FindBy(xpath ="//span[@className='select2']"),
		@FindBy(className = "select2-container")
	})
	WebElement billing_country;
	
	@FindAll({
		@FindBy(id="billing_country"),
	})
	WebElement select2_country;
	
	

	
	@FindAll({
		@FindBy(id="billing_address_1")
	})
	WebElement billing_address_1;
	
	@FindAll({
		@FindBy(id="billing_address_2")
	})
	WebElement billing_address_2;
	
	@FindAll({
		@FindBy(id="billing_postcode")
	})
	WebElement billing_postcode;
	
	@FindAll({
		@FindBy(id="billing_phone")
	})
	WebElement billing_phone;
	
	@FindAll({
		@FindBy(id="billing_email")
	})
	WebElement billing_email;
	
	
	
	public void couponCode() throws IOException {
		
		test.info("coupon_code");
		try {
			sendText(coupon_code, "1234");
			timeOut(1000);
			test.pass("<p style=\"color:green; font-size:13px\"><b>coupon_code field</b></p>");
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "coupon_code");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "coupon_code.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>coupon_code not Working.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "coupon_code");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "coupon_code.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			PageDriver.getCurrentDriver().quit();
		}
		
	}
	
	public void billing_first_name() throws IOException {
		
		test.info("billing_first_name");
		try {
			sendText(billing_first_name,firstNameGenerate());
			timeOut(1000);
			test.pass("<p style=\"color:green; font-size:13px\"><b>billing_first_name field</b></p>");
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billing_first_name");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billing_first_name.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>billing_first_name not Working.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billing_first_name");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billing_first_name.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void billing_last_name() throws IOException {
		
		test.info("billing_last_name");
		try {
			sendText(billing_last_name, lastNameGenerate());
			timeOut(1000);
			test.pass("<p style=\"color:green; font-size:13px\"><b>billing_last_name field</b></p>");
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billing_last_name");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billing_last_name.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>billing_first_name not Working.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billing_last_name");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billing_last_name.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	
	public void select2_billing_country() throws IOException {
		
		test.info("billing_country");
		try {
			billing_country.click();
			timeOut(2000);
			selectItemByValue(select2_country, "AF");
			timeOut(2000);
			test.pass("<p style=\"color:green; font-size:13px\"><b>billing_country field</b></p>");
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billing_country");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billing_country.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>billing_country not Working.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billing_country");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billing_country.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void billing_address_1() throws IOException {
        try {
			sendText(billing_address_1, lastNameGenerate());
			timeOut(1000);
			test.pass("<p style=\"color:green; font-size:13px\"><b>billing_address_1 field</b></p>");
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billing_address_1");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billing_address_1.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>billing_address_1 not Working.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billing_address_1");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billing_address_1.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void billing_address_2() throws IOException {
		
	       try {
	    	   sendText(billing_address_2, cityAddressGenerate());
				timeOut(1000);
				test.pass("<p style=\"color:green; font-size:13px\"><b>billing_address_2 field</b></p>");
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billing_address_2");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billing_address_2.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>billing_address_2 not Working.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billing_address_2");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billing_address_2.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				PageDriver.getCurrentDriver().quit();
			}
	}
	
	public void billing_postcode() throws IOException {
		
        try {
        	sendText(billing_postcode, "00000");
			timeOut(1000);
			test.pass("<p style=\"color:green; font-size:13px\"><b>billing_postcode field</b></p>");
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billing_postcode");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billing_postcode.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>billing_postcode not Working.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billing_postcode");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billing_postcode.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void billing_phone() throws IOException {
		
	     try {
	    	 sendText(billing_phone, phoneNumberGenerate());
				timeOut(1000);
				test.pass("<p style=\"color:green; font-size:13px\"><b>billing_phone field</b></p>");
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billing_phone");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billing_phone.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>billing_phone not Working.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billing_phone");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billing_phone.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				PageDriver.getCurrentDriver().quit();
			}
	}
	
	public void billing_email() throws IOException {
		
		  try {
			  sendText(billing_email, emailGenerate());
					timeOut(1000);
					test.pass("<p style=\"color:green; font-size:13px\"><b>billing_email field</b></p>");
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billing_email");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billing_email.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					
				} catch (Exception e) {
					test.fail("<p style=\"color:red; font-size:13px\"><b>billing_email not Working.</b></p>");
					Throwable t = new InterruptedException("Exception");
					test.fail(t);
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billing_email");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billing_email.png";
					test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					PageDriver.getCurrentDriver().quit();
				}
		  timeOut(10000);
	}
}
