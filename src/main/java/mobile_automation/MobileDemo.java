package mobile_automation;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class MobileDemo {
	static AndroidDriver <MobileElement> driver = null;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//local host server where our server is running
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		//DesiredCapabilitis used for setting device's version,name through setCapability
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(AndroidMobileCapabilityType.VERSION, "11");
		dc.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "Android");
		//dc.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"samsung");
		//dc.setCapability("w3c", false);
		//Current active app package 
		//first part is activity and second part is package
	   dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.samsung.android.contacts.contactslist.PeopleActivity");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.samsung.android.app.contacts");
		//No reset true means you will rejoin the application at previous stage
		//dc.setCapability("noReset", true);or
		dc.setCapability(MobileCapabilityType.NO_RESET, true);
		driver = new AndroidDriver<MobileElement>(url,dc);
		//findElement only
		// driver.findElementByAccessibilityId("7").click();
		// driver.findElementByAccessibilityId("2").click();
		// driver.findElementByAccessibilityId("Plus").click();
		// driver.findElementByAccessibilityId("8").click();
		// driver.findElementByAccessibilityId("9").click();
		// driver.findElementByAccessibilityId("Equal").click();
		// driver.findElementById("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal").click();
		//TouchAction-->when you need  to swipe or perform any action
		Thread.sleep(5000);
		//MobileElement search = (MobileElement)driver.findElement(By.id("")); 
		//Dimention Class
		//Dimension size = search.getSize(); 
		//int width_x = size.getWidth();
		//int height_y = size.getHeight();
				
		TouchAction action = new TouchAction(driver);
		action.longPress(PointOption.point(10, 1505)).moveTo(PointOption.point(910, 1441)).release().perform();
		//action.longPress(PointOption.point(10, 1505)).moveTo(PointOption.point(910, 1441)).release().perform();
		System.out.println("right swipe performed");
		//Left swipe
		action.longPress(PointOption.point(910, 1441)).moveTo(PointOption.point(10, 1505)).release().perform();
		System.out.println("Left swipe performed");
		//driver.rotate(ScreenOrientation.PORTRAIT);
		//driver.lockDevice();
		//driver.unlockDevice();
		//Application  will be available at background after 15sec it will come foreground
		//driver.runAppInBackground(Duration.ofSeconds(15));
		//If you to find element you need to use UiSelector 
		WebElement scrollableList = (WebElement) driver.findElementsByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/content\")");
		
		
		
		
		
		//package information of an application,and activity name should pass
		//Activity activity = new Activity(null, null);
		//driver.startActivity(activity);
		//Thread.sleep(3000);
		
		
		
		
		
		
		 
		 
		
	}
	
	
	
	
	
	

}
