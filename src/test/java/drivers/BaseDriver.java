package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	public static String baseURL="https://www.printworksbd.com/";
	 public static WebDriver driver=null;
	 
	 
     @BeforeSuite //It will run only once, before all tests in the suite are executed.
     public void start() {
		String browser = System.getProperty("browser","chrome");
	    
		if(browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}else{
			WebDriverManager.edgedriver().setup();
			driver =  new EdgeDriver();
		}
		
		PageDriver.getInstance().setDriver(driver);;
	}
     
     @AfterSuite //A method with this annotation will run once after the execution of all tests in the suite is complete.
     public void close() {
		PageDriver.getCurrentDriver().quit();
	}
}
