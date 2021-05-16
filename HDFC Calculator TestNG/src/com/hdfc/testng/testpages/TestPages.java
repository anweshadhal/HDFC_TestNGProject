package com.hdfc.testng.testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hdfc.testng.fetchtestdata.FetchTestData;
import com.hdfc.testng.pages.HDFCCalculatorePage;
import com.hdfc.testng.pages.HDFCLandingPage;



public class TestPages {
	
	WebDriver driver;
	HDFCLandingPage hdfcLandingPage;
	HDFCCalculatorePage hdfcCalculatorePage;
	
	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\selenium_jars\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://v1.hdfcbank.com/htdocs/common/fd/fixed-deposit.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testPages()
	{
		hdfcLandingPage=new HDFCLandingPage(driver);
		hdfcCalculatorePage=new HDFCCalculatorePage(driver);
		hdfcLandingPage.chooseCitizenOption();
		hdfcLandingPage.selectFixedDepositType(FetchTestData.fetchTestData("Sheet1", 0, 0));
		hdfcLandingPage.provideDepositeTerms(FetchTestData.fetchTestData("Sheet1", 0, 1), FetchTestData.fetchTestData("Sheet1", 0, 2));
		hdfcCalculatorePage.selectDateOfFD(FetchTestData.fetchTestData("Sheet1", 0, 3));
		hdfcCalculatorePage.fixedDepositAmount(FetchTestData.fetchTestData("Sheet1", 0, 4));
	}
	
	@AfterTest
	public void closeWindows()
	{
		
	}

}
