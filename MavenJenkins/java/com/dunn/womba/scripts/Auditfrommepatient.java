package com.dunn.womba.scripts;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.pages.Auditbymepatientpage;
import com.dunn.womba.pages.Auditfrommepatientpage;
import com.dunn.womba.pages.LoginPage;

public class Auditfrommepatient extends Baselib {
//	public Auditfrommepatientpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	

	@Test

	
	public  void auditfromme() throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		LoginPage lp = new LoginPage(driver);
		String un = excelLib.getData("Sheet1",4,1,Iconstants.DataexcelPath);
		String pw = excelLib.getData("Sheet1",4,2,Iconstants.DataexcelPath);
		lp.doLogin(un, pw);
		
		Auditfrommepatientpage obj=new Auditfrommepatientpage(driver);
	    obj.auditfrommepatientpage();  //calling method here//
		

	}

}

