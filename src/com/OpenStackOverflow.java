package com;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class OpenStackOverflow {
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
			driver.get("https://stackoverflow.com/");
			System.out.println("Opened StackOverFlow");
		}
		catch (Exception e) {

			e.printStackTrace();

		}
		
	}
	
}
