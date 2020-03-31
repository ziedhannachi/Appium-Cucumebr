/**
 * 
 */
package com.selogerMobile.e2eTests.utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * @author Zied Hannachi
 *
 */
public class Hook {

	private static WebDriver driver;
	
	@Before()
	public void setUpAppium() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("udid", "DEFNW18B27009668"); //Give Device ID of your mobile phone
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Huawei Y9");
		cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\Dell\\eclipse-workspace\\SelogerMobile\\src\\test\\ressources\\Applications\\SeLoger.apk");
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}
