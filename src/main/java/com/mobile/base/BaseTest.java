package com.mobile.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest {

	private static AndroidDriver<MobileElement> driver;
	
	public AndroidDriver<MobileElement> launchMobileApp(){

		DesiredCapabilities capabilities = new DesiredCapabilities();
		//device related setting
		capabilities.setCapability("deviceName", "R5CN704ZWCE");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "12");
		//App related settings
		capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	
	}
	
	
}	
	
	
	
