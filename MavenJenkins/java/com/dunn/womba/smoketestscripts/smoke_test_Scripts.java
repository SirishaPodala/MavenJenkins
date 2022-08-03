package com.dunn.womba.smoketestscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.smoketestpages.AddInsurancesupervisor;
import com.dunn.womba.smoketestpages.Bulkrequest;
import com.dunn.womba.smoketestpages.Filters;
import com.dunn.womba.smoketestpages.Insurancepasswordupdate;
import com.dunn.womba.smoketestpages.LoginPage;
import com.dunn.womba.smoketestpages.Single_Request_Record;

public class smoke_test_Scripts extends Baselib
{		
	@Test (alwaysRun = true,priority=0)
    public void addsupervisorandagent() throws InterruptedException, Throwable
    
		{
		LoginPage lp = new LoginPage(driver);
		String un = excelLib.getData("Sheet1",3,1,Iconstants.DataexcelPath);
		String pw = excelLib.getData("Sheet1",3,2,Iconstants.DataexcelPath);
		lp.InsuranceLogin(un, pw);
		Thread.sleep(5000);
			
		AddInsurancesupervisor is=new AddInsurancesupervisor(driver);	
	    is.Addsupervisor();  
		}
	
	@Test (alwaysRun = true,priority=1)
    public void singlerecord() throws InterruptedException, Throwable
		{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='navbar-logo']/a/img")).click();
		Thread.sleep(5000);
		Single_Request_Record sr = new Single_Request_Record(driver);
		sr.requestrecordsingle();
		}
	
	@Test (alwaysRun = true,priority=2)
    public void filtersearch() throws InterruptedException, Throwable
		{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='navbar-logo']/a/img")).click();
		Thread.sleep(5000);
		Filters fl = new Filters(driver);
		fl.filters();
		}
	
	@Test (alwaysRun = true,priority=3)
    public void bulk_request() throws InterruptedException, Throwable
		{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='navbar-logo']/a/img")).click();
		Thread.sleep(5000);
		Bulkrequest br=new Bulkrequest(driver);
		br.bulkrequest();  
		}
	
//	@Test (alwaysRun = true,priority=4)
//    public void updatepassword() throws InterruptedException, Throwable
//		{
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[@class='navbar-logo']/a/img")).click();
//		Thread.sleep(5000);
//		Insurancepasswordupdate ip=new Insurancepasswordupdate(driver);
//		ip.updatepassword(); 
//		}
	

}




