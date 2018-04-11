package com.acti.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class generics implements Autoconst
{

	public void verifyTitle(WebDriver driver,String etitle)
	{
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleIs(etitle));
		
	}
	
}
