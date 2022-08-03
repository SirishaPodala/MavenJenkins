package Pom_pages;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.dunn.womba.lib.GenericLib;



public class AddInsurancesupervisor {
	WebDriver driver;
	
	@FindBy(xpath =" //a[@href=\"#/insurance/providers\"]")
	private WebElement myteamlink;
			 
	@FindBy(xpath ="//*[text()='My Team'] ")
	private WebElement  Myteam;
					 
	@FindBy(xpath ="(//*[text()='Add'])[1]")
	private WebElement	Addbutton;
					 
	@FindBy(xpath =" //*[@name='firstName']")
	private WebElement firstname;
	
	@FindBy(xpath ="//*[@name='lastName']")
	private WebElement lastname;
	
	@FindBy(xpath ="//*[@name='mobilePhoneCountryCode']")
	private WebElement phonenumber;
	
	@FindBy(xpath ="//*[@name='mobilePhone']")
	private WebElement mobilenumber;
	
	@FindBy(xpath ="//*[@name='email']")
	private WebElement email;
							 
	@FindBy(xpath ="//*[@name='role']")
	private WebElement role;
	
	@FindBy(xpath ="//*[@name='viewApplicantData']")
	private WebElement viewApplicantData;
	
	@FindBy(xpath ="//*[@name='rejectPatientRecords']")
	private WebElement rejectPatientRecords;
	
	@FindBy(xpath ="//*[text()='Send Requests']")
	private WebElement sendrequests;
	
	

	
		 
	
	
	
	
	public AddInsurancesupervisor(WebDriver driver)  //constructor//
    {
		this.driver=driver;
		PageFactory.initElements(driver, this);

}
	
	 public void Addsupervisor() throws InterruptedException   //method//
	  
	    {
		 Thread.sleep(1000);
		 
		 	GenericLib.clickElement(driver, myteamlink, "click on myteamlink");
	    	Thread.sleep(1000);
	    	GenericLib.clickElement(driver, Myteam, "click on Myteam");
		    Thread.sleep(1000); 	
		    GenericLib.clickElement(driver, Addbutton, "click on Addbutton");
	    	Thread.sleep(1000);
	    	GenericLib.enterText(driver, firstname, "insurancesupervisor", "firstname enter");
	    	Thread.sleep(1000);
		    GenericLib.enterText(driver, lastname, "test555", "lastname enter");
		    Thread.sleep(1000);
		     
		    Select sc = new Select(phonenumber);
		    sc.selectByVisibleText("India (+91)");
		    GenericLib.enterText(driver, mobilenumber, "9972723014", "mobilenumber");
		    Thread.sleep(1000);
	      
		    Random rand = new Random(); 
		    int upperbound = 1000;
		    int int_random = rand.nextInt(upperbound); 
	        GenericLib.enterText(driver, email, "insurancesupervisor"+int_random+"@gmail.com", "email");
	        Thread.sleep(1000); 
	      
	        Select sc1 = new Select(role);
		    sc1.selectByVisibleText("Insurance Supervisor (Also has permissions to audit the records)");
		    
		     WebElement radio1=driver.findElement(By.xpath("//*[@name='viewApplicantData']"));
		     radio1.click();
		     GenericLib.clickElement(driver, sendrequests, "click on Myteam");
		   	Thread.sleep(1000);
		    	 }
}