package prac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.acti.generics.Autoconst;
import com.acti.generics.generics;

public class dx extends generics {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		generics g = new generics();
		g.verifyTitle(driver, driver.getTitle());
		driver.get("https://online.actitime.com/google/login.do");
		driver.findElement(By.id("username")).sendKeys("abdulla.suhail8");
		driver.findElement(By.name("pwd")).sendKeys("gyzAhenY");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		generics g1 = new generics();
		g1.verifyTitle(driver, driver.getTitle());
		driver.findElement(By.xpath("//div[.='TASKS']")).click();
		
		
	}
}
