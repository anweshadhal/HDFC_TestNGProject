package com.hdfc.testng.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HDFCLandingPage {
	
	WebDriver driver;
	
	@FindBy(id="SeniorNo")
	WebElement chooseCitizenOption;
	
	@FindBy(xpath="//div[@class=\"selectbg\"]/select")
	WebElement selectFixedDepositeType;
	
	@FindBy(id="months")
	WebElement giveMonthsValue;
	
	@FindBy(id="days")
	WebElement giveDaysValue;
	
	@FindBy(xpath="//a[@class=\"nextBtn\"]")
	WebElement clickNext;
	
	public HDFCLandingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void chooseCitizenOption()
	{
		chooseCitizenOption.click();
	}
	
	public void selectFixedDepositType()
	{
		Select s=new Select(selectFixedDepositeType);
		s.selectByVisibleText("Monthly Payout");
	}
	
	public void provideDepositeTerms(String months,String days)
	{
		giveMonthsValue.click();
		giveMonthsValue.sendKeys(months);
		giveDaysValue.click();
		giveDaysValue.sendKeys(days);
		clickNext.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

}
