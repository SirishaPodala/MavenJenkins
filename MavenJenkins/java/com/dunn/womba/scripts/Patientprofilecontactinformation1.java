package com.dunn.womba.scripts;
import org.testng.annotations.Test;
import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.pages.LoginPage;
import com.dunn.womba.pages.Patientprofilecontactinformation;

public class Patientprofilecontactinformation1 extends Baselib
{
//TODO Auto-generated constructor stub
	
@Test

public  void contactupdation12() throws InterruptedException  //JVM will handle exception here//
	{
		// TODO Auto-generated method stub
		
		LoginPage lp = new LoginPage(driver);
		String un = excelLib.getData("Sheet2",2,1,Iconstants.DataexcelPath);
		String pw = excelLib.getData("Sheet2",2,2,Iconstants.DataexcelPath);
		lp.doLogin(un, pw);
		
		Patientprofilecontactinformation obj=new Patientprofilecontactinformation(driver);
		
	    obj.PatientprofileCtinformation();  //calling method here//
		
		

	}

}

