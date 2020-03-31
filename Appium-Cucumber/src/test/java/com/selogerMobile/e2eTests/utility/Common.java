package com.selogerMobile.e2eTests.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Common extends AbstractPage {
	
	public Common(WebDriver driver) {
		
		super(driver);
		
	}

	//private WebDriver driver;

				// Handel Cookies Seloger Mobile
			public void handelCookiesSelogerMobile() throws Throwable {
				
				driver.findElement(By.xpath("//*[@index='1']")).click();
				Thread.sleep(2000);
			}
}
