package org.company.Utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver extends WaitHelpers{
	private static Driver Instance=null;
	public static WebDriver driver;
	private Driver()
	{
		Setup();
	}
	public static Driver getDriverInstace() 
	{ 
		if (Instance == null) 
			Instance = new Driver(); 
		return Instance; 
	} 
	public void Setup()
	{
		driver = new ChromeDriver();
	}
	public WebElement GetElement(By Locator)
	{
		return driver.findElement(Locator);
	}
	public boolean ClickElement(By Locator)
	{
		try {
			driver.findElement(Locator).click();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}
}