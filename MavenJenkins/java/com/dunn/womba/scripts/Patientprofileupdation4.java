package com.dunn.womba.scripts;

import org.testng.annotations.Test;

import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.pages.LoginPage;

//import com.dunn.womba.pages.Patientprofileupdationstep3;
import com.dunn.womba.pages.Patientprofileupdationstep4;

public class Patientprofileupdation4  extends Baselib {
	@Test


public  void Patientprofileupdationfour() throws InterruptedException  //JVM will handle exception here//
{
	// TODO Auto-generated method stub
	
	LoginPage lp = new LoginPage(driver);
	String un = excelLib.getData("Sheet2",2,1,Iconstants.DataexcelPath);
	String pw = excelLib.getData("Sheet2",2,2,Iconstants.DataexcelPath);
	lp.doLogin(un, pw);
	
	Patientprofileupdationstep4 obj=new Patientprofileupdationstep4(driver);
	
    obj.step4();  //calling method here//
	
	

}

}

