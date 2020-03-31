package com.selogerMobile.e2eTests.utility;

import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;

import net.codestory.simplelenium.DomElement;
import net.codestory.simplelenium.SectionObject;
import net.codestory.simplelenium.SeleniumTest;
import net.codestory.simplelenium.driver.Browser;
import net.codestory.simplelenium.driver.SeleniumDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class AbstractPage implements SectionObject{
	

	
	public static WebDriver driver;
	public static boolean bResult;

	public  AbstractPage(WebDriver driver){
		AbstractPage.driver = driver;
		AbstractPage.bResult = true; 
	}
	
	

}
	
