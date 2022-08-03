package com.dunn.womba.scripts;
import org.testng.annotations.Test;
import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.pages.Insurancepasswordupdate;
import com.dunn.womba.pages.LoginPage;

public class Insurancepasswordupdate1  extends Baselib {
	@Test


public  void Insurancepasswordupdateone() throws InterruptedException  //JVM will handle exception here//
{
	// TODO Auto-generated method stub
	
	LoginPage lp = new LoginPage(driver);
	String un = excelLib.getData("Sheet1",3,1,Iconstants.DataexcelPath);
	String pw = excelLib.getData("Sheet1",3,2,Iconstants.DataexcelPath);
	lp.doLogin(un, pw);
	
	Insurancepasswordupdate obj=new Insurancepasswordupdate(driver);
	
    obj.updatepassword();  //calling method here//
	
	

}

}