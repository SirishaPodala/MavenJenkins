package com.dunn.womba.scripts;
import org.testng.annotations.Test;

import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.pages.LoginPage;
import com.dunn.womba.pages.Patientlogout;

public class Patientlogout1 extends Baselib
{
//TODO Auto-generated constructor stub
	
@Test

public  void logout() throws InterruptedException  //JVM will handle exception here//
	{
		// TODO Auto-generated method stub
		
		LoginPage lp = new LoginPage(driver);
		String un = excelLib.getData("Sheet1",4,1,Iconstants.DataexcelPath);
		String pw = excelLib.getData("Sheet1",4,2,Iconstants.DataexcelPath);
		lp.doLogin(un, pw);
		
		Patientlogout obj=new Patientlogout(driver);
		
	    obj.plogout();  //calling method here//
		
		

	}

}

