package com.dunn.womba.scripts;
import org.testng.annotations.Test;
import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.pages.LoginPage;
import com.dunn.womba.pages.SearchRecordApplicantpage;

public class SearchRecordApplicantpage1 extends Baselib
{
//TODO Auto-generated constructor stub
	
@Test

public  void SearchRecordApplicantpageone() throws InterruptedException  //JVM will handle exception here//
	{
		// TODO Auto-generated method stub
		
		LoginPage lp = new LoginPage(driver);
		String un = excelLib.getData("Sheet1",3,1,Iconstants.DataexcelPath);
		String pw = excelLib.getData("Sheet1",3,2,Iconstants.DataexcelPath);
		lp.doLogin(un, pw);
		
		SearchRecordApplicantpage obj=new SearchRecordApplicantpage(driver);
		
	    obj.SearchRecordApplicantp();  //calling method here//
		
			}

}
