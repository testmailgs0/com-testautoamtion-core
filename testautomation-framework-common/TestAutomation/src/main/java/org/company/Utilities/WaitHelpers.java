package org.company.Utilities;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.*;

public class WaitHelpers {
	private static WebDriverWait Wait;
	private static FluentWait FWait;
	protected void ImplicitWait(WebDriver driver,long timeToWait,TimeUnit timeUnit)
	{
		try {
			driver.manage().timeouts().implicitlyWait(timeToWait, timeUnit);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@SuppressWarnings("static-access")
	protected void ExplicitWait(WebDriver driver,WebElement elem,ExpectedConditions Condition,long time,By Locator) {
		try {
			Wait= new WebDriverWait(driver, time);
			Wait.until(Condition.elementToBeClickable(Locator));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void FluentWait(WebDriver driver,Duration TimeOut,Duration PollingInterval)
	{
		try {
			FWait  = new FluentWait<WebDriver>(driver)
					.withTimeout(TimeOut).pollingEvery(PollingInterval)
					.ignoring(NoSuchElementException.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
