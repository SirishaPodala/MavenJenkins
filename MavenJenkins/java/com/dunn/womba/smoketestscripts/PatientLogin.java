package com.dunn.womba.smoketestscripts;

import org.testng.annotations.Test;

import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.smoketestpages.LoginPage;

public class PatientLogin extends Baselib{
	@Test
	public void patientlogin() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		String un = excelLib.getData("Sheet1",1,1,Iconstants.DataexcelPath);
		String pw = excelLib.getData("Sheet1",1,2,Iconstants.DataexcelPath);
		lp.patientlogin(un, pw);
}
	
	
}