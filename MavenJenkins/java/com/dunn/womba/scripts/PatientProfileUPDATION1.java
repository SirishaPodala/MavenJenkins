package com.dunn.womba.scripts;

import org.testng.annotations.Test;

import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
//import com.dunn.womba.pages.Auditbymepatientpage;
//import com.dunn.womba.pages.Auditfrommepatientpage;
import com.dunn.womba.pages.LoginPage;
import com.dunn.womba.pages.Patientprofileupdationstep1;
import com.dunn.womba.pages.Patientprofileupdationstep2;
import com.dunn.womba.pages.Patientprofileupdationstep3;
import com.dunn.womba.pages.Patientprofileupdationstep4;
import com.dunn.womba.pages.Patientprofileupdationstep5;

public class PatientProfileUPDATION1 extends Baselib {

		// TODO Auto-generated constructor stub
	

	@Test

	
	public  void Patientprofileupdationonee() throws InterruptedException  //JVM will handle exception here//
	{
		// TODO Auto-generated method stub
		
		LoginPage lp = new LoginPage(driver);
		String un = excelLib.getData("Sheet2",2,1,Iconstants.DataexcelPath);
		String pw = excelLib.getData("Sheet2",2,2,Iconstants.DataexcelPath);
		lp.doLogin(un, pw);
		
		Patientprofileupdationstep1 obj1=new Patientprofileupdationstep1(driver);
		
	    obj1.Patientprofileupdationstepone();  //calling method here//
	
	}

}




