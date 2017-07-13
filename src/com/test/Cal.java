package com.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Cal {
	
	public static void main(String[] args) throws MalformedURLException {
		// Created object of DesiredCapabilities class. 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//Set android deviceName desired capability to Android Emulator. 
		capabilities.setCapability("deviceName", "Android Emulator");
		//Set BROWSER_NAME desired capability to Android. 
		capabilities.setCapability("browserName", "Android");
		//Set android VERSION from device desired capability. 
		capabilities.setCapability("platformVersion", "4.4");
		// Set android platformName desired capability to Android. 
		capabilities.setCapability("platformName", "Android");
		// Set android appPackage desired capability.  
		capabilities.setCapability("appPackage", "com.android.calculator2");
		// Set android appActivity desired capability.  
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		AndroidDriver driver;
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
}
