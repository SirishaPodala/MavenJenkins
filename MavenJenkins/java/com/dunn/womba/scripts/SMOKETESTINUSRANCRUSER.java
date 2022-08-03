package com.dunn.womba.scripts;
import org.testng.annotations.Test;
import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.pages.AddInsuranceUser;
import com.dunn.womba.pages.AddInsurancesupervisor;
import com.dunn.womba.pages.FileuploadSFTP;
import com.dunn.womba.pages.ForgetpasswordINSURANCE;
import com.dunn.womba.pages.InsuranceBulkrequest;
import com.dunn.womba.pages.InsuranceUSERLOGOUT;
import com.dunn.womba.pages.Insurancepasswordupdate;
import com.dunn.womba.pages.Insurancerequestrecordsingle;
import com.dunn.womba.pages.InsuranceuserINACTIVE;
import com.dunn.womba.pages.LoginPage;
import com.dunn.womba.pages.SearchRecordApplicantpage;

public class SMOKETESTINUSRANCRUSER extends Baselib
{
//TODO Auto-generated constructor stub
	
	@Test(alwaysRun = true,priority=1)

public  void logintowomba() throws InterruptedException  //JVM will handle exception here//
	{
		// TODO Auto-generated method stub
		
		LoginPage lp = new LoginPage(driver);
		String un = excelLib.getData("Sheet1",3,1,Iconstants.DataexcelPath);
		String pw = excelLib.getData("Sheet1",3,2,Iconstants.DataexcelPath);
		lp.doLogin(un, pw);
		
	}
	
	@Test(alwaysRun = true,priority=2)

public  void Insurancerequestrecordsingleone() throws InterruptedException  //JVM will handle exception here//
{
	// TODO Auto-generated method stub
	
	Insurancerequestrecordsingle obj=new Insurancerequestrecordsingle(driver);
	
    obj.requestrecordsingle();  //calling method here//
	
}

	@Test(alwaysRun = true,priority=3)
public  void InsuranceBulkrequestone() throws InterruptedException  //JVM will handle exception here//
{
	// TODO Auto-generated method stub
	
	
	InsuranceBulkrequest obj=new InsuranceBulkrequest(driver);
	
    obj.Bulkrequest();  //calling method here//	
}
	@Test(alwaysRun = true,priority=4)
	public  void SearchRecordApplicantpage() throws InterruptedException  //JVM will handle exception here//
	{
	
	SearchRecordApplicantpage obj=new SearchRecordApplicantpage(driver);
	
    obj.SearchRecordApplicantp();
	}

	@Test(alwaysRun = true,priority=5)
public void FileuploadSFTP() throws InterruptedException
{
	
FileuploadSFTP obj=new FileuploadSFTP(driver);
	obj.sftpfileupload();
	}
	
	@Test(alwaysRun = true,priority=6)
public void AddInsurancesupervisor() throws InterruptedException
{
	
		AddInsurancesupervisor obj1=new AddInsurancesupervisor(driver);
	
    obj1.Addsupervisor();  
    
}
    
	@Test(alwaysRun = true,priority=7)
public void AddInsuranceUser() throws InterruptedException
{
	
AddInsuranceUser obj=new AddInsuranceUser(driver);
	
    obj.Addinsurance();  //calling method here//
    
}
	@Test(alwaysRun = true,priority=8)
	public void InsuranceuserINACTIVE() throws InterruptedException
	{
		
    
    InsuranceuserINACTIVE obj2=new InsuranceuserINACTIVE(driver);
	
    obj2.INACTIVE(); 
	
}
	
	@Test(alwaysRun = true,priority=9)
	public void Insurancepasswordupdate() throws InterruptedException
	{	
Insurancepasswordupdate obj=new Insurancepasswordupdate(driver);
	
    obj.updatepassword();  //calling method here//
	}
	
	@Test(alwaysRun = true,priority=10)
	public void InsuranceUSERLOGOUT() throws InterruptedException
	{
		
InsuranceUSERLOGOUT obj=new InsuranceUSERLOGOUT(driver);
		
	    obj.Insurancelogout();  //calling method here//
	
}
	
@Test(alwaysRun = true,priority=11)
	public void ForgetpasswordINSURANCE() throws InterruptedException
	{
			ForgetpasswordINSURANCE obj=new ForgetpasswordINSURANCE(driver);
	
    obj.forget(); 
}
	
}
