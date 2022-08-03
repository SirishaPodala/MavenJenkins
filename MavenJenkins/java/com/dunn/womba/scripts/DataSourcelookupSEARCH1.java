package com.dunn.womba.scripts;
import org.testng.annotations.Test;
import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.pages.DataSourcelookupSEARCH;
import com.dunn.womba.pages.LoginPage;

public class DataSourcelookupSEARCH1 extends Baselib {
	@Test

	public  void datasourcelookup() throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		LoginPage lp = new LoginPage(driver);
		String un = excelLib.getData("Sheet1",3,1,Iconstants.DataexcelPath);
		String pw = excelLib.getData("Sheet1",3,2,Iconstants.DataexcelPath);
		lp.doLogin(un, pw);
		
		DataSourcelookupSEARCH obj=new DataSourcelookupSEARCH(driver);
		obj.datasourcelookupsearch();
		

	}

}
