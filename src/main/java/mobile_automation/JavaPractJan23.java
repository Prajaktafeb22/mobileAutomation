package mobile_automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.util.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class JavaPractJan23 {

	static AndroidDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		//device related setting
		capabilities.setCapability("deviceName", "R5CN704ZWCE");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "12");
		//App related settings
		capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		
		driver.findElementByAccessibilityId("7").click();
		driver.findElementByAccessibilityId("Multiplication").click();
		driver.findElementByAccessibilityId("5").click();
		driver.findElementByAccessibilityId("Equal").click();
		
	}
	
	
	
}
