package com.dunn.womba.scripts;
import org.testng.annotations.Test;
import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.pages.LABRESULTS;
import com.dunn.womba.pages.LoginPage;
import com.dunn.womba.pages.Patientrecordsharing;
import com.dunn.womba.pages.Timeline;
import com.dunn.womba.pages.overviewtab;
import com.dunn.womba.pages.vitals;


public class PATIENTHOMEDASHBOARDANDRECORDSHARING extends Baselib
{
//TODO Auto-generated constructor stub
	
	@Test(alwaysRun = true,priority=1)

public  void logintowomba() throws InterruptedException  //JVM will handle exception here//
	{
		// TODO Auto-generated method stub
		LoginPage lp = new LoginPage(driver);
		String un = excelLib.getData("Sheet1",4,1,Iconstants.DataexcelPath);
		String pw = excelLib.getData("Sheet1",4,2,Iconstants.DataexcelPath);
		lp.doLogin(un, pw);
		
	}
	
	@Test(alwaysRun = true,priority=2)

	public  void Timeline11() throws InterruptedException
	{
			Timeline obj=new Timeline(driver);
		obj.time();   //calling method here//
		
	}
	
	@Test(alwaysRun = true,priority=3)

	public  void vitals11() throws InterruptedException  //JVM will handle exception here//
	{
		// TODO Auto-generated method stub
		
		vitals obj=new vitals(driver);
		obj.viatltab();
		
	}

	@Test(alwaysRun = true,priority=4)

	public  void LABRESULTS11() throws InterruptedException  //JVM will handle exception here//
	{
		// TODO Auto-generated method stub
		
		LABRESULTS obj=new LABRESULTS(driver);
		obj.labresulttab();
		
	}
	
	@Test(alwaysRun = true,priority=5)

	public  void overviewtab11() throws InterruptedException  //JVM will handle exception here//
	{
		// TODO Auto-generated method stub
		
		overviewtab obj=new overviewtab(driver);
		obj.overview();;
		
	}
	
	@Test(alwaysRun = true,priority=6)
		
		public void Patientrecordsharing11() throws InterruptedException
		{
		Patientrecordsharing obj=new Patientrecordsharing(driver);
		
	    obj.recordsharing(); 
	}	
}
	
