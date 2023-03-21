package mobile_automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class MobileDemo1 {
    
	static AndroidDriver<MobileElement> driver;
	@Test
	public static void testCase1() throws MalformedURLException{
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "R5CN704ZWCE");
	    //device related setting
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "12");
		//App related settings
		capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		//App related functions
		driver.findElementByAccessibilityId("7").click();
		driver.findElementByAccessibilityId("Multiplication").click();
		driver.findElementByAccessibilityId("5").click();
		driver.findElementByAccessibilityId("Equal").click();
		
		
	}
	
	
	
	
	
	
}
