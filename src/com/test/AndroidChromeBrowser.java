package com.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidChromeBrowser {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		System.out.println("I am start here....");
		//File appDir=new File("E:\\ALL_Test\\eclipse-workspace\\MobileAutomation\\apk\\com.flipkart.android.apk");
		
		//System.out.println(appDir.getAbsolutePath());
		DesiredCapabilities capabilities=new DesiredCapabilities().chrome();
		
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "S4");
		//
		capabilities.setCapability(MobileCapabilityType.APPLICATION_NAME, "Android");
		
		//capabilities.setCapability(MobileCapabilityType.APP,appDir.getAbsolutePath());
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		Thread.sleep(9000);
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.get("http://www.verizonwireless.com");
	}
}
