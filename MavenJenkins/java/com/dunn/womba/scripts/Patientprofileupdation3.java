package com.dunn.womba.scripts;
import org.testng.annotations.Test;

import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.pages.LoginPage;

import com.dunn.womba.pages.Patientprofileupdationstep3;

public class Patientprofileupdation3  extends Baselib {
	@Test


public  void Patientprofileupdationthree() throws InterruptedException  //JVM will handle exception here//
{
	// TODO Auto-generated method stub
	
	LoginPage lp = new LoginPage(driver);
	String un = excelLib.getData("Sheet2",2,1,Iconstants.DataexcelPath);
	String pw = excelLib.getData("Sheet2",2,2,Iconstants.DataexcelPath);
	lp.doLogin(un, pw);
	
	Patientprofileupdationstep3 obj=new Patientprofileupdationstep3(driver);
	
    obj.step3();  //calling method here//
	
	

}

}