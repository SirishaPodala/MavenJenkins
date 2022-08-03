package Pom_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.dunn.womba.lib.GenericLib;

public class LoginPage {
	WebDriver driver;
	

	@FindBy(id = "username")
	private WebElement usrname;

	@FindBy(id = "password")
	private WebElement psw;

	@FindBy(name = "submit")
	private WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void patientlogin(String username, String password)
	{
		
		GenericLib.enterText(driver, usrname, username, "Username TextBox");
		GenericLib.enterText(driver, psw, password, "password TextBox");
		GenericLib.clickElement(driver, loginBtn, "Login Btn");
		String ActualText = driver.findElement(By.id("navbarDropdownMenuLink")).getText();
		System.out.println(ActualText);
		String ExpectedText = "paaa@gmail.com";
		Assert.assertEquals(ActualText,ExpectedText);
		
		
	}
	
	public void doctorlogin(String username1, String password1)
	{
		GenericLib.enterText(driver, usrname, username1, "Username TextBox");
		GenericLib.enterText(driver, psw, password1, "password TextBox");
		GenericLib.clickElement(driver, loginBtn, "Login Btn");
		String ActualText = driver.findElement(By.id("navbarDropdownMenuLink")).getText();
		System.out.println(ActualText);
		String ExpectedText = "kiran2@gmail.com";
		Assert.assertEquals(ActualText,ExpectedText);
			}
	
	public void InsuranceLogin(String usernam, String pswd)
	{
		GenericLib.enterText(driver, usrname, usernam, "Username TextBox");
		GenericLib.enterText(driver, psw, pswd, "password TextBox");
		GenericLib.clickElement(driver, loginBtn, "Login Btn");
		String ActualText = driver.findElement(By.id("navbarDropdownMenuLink")).getText();
		System.out.println(ActualText);
		String ExpectedText = "hasa@womba.com";
		Assert.assertEquals(ActualText,ExpectedText);
		}
}
