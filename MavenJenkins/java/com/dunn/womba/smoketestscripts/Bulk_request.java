package com.dunn.womba.smoketestscripts;
import org.testng.annotations.Test;
import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;

import com.dunn.womba.lib.excelLib;
import com.dunn.womba.smoketestpages.Bulkrequest;
import com.dunn.womba.smoketestpages.LoginPage;

public class Bulk_request extends Baselib
{
//TODO Auto-generated constructor stub
	
@Test

public  void InsuranceBulkrequestone() throws InterruptedException  //JVM will handle exception here//
	{
		// TODO Auto-generated method stub
		
		LoginPage lp = new LoginPage(driver);
		String un = excelLib.getData("Sheet1",3,1,Iconstants.DataexcelPath);
		String pw = excelLib.getData("Sheet1",3,2,Iconstants.DataexcelPath);
		lp.InsuranceLogin(un, pw);
		
		Bulkrequest br=new Bulkrequest(driver);
		br.bulkrequest();  
		
		

	}

}
