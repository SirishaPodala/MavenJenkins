package Pom_pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.GenericLib;



public class Bulkrequest {
	WebDriver driver;
	
	@FindBy(xpath ="(//*[contains(text(),'Request Records')])[2]")
	private WebElement requestrecord;
			 
	@FindBy(xpath ="//*[text()='Upload']")
	private WebElement  uploadbutton;
					 
	@FindBy(xpath ="//*[@name='bulkUploadHipaa']")
	private WebElement	hipaafile;
					 
	@FindBy(xpath ="//*[@name='bulkUploadApplicant']")
	private WebElement chooseapplicantfile;
							 
	@FindBy(xpath ="//*[text()='here']")
	private WebElement here;
							 
	@FindBy(xpath =" //*[text()='Bulk Request']")
	private WebElement BulkRequest;
	
	 
@FindBy(xpath ="//*[text()='Send Requests']")
private WebElement sendrequest;
		 
	
	
	
	
	public Bulkrequest(WebDriver driver)  //constructor//
    {
		this.driver=driver;
		PageFactory.initElements(driver, this);

}
	
	 public void bulkrequest() throws InterruptedException   //method//
	  
	    {
		 	GenericLib.clickElement(driver, requestrecord, "click on requestrecord");
	    	Thread.sleep(5000);
	    	GenericLib.clickElement(driver, BulkRequest, "click on BulkRequest");
		    Thread.sleep(5000); 	
		    //Genericlib.clickElement(driver, here, "click on here");
	    	Thread.sleep(1000);
	    	driver.findElement(By.xpath("//*[@name='bulkUploadApplicant']")).sendKeys(Iconstants.WombaBulk);
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//input[@name='bulkUploadHipaa']")).sendKeys(Iconstants.hippa1 +"\n"+ Iconstants.hippa1);
	    	GenericLib.clickElement(driver, uploadbutton, "click on uploadbutton button");
	        Thread.sleep(1000);
	        GenericLib.clickElement(driver, sendrequest, "click on sendrequest button"); 
	        Thread.sleep(1000);
	        String ActualMessage1=driver.findElement(By.xpath("//*[contains(text(),'Request successfully sent. Your request will now appear on the �Applicant�s page. View all of your requested records')]")).getText();
	    	System.out.println(ActualMessage1);
	    	Thread.sleep(500);
	    	String Expected="Request successfully sent. Your request will now appear on the �Applicant�s page. View all of your requested records here.";
	    	Assert.assertEquals(ActualMessage1, Expected); 
	    	}
}