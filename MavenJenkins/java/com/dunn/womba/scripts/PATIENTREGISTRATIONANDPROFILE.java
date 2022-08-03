package com.dunn.womba.scripts;

import org.testng.annotations.Test;

import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.pages.LoginPage;
import com.dunn.womba.pages.PatientCONTACT;
import com.dunn.womba.pages.PatientProfileEHRConnections;
import com.dunn.womba.pages.PatientProfileProfileSurvey;
import com.dunn.womba.pages.Patientinsurance;
import com.dunn.womba.pages.Patientprofilepersonaltabupdation;
import com.dunn.womba.pages.Patientprofileupdationstep1;
import com.dunn.womba.pages.Patientprofileupdationstep2;
import com.dunn.womba.pages.Patientprofileupdationstep3;
import com.dunn.womba.pages.Patientprofileupdationstep4;
import com.dunn.womba.pages.Patientprofileupdationstep5;
import com.dunn.womba.pages.PatientprofilrPASSWORD;
public class PATIENTREGISTRATIONANDPROFILE extends Baselib
{
//TODO Auto-generated constructor stub
	
	@Test(alwaysRun = true,priority=1)

public  void logintowomba() throws InterruptedException  //JVM will handle exception here//
	{
		// TODO Auto-generated method stub
		LoginPage lp = new LoginPage(driver);
		String un = excelLib.getData("Sheet2",2,1,Iconstants.DataexcelPath);
		String pw = excelLib.getData("Sheet2",2,2,Iconstants.DataexcelPath);
		lp.doLogin(un, pw);
		
	}
	
	@Test(alwaysRun = true,priority=2)

public  void Patientprofileupdationstep1() throws InterruptedException  //JVM will handle exception here//
{
	// TODO Auto-generated method stub
	
		Patientprofileupdationstep1 obj1=new Patientprofileupdationstep1(driver);

		obj1.Patientprofileupdationstepone();   //calling method here//
	
}
	
	@Test(alwaysRun = true,priority=3)
	public  void Patientprofileupdationstep2() throws InterruptedException  //JVM will handle exception here//
	{
		Patientprofileupdationstep2 obj2=new Patientprofileupdationstep2(driver);

		obj2.step2(); //calling method here//	
	}

	@Test(alwaysRun = true,priority=4)
	public  void Patientprofileupdationstep3() throws InterruptedException  //JVM will handle exception here//
	{
		Patientprofileupdationstep3 obj3=new Patientprofileupdationstep3(driver);

		obj3.step3();
	}

	@Test(alwaysRun = true,priority=5)
	public  void Patientprofileupdationstep4() throws InterruptedException  //JVM will handle exception here//
	{
		Patientprofileupdationstep4 obj4=new Patientprofileupdationstep4(driver);

		obj4.step4();
	}

	@Test(alwaysRun = true,priority=6)
	public  void Patientprofileupdationstep5() throws InterruptedException  //JVM will handle exception here//
	{
		Patientprofileupdationstep5 obj5=new Patientprofileupdationstep5(driver);

		obj5.step5();
	}
	
	@Test(alwaysRun = true,priority=7)
	public  void Patientprofilepersonaltabupdation11() throws InterruptedException  //JVM will handle exception here//
	{
        Patientprofilepersonaltabupdation obj=new Patientprofilepersonaltabupdation(driver);
		
	    obj.PatientprofilePtabupdation();
	}
	@Test(alwaysRun = true,priority=8)
	public  void PatientCONTACT11() throws InterruptedException  //JVM will handle exception here//
	{
        PatientCONTACT obj=new PatientCONTACT(driver);
		
	    obj.patientcontact1();
	}
	@Test(alwaysRun = true,priority=9)
	public  void Patientinsurance11() throws InterruptedException  //JVM will handle exception here//
	{
		 Patientinsurance obj=new Patientinsurance(driver);
 		
		    obj.insurance();
	}
	@Test(alwaysRun = true,priority=10)
	public  void PatientProfileEHRConnections11() throws InterruptedException  //JVM will handle exception here//
	{
		PatientProfileEHRConnections obj=new PatientProfileEHRConnections(driver);
		
	    obj.ehrconnection();
	}
	@Test(alwaysRun = true,priority=11)
	public  void PatientProfileProfileSurvey11() throws InterruptedException  //JVM will handle exception here//
	{
		PatientProfileProfileSurvey obj=new PatientProfileProfileSurvey(driver);
		
	    obj.survey();
	}
	@Test(alwaysRun = true,priority=12)
	public  void PatientprofilrPASSWORD11() throws InterruptedException  //JVM will handle exception here//
	{
		PatientprofilrPASSWORD obj=new PatientprofilrPASSWORD(driver);
		
	    obj.password();
	}

	
	
	
	
	
	
}




