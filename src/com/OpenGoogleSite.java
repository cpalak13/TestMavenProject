package com;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenGoogleSite {
public static WebDriver driver;
	
	@BeforeMethod
	public void setupBrowserAndLogin() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	}
	
	@Test()
	public void OpenGoogletest() throws InterruptedException,
			AWTException {

		try {
			driver.manage().window().maximize();
			driver.get("https://google.co.in/");
			
			System.out.println("Opened Google");
		}
		catch (Exception e) {

			e.printStackTrace();

		}
		
	}
	
}