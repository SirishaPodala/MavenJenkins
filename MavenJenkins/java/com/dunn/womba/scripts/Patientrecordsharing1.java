package com.dunn.womba.scripts;
import org.testng.annotations.Test;
import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.pages.LoginPage;
import com.dunn.womba.pages.Patientrecordsharing;

public class Patientrecordsharing1 extends Baselib {
	@Test

	public  void Patientrecordsharingone() throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		LoginPage lp = new LoginPage(driver);
		String un = excelLib.getData("Sheet1",4,1,Iconstants.DataexcelPath);
		String pw = excelLib.getData("Sheet1",4,2,Iconstants.DataexcelPath);
		lp.doLogin(un, pw);
		
		Patientrecordsharing obj=new Patientrecordsharing(driver);
		obj.recordsharing();
		

	}

}