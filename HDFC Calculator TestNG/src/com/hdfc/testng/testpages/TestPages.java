package com.hdfc.testng.testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestPages {
	
	WebDriver driver;
	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\selenium_jars\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testPages()
	{
		
	}
	
	@AfterTest
	public void closeWindows()
	{
		
	}

}
