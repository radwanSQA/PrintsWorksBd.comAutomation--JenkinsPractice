package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utlities.CommonMethods;
import utlities.GetScreenShot;

public class ViewProductDetailsPage extends CommonMethods{
	ExtentTest test;
	
	public ViewProductDetailsPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
		
	}
	
	@FindAll({
		@FindBy(xpath="//h3[contains(text(),'জীবন যে রকম')]"),
	})
	WebElement detailsLink;
	
	@FindAll({
		@FindBy(xpath="//button[contains(text(),'Add to cart')]"),
	})
	WebElement addToCartBtn;
	
	@FindAll({
		@FindBy(id="mini-cart"),
	})
	WebElement viewCart;
	
	@FindAll({
		@FindBy(className = "woocommerce-mini-cart__buttons"),
		@FindBy(xpath="//h3[contains(text(),'Checkout')]"),
	})
	WebElement checkoutBtn;
	
	
	
	public void detailsClick() throws IOException {
		
		test.info("DetailsLink");
		try {
		
			detailsLink.click();
			timeOut(3000);
			test.pass("<p style=\"color:green; font-size:13px\"><b>detailsLink</b></p>");
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "detailsLink");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "detailsLink.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>detailsLink</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "detailsLink");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "detailsLink.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			PageDriver.getCurrentDriver().quit();
			
		}
	}
	
	public void addToCartClick() throws IOException {
		test.info("DetailsLink");
		try {
		
			addToCartBtn.click();
			timeOut(3000);
			test.pass("<p style=\"color:green; font-size:13px\"><b>addToCartBtn</b></p>");
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "addToCartBtn");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addToCartBtn.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>addToCartBtn</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "addToCartBtn");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addToCartBtn.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			PageDriver.getCurrentDriver().quit();
			
		}
	}
	
	public void viewCartList() throws IOException {
	
			test.info("viewCart");
			try {
				 Actions action =  new Actions(PageDriver.getCurrentDriver());
				 action.moveToElement(viewCart).perform();
				timeOut(3000);
				test.pass("<p style=\"color:green; font-size:13px\"><b>viewCart</b></p>");
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "viewCart");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "viewCart.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
				
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>addToCartBtn</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "viewCart");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "viewCart.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				PageDriver.getCurrentDriver().quit();
				
			}
	}
	
	
	public void clickCheckout() throws IOException {

			test.info("checkoutBtn");
			try {
				checkoutBtn.click();
				timeOut(3000);
				test.pass("<p style=\"color:green; font-size:13px\"><b>checkoutBtn</b></p>");
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "checkoutBtn");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "checkoutBtn.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
				
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>checkoutBtn</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "checkoutBtn");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "checkoutBtn.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				PageDriver.getCurrentDriver().quit();
				
			}
		 timeOut(10000);
	}
	
	
	
}
