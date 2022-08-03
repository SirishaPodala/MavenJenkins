package com.dunn.womba.scripts;

import org.testng.annotations.Test;

import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.pages.Auditbymepatientpage;

import com.dunn.womba.pages.LoginPage;

public class Auditbymepatient extends Baselib {
	@Test

	public  void auditbyme() throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		LoginPage lp = new LoginPage(driver);
		String un = excelLib.getData("Sheet1",4,1,Iconstants.DataexcelPath);
		String pw = excelLib.getData("Sheet1",4,2,Iconstants.DataexcelPath);
		lp.doLogin(un, pw);
		
		Auditbymepatientpage obj=new Auditbymepatientpage(driver);
		obj.auditbymepatient();
		

	}

}
