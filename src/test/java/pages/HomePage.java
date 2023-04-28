package pages;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utlities.CommonMethods;
import utlities.GetScreenShot;

public class HomePage extends CommonMethods{

	ExtentTest test;
	
	public HomePage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindAll({
		@FindBy(xpath = "//a[contains(text(),'বাংলা')]"),
	    @FindBy(xpath = "//a[@href='https://www.printworksbd.com/product-category/bangla-books/']")
	})
	WebElement menuItem;
	
	@FindAll({
		@FindBy(xpath = "//a[contains(text(),'উপন্যাস')]"),
	    @FindBy(xpath = "//a[@href='https://www.printworksbd.com/product-category/bangla-books/%e0%a6%89%e0%a6%aa%e0%a6%a8%e0%a7%8d%e0%a6%af%e0%a6%be%e0%a6%b8/']")
	})
	WebElement subMenuItem;
	
	public void HomePageMenuVisit() throws IOException {
		
        Actions action =  new Actions(PageDriver.getCurrentDriver());
		
		
		test.info("Click on Main Menu");
		try {
			if(menuItem != null) {
			action.moveToElement(menuItem).perform();
			timeOut(3000);
			test.pass("<p style=\"color:green; font-size:13px\"><b>Main Menu Visit</b></p>");
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "mainMenu");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "mainMenu.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Home Page Main Menu Visit not Working.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "mainMenu");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "mainMenu.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(menuItem.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
		
		
		test.info("Click on Sub Menu");
		try {
			if(subMenuItem != null) {	
			action.click(subMenuItem).click().perform();
			timeOut(3000);
			test.pass("<p style=\"color:green; font-size:13px\"><b>Sub Menu Visit</b></p>");
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "subMenu");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "subMenu.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Submenu not Working.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "subMenu");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "submenu.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(subMenuItem.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
	}

}
