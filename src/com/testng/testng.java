package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng {
	
	WebDriver driver;

	@BeforeMethod
	public void precondition()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
	}
	
	@Test(priority=1)
	public void testmethod1()
	{
		System.out.println(driver.getTitle());
		boolean ans = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
		if(ans)
		{
			System.out.println("true");
		}
	}
	@Test(priority=0)
	public void testmethod2()
	{
		boolean mail = driver.findElement(By.linkText("Gmail")).isDisplayed();
		
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.quit();
		driver.close();
	}
}


