package com.dunn.womba.smoketestscripts;
import org.testng.annotations.Test;
import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.smoketestpages.AddInsurancesupervisor;
import com.dunn.womba.smoketestpages.LoginPage;

public class AddInsurancesupervisor1 extends Baselib
{
	
@Test

public  void AddInsurancesupervisorone() throws InterruptedException  //JVM will handle exception here//
	{
		
	LoginPage lp = new LoginPage(driver);
	String un = excelLib.getData("Sheet1",3,1,Iconstants.DataexcelPath);
	String pw = excelLib.getData("Sheet1",3,2,Iconstants.DataexcelPath);
	lp.InsuranceLogin(un, pw);
	Thread.sleep(5000);
		
	AddInsurancesupervisor is=new AddInsurancesupervisor(driver);	
    is.Addsupervisor();  
		}
}
