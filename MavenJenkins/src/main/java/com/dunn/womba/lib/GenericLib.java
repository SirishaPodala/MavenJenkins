package com.dunn.womba.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.dunn.womba.init.Iconstants;
import com.google.common.io.Files;

public class GenericLib {
	public static String getPropData(String Key) {
		String data = "";
		try {
		FileInputStream finn = new FileInputStream(Iconstants.propData);
		Properties prop= new Properties();
		prop.load(finn);
		data = prop.getProperty(Key);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
	public static void clickElement(WebDriver driver,WebElement ele,String eleName)
	{
		try{		
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(ele)).click();
			Reporter.log("Clicked on"+eleName);
			}
		catch (TimeoutException e) {
			Reporter.log(eleName+"Not dispalyed");
			//Assert.fail();
		}
	}
	
	public static void enterText(WebDriver driver,WebElement ele,String text, String eleName)
	{
		try{	
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(ele)).sendKeys(text);
			Reporter.log("Entered Text" +text+" In the "+eleName );
			}
		catch (TimeoutException e) {
			Reporter.log(eleName+"Not dispalyed");
		
		}
		}
	
}