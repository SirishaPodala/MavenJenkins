package com.dunn.womba.smoketestscripts;

import org.testng.annotations.Test;

import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.smoketestpages.Filters;
import com.dunn.womba.smoketestpages.LoginPage;

public class FilterSearch  extends Baselib
{		
	@Test

	public  void Insurancerequestrecordsingleone() throws InterruptedException  
		{
			
			LoginPage lp = new LoginPage(driver);
			String un = excelLib.getData("Sheet1",3,1,Iconstants.DataexcelPath);
			String pw = excelLib.getData("Sheet1",3,2,Iconstants.DataexcelPath);
			lp.InsuranceLogin(un, pw);
			Thread.sleep(5000);
			Filters fl = new Filters(driver);
			fl.filters();
		}
}
