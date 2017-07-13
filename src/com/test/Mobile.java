package com.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Mobile {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		
		
		System.out.println("I am start here....");
		File appDir=new File("E:\\ALL_Test\\eclipse-workspace\\MobileAutomation\\apk\\com.flipkart.android.apk");
		
		System.out.println(appDir.getAbsolutePath());
		DesiredCapabilities capabilities=new DesiredCapabilities();
		
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "S4");
		//
		capabilities.setCapability(MobileCapabilityType.APPLICATION_NAME, "Android");
		
		capabilities.setCapability(MobileCapabilityType.APP,appDir.getAbsolutePath());
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		Thread.sleep(9000);
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		
		
		
//		capabilities.setCapability("appPackage", "com.flipkart.android");
//		capabilities.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");
//		
//		capabilities.setCapability("appPackage","com.android.calculator2");
//		capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
//		
//		Thread.sleep(3000);
//		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wb/hub"),capabilities);
//		Thread.sleep(6000);
//		
//		
		
		
		
		
		
		
//		
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
//		capabilities.setCapability(MobileCapabilityType.VERSION, "4.4");

		//		cap.setCapability("platformName", "Android");
		//		cap.setCapability("platformVersion", "4.4.2");
		//		cap.setCapability("deviceName", "emulator-5554");
		//		//cap.setCapability("browserName", "Android");

		//capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,200);
		//capabilities.setCapability("appPackage","com.android.calculator2");
		//capabilities.setCapability("appActivity","com.android.calculator2.Calculator");

		
	}

	

}
