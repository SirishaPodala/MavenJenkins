package com.dunn.womba.scripts;
import org.testng.annotations.Test;
import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.pages.InsuranceadminCoverPage;
import com.dunn.womba.pages.InsuranceadminSettingstab;
import com.dunn.womba.pages.InsuranceadminVeriskAccountTab;
import com.dunn.womba.pages.Insurancerequestrecordsingle;
import com.dunn.womba.pages.LoginPage;

public class INSURANCEADMINSETTINGSONE extends Baselib {
	
	@Test(alwaysRun = true,priority=1)
	
	public void Insuranceadminsettingsoneone() throws InterruptedException
		{
			LoginPage lp = new LoginPage(driver);
			String un = excelLib.getData("Sheet1",3,1,Iconstants.DataexcelPath);
			String pw = excelLib.getData("Sheet1",3,2,Iconstants.DataexcelPath);
			lp.doLogin(un, pw);
		}
	
	@Test(alwaysRun = true,priority=2)

public  void InsuranceadminSettingstab() throws InterruptedException  //JVM will handle exception here//
{
	// TODO Auto-generated method stub
	
		InsuranceadminSettingstab obj=new InsuranceadminSettingstab(driver);
		obj.settingstab();  //calling method here//
	
}
	@Test(alwaysRun = true,priority=3)
	
	public  void InsuranceadminVeriskAccountTab() throws InterruptedException  //JVM will handle exception here//
	{
		// TODO Auto-generated method stub
		
		InsuranceadminVeriskAccountTab obj1=new InsuranceadminVeriskAccountTab(driver);
		obj1.Veriskstab();  //calling method here//
		
	}	
	@Test(alwaysRun = true,priority=4)
	
	public  void InsuranceadminCoverPage() throws InterruptedException  //JVM will handle exception here//
	{
		// TODO Auto-generated method stub
		
		InsuranceadminCoverPage obj2=new InsuranceadminCoverPage(driver);
		obj2.coverpage();
			 //calling method here//
	}
}


